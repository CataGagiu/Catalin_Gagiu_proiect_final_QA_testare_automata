package com.saucedemo;

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
