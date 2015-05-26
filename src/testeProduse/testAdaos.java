package testeProduse;

import static org.junit.Assert.*;

import org.junit.Test;



import clase.Produse;



public class testAdaos {


	@Test
	public void testAdaosGeneral(){
		Produse a=new Produse("pateuri",3,"patiserie",13,"EsteInStoc","2234567892");
		float adaos = 0;
		
		if (a.getCategorie().equalsIgnoreCase("alimente")) {

			adaos = (float) (a.getPret() * 0.7);
		} else if (a.getCategorie().equalsIgnoreCase("electronice")){
			adaos = (float) (a.getPret() * 0.2);
		}
			else if (a.getCategorie().equalsIgnoreCase("patiserie")){
				adaos = (float) (a.getPret() * 0.4);
			}
			else if (a.getCategorie().equalsIgnoreCase("decoratiuni")){
				adaos = (float) (a.getPret() * 0.5);
			}
			else if (a.getCategorie().equalsIgnoreCase("vestimentare")){
				adaos = (float) (a.getPret() * 0.6);
			}
	
		assertEquals(adaos,a.adaosCategorie(),0);
	}
	
	@Test
	public void testAdaosAlimente() {
		Produse a=new Produse("cartofi",1,"alimente",13,"EsteInStoc","2234567892");
		float adaos = (float) (a.getPret() * 0.7);
		assertEquals(adaos,a.adaosCategorie(),0);
	}
	@Test
	public void testAdaosElectronice() {
		Produse a=new Produse("laptop",3,"electronice",30,"EsteInStoc","2235667892");
		float adaos = (float) (a.getPret() * 0.2);
		assertEquals(adaos,a.adaosCategorie(),0);
	}
	@Test
	public void testAdaosPatiserie() {
		Produse a=new Produse("saleuri",5,"patiserie",6,"EsteInStoc","2233467892");
		float adaos = (float) (a.getPret() * 0.4);
		assertEquals(adaos,a.adaosCategorie(),0);
	}
	@Test
	public void testAdaosDecoratiuni() {
		Produse a=new Produse("tablou",4,"decoratiuni",10,"EsteInStoc","2114567892");
		float adaos = (float) (a.getPret() * 0.5);
		assertEquals(adaos,a.adaosCategorie(),0);
	}
	@Test
	public void testAdaosVestimentare() {
		Produse a=new Produse("geaca",2,"vestimentare",89,"EsteInStoc","2234567892");
		float adaos = (float) (a.getPret() * 0.6);
		assertEquals(adaos,a.adaosCategorie(),0);
	}
	@Test
	public void testAdaosInexistent(){
		Produse a=new Produse("iaurt",3,"lactate",13,"Inexistent","2234567892");
		
		float adaos = 0;
		assertEquals(adaos,a.adaosCategorie(),0);
	}
}

