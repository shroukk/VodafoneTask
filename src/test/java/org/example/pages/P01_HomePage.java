package org.example.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P01_HomePage extends P00_BasePage{
    public P01_HomePage(WebDriver driver) {
        super(driver);
    }

    private final By cookiesBtn = By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button");
    public void closeCookiesWindow(){
        driver.findElement(cookiesBtn).click();
    }
    private final By loginPage = By.id("userProfileMenu");

    public void clickLoginPage() {
        driver.findElement(loginPage).click();
    }
    private final By product1 = By.xpath("//p[contains(.,' Samsung Smart TV 50-Inch Crystal 4K UHD - 50CU8000 ')]");
    public void addFirstProduct() {

        final Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(product1)).click().build().perform();
        clickAddToCart();

    }
    private final By product2 = By.xpath("//p[contains(.,' Apple Watch Series 9 GPS 45mm  ')]");
    public void addSecondProduct() {

        final Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(product2)).click().build().perform();
        clickAddToCart();

    }

    private final By addToCartBtn = By.xpath("//*[text()=' Add To Cart ']");
    private final By addedSuccessfully = By.xpath("/html/body/vf-root/main/section[1]/vf-alert-box/div/div/p");
    public void clickAddToCart() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(addToCartBtn))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(addedSuccessfully));
    }



    private final By searchInput = By.cssSelector("[id = \"searchInput\"]");
    public void searchForProduct(String productName) {
        Actions actions = new Actions(driver);
        actions.click(driver.findElement(searchInput)).perform();
        actions.sendKeys(productName).perform();

    }
    private final By product3 = By.cssSelector("[class=\"product-result\"]");

    public void addResultProductToCart(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(product3)));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(product3))).click();
        clickAddToCart();
    }
    private final By cartPage = By.cssSelector("button[class=\"cart-btn\"]");
    public void clickCartPage() {
        driver.findElement(cartPage).click();
    }

}
