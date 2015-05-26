package testeSupermarket;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Produse;
import clase.Supermarket;

public class TestAdaugareProdus {

	@Test
	public void testAdaugaProdusInexistent() {
		Supermarket s=Supermarket.getInstance();
		Produse a= new Produse("caramele",3,"alimentare",8,"EsteInStoc","2234567892");
		s.adaugaProduse(a);
		assertEquals(a,s.getProduse(a));
		
	}
	@Test
	public void testAdaugareProdusNull(){
		Supermarket s=Supermarket.getInstance();
		Produse a=null;
		try{
			s.adaugaProduse(a);
		}
		catch(NullPointerException ex){
			
		}
	}
}
