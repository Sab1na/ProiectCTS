package testeSupermarket;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import clase.Produse;
import clase.Supermarket;



public class testCalculeazaTotalulPlatilor {

	@Test
	public void testCalculeazaTotalPlati() {
		ArrayList<Produse> Produse= new ArrayList<Produse>();
		
		Produse a=new Produse("saratele",2,"patiserie",13,"NuInStoc","2234567892");
		
		
		Produse.add(a);
		
		
		float total=a.adaosCategorie()+a.getPret();
		
		Supermarket s= new Supermarket(Produse);
		assertEquals(total,s.calculeazaPlatiTotale(),0);
	}

	
	@Test
	public void calculeazaTotalListaNulaProduse(){
		ArrayList<Produse> Produse = null;
		Supermarket s=new Supermarket(Produse);
		try{
			System.out.println(s.calculeazaPlatiTotale());
			fail("lista e nula");
		}
		catch(NullPointerException ex){}
	}
	
	@Test
	public void calculeazaPretListaGoalaProduse(){
		ArrayList<Produse> Produse = new ArrayList<Produse>();
		Supermarket s= new Supermarket(Produse);
		assertEquals(0, s.calculeazaPlatiTotale(),0);
	}
	
}
