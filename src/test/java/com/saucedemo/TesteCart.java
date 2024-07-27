package com.saucedemo;

import org.testng.annotations.Test;

public class TesteCart extends PaginaCartFunctiiPtTest
{
    @Test
    public void verificaExistentaButonCartTest()
    {
        verificaExistentaCart();
    }

    @Test
    public void verificaButonCartApasatTest()
    {
        apasaButonCart();
        verificaRezultatButonCartApasat();
    }

    @Test
    public void verificaExistentaButonCheckoutInCartTest()
    {
        apasaButonCart();
        verificaExistentaButonCheckout();
    }

    @Test
    public void apasaButonCheckoutTest()
    {
        apasaButonCart();
        apasaButonCheckout();
        verificaRezultatButonCheckoutApasat();
    }

    @Test
    public void existentaButonContinueShoppingTest()
    {
        apasaButonCart();
        verificareExistentaButonContinueShopping();
    }

    @Test
    void apasaButonContinueShoppingTest()
    {
        apasaButonCart();
        apasaButonContinueShopping();

    }
}
