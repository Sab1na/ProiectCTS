package testeSupermarket;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import clase.Produse;
import clase.Supermarket;

public class TestProduseVestimentare {

	@Test
	public void testareProduseVestimentare() {
		ArrayList<Produse> Produse = new ArrayList<Produse>();
		Produse.add(new Produse("rochie",2,"vestimentare",50,"EsteInStoc","5234567892"));
		Produse.add(new Produse("geaca",3,"vestimentare",80,"EsteInStoc","5234567892"));
		Supermarket s= new Supermarket(Produse);
		assertEquals(2,s.numarProduseVestimentare());
		
	}
	@Test
	public void testareProduseVestimentareListaNull(){
		ArrayList<Produse> Produse=null;
		try{
			Supermarket s=new Supermarket(Produse);
			System.out.println(s.numarProduseVestimentare());
			fail("lista e nula");
		}
		catch(NullPointerException ex){}
	}

	@Test
	public void testareProduseVestimentareListaGoala(){
		ArrayList<Produse> Produse = new ArrayList<Produse>();
		Supermarket s= new Supermarket(Produse);
		assertEquals(0,s.numarProduseVestimentare());
	}

}
