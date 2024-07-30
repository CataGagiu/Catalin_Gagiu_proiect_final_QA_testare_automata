package com.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PaginaCartFunctiiPtTest extends PaginaDeBazaDupaLogareFunctiiPtTest
{
// verifica existenta element in Cart
    public void verificaExistentaButonCheckout()
    {
        verificareExistentaElementByID(locatorButonCheckoutByID);
    }
    public void verificaExistentaButonContinue()
    {
        verificareExistentaElementByID(locatorButonContinueByID);
    }
    public boolean verificareExistentaBadgeCart()
    {
        WebElement badge=driver.findElement(By.xpath(locatorBadgeByXpath));
        if (badge.isDisplayed())
        return true;
        return false;
    }

    //apasa butoane
    public void apasaButonCheckout()
    {
        apasaButonByID(locatorButonCheckoutByID);
    }
    public void apasaButonContinue()
    {
        apasaButonByID(locatorButonContinueByID);
    }


}
