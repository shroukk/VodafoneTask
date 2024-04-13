package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_LoginPage extends P00_BasePage {


    public P02_LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By phoneField = By.id("username");
    public void enterPhoneNumber(String phone){
        driver.findElement(phoneField).sendKeys(phone);
    }
    private final By passwordField = By.id("password");
    public void enterPass(String pass){
        driver.findElement(passwordField).sendKeys(pass);
    }

    private final By loginBtn = By.id("submitBtn");
    public void clickLogin(){
        driver.findElement(loginBtn).click();
    }

    public void login(String phone, String pass){
        enterPhoneNumber(phone);
        enterPass(pass);
        clickLogin();
    }
}
