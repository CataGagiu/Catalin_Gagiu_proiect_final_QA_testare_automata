package com.saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
public class PaginaDeBaza
{
    WebDriver driver;

    @Parameters({"browserParam"})
    @BeforeMethod(alwaysRun = true)
    public void setUp(@Optional("chrome") String browser)
    {
        //open page
        String url = "https://www.saucedemo.com/";
        switch (browser)
        {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                driver = new ChromeDriver();
        }

        driver.get(url);
        driver.manage().window().maximize();
    }

    // !!!!!!!!!!!!!!!!Locatori !!!!!!!!!!!!!!!!!!!!
    // pagina de baza
    String locatorCampLoginUserByID="user-name";
    String locatorCampLoginPasswordByID="password";
    String locatorButonLoginByID="login-button";
    String locatorCampEroareByXpath="//div[@id='login_button_container']//form//h3";

    // pagina dupa logare
    String locatorButonMeniuStangaSusByXpath="/html//button[@id='react-burger-menu-btn']";
    String locatorButonAboutDinMeniuStangaSusByXpath="/html//a[@id='about_sidebar_link']";
    String locatorButonCartDreaptaSusByXpath="/html/body/div[1]/div/div/div[1]/div[1]/div[3]/a";

    //pagina About

    String locatorButonCookieInPaginaAboutByXpath="/html/body/div[9]/div[2]/div/div/div[2]/div/div/button[1]";

    //Pagina cart

    String locatorButonCheckoutByID="checkout";
    String locatorButonContinueShopingByname="continue-shopping";

    // !!!!!!!!!!!!!!variabile useri!!!!!!!!!!!!!!!!

    String user1="standard_user";
    String user2="locked_out_user";
    String user3="problem_user";
    String user4="performance_glitch_user";
    String user5="error_user";
    String user6="visual_user";

    // !!!!!!!!!!!!!!variabila parola!!!!!!!!!!!!!!!

    String password="secret_sauce";

    //!!!!!!!!!!!!!!! pentru testare !!!!!!!!!!!!!!!!

    //user
    String user=user5;

    //!!!!!!!!!!!!!!!!!!!mesaje de eroare la logare !!!!!!!!!!!

    String mesajDeEroareUserLipsa="Epic sadface: Username is required";
    String mesajDeEroarePsswordLipsa="Epic sadface: Password is required";
    String mesajDeEroareUserInchis="Epic sadface: Sorry, this user has been locked out.";
    String mesajDeEroareParolaGresita="Epic sadface: Username and password do not match any user in this service";

//@AfterMethod
    public void inchideBrowser()
    {
        if (driver != null)
        {
            driver.quit();
        }
    }

}
