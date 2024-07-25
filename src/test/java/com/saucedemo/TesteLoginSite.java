package com.saucedemo;

import org.testng.annotations.Test;

public class TesteLoginSite extends LoginBazaFunctiiPtTest
{
    // testare functionala credentiale corecte la toti userii
    @Test
    public void credentialeCorecteUser1()// logare functionala credentiale coreocte user 1
    {
        introduUsernameStandardUser();
        introduParolaSecretSauce();
        apasaButonLogin();
        verificareLogareButonMeniu();
    }

    @Test
    public void credentialeCorecteUser2() //logare functionala credentiale coreocte user 2
    {
        introduUsernameLockedOutUser();
        introduParolaSecretSauce();
        apasaButonLogin();
        verificareMesajDeEroareUserBlocat();
    }

    @Test
    public void credentialeCorecteUser3() //logare functionala credentiale coreocte user 3
    {
        introduUsernameProblemUser();
        introduParolaSecretSauce();
        apasaButonLogin();
        verificareLogareButonMeniu();
    }

    @Test
    public void credentialeCorecteUser4() // logare functionala credentiale coreocte user 4
    {
        introduUsernamePerformanceGlitchUser();
        introduParolaSecretSauce();
        apasaButonLogin();
        verificareLogareButonMeniu();
    }

    @Test
    public void credentialeCorecteUser5() // logare functionala credentiale coreocte user 5
    {
        introduUsernameErrorUser();
        introduParolaSecretSauce();
        apasaButonLogin();
        verificareLogareButonMeniu();
    }

    @Test
    public void credentialeCorecteUser6() // logare functionala credentiale coreocte user 6
    {
        introduUsernameVisualUser();
        introduParolaSecretSauce();
        apasaButonLogin();
        verificareLogareButonMeniu();
    }

    //testare nonfunctionala user corect parola gresita la toti userii
    @Test
    public void user1CorectSiParolaGresita() // testare nonfunctionala user1 corect parola gresita
    {
        introduUsernameStandardUser();
        introduParolaParolaGresita();
        apasaButonLogin();
        verificareMesajParolaGresita();
    }

    @Test
    public void user2CorectSiParolaGresita() // testare nonfunctionala user2 corect parola gresita
    {
        introduUsernameLockedOutUser();
        introduParolaParolaGresita();
        apasaButonLogin();
        verificareMesajParolaGresita();
    }

    @Test
    public void user3CorectSiParolaGresita() // testare nonfunctionala user3 corect parola gresita
    {
        introduUsernameProblemUser();
        introduParolaParolaGresita();
        apasaButonLogin();
        verificareMesajParolaGresita();
    }

    @Test
    public void user4CorectSiParolaGresita() // testare nonfunctionala user4 corect parola gresita
    {
        introduUsernamePerformanceGlitchUser();
        introduParolaParolaGresita();
        apasaButonLogin();
        verificareMesajParolaGresita();
    }

    @Test
    public void user5CorectSiParolaGresita() // testare nonfunctionala user5 corect parola gresita
    {
        introduUsernameErrorUser();
        introduParolaParolaGresita();
        apasaButonLogin();
        verificareMesajParolaGresita();
    }

    @Test
    public void user6CorectSiParolaGresita() // testare nonfunctionala user6 corect parola gresita
    {
        introduUsernameVisualUser();
        introduParolaParolaGresita();
        apasaButonLogin();
        verificareMesajParolaGresita();
    }

    // testare nonfunctionala user gol parola corecta
    @Test
    public void userGolParolaCorecta()
    {
        introduParolaSecretSauce();
        apasaButonLogin();
        verificareMesajDeEroareUserLipsa();
    }

    //testare nonfunctionala user corect parola lipsa
    @Test
    public void user1CorectParolaLipsa() // testare nonfunctionala user6 corect parola lipsa
    {
        introduUsernameStandardUser();
        apasaButonLogin();
        verificareMesajParolaLipsa();
    }

    @Test
    public void user2CorectParolaLipsa() // testare nonfunctionala user2 corect parola lipsa
    {
        introduUsernameLockedOutUser();
        apasaButonLogin();
        verificareMesajParolaLipsa();
    }

    @Test
    public void user3CorectParolaLipsa() // testare nonfunctionala user3 corect parola lipsa
    {
        introduUsernameProblemUser();
        apasaButonLogin();
        verificareMesajParolaLipsa();
    }

    @Test
    public void user4CorectParolaLipsa() // testare nonfunctionala user4 corect parola lipsa
    {
        introduUsernamePerformanceGlitchUser();
        apasaButonLogin();
        verificareMesajParolaLipsa();
    }

    @Test
    public void user5CorectParolaLipsa() // testare nonfunctionala user5 corect parola lipsa
    {
        introduUsernameErrorUser();
        apasaButonLogin();
        verificareMesajParolaLipsa();
    }

    @Test
    public void user6CorectParolaLipsa() // testare nonfunctionala user6 corect parola lipsa
    {
        introduUsernameVisualUser();
        apasaButonLogin();
        verificareMesajParolaLipsa();
    }

    @Test
    public void CredentialeLipsaTest()
    {
        apasaButonLogin();
        verificareMesajDeEroareUserLipsa();
    }
}
