package testeSupermarket;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import clase.Produse;
import clase.Supermarket;

public class TestProduseDecorative {

	@Test
	public void testareProduseDecorative() {
		ArrayList<Produse> Produse = new ArrayList<Produse>();
		Produse.add(new Produse("vaza",2,"decorative",45,"EsteInStoc","4234567892"));
		Produse.add(new Produse("tablou",3,"decorative",38,"EsteInStoc","4234567892"));
		Supermarket s= new Supermarket(Produse);
		assertEquals(2,s.numarDecoratiuni());
		
	}
	@Test
	public void testareProduseDecorativeListaNull(){
		ArrayList<Produse> Produse=null;
		try{
			Supermarket s=new Supermarket(Produse);
			System.out.println(s.numarDecoratiuni());
			fail("lista e nula");
		}
		catch(NullPointerException ex){}
	}

	@Test
	public void testareProduseDecorativeListaGoala(){
		ArrayList<Produse> Produse = new ArrayList<Produse>();
		Supermarket s= new Supermarket(Produse);
		assertEquals(0,s.numarDecoratiuni());
	}


}
