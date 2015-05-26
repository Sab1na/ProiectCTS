package testeSupermarket;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.junit.Test;

import clase.Produse;
import clase.Supermarket;

public class TestCitireDinFisier {

	@Test
	public void test() {
		Supermarket s=Supermarket.getInstance();
		Produse a=new Produse("mixer",2,"electronice",12,"EsteInStoc","1234567892");
		
		try{
			FileReader reader=new FileReader("angajatTest.txt");
			BufferedReader bf=new BufferedReader(reader);
			String linie=null;
			while((linie=bf.readLine())!=null && (linie.length())!=0){
				linie=bf.readLine();
				 String[] elemente = linie.split(",");
	                if(elemente.length!=6){
	                    throw new Exception("Linie invalida!");
	                }
	                Produse a1 = new Produse();
	                a.setDenumire(elemente[0]);
	                a.setId(Integer.parseInt(elemente[1].trim()));
	                a.setCategorie(elemente[2]);
	                a.setPret(Integer.parseInt(elemente[3].trim()));
	                a.setStatusStoc(elemente[4]);
	                a.setCodBare(elemente[5]);
	                linie = bf.readLine();
	                s.getListaProduse().add(a);           
	                
			}
			
			bf.close();
			reader.close();
			assertEquals(a,s.getProduse(a));
			
		}
		catch(FileNotFoundException ex){}
		catch(Exception ex){}
		}

}
