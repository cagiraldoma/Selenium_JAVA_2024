package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Base {

    By userNameInput = By.id("user-name");
    By passwordInput = By.id("password");
    By loginButton = By.id("login-button");

    public void loginUser (String userName, String password) {
        type(userName, userNameInput);
        type(password, passwordInput);
        click(loginButton);
    }

    public LoginPage(WebDriver driver) {
        super(driver);
    }


}
