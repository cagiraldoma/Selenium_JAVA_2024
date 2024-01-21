package com.project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest {

    private WebDriver driver;
    String userName = "standard_user";
    String password = "secret_sauce";

    LoginPage loginPage;
    HomePage homePage;


    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        loginPage.visit("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testLoginUser() {
        loginPage.loginUser(userName, password);
        Assert.assertTrue(homePage.isProductLabelDisplayed());
    }
}