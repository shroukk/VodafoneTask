package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class P00_BasePage {
    protected WebDriver driver;

    public P00_BasePage(WebDriver driver)
    {
        this.driver = driver;
    }

}
