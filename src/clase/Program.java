package clase;

public class Program {
	

	public static void main(String[] args) {
		Supermarket s= Supermarket.getInstance();
		Produse a=new Produse("ciocolata",1,"alimente",10,"EsteInStoc","3234567891");
		Produse a1=new Produse("saratele",2,"patiserie",13,"NuInStoc","2234567892");
		Produse a2=new Produse("blender",3,"electronice",100,"EsteInStoc","1234567893");
		Produse a3=new Produse("vaza",4,"decoratiuni",80,"NuInStoc","4234567894");
		Produse a4=new Produse("camasa",5,"vestimentare",79,"EsteInStoc","5234567895");
		Produse a5=new Produse("candelabru",6,"decoratiuni",99,"EsteInStoc","4234567895");
		
		
		
		
		System.out.println("Se afiseaza adaosul pentru categoria patiserie \n");
		System.out.println(a1.adaosCategorie());
		
		s.adaugaProduse(a);
		s.adaugaProduse(a1);
		s.adaugaProduse(a2);
		s.adaugaProduse(a3);
		s.adaugaProduse(a4);
		System.out.println("Se afiseaza produsele \n");
		s.afiseazaProduse();
		
		System.out.println("Se afiseaza produsul cu cel mai mare pret \n");
		System.out.println(s.celMaiMarePret());
		System.out.println("Se afiseaza pretul produselor care includ adaos \n");
		System.out.println(s.adaosPret());
		System.out.println("Se afiseaza impozitul \n");
		System.out.println(s.calculeazaImpozit());
		System.out.println("Se afiseaza platile totale \n");
		System.out.println(s.calculeazaPlatiTotale());
		
		System.out.println("Modifica pretul produsului \n");
		s.modificaPret(a, 500);
		
		System.out.println("Afiseaza produsele \n");
		 s.afiseazaProduse();
		
		 System.out.println("Afiseaza produsele modificate \n");
		 s.afiseazaProduseModificate();
		
		
		System.out.println("Citeste din fisier \n");
		s.citireProduseDinFisier();
		
		
		s.afiseazaProduse();
		
		 
		 System.out.println("Adauga produs nou");
		 s.adaugaProduse(a5);
		 System.out.println("Afiseaza produsele dupa adaugare \n");
		 s.afiseazaProduse();
		 
		
		
		 System.out.println("Elimina produsul \n");
			s.eliminaProduse(a1);
			System.out.println("Afiseaza produsele dupa stergere \n");
			 s.afiseazaProduse();
	}
}


