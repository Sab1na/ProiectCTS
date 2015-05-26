package testeSupermarket;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.EmptyStackException;

import org.junit.Test;

import clase.Produse;
import clase.Supermarket;



public class TestModificaPretulProdusului {
	@Test
	public void testModificarePretProdus(){
		ArrayList<Produse> Produse = new ArrayList<Produse>();
		Produse a= new Produse("ciocolata",3,"alimente",12,"EsteInStoc","2234567893");
		Produse.add(a);
		Supermarket s=new Supermarket(Produse);
		s.modificaPret(a, 70);
		assertEquals(70,s.getProduse(a).getPret());
		
		
		
	}
	@Test
	public void testModificaPretProdusNull(){
		ArrayList<Produse> Produse = new ArrayList<Produse>();
		Produse a= null;
		Produse a1=new Produse("ciocolata",3,"alimente",12,"EsteInStoc","2234567893");
		Produse.add(a);
		Produse.add(a1);
		try{
			Supermarket s=new Supermarket(Produse);
			s.modificaPret(a, 90);
			fail("produsul este null");
			
		}
		catch(NullPointerException ex){
			
		}
		
	}

	@Test
	public void testModificaListaProduseNula(){
		ArrayList<Produse> Produse=null;
		Produse a1=new Produse("ciocolata",3,"alimente",12,"EsteInStoc","2234567893");
		try{
			Supermarket s=new Supermarket(Produse);
			s.modificaPret(a1, 60);
			fail("lista e nula");
		}
		catch(NullPointerException ex){}
	}
	
	@Test
	public void testModificaListaProduseGoala(){
		ArrayList<Produse> Produse = new ArrayList<Produse>();
		Produse a1=new Produse("ciocolata",3,"alimente",12,"EsteInStoc","2234567893");
		try{
			Supermarket s=new Supermarket(Produse);
			s.modificaPret(a1, 100);
		}
		catch(EmptyStackException ex){}
		
		
	}
}
