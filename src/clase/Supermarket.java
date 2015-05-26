package clase;




import interfete.Observer;
import interfete.Subiect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class Supermarket implements Subiect{
	private ArrayList<Produse> lista = new ArrayList<Produse>();
	private ArrayList<Observer> observer = new ArrayList<Observer>();
	
	
	CareTaker c = new CareTaker();
	
	//singleton
	
	private static Supermarket singleton = null;

	public static Supermarket getInstance() {
		if (singleton == null) {
			singleton = new Supermarket();
		}
		return singleton;
	}
	
	private Supermarket(){
		
	}
	
	// Crearea unui supermarket cu produse
	
		public Supermarket(ArrayList<Produse> listaNoua) {
			if (listaNoua != null) {
				lista = new ArrayList<Produse>();
				for (int i = 0; i < listaNoua.size(); i++)
					lista.add(listaNoua.get(i));
				anuntaObservatori();
			} else
				lista = null;
		}
		
		// Toate produsele din supermarket
		
		public ArrayList<Produse> getListaProduse() {
			if (lista != null) {
				return lista;
			} else
				throw new NullPointerException();
		}

		// Setarea unei liste cu produse
		
		public void setListaProduse(ArrayList<Produse> list) {
			if (list != null) {
				lista = list;
				anuntaObservatori();
			} else
				throw new NullPointerException();

		}
		
		// returnarea unui produs
		
		public Produse getProduse(Produse a) {
			int index = 0;
			
			if (lista != null) {
				if (lista.size() != 0) {
					if (a != null) {
						index = lista.indexOf(a);
						if (index != -1) {
							return lista.get(index);
						} else {
							return null;
						}
					} else
						throw new NullPointerException();
				} else {
					throw new EmptyStackException();
				}
			} else
				throw new NullPointerException();

		}
		
		// adaugarea unui produs
		
		public void adaugaProduse(Produse a) {
			int k = 0;
			if (a != null) {
				for (int i = 0; i < lista.size(); i++) {
					if (a.equals(lista.get(i))) {
						k++;
					}
				}
				if (k == 0) {
					lista.add(a);
					anuntaObservatori();
				} else

					System.out
							.println("Produsul exista deja in lista.");

			}

			else
				throw new NullPointerException();

		}
		
		// eliminarea unui produs
		
		public void eliminaProduse(Produse a) {
			int k = 0;
			if (lista != null) {
				if (lista.size() != 0) {
					if (a != null) {
						for (Produse a1 : lista) {
							if (a.equals(a1)) {
								k++;
							}

						}
						if (k != 0) {
							lista.remove(a);
							anuntaObservatori();
						} else
							System.out
									.println("Nu exista produsul in lista !");
					} else
						throw new NullPointerException();
				} else
					throw new EmptyStackException();
			} else
				throw new NullPointerException();
		}
		
		
		// calcularea  produsului cu pretul cel mai mare
		
		public Produse celMaiMarePret() {
			int p = 0;
			int index = 0;
			if (lista != null) {
				if(lista.size()!=0){
				for (int i = 0; i < lista.size(); i++) {
					if (p < lista.get(i).getPret()) {
						p = lista.get(i).getPret();
						index = i;

					}

				}
				return lista.get(index);

			}
				else throw new EmptyStackException();
				}

			else
				throw new NullPointerException();

		}
		
	// calcularea pretului produselor care includ adaos
		
		public float adaosPret() {
			float cost = 0;
			if (lista != null) {
				if (lista.size() != 0) {
					for (int i = 0; i < lista.size(); i++) {
						cost = cost 
								+ lista.get(i).getPret();

					}
					return cost;

				} else {
				return 0;
			}

			}

			else
			throw new NullPointerException();

	}
		
		// calculeaza impozitul platit de supermarket

		public float calculeazaImpozit() {
			float impozitSupermarket = 0;
			if (lista != null) {
				if (lista.size() != 0) {
					for (int i = 0; i < lista.size(); i++) {
						impozitSupermarket = impozitSupermarket + lista.get(i).impozit();

					}
					return impozitSupermarket;
				} else {
					return 0;
				}

			}

			else
				throw new NullPointerException();

		}
		
		// calculeaza adaosul pe categorie
		
		public float calculeazaAdaosCategorie() {
			float com = 0;
			if (lista != null) {
				if (lista.size() != 0) {
					for (int i = 0; i < lista.size(); i++) {
						com = com + lista.get(i).adaosCategorie();
					}
					return com;
				} else {
					return 0;
				}
			} else
				throw new NullPointerException();
		}

		
		// calculeaza totalul platilor
		
		public float calculeazaPlatiTotale() {
			float plati = 0;
			if(lista!=null){
				if(lista.size()!=0){
			plati = this.adaosPret() 
					+ this.calculeazaAdaosCategorie();
			return plati;}
				else return 0;}
			else
				throw new NullPointerException();

		}
		
		// afisarea tuturor produselor din supermarket
		
		public void afiseazaProduse() {
			if (lista != null) {
				if (lista.size() != 0) {
					for (Produse a : lista) {
						System.out.println(a);
					}

				} else {
					System.out.println("Nu exista produse in supermarket ! ");
				}

			} else
				throw new NullPointerException();

		}
		
		
		// modifica pretul unui produs
		
		public void modificaPret(Produse a, int s)  {
			
			int k=0;
			if(lista!=null){
				if(lista.size()!=0){
			if (a != null) {
				for (int i = 0; i < lista.size(); i++) {
					if (lista.get(i).equals(a)) {
						
						k++;
					}	
					}
				if(k!=0){
					Originator o=new Originator();
					Memento m=o.saveToMemento(a);
					c.adaugaMemento(m);
					a.setPret(s);
					anuntaObservatori();
				}
				
				else System.out.println("produsul nu exista");
			}
			

			else
				throw new NullPointerException();

		}
				else throw new EmptyStackException();
				}

			else
				throw new NullPointerException();
			}
		
		// se afiseaza modificarea produselor din supermarket
		
		public void afiseazaProduseModificate() {

			for (int i = 0; i < c.memento.size(); i++) {
				System.out.println(c.getMemento(i).getProduse());
			}
		}
		
		
		
		
		//citire produse din fisier
		
		public void citireProduseDinFisier(){
			FileReader fi;
	        BufferedReader in = null;
	        try {
	            fi = new FileReader("C:/Users/Sabina/workspace/Cts/Produse");
	            in = new BufferedReader(fi);
	            String linie=in.readLine();
	            while (linie!= null)  {
	                String[] elemente = linie.split(",");
	                if(elemente.length!=6){
	                    throw new Exception("Linie invalida!");
	                }
	                
	                Produse a = new Produse ();
	                a.setDenumire(elemente[0]);
	                a.setId(Integer.parseInt(elemente[1].trim()));
	                a.setCategorie(elemente[2]);
	                a.setPret(Integer.parseInt(elemente[3].trim()));
	                a.setStatusStoc(elemente[4]);
	                a.setCodBare(elemente[5]);
	                
	                linie = in.readLine();
	                                
	               lista.add(a);
	            }
	        } catch (Exception ex) {
	           
	        } finally {
	            try {
	                in.close();
	            } catch (Exception ex) {
	            }
	        }
		}
		@Override
		
		public void adaugaObserver(Observer obs) {
			// TODO Auto-generated method stub
			observer.add(obs);

		}

		@Override
		public void anuntaObservatori() {
			// TODO Auto-generated method stub
			for (Observer obs : observer) {
				obs.modificareListaProduse();
			}
		}
		
		//afisare produse electronice din supermarket
		
		public int numarElectronice(){
			int nr=0;
			if(lista!=null){
				if(lista.size()!=0){
					for(Produse a:lista){
						String n=a.getCodBare();
						if(n.charAt(0)=='1' ){
							nr=nr+1;
						}
					}
					return nr;
				}
				else return 0;
			}
			else throw new NullPointerException();
		}
		
		//afisare produse de patiserie din supermarket
		
				public int numarProdusePatiserie(){
					int nr=0;
					if(lista!=null){
						if(lista.size()!=0){
							for(Produse a:lista){
								String n=a.getCodBare();
								if(n.charAt(0)=='2' ){
									nr=nr+1;
								}
							}
							return nr;
						}
						else return 0;
					}
					else throw new NullPointerException();
				}
		
		//afisare produse decorative din supermarket
		
				public int numarDecoratiuni(){
					int nr=0;
					if(lista!=null){
						if(lista.size()!=0){
							for(Produse a:lista){
								String n=a.getCodBare();
								if(n.charAt(0)=='4' ){
									nr=nr+1;
								}
							}
							return nr;
						}
						else return 0;
					}
					else throw new NullPointerException();
				}
				
				//afisare produse vestimentare din supermarket
				
				public int numarProduseVestimentare(){
					int nr=0;
					if(lista!=null){
						if(lista.size()!=0){
							for(Produse a:lista){
								String n=a.getCodBare();
								if(n.charAt(0)=='5' ){
									nr=nr+1;
								}
							}
							return nr;
						}
						else return 0;
					}
					else throw new NullPointerException();
				}
		// afisarea numarului de produse alimentare din supermarket
		
		public int numarAlimente(){
			int nr=0;
			if(lista!=null){
				if(lista.size()!=0){
					for(Produse a:lista){
						String n=a.getCodBare();
						if(n.charAt(0)=='2' ){
							nr=nr+1;
						}
					}
					return nr;
				}
				else return 0;
			}
			else throw new NullPointerException();
		}
		
		//afisarea numarului produselor cu pretul mai mare sau egal decat pretul de la furnizori
		
		public int numarProduse(int s){
			int nr=0;
			if(lista!=null){
				if(lista.size()!=0){
					for(Produse a:lista){
						if(a.getPret()>=s){
							nr=nr+1;
						}
					}
					return nr;
				}
				else return 0;
			}
			else throw new NullPointerException();
		}
	}

