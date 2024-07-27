package com.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class PaginaDeBazaDupaLogareFunctiiPtTest extends LoginBazaFunctiiPtTest
{
    @BeforeMethod

   public void logareUser4()
   {
       introduUserDefinitInPaginaDeBaza();
       introduParolaSecretSauce();
       apasaButonLogin();
       apasareButonMeniu();
   }
//verificari existenta butoane meniu stanga sus

   public void verificareExistentaButonAllItem()
   {
         Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         WebElement butonAllItem=driver.findElement(By.xpath("/html//a[@id='inventory_sidebar_link']"));
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//a[@id='inventory_sidebar_link']")));
         assert butonAllItem.isDisplayed();
   }

   // verificare daca exista buton LOGOUT
    public void verificareExistenteiLogout()
    {
          Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
          WebElement butonLogout=driver.findElement(By.xpath("/html//a[@id='logout_sidebar_link']"));
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//a[@id='logout_sidebar_link']")));
          assert butonLogout.isDisplayed();
    }

    // verificare existenta buton reset About
    public void verificareExistentaAbout()
    {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement butonAbout=driver.findElement(By.xpath("/html//a[@id='about_sidebar_link']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//a[@id='about_sidebar_link']")));
        assert butonAbout.isDisplayed();
    }

    //verificare existenta buton Resset App State
    public void verificareExistentaRessetAppState()
    {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement butonResetAppState=driver.findElement(By.xpath("/html//a[@id='reset_sidebar_link']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//a[@id='reset_sidebar_link']")));
        assert butonResetAppState.isDisplayed();
    }

    //verificari apasare butoane meniu stanga sus

    public void apasareButoanAllItems() // in lucru fara verificare functionalitate
    {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement butonAllItem=driver.findElement(By.xpath("/html//a[@id='inventory_sidebar_link']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//a[@id='inventory_sidebar_link']")));
        butonAllItem.click();

    }

    public void apasareButonResetAppState()  // in lucru fara verificare functionalitate
    {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement butonResetAppState=driver.findElement(By.xpath("/html//a[@id='reset_sidebar_link']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//a[@id='reset_sidebar_link']")));
        butonResetAppState.click();

    }

    public void apasaButonLogout()// finalizat
    {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement butonLogout=driver.findElement(By.xpath("/html//a[@id='logout_sidebar_link']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//a[@id='logout_sidebar_link']")));
        butonLogout.click();
        WebElement butonLogin= driver.findElement(By.id("login-button"));
        assert butonLogin.isDisplayed();
    }

    public void apasaButonAbout()// finalizat
    {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement butonAbout=driver.findElement(By.xpath(locatorButonAboutDinMeniuStangaSusByXpath));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorButonAboutDinMeniuStangaSusByXpath)));
        butonAbout.click();
        String linkAsteptatDirectionareAbout="https://saucelabs.com/";
        WebElement butonCookies=driver.findElement(By.xpath(locatorButonCookieInPaginaAboutByXpath));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorButonCookieInPaginaAboutByXpath)));
        butonCookies.click();
        String linkDirectionareAbout= driver.getCurrentUrl();
        Assert.assertEquals(linkDirectionareAbout,linkAsteptatDirectionareAbout);
    }

    public void verificaExistentaCart()
    {
        WebElement cart=driver.findElement(By.xpath(locatorButonCartDreaptaSusByXpath));
        cart.isDisplayed();
    }

    //Cart
    public void apasaButonCart()
    {
        WebElement cart=driver.findElement(By.xpath(locatorButonCartDreaptaSusByXpath));
        cart.click();
    }

    public void verificaRezultatButonCartApasat()
    {
        String linkDirectionareCartAsteptat="https://www.saucedemo.com/cart.html";
        String linkDirectionareCart= driver.getCurrentUrl();
        Assert.assertEquals(linkDirectionareCart,linkDirectionareCartAsteptat);
    }
    public void apasaButonCheckout()
    {
        WebElement butonCheckout=driver.findElement(By.id(locatorButonCheckoutByID));
        butonCheckout.click();
    }
    public void verificaRezultatButonCheckoutApasat()
    {
        String linkDirectionareChackout= driver.getCurrentUrl();
        String linkDirectionareAsteptatCheckout="https://www.saucedemo.com/checkout-step-one.html";
        Assert.assertEquals(linkDirectionareChackout,linkDirectionareAsteptatCheckout);
    }

    public void verificareExistentaButonContinueShopping()
    {
        WebElement butonContinueShopingShopping=driver.findElement(By.name(locatorButonContinueShopingByname));
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorButonContinueShopingByname)));
        butonContinueShopingShopping.isDisplayed();
    }
    public void apasaButonContinueShopping()
    {
        WebElement butonContinueShopingShopping=driver.findElement(By.name(locatorButonContinueShopingByname));
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorButonContinueShopingByname)));
        butonContinueShopingShopping.click();
    }
    //produse
    //verificare butoane Add To Chart
    public void verificareExistentaButonAddToChart1()
    {
        WebElement butonAddToChartProdus=driver.findElement(By.id(locatorButonAddToChartProdus1ByID));
        butonAddToChartProdus.isDisplayed();
    }
    public void verificareExistentaButonAddToChart2()
    {
        WebElement butonAddToChartProdus=driver.findElement(By.id(locatorButonAddToChartProdus2ByID));
        butonAddToChartProdus.isDisplayed();
    }
    public void verificareExistentaButonAddToChart3()
    {
        WebElement butonAddToChartProdus=driver.findElement(By.id(locatorButonAddToChartProdus3ByID));
        butonAddToChartProdus.isDisplayed();
    }
    public void verificareExistentaButonAddToChart4()
    {
        WebElement butonAddToChartProdus=driver.findElement(By.id(locatorButonAddToChartProdus4ByID));
        butonAddToChartProdus.isDisplayed();
    }
    public void verificareExistentaButonAddToChart5()
    {
        WebElement butonAddToChartProdus=driver.findElement(By.id(locatorButonAddToChartProdus5ByID));
        butonAddToChartProdus.isDisplayed();
    }
    public void verificareExistentaButonAddToChart6()
    {
        WebElement butonAddToChartProdus=driver.findElement(By.id(locatorButonAddToChartProdus6ByID));
        butonAddToChartProdus.isDisplayed();
    }

    //apasa butoane AddToChart

    public void apasaButonAddToChart1()
    {
        WebElement butonAddToChartProdus=driver.findElement(By.id(locatorButonAddToChartProdus1ByID));
        butonAddToChartProdus.click();
    }
    public void apasaButonAddToChart2()
    {
        WebElement butonAddToChartProdus=driver.findElement(By.id(locatorButonAddToChartProdus2ByID));
        butonAddToChartProdus.click();
    }
    public void apasaButonAddToChart3()
    {
        WebElement butonAddToChartProdus=driver.findElement(By.id(locatorButonAddToChartProdus3ByID));
        butonAddToChartProdus.click();
    }
    public void apasaButonAddToChart4()
    {
        WebElement butonAddToChartProdus=driver.findElement(By.id(locatorButonAddToChartProdus4ByID));
        butonAddToChartProdus.click();
    }
    public void apasaButonAddToChart5()
    {
        WebElement butonAddToChartProdus=driver.findElement(By.id(locatorButonAddToChartProdus5ByID));
        butonAddToChartProdus.click();
    }
    public void apasaButonAddToChart6()
    {
        WebElement butonAddToChartProdus=driver.findElement(By.id(locatorButonAddToChartProdus6ByID));
        butonAddToChartProdus.click();
    }
    public void verificareModificareMesajButonAddToChartInRemoveProdus1()
    {
        WebElement butonRemoveProdus=driver.findElement(By.id(locatorButonRemoveProdus1ByID));
        butonRemoveProdus.isDisplayed();
    }

    public void verificareModificareMesajButonAddToChartInRemoveProdus2()
    {
        WebElement butonRemoveProdus=driver.findElement(By.id(locatorButonRemoveProdus2ByID));
        butonRemoveProdus.isDisplayed();
    }
    public void verificareModificareMesajButonAddToChartInRemoveProdus3()
    {
        WebElement butonRemoveProdus=driver.findElement(By.id(locatorButonRemoveProdus3ByID));
        butonRemoveProdus.isDisplayed();
    }
    public void verificareModificareMesajButonAddToChartInRemoveProdus4()
    {
        WebElement butonRemoveProdus=driver.findElement(By.id(locatorButonRemoveProdus4ByID));
        butonRemoveProdus.isDisplayed();
    }
    public void verificareModificareMesajButonAddToChartInRemoveProdus5()
    {
        WebElement butonRemoveProdus=driver.findElement(By.id(locatorButonRemoveProdus5ByID));
        butonRemoveProdus.isDisplayed();
    }
    public void verificareModificareMesajButonAddToChartInRemoveProdus6()
    {
        WebElement butonRemoveProdus=driver.findElement(By.id(locatorButonRemoveProdus6ByID));
        butonRemoveProdus.isDisplayed();
    }
    public void apasaButonRemoveProdus1()
    {
        WebElement butonRemoveProdus=driver.findElement(By.id(locatorButonRemoveProdus1ByID));
        butonRemoveProdus.click();
    }
    public void apasaButonRemoveProdus2()
    {
        WebElement butonRemoveProdus=driver.findElement(By.id(locatorButonRemoveProdus2ByID));
        butonRemoveProdus.click();
    }
    public void apasaButonRemoveProdus3()
    {
        WebElement butonRemoveProdus=driver.findElement(By.id(locatorButonRemoveProdus3ByID));
        butonRemoveProdus.click();
    }
    public void apasaButonRemoveProdus4()
    {
        WebElement butonRemoveProdus=driver.findElement(By.id(locatorButonRemoveProdus4ByID));
        butonRemoveProdus.click();
    }
    public void apasaButonRemoveProdus5()
    {
        WebElement butonRemoveProdus=driver.findElement(By.id(locatorButonRemoveProdus5ByID));
        butonRemoveProdus.click();
    }
    public void apasaButonRemoveProdus6()
    {
        WebElement butonRemoveProdus=driver.findElement(By.id(locatorButonRemoveProdus6ByID));
        butonRemoveProdus.click();
    }

    //verificare imagine produs

    public void verificareImagineProdus1()
    {
        WebElement imagineProdus=driver.findElement(By.xpath(locatorImagineProdus1ByXpath));
        imagineProdus.isDisplayed();
    }
    public void verificareImagineProdus2()
    {
        WebElement imagineProdus=driver.findElement(By.xpath(locatorImagineProdus2ByXpath));
        imagineProdus.isDisplayed();
    }
    public void verificareImagineProdus3()
    {
        WebElement imagineProdus=driver.findElement(By.xpath(locatorImagineProdus3ByXpath));
        imagineProdus.isDisplayed();
    }
    public void verificareImagineProdus4()
    {
        WebElement imagineProdus=driver.findElement(By.xpath(locatorImagineProdus4ByXpath));
        imagineProdus.isDisplayed();
    }
    public void verificareImagineProdus5()
    {
        WebElement imagineProdus=driver.findElement(By.xpath(locatorImagineProdus5ByXpath));
        imagineProdus.isDisplayed();
    }
    public void verificareImagineProdus6()
    {
        WebElement imagineProdus=driver.findElement(By.xpath(locatorImagineProdus6ByXpath));
        imagineProdus.isDisplayed();
    }




}