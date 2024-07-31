package com.saucedemo;

import org.testng.annotations.Test;
//validat
public class TesteVerificareProduse extends PaginaCartFunctiiPtTest
{
    @Test
    public void verificareExistentaButonAddToChartProdus1Test()
    {
        verificareExistentaButonAddToChart1();
    }
    @Test
    public void verificareExistentaButonAddToChartProdus2Test()
    {
        verificareExistentaButonAddToChart2();
    }@Test
    public void verificareExistentaButonAddToChartProdus3Test()
    {
        verificareExistentaButonAddToChart3();
    }
    @Test
    public void verificareExistentaButonAddToChartProdus4Test()
    {
        verificareExistentaButonAddToChart4();
    }
    @Test
    public void verificareExistentaButonAddToChartProdus5Test()
    {
        verificareExistentaButonAddToChart5();
    }
    @Test
    public void verificareExistentaButonAddToChartProdus6Test()
    {
        verificareExistentaButonAddToChart6();
    }

    @Test
    public void apasaButonAddToChartProdus1Test()
    {
        apasaButonByID(locatorButonAddToChartProdus1ByID);
        verificareModificareMesajButonAddToChartInRemoveProdus1();

    }

    @Test
    public void apasaButonAddToChartProdus2Test()
    {
        apasaButonByID(locatorButonAddToChartProdus2ByID);
        verificareModificareMesajButonAddToChartInRemoveProdus2();
        verificareExistentaBadgeCart();
    }

    @Test
    public void apasaButonAddToChartProdus3Test()
    {
        apasaButonByID(locatorButonAddToChartProdus3ByID);
        verificareModificareMesajButonAddToChartInRemoveProdus3();
        verificareExistentaBadgeCart();
    }

    @Test
    public void apasaButonAddToChartProdus4Test()
    {
        apasaButonByID(locatorButonAddToChartProdus4ByID);
        verificareModificareMesajButonAddToChartInRemoveProdus4();
        verificareExistentaBadgeCart();
    }

    @Test
    public void apasaButonAddToChartProdus5Test()
    {
        apasaButonByID(locatorButonAddToChartProdus5ByID);
        verificareModificareMesajButonAddToChartInRemoveProdus5();
        verificareExistentaBadgeCart();
    }

    @Test
    public void apasaButonAddToChartProdus6Test()
    {
        apasaButonByID(locatorButonAddToChartProdus6ByID);
        verificareModificareMesajButonAddToChartInRemoveProdus6();
        verificareExistentaBadgeCart();
    }

    //verificare existenta butoane remove
    @Test
    public void verificaExistentaButonRemoveProdus1Test()
    {
        apasaButonAddToChart1();
        verificareModificareMesajButonAddToChartInRemoveProdus1();
    }
    @Test
    public void verificaExistentaButonRemoveProdus2Test()
    {
        apasaButonAddToChart2();
        verificareModificareMesajButonAddToChartInRemoveProdus2();
    }
    @Test
    public void verificaExistentaButonRemoveProdus3Test()
    {
        apasaButonAddToChart3();
        verificareModificareMesajButonAddToChartInRemoveProdus3();
    }
    @Test
    public void verificaExistentaButonRemoveProdus4Test()
    {
        apasaButonAddToChart4();
        verificareModificareMesajButonAddToChartInRemoveProdus4();
    }
    @Test
    public void verificaExistentaButonRemoveProdus5Test()
    {
        apasaButonAddToChart5();
        verificareModificareMesajButonAddToChartInRemoveProdus5();
    }
    @Test
    public void verificaExistentaButonRemoveProdus6Test()
    {
        apasaButonAddToChart6();
        verificareModificareMesajButonAddToChartInRemoveProdus6();
    }
    // apasa buton Remove

    @Test
    public void apasaButonRemoveProdus1Test()
    {
        apasaButonAddToChart1();
        apasaButonRemoveProdus1();
        verificareExistentaButonAddToChart1();
    }
    @Test
    public void apasaButonRemoveProdus2Test()
    {
        apasaButonAddToChart2();
        apasaButonRemoveProdus2();
        verificareExistentaButonAddToChart2();
    }
    @Test
    public void apasaButonRemoveProdus3Test()
    {
        apasaButonAddToChart3();
        apasaButonRemoveProdus3();
        verificareExistentaButonAddToChart3();
    }
    @Test
    public void apasaButonRemoveProdus4Test()
    {
        apasaButonAddToChart4();
        apasaButonRemoveProdus4();
        verificareExistentaButonAddToChart4();
    }
    @Test
    public void apasaButonRemoveProdus5Test()
    {
        apasaButonAddToChart5();
        apasaButonRemoveProdus5();
        verificareExistentaButonAddToChart5();
    }
    @Test
    public void apasaButonRemoveProdus6Test()
    {
        apasaButonAddToChart6();
        apasaButonRemoveProdus6();
        verificareExistentaButonAddToChart6();
    }

    @Test
    public void verificareImagineProdus1Test()
    {
        verificareImagineProdus1();
    }

    @Test
    public void verificareImagineProdus2Test()
    {
        verificareImagineProdus2();
    }
    @Test
    public void verificareImagineProdus3Test()
    {
        verificareImagineProdus3();
    }
    @Test
    public void verificareImagineProdus4Test()
    {
        verificareImagineProdus4();
    }
    @Test
    public void verificareImagineProdus5Test()
    {
        verificareImagineProdus5();
    }
    @Test
    public void verificareImagineProdus6Test()
    {
        verificareImagineProdus6();
    }
    @Test
    public void verificarePretProdus1Test()
    {
        verificaPretProdus1();
    }
    @Test
    public void verificarePretProdus2Test()
    {
        verificaPretProdus2();
    }
    @Test
    public void verificarePretProdus3Test()
    {
        verificaPretProdus3();
    }
    @Test
    public void verificarePretProdus4Test()
    {
        verificaPretProdus4();
    }
    @Test
    public void verificarePretProdus5Test()
    {
        verificaPretProdus5();
    }
    @Test
    public void verificarePretProdus6Test()
    {
        verificaPretProdus6();
    }

    @Test
    public void verificaDenumireProdus1()
    {
        verificaDenumireProdus(denumireProdus1,locatorDenumireProdus1Css);
    }
    @Test
    public void verificaDenumireProdus2()
    {
        verificaDenumireProdus(denumireProdus2,locatorDenumirePRODUS2Css);
    }
    @Test
    public void verificaDenumireProdus3()
    {
        verificaDenumireProdus(denumireProdus3,locatorDenumireProdus3Css);
    }
    @Test
    public void verificaDenumireProdus4()
    {
        verificaDenumireProdus(denumireProdus4,locatorDenumireProdus4Css);
    }
    @Test
    public void verificaDenumireProdus5()
    {
        verificaDenumireProdus(denumireProdus5,locatorDenumireProdus5Css);
    }
    @Test
    public void verificaDenumireProdus6()
    {
        verificaDenumireProdus(denumireProdus6,locatorDenumireProdus6Css);
    }
    @Test
    public void verificaDescriereProdus1()
    {
        apasaButonByXpath("//*[@id=\"react-burger-cross-btn\"]");
        verificaDescriereProduse(descriereProdus1,locatorDescriereProdus1ByXpath);
    }


    @Test
    public void verificaDescriereProdus2()
    {
        apasaButonByXpath("//*[@id=\"react-burger-cross-btn\"]");
        verificaDescriereProduse(descriereProdus2,locatorDescriereProdus2ByXpath);
    }
    @Test
    public void verificaDescriereProdus3()
    {
        apasaButonByXpath("//*[@id=\"react-burger-cross-btn\"]");
        verificaDescriereProduse(descriereProdus3,locatorDescriereProdus3ByXpath);
    }
    @Test
    public void verificaDescriereProdus4()
    {
        apasaButonByXpath("//*[@id=\"react-burger-cross-btn\"]");
        verificaDescriereProduse(descriereProdus4,locatorDescriereProdus4ByXpath);
    }
    @Test
    public void verificaDescriereProdus5()
    {
        apasaButonByXpath("//*[@id=\"react-burger-cross-btn\"]");
        verificaDescriereProduse(descriereProdus5,locatorDescriereProdus5ByXpath);
    }
    @Test
    public void verificaDescriereProdus6()
    {
        apasaButonByXpath("//*[@id=\"react-burger-cross-btn\"]");
        verificaDescriereProduse(descriereProdus6,locatorDescriereProdus6ByXpath);
    }
}
