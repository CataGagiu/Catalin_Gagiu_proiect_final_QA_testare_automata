package com.saucedemo;

import org.testng.annotations.Test;
//validate
public class TesteLoginSite extends LoginBazaFunctiiPtTest
{
    // testare functionala credentiale corecte la toti userii
    @Test
    public void credentialeCorecteUser1Test()// logare functionala credentiale coreocte user 1
    {
        introduUsernameStandardUser();
        introduParolaSecretSauce();
        apasaButonLogin();
        verificareLogareButonMeniu();
    }

    @Test
    public void credentialeCorecteUser2Test() //logare functionala credentiale coreocte user 2
    {
        introduUsernameLockedOutUser();
        introduParolaSecretSauce();;
        apasaButonLogin();
        verificareMesajDeEroareUserBlocat();
    }

    @Test
    public void credentialeCorecteUser3Test() //logare functionala credentiale coreocte user 3
    {
        introduUsernameProblemUser();
        introduParolaSecretSauce();
        apasaButonLogin();
        verificareLogareButonMeniu();
    }

    @Test
    public void credentialeCorecteUser4Test() // logare functionala credentiale coreocte user 4
    {
        introduUsernamePerformanceGlitchUser();
        introduParolaSecretSauce();
        apasaButonLogin();
        verificareLogareButonMeniu();
    }

    @Test
    public void credentialeCorecteUser5Test() // logare functionala credentiale coreocte user 5
    {
        introduUsernameErrorUser();
        introduParolaSecretSauce();
        apasaButonLogin();
        verificareLogareButonMeniu();
    }

    @Test
    public void credentialeCorecteUser6Test() // logare functionala credentiale coreocte user 6
    {
        introduUsernameVisualUser();
        introduParolaSecretSauce();
        apasaButonLogin();
        verificareLogareButonMeniu();
    }

    //testare nonfunctionala user corect parola gresita la toti userii
    @Test
    public void user1CorectSiParolaGresitaTest() // testare nonfunctionala user1 corect parola gresita
    {
        introduUsernameStandardUser();
        introduParolaParolaGresita();
        apasaButonLogin();
        verificareMesajParolaGresita();
    }

    @Test
    public void user2CorectSiParolaGresitaTest() // testare nonfunctionala user2 corect parola gresita
    {
        introduUsernameLockedOutUser();
        introduParolaParolaGresita();
        apasaButonLogin();
        verificareMesajParolaGresita();
    }

    @Test
    public void user3CorectSiParolaGresitaTest() // testare nonfunctionala user3 corect parola gresita
    {
        introduUsernameProblemUser();
        introduParolaParolaGresita();
        apasaButonLogin();
        verificareMesajParolaGresita();
    }

    @Test
    public void user4CorectSiParolaGresitaTest() // testare nonfunctionala user4 corect parola gresita
    {
        introduUsernamePerformanceGlitchUser();
        introduParolaParolaGresita();
        apasaButonLogin();
        verificareMesajParolaGresita();
    }

    @Test
    public void user5CorectSiParolaGresitaTest() // testare nonfunctionala user5 corect parola gresita
    {
        introduUsernameErrorUser();
        introduParolaParolaGresita();
        apasaButonLogin();
        verificareMesajParolaGresita();
    }

    @Test
    public void user6CorectSiParolaGresitaTest() // testare nonfunctionala user6 corect parola gresita
    {
        introduUsernameVisualUser();
        introduParolaParolaGresita();
        apasaButonLogin();
        verificareMesajParolaGresita();
    }

    // testare nonfunctionala user gol parola corecta
    @Test
    public void userGolParolaCorectaTest()
    {
        introduParolaSecretSauce();
        apasaButonLogin();
        verificareMesajDeEroareUserLipsa();
    }

    //testare nonfunctionala user corect parola lipsa
    @Test
    public void user1CorectParolaLipsaTest() // testare nonfunctionala user6 corect parola lipsa
    {
        introduUsernameStandardUser();
        apasaButonLogin();
        verificareMesajParolaLipsa();
    }

    @Test
    public void user2CorectParolaLipsaTest() // testare nonfunctionala user2 corect parola lipsa
    {
        introduUsernameLockedOutUser();
        apasaButonLogin();
        verificareMesajParolaLipsa();
    }

    @Test
    public void user3CorectParolaLipsaTest() // testare nonfunctionala user3 corect parola lipsa
    {
        introduUsernameProblemUser();
        apasaButonLogin();
        verificareMesajParolaLipsa();
    }

    @Test
    public void user4CorectParolaLipsaTest() // testare nonfunctionala user4 corect parola lipsa
    {
        introduUsernamePerformanceGlitchUser();
        apasaButonLogin();
        verificareMesajParolaLipsa();
    }

    @Test
    public void user5CorectParolaLipsaTest() // testare nonfunctionala user5 corect parola lipsa
    {
        introduUsernameErrorUser();
        apasaButonLogin();
        verificareMesajParolaLipsa();
    }

    @Test
    public void user6CorectParolaLipsaTest() // testare nonfunctionala user6 corect parola lipsa
    {
        introduUsernameVisualUser();
        apasaButonLogin();
        verificareMesajParolaLipsa();
    }

    @Test
    public void CredentialeLipsaTest()//testare nonfunctionala credentiale lipsa
    {
        apasaButonLogin();
        verificareMesajDeEroareUserLipsa();
    }
}
