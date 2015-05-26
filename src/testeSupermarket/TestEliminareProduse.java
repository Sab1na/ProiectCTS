package testeSupermarket;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.EmptyStackException;

import org.junit.Test;



import clase.Produse;
import clase.Supermarket;

public class TestEliminareProduse {

	@Test
	public void eliminaProduse(){
		ArrayList<Produse> Produse = new ArrayList<Produse>();
		Produse a= new Produse("saratele",2,"alimente",13,"EsteInStoc","2234567892");
		Produse.add(a);
		Produse.add(new Produse ("saratele",2,"alimente",13,"EsteInStoc","2234567892"));
		Supermarket s=new Supermarket(Produse);
		int i= s.getListaProduse().size();
		int rez=i-1;
		s.eliminaProduse(a);
		int rez2=s.getListaProduse().size();
		assertEquals(rez,rez2);
		
	}
@Test
	
	public void eliminaProdusNull(){
		ArrayList<Produse> Produse = new ArrayList<Produse>();
		Produse a=null;
		Produse.add(a);
		try{
			Supermarket s=new Supermarket(Produse);
			s.eliminaProduse(a);
			fail("produsul e null");
		}
		catch(NullPointerException ex){}
	}
@Test
  public void eliminaProduseListaNula(){
	ArrayList<Produse> Produse=null;
	try{
		Supermarket s=new Supermarket(Produse);
		Produse a=new Produse("saratele",2,"alimente",13,"EsteInStoc","2234567892");
		s.eliminaProduse(a);
		fail("lista e nula");
	}
	catch(NullPointerException ex){
		
	}
}
@Test
public void eliminaProduseListaGoala(){
	ArrayList<Produse> Produse = new ArrayList<Produse>();
	try{
		Supermarket s=new Supermarket(Produse);
	    Produse a=new Produse("saratele",2,"alimente",13,"EsteInStoc","2234567892");
	    s.eliminaProduse(a);
		fail("lista goala");
		
	}
	catch(EmptyStackException ex){}
	
	
}

}
