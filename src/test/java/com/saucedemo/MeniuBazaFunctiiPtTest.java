package com.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

public class MeniuBazaFunctiiPtTest extends LoginBazaFunctiiPtTest
{
    @BeforeMethod

   public void logareUser4()
   {
       introduUsernameErrorUser();
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

    public void verificareExistenteiLogout()
    {
          Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
          WebElement butonLogout=driver.findElement(By.xpath("/html//a[@id='logout_sidebar_link']"));
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//a[@id='logout_sidebar_link']")));
          assert butonLogout.isDisplayed();
    }

    public void verificareExistentaAbout()
    {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement butonAbout=driver.findElement(By.xpath("/html//a[@id='about_sidebar_link']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//a[@id='about_sidebar_link']")));
        assert butonAbout.isDisplayed();
    }

    public void verificareExistentaResetAppState()
    {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement butonResetAppState=driver.findElement(By.xpath("/html//a[@id='reset_sidebar_link']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//a[@id='reset_sidebar_link']")));
        assert butonResetAppState.isDisplayed();
    }

    //verificari apasare butoane meniu stanga sus

    public void apasareButoanAllItem() // in lucru fara verificare functionalitate
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

        // gaseste buton login
        WebElement butonLogin= driver.findElement(By.id("login-button"));
        assert butonLogin.isDisplayed();
    }

    public void apasaButonAbout()// finalizat
    {   //click pe butonul About
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement butonAbout=driver.findElement(By.xpath("/html//a[@id='about_sidebar_link']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//a[@id='about_sidebar_link']")));
        butonAbout.click();

        // verificare url
        String linkAsteptatDirectionareAbout="https://saucelabs.com/";

        //apasare buton cookies
        WebElement butonCookies=driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")));
        butonCookies.click();

        String linkDirectionareAbout= driver.getCurrentUrl();
        System.out.println(linkDirectionareAbout);
        Assert.assertEquals(linkDirectionareAbout,linkAsteptatDirectionareAbout);
    }
}