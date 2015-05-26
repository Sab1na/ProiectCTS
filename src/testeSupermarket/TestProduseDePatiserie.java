package testeSupermarket;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import clase.Produse;
import clase.Supermarket;

public class TestProduseDePatiserie {

	@Test
	public void testareProduseDePatiserie() {
		ArrayList<Produse> Produse = new ArrayList<Produse>();
		Produse.add(new Produse("croissant",2,"patiserie",5,"EsteInStoc","2234567892"));
		Produse.add(new Produse("pateuri",3,"patiserie",8,"EsteInStoc","2234567892"));
		Supermarket s= new Supermarket(Produse);
		assertEquals(2,s.numarProdusePatiserie());
		
	}
	@Test
	public void testareProduseDePatiserieListaNull(){
		ArrayList<Produse> Produse=null;
		try{
			Supermarket s=new Supermarket(Produse);
			System.out.println(s.numarProdusePatiserie());
			fail("lista e nula");
		}
		catch(NullPointerException ex){}
	}

	@Test
	public void testareProduseDePatiserieListaGoala(){
		ArrayList<Produse> Produse = new ArrayList<Produse>();
		Supermarket s= new Supermarket(Produse);
		assertEquals(0,s.numarProdusePatiserie());
	}

}
