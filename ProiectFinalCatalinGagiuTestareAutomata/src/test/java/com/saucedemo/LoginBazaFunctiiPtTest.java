package com.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginBazaFunctiiPtTest extends PaginaDeBaza
{
    //verificare element locatie

    public void verificareExistentaElementByXpath(String locatorElement)
    {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element=driver.findElement(By.xpath(locatorElement));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorElement)));
        assert element.isDisplayed();
    }
    public void  verificareExistentaElementByNume(String locatorElement)
    {
        WebElement element=driver.findElement(By.name(locatorElement));
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorElement)));
        assert element.isDisplayed();
    }
    public void verificareExistentaElementByID(String locatieElementID)
    {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element= driver.findElement(By.id(locatieElementID));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatieElementID)));
        assert element.isDisplayed();
    }
    public void verificareExistentaElementXpath(String locatieElementID)
    {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element= driver.findElement(By.xpath(locatieElementID));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatieElementID)));
        assert element.isDisplayed();
    }
    public void verificareExistentaElementByCss(String locatorElementCss)
    {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element=driver.findElement(By.cssSelector(locatorElementCss));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorElementCss)));
        assert element.isDisplayed();
    }
    public void verificaPretProdusByCss(String pretProd,String locatorPretProdus)

    {
        WebElement pretProdus=driver.findElement(By.cssSelector(locatorPretProdus));
        String pretAfisat=pretProdus.getText();
        Assert.assertEquals(pretAfisat, pretProd);
    }
    public void verificaDenumireProdus(String denum,String locatornumeProdus)

    {
        WebElement pretProdus=driver.findElement(By.cssSelector(locatornumeProdus));
        String numeAfisat=pretProdus.getText();
        Assert.assertEquals(numeAfisat, denum);
    }
    public void verificaDescriereProduse(String descriereProdus,String locatordescriereProdus)

    {
        WebElement descriere=driver.findElement(By.xpath(locatordescriereProdus));
        String descriereAfisata=descriere.getText();
        Assert.assertEquals(descriereAfisata, descriereProdus);
    }


    //apasa buton

    public void apasaButonByNume(String locatorElement)
    {
        WebElement buton = driver.findElement(By.name(locatorElement));
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorElement)));
        buton.click();
    }

    public void apasaButonByXpath(String locatorElement)
    {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement buton=driver.findElement(By.xpath(locatorElement));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorElement)));
        buton.click();
    }

    public void apasaButonByID(String locatorByID)
    {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement buton=driver.findElement(By.id(locatorByID));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorByID)));
        buton.click();
    }

    //Verificare pagina url corespunde asteptarilor

    public void verificarePaginaUrl(String urlFunctie)
    {
        String linkDirectionareChackout= driver.getCurrentUrl();
        Assert.assertEquals(linkDirectionareChackout,urlFunctie);
    }

    // completeaza camp
    public void completeazaCampByID(String locatorCamp,String textul)
    {
        WebElement text=driver.findElement(By.id(locatorCamp));
        text.sendKeys(textul);
    }
    // verificare de eroare login gresit
    public void  verificareMesajDeEroareLoginGresit(String mesajDeEroareAsteptat)
    {
        WebElement mesajDeEroare= driver.findElement(By.xpath(locatorCampEroareByXpath));
        String mesajDeEroareAfisat=mesajDeEroare.getText();
        Assert.assertEquals(mesajDeEroareAfisat,mesajDeEroareAsteptat,mesajDeEroarePicareTestLogin);
    }

    public void introduParolaSecretSauce()
    {
        completeazaCampByID(locatorCampLoginPasswordByID,password);
    }
    public void introduUsernameStandardUser()
    {
        completeazaCampByID(locatorCampLoginUserByID,user1);
    }
    public void introduUsernameLockedOutUser()
    {
        completeazaCampByID(locatorCampLoginUserByID,user2);
    }
    public void introduUsernameProblemUser()
    {
        completeazaCampByID(locatorCampLoginUserByID,user3);
    }
    public void introduUsernamePerformanceGlitchUser()
    {
        completeazaCampByID(locatorCampLoginUserByID,user4);
    }
    public void introduUsernameErrorUser()
    {
        completeazaCampByID(locatorCampLoginUserByID,user5);
    }
    public void introduUsernameVisualUser()
    {
        completeazaCampByID(locatorCampLoginUserByID,user6);
    }
    public void introduParolaParolaGresita()
    {
        completeazaCampByID(locatorCampLoginPasswordByID,"parola gresita");
    }

    //verificari
    public void  verificareMesajParolaLipsa()
    {
        verificareMesajDeEroareLoginGresit(mesajDeEroarePsswordLipsa);
    }
    public void verificareMesajDeEroareUserLipsa()
    {
        verificareMesajDeEroareLoginGresit(mesajDeEroareUserLipsa);
    }
    public void verificareLogareButonMeniu()
    {
        verificareExistentaElementByXpath(locatorButonMeniuStangaSusByXpath);
    }
    public void verificareMesajDeEroareUserBlocat()
    {
        verificareMesajDeEroareLoginGresit(mesajDeEroareUserInchis);
    }
    public void  verificareMesajParolaGresita()
    {
        verificareMesajDeEroareLoginGresit(mesajDeEroareParolaGresita);
    }

    // apasa buton meniu stanga sus
    public void apasaButonLogin()
    {
        apasaButonByID(locatorButonLoginByID);
    }
    public void apasareButonMeniu()
    {
        apasaButonByXpath(locatorButonMeniuStangaSusByXpath);
    }

    //introdu user definit in pagina de baza
    public void introduUserDefinitInPaginaDeBaza()
    {
        completeazaCampByID(locatorCampLoginUserByID,user);
    }

}
