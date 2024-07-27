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

    //locatori butoane produse
    String locatorButonAddToChartProdus1ByID="add-to-cart-sauce-labs-backpack";
    String locatorButonAddToChartProdus2ByID="add-to-cart-sauce-labs-bike-light";
    String locatorButonAddToChartProdus3ByID="add-to-cart-sauce-labs-bolt-t-shirt";
    String locatorButonAddToChartProdus4ByID="add-to-cart-sauce-labs-fleece-jacket";
    String locatorButonAddToChartProdus5ByID="add-to-cart-sauce-labs-onesie";
    String locatorButonAddToChartProdus6ByID="add-to-cart-test.allthethings()-t-shirt-(red)";
    String locatorButonRemoveProdus1ByID="remove-sauce-labs-backpack";
    String locatorButonRemoveProdus2ByID ="remove-sauce-labs-bike-light";
    String locatorButonRemoveProdus3ByID="remove-sauce-labs-bolt-t-shirt";
    String locatorButonRemoveProdus4ByID="remove-sauce-labs-fleece-jacket";
    String locatorButonRemoveProdus5ByID="remove-sauce-labs-onesie";
    String locatorButonRemoveProdus6ByID="remove-test.allthethings()-t-shirt-(red)";
    String locatorImagineProdus1ByXpath="//*[@id=\"item_4_img_link\"]/img";
    String locatorImagineProdus2ByXpath="//*[@id=\"item_0_img_link\"]/img";
    String locatorImagineProdus3ByXpath="//*[@id=\"item_1_img_link\"]/img";
    String locatorImagineProdus4ByXpath="//*[@id=\"item_5_img_link\"]/img";
    String locatorImagineProdus5ByXpath="//*[@id=\"item_2_img_link\"]/img";
    String locatorImagineProdus6ByXpath="//*[@id=\"item_3_img_link\"]/img";

    // !!!!!!!!!!!!!!variabile useri!!!!!!!!!!!!!!!!

    String user1="standard_user";
    String user2="locked_out_user";
    String user3="problem_user";
    String user4="performance_glitch_user";
    String user5="error_user";
    String user6="visual_user";
    // !!!!!!!!!!!!!variabile produse!!!!!!!!!!!!!!!

    String denumireProdus1="Sauce Labs Backpack";
    String denumireProdus2="Sauce Labs Bike Light";
    String denumireProdus3="Sauce Labs Bolt T-Shirt";
    String denumireProdus4="Sauce Labs Fleece Jacket";
    String denumireProdus5="Sauce Labs Onesie";
    String denumireProdus6="Test.allTheThings() T-Shirt (Red)";

    // !!!!!!!!!!!!!!variabila parola!!!!!!!!!!!!!!!

    String password="secret_sauce";

    //!!!!!!!!!!!!!!! pentru testare !!!!!!!!!!!!!!!!

    //user
    String user=user1;

    //!!!!!!!!!!!!!!!!!!!mesaje de eroare la logare !!!!!!!!!!!

    String mesajDeEroareUserLipsa="Epic sadface: Username is required";
    String mesajDeEroarePsswordLipsa="Epic sadface: Password is required";
    String mesajDeEroareUserInchis="Epic sadface: Sorry, this user has been locked out.";
    String mesajDeEroareParolaGresita="Epic sadface: Username and password do not match any user in this service";

@AfterMethod
    public void inchideBrowser()
    {
        if (driver != null)
        {
            driver.quit();
        }
    }

}
