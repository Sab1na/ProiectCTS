package testeSupermarket;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import clase.Produse;
import clase.Supermarket;

public class TestProduseElectronice {

	@Test
	public void testareProduseElectronice() {
		ArrayList<Produse> Produse = new ArrayList<Produse>();
		Produse.add(new Produse("mixer",2,"electronice",50,"EsteInStoc","1234567892"));
		Produse.add(new Produse("blender",3,"electronice",80,"EsteInStoc","1234567892"));
		Supermarket s= new Supermarket(Produse);
		assertEquals(2,s.numarElectronice());
		
	}
	@Test
	public void testareProduseElectroniceListaNull(){
		ArrayList<Produse> Produse=null;
		try{
			Supermarket s=new Supermarket(Produse);
			System.out.println(s.numarElectronice());
			fail("lista e nula");
		}
		catch(NullPointerException ex){}
	}

	@Test
	public void testareProduseElectroniceListaGoala(){
		ArrayList<Produse> Produse = new ArrayList<Produse>();
		Supermarket s= new Supermarket(Produse);
		assertEquals(0,s.numarElectronice());
	}

}
