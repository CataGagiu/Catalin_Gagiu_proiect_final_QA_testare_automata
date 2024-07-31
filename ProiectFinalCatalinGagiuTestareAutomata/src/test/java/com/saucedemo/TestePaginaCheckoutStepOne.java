package com.saucedemo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestePaginaCheckoutStepOne extends PaginaCheckoutStepOneFunctiiPtTest
{
    @BeforeMethod
    public void deLaLogarePanaLaCheckout()
    {
        apasaButonCart();
        apasaButonCheckout();
    }

    @Test
    public void verificaExistentaButonContinueTest()
    {
        verificaExistentaButonContinue();
    }
    
    @Test
    public void verificaExistentaMesajDeEroareNecompletareFormularContinueTest()
    {
        verificaAfisareMesajDeEroareContinueNecompletareFirstName();
    }

    @Test
    public void verificaMesajEroareNecompletareFirstNameContinueTest()
    {
        verificaAfisareMesajDeEroareContinueNecompletareFirstName();
    }

    @Test
    public void verificareMesajEroareNecompletareLastNameContinueTest()
    {
        completeazaCampFirstNameCuVasile();
        verificaAfisareMesajDeEroareContinueNecompletareLastName();
    }

    @Test
    public void verificareMesajEroareNecompletareZipContinueTest()
    {
        completeazaCampFirstNameCuVasile();
        completareCampLastNamePop();
        verificaAfisareMesajDeEroareContinueNecompletareZip();
    }
    @Test
    public void verificaCompletareFormularContinue()
    {
        completeazaCampFirstNameCuVasile();
        completareCampLastNamePop();
        completareCampZip420684();
        apasaButonContinue();
        verificarePaginaUrl(urlChechoutStepTwo);
    }
    @Test
    public void verificareExistentaButonMeniuStangaSusCheckout()
    {
        verificareExistentaElementByXpath(locatorButonMeniuStangaSusByXpath);
    }
    @Test
    public void verificareExistentaMeniuDinCart()
    {
        apasareButonMeniu();
        verificareExistentaButonAllItem();
        verificareExistenteiLogout();
        verificareExistentaAbout();
        verificareExistentaRessetAppState();
    }
    @Test
    public void verificareApasareButoanLogoutDinCartMeniuTest()
    {
        apasareButonMeniu();
        apasaButonLogout();
        verificareExistentaElementByID(locatorButonLoginByID);
    }

    @Test
    public void verificareApasareButonAboutDinCartMeniuTest()
    {
        apasareButonMeniu();
        apasaButonAbout();
    }

    @Test
    public void verificareApasareButonAllItemsCartMeniuTest()
    {
        apasareButonMeniu();
        apasareButoanAllItems();
        verificarePaginaUrl(urlInventoryAllItem);
    }
    @Test
    public void verificareApasareButonCancelDinCheckoutStepOne()
    {
        apasaButonByID(locatorButonCancelById);
        verificarePaginaUrl(urlCart);
    }
    }
