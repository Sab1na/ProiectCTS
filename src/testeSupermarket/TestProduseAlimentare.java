package testeSupermarket;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import clase.Produse;
import clase.Supermarket;

public class TestProduseAlimentare {

	@Test
	public void testareProduseAlimentare() {
		ArrayList<Produse> Produse = new ArrayList<Produse>();
		Produse.add(new Produse("ciocolata",2,"alimentare",5,"EsteInStoc","2234567892"));
		Produse.add(new Produse("caramele",3,"alimentare",8,"EsteInStoc","2234567892"));
		Supermarket s= new Supermarket(Produse);
		assertEquals(2,s.numarAlimente());
		
	}
	@Test
	public void testareProduseAlimentareListaNull(){
		ArrayList<Produse> Produse=null;
		try{
			Supermarket s=new Supermarket(Produse);
			System.out.println(s.numarAlimente());
			fail("lista e nula");
		}
		catch(NullPointerException ex){}
	}

	@Test
	public void testareProduseAlimentareListaGoala(){
		ArrayList<Produse> Produse = new ArrayList<Produse>();
		Supermarket s= new Supermarket(Produse);
		assertEquals(0,s.numarAlimente());
	}

}
