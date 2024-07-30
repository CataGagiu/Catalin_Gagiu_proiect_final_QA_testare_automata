package com.saucedemo;

import org.testng.annotations.Test;
//validat
public class TestePaginaMeniuDinStangaSus extends PaginaDeBazaDupaLogareFunctiiPtTest
{
    // teste verificare existenta butoane meniu stanga sus

    @Test
    public void verificareExistentaButonAllItemTest()
    {
        verificareExistentaButonAllItem();
    }

    @Test
    public void verificareExistenteiLogoutTest()
    {
        verificareExistenteiLogout();
    }

    @Test
    public void verificareExistentaAboutTest()
    {
        verificareExistentaAbout();
    }

    @Test
    public void verificareExistentaResetAppStateTest()
    {
        verificareExistentaRessetAppState();
    }

    // teste verificare functionalitate apasare butoane meniu stanga sus

    @Test
    public void apasareButoanAllItemTest()
    {
        verificareExistentaButonAllItem();
    }

// verificare existrenta meniu stanga sus dupa apasare butonul de meniu

    @Test
    public void verificareVizibilitateMeniuStangaSus()
    {
        verificareExistentaButonAllItem();
        verificareExistenteiLogout();
        verificareExistentaAbout();
        verificareExistentaRessetAppState();
    }

 // verificare apasare buton si corectitudinea afisarii acestuia

    @Test
    public void verificareApasareButoanLogoutDinMeniuTest()
    {
        apasaButonLogout();
        verificarePaginaUrl(urlPaginaDeStart);
    }

    @Test
    public void verificareApasareButonAboutDinMeniuTest()
    {
        apasaButonAbout();
        verificarePaginaUrl(urlAbout);
    }

    @Test
    public void verificareApasareButonDinMeniuAllItemsTest()
    {
        apasareButoanAllItems();
        verificarePaginaUrl(urlInventoryAllItem);
    }
}
