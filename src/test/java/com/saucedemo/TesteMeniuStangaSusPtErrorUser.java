package com.saucedemo;

import org.testng.annotations.Test;

public class TesteMeniuStangaSusPtErrorUser extends MeniuBazaFunctiiPtTest
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
        verificareExistentaResetAppState();
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
        verificareExistentaResetAppState();
    }

 // verificare apasare buton si coreectitudinea afisari acestuia

    @Test
    public void verificareApasareButoanLogoutTest()
    {
        apasaButonLogout();
    }
    @Test
    public void verificareApasareButonAboutTest()
    {
        apasaButonAbout();
    }
}
