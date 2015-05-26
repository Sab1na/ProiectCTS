package testeProduse;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Produse;

public class testReducere {

	@Test
	public void testReducereGenerala() {
		Produse a=new Produse("racoritoare",7,"alimente",6,"EsteInStoc","3234567892");
	
		float reducere = 0;

		if (a.getStatusStoc().equalsIgnoreCase("EsteInStoc")) {
			reducere = (float) (a.getPret() * 0.1);
			
		}  else {

				reducere = (float) (a.getPret() * 0.05);
				
			}

	

		assertEquals(reducere,a.reducere(),0.9);
}
	@Test
	public void testReducereProdusInStoc(){
		Produse a=new Produse("racoritoare",7,"alimente",6,"EsteInStoc","3234567892");
		
		float reducere = (float) (a.getPret() * 0.2);
		assertEquals(reducere,a.reducere(),0.5);
	}
	
	@Test
	public void testReducereProdusNuEsteInStoc(){
		Produse a=new Produse("racoritoare",7,"alimente",6,"NuEsteInStoc","3234567892");
		
		float reducere = (float) (a.getPret() * 0.1);
		assertEquals(reducere,a.reducere(),0.7);
	}
	
	@Test
	public void testProdusInexistent(){
		Produse a=new Produse("racoritoare",7,"alimente",6,"Inexistent","3234567892");
		
		float reducere = 0;
		assertEquals(reducere,a.reducere(),0);
	}
}
