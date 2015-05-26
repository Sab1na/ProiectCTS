package testeSupermarket;




import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ TestAdaosPret.class,
		TestCalculeazaAdaosCategorie.class, TestCalculeazaImpozitul.class,
		testCalculeazaTotalulPlatilor.class, TestCitireDinFisier.class,
		TestCelMaiMarePret.class, TestEliminareProduse.class,TestProduseAlimentare.class,
		TestProduseElectronice.class, TestProduseDecorative.class, TestProduseVestimentare.class ,
		TestModificaPretulProdusului.class, TestAdaugareProdus.class, TestProduseDePatiserie.class })
public class AllTestsSupermarket {
	
	

}
