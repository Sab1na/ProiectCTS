package testeSupermarket;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


import clase.Produse;
import clase.Supermarket;

public class TestCalculeazaAdaosCategorie {

	@Test
	public void calculeazaAdaos(){
		ArrayList<Produse> listaA = new ArrayList<Produse>();
		Produse a=new Produse("saratele",2,"patiserie",13,"NuInStoc","2234567892");
		Produse a1=new Produse("blender",3,"electronice",100,"EsteInStoc","1234567893");
		listaA.add(a);
		listaA.add(a1);
		float adaos=a.adaosCategorie()+a1.adaosCategorie();
		
		Supermarket s= new Supermarket(listaA);
		assertEquals(adaos,s.calculeazaAdaosCategorie(),0);
	}
	@Test
	public void calculeazaAdaosListaNulaProduse(){
		ArrayList<Produse> listaA = null;
		Supermarket s=new Supermarket(listaA);
		try{
			System.out.println(s.calculeazaAdaosCategorie());
			fail("lista e nula");
		}
		catch(NullPointerException ex){}
	}
	
	@Test
	public void calculeazaAdaosListaGoalaProduse(){
		ArrayList<Produse> listaA = new ArrayList<Produse>();
		Supermarket s= new Supermarket(listaA);
		assertEquals(0, s.calculeazaAdaosCategorie(),0);
	}
}
