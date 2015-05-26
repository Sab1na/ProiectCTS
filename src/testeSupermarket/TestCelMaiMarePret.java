package testeSupermarket;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.EmptyStackException;

import org.junit.Test;


import clase.Produse;
import clase.Supermarket;

public class TestCelMaiMarePret {

	@Test
	public void testCelMaiMarePret() {
		ArrayList<Produse> Produse = new ArrayList<Produse>();
		Produse a=new Produse("saratele",2,"alimente",13,"EsteInStoc","2234567892");
		Produse a1=new Produse("ciocolata",3,"alimente",12,"EsteInStoc","2234567893");
		Produse.add(a);
		Produse.add(a1);
		
		Supermarket s= new Supermarket(Produse);
		assertEquals(a,s.celMaiMarePret());
	}
	@Test
	public void testCelMaiMarePretListaNula(){
		ArrayList<Produse> Produse=null;
		try{
			Supermarket s=new Supermarket(Produse);
			System.out.println(s.celMaiMarePret());
			fail("lista e nula");
		}catch(NullPointerException ex){}
		
	}
	
	@Test
	public void testCelMaiMarePretListaGoala(){
		ArrayList<Produse> Produse = new ArrayList<Produse>();
		try{
			Supermarket s=new Supermarket(Produse);
			System.out.println(s.celMaiMarePret());
			fail("lista e goala");
		}catch(EmptyStackException ex){}
	}

}
