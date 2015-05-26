package testeSupermarket;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;




import clase.Produse;
import clase.Supermarket;

public class TestCalculeazaImpozitul {

	@Test
	public void calculeazaImpozit(){
		ArrayList<Produse> Produse = new ArrayList<Produse>();
		Produse a=new Produse("saratele",2,"alimente",13,"EsteInStoc","2234567892");
		Produse a1=new Produse("ciocolata",3,"alimente",12,"EsteInStoc","2234567893");
		Produse.add(a);
		Produse.add(a1);
		
		float imp=a.impozit()+a1.impozit();
		Supermarket s= new Supermarket(Produse);
		assertEquals(imp,s.calculeazaImpozit(),0);
	}
	
	@Test
	public void calculeazaImpozitListaNulaProduse(){
		ArrayList<Produse> Produse = null;
		Supermarket s=new Supermarket(Produse);
		try{
			System.out.println(s.calculeazaImpozit());
			fail("lista e nula");
		}
		catch(NullPointerException ex){}
	}
	
	@Test
	public void calculeazaImpozitListaGoalaProduse(){
		ArrayList<Produse> Produse = new ArrayList<Produse>();
		Supermarket s= new Supermarket(Produse);
		assertEquals(0, s.calculeazaImpozit(),0);
	}
}
