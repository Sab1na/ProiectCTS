package testeSupermarket;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


import clase.Produse;
import clase.Supermarket;



public class TestAdaosPret {

	@Test
	public void testCalculeazaAdaosPret() {
		ArrayList<Produse> Produse = new ArrayList<Produse>();
		Produse a=new Produse("saratele",2,"alimente",13,"EsteInStoc","2234567892");
	    Produse.add(a);
	    float adaosPret=(float) (a.getPret() * 0);
	    float cost=adaosPret+a.getPret();
	    
	  Supermarket s=new Supermarket(Produse);
	  double d=s.adaosPret();
	  assertEquals(cost,d,0);
	  
	
	}
	@Test
	public void testCalculeazaAdaosPretListaGoala(){
		ArrayList<Produse> Produse = new ArrayList<Produse>();
		Supermarket s=new Supermarket(Produse);
		assertEquals(0,s.adaosPret(),0); 
		
	}
	
	@Test
	public void testCalculeazaAdaosPretListaNula(){
		ArrayList<Produse> Produse = null;
		Supermarket s=new Supermarket(Produse);
		try{
			System.out.println(s.adaosPret());
			fail("lista e nula");
		}
		catch(NullPointerException ex){}
	}
	

}
