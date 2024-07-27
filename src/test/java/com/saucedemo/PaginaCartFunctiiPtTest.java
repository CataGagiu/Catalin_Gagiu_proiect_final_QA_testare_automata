package com.saucedemo;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class PaginaCartFunctiiPtTest extends PaginaDeBazaDupaLogareFunctiiPtTest
{

    public void verificaExistentaButonCheckout()
    {
        WebElement butonCheckout=driver.findElement(By.id(locatorButonCheckoutByID));
        butonCheckout.isDisplayed();
    }
public void apasaButonCheckout()
    {
        apasaButonCart();
        WebElement butonCheckout=driver.findElement(By.id(locatorButonCheckoutByID));
        butonCheckout.click();
    }
}
