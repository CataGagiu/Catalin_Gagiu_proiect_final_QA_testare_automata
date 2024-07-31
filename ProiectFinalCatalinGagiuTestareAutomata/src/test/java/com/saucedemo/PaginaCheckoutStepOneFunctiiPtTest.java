package com.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;



public class PaginaCheckoutStepOneFunctiiPtTest extends PaginaCartFunctiiPtTest
{
    public void completeazaCampFirstNameCuVasile()
    {
        completeazaCampByID(locatorCampFirstNameByID,"Vasile");
    }
    public void completareCampLastNamePop()
    {
        completeazaCampByID(locatorCampLastNameByID,"Pop");
    }
    public void completareCampZip420684()
    {
        completeazaCampByID(locatorCampZipCodeByID,"420684");
    }
    public void verificareMesajEroareNecompletareCorectaFormularCheckoutContinue(String mesajAsteptat)
    {
        WebElement mesajEroare=driver.findElement(By.cssSelector(locatorMesajEroareContinueCss));
        String mesajExistent=mesajEroare.getText();
        Assert.assertEquals(mesajExistent,mesajAsteptat);
    }

    public void verificaAfisareMesajDeEroareContinueNecompletareFirstName()
    {
        apasaButonContinue();
        verificareMesajEroareNecompletareCorectaFormularCheckoutContinue(mesajDeEroareContinueFaraNume);
    }
    public void verificaAfisareMesajDeEroareContinueNecompletareLastName()
    {
        apasaButonContinue();
        verificareMesajEroareNecompletareCorectaFormularCheckoutContinue(mesajDeEroareContinueLastName);

    }
    public void verificaAfisareMesajDeEroareContinueNecompletareZip()
    {
        apasaButonContinue();
        verificareMesajEroareNecompletareCorectaFormularCheckoutContinue(mesajDeEroareContinueZip);
    }

}
