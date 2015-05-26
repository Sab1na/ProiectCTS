package clase;

public class Produse {
	private String denumire;
	private int id;
	private String categorie;
	private int pret;
	private String statusStoc;
	private String codBare;
	
	
	
	
	public String getDenumire() {
		return denumire;
	}
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public int getPret() {
		return pret;
	}
	public void setPret(int pret) {
		this.pret = pret;
	}
	public String getStatusStoc() {
		return statusStoc;
	}
	public void setStatusStoc(String statusStoc) {
		this.statusStoc = statusStoc;
	}
	public String getCodBare() {
		return codBare;
	}
	public void setCodBare(String c) {
		if (c.length() == 10) {
			switch (c.charAt(0)) {
			case '1':
				codBare =c;
			case '2':
				codBare =c;
			case '3':
				codBare = c;
			case '4':
				codBare =c;
			case '5':
				codBare =c;
			
			}
	
		} else System.out.println("cod de bare incorect");
		
		
	}
	
	
	public Produse(String denumire, int id, String categorie, int pret,
			String statusStoc, String codBare) {
		super();
		this.denumire = denumire;
		this.id = id;
		this.categorie = categorie;
		this.pret = pret;
		this.statusStoc = statusStoc;
		this.codBare = codBare;
	}
	
	public Produse() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Produse [denumire=" + denumire + ", id=" + id + ", categorie="
				+ categorie + ", pret=" + pret + ", statusStoc=" + statusStoc
				+ ", codBare=" + codBare + "]";
	}
	
	
	// calcularea adaosului in functie de categorie
	
		public float adaosCategorie() {
			float adaos = 0;
			
			if (categorie.equalsIgnoreCase("alimente")) {

				adaos = (float) (pret * 0.7);
			} else if (categorie.equalsIgnoreCase("electronice")){
				adaos = (float) (pret * 0.2);
			}
				else if (categorie.equalsIgnoreCase("patiserie")){
					adaos = (float) (pret * 0.4);
				}
				else if (categorie.equalsIgnoreCase("decoratiuni")){
					adaos = (float) (pret * 0.5);
				}
				else if (categorie.equalsIgnoreCase("vestimentare")){
					adaos = (float) (pret * 0.6);
				}
			return adaos;
		} 
		
		//calcularea reducerii in functie de statusul produsului
		
		public float reducere(){
			float reducere=0;
			if(statusStoc.equalsIgnoreCase("EsteInStoc")){
				reducere=(float) (pret*0.15);
				return reducere;
			}
			
			else
				if(statusStoc.equalsIgnoreCase("NuEsteInStoc")){
					reducere=(float) (pret*0.15);
					return reducere;
				}
				else
				{
				reducere = 0;
				return reducere;
			}
			
			
		}
		//calcularea impozitului pe categorie
		
		public float impozit() {
			float impozit = 0;
			if (categorie.equalsIgnoreCase("alimente")) {

				impozit = (float) (pret * 0.07);
			} else {
				impozit = (float) (pret * 0.2);
			}

			return impozit;
		}

	}
	
	
	

