package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Base {

    By productLabel = By.id("menu_button_container");

    public Boolean isProductLabelDisplayed() {
        return isDisplayed(productLabel);
    }
    public HomePage(WebDriver driver) {
        super(driver);
    }
}
