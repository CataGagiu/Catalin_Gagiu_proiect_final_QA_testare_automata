package com.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

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
        WebElement butonAddToChartProdus=driver.findElement(By.id(locatorButonAddToChartProdus1ByID));
        butonAddToChartProdus.click();
    }

    @Test
    public void apasaButonAddToChartProdus2Test()
    {
        WebElement butonAddToChartProdus=driver.findElement(By.id(locatorButonAddToChartProdus2ByID));
        butonAddToChartProdus.click();
    }

    @Test
    public void apasaButonAddToChartProdus3Test()
    {
        WebElement butonAddToChartProdus=driver.findElement(By.id(locatorButonAddToChartProdus3ByID));
        butonAddToChartProdus.click();
    }

    @Test
    public void apasaButonAddToChartProdus4Test()
    {
        WebElement butonAddToChartProdus=driver.findElement(By.id(locatorButonAddToChartProdus4ByID));
        butonAddToChartProdus.click();
    }

    @Test
    public void apasaButonAddToChartProdus5Test()
    {
        WebElement butonAddToChartProdus=driver.findElement(By.id(locatorButonAddToChartProdus5ByID));
        butonAddToChartProdus.click();
    }

    @Test
    public void apasaButonAddToChartProdus6Test()
    {
        WebElement butonAddToChartProdus=driver.findElement(By.id(locatorButonAddToChartProdus6ByID));
        butonAddToChartProdus.click();
    }

    //verificare existenta butoane remove
    @Test
    public void verificaExistentaButonRemoveProdus1()
    {
        apasaButonAddToChart1();
        verificareModificareMesajButonAddToChartInRemoveProdus1();
    }
    @Test
    public void verificaExistentaButonRemoveProdus2()
    {
        apasaButonAddToChart2();
        verificareModificareMesajButonAddToChartInRemoveProdus2();
    }
    @Test
    public void verificaExistentaButonRemoveProdus3()
    {
        apasaButonAddToChart3();
        verificareModificareMesajButonAddToChartInRemoveProdus3();
    }
    @Test
    public void verificaExistentaButonRemoveProdus4()
    {
        apasaButonAddToChart4();
        verificareModificareMesajButonAddToChartInRemoveProdus4();
    }
    @Test
    public void verificaExistentaButonRemoveProdus5()
    {
        apasaButonAddToChart5();
        verificareModificareMesajButonAddToChartInRemoveProdus5();
    }
    @Test
    public void verificaExistentaButonRemoveProdus6()
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





}
