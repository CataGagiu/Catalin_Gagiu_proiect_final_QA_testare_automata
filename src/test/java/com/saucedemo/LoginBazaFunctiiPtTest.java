package com.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginBazaFunctiiPtTest extends PaginaDeBaza
{
    public void apasaButonLogin()
    {
        WebElement butonLogin= driver.findElement(By.id(locatorButonLoginByID));
        butonLogin.click();
    }

    public void introduParolaSecretSauce()
    {
        WebElement campParola=driver.findElement(By.id(locatorCampLoginPasswordByID));
        campParola.sendKeys(password);
    }
    public void introduUsernameStandardUser()
    {
        WebElement campUsername=driver.findElement(By.id(locatorCampLoginUserByID));
        campUsername.sendKeys(user1);
    }
    public void introduUsernameLockedOutUser()
    {
        WebElement campUsername=driver.findElement(By.id(locatorCampLoginUserByID));
        campUsername.sendKeys(user2);
    }
    public void introduUsernameProblemUser()
    {
        WebElement campUsername=driver.findElement(By.id(locatorCampLoginUserByID));
        campUsername.sendKeys(user3);
    }
    public void introduUsernamePerformanceGlitchUser()
    {
        WebElement campUsername=driver.findElement(By.id(locatorCampLoginUserByID));
        campUsername.sendKeys(user4);
    }
    public void introduUsernameErrorUser()
    {
        WebElement campUsername=driver.findElement(By.id(locatorCampLoginUserByID));
        campUsername.sendKeys(user5);
    }
    public void introduUsernameVisualUser()
    {
        WebElement campUsername=driver.findElement(By.id(locatorCampLoginUserByID));
        campUsername.sendKeys(user6);
    }

    public void introduParolaParolaGresita()
    {
        WebElement campParola=driver.findElement(By.id(locatorCampLoginPasswordByID));
        campParola.sendKeys("parola_gresita");
    }

    public void  verificareMesajParolaLipsa()
    {
        WebElement mesajDeEroare= driver.findElement(By.xpath(locatorCampEroareByXpath));
        String mesajDeEroareAsteptat=mesajDeEroarePsswordLipsa;
        String mesajDeEroareAfisat=mesajDeEroare.getText();
        Assert.assertEquals(mesajDeEroareAfisat,mesajDeEroareAsteptat,"mesajul de eroare nu corespunde asteptarilor");
    }
    public void verificareMesajDeEroareUserLipsa()
    {
        WebElement mesajDeEroare= driver.findElement(By.xpath(locatorCampEroareByXpath));
        String mesajDeEroareAsteptat=mesajDeEroareUserLipsa;
        String mesajDeEroareAfisat=mesajDeEroare.getText();
        Assert.assertEquals(mesajDeEroareAfisat,mesajDeEroareAsteptat,"mesajul de eroare nu corespunde asteptarilor");
    }
    public void verificareLogareButonMeniu()
    {
        WebElement butonMeniu=driver.findElement(By.xpath(locatorButonMeniuStangaSusByXpath));
        assert butonMeniu.isDisplayed();
    }
    public void verificareMesajDeEroareUserBlocat()
    {
    WebElement mesajDeEroare= driver.findElement(By.xpath(locatorCampEroareByXpath));
    String mesajDeEroareAsteptat=mesajDeEroareUserInchis;
    String mesajDeEroareAfisat=mesajDeEroare.getText();
    Assert.assertEquals(mesajDeEroareAfisat,mesajDeEroareAsteptat,"mesajul de eroare nu corespunde asteptarilor");
    }
    public void  verificareMesajParolaGresita()
    {
        WebElement mesajDeEroareParolaLipsa = driver.findElement(By.xpath(locatorCampEroareByXpath));
        String mesajDeEroareAsteptat = mesajDeEroareParolaGresita;
        String mesajDeEroareAfisat = mesajDeEroareParolaLipsa.getText();
        Assert.assertEquals(mesajDeEroareAfisat, mesajDeEroareAsteptat, "mesajul de eroare nu corespunde asteptarilor");
    }
    public void apasareButonMeniu()
    {
        WebElement butonMeniu=driver.findElement(By.xpath(locatorButonMeniuStangaSusByXpath));
        butonMeniu.click();
    }

    public void introduUserDefinitInPaginaDeBaza()
    {
        WebElement campUsername=driver.findElement(By.id(locatorCampLoginUserByID));
        campUsername.sendKeys(user);
    }

}
