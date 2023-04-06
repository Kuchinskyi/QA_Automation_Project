package org.project.domria.pages.mainpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.project.domria.pages.AbstractPage;

public class Product extends AbstractPage {

    public static final By PRODUCT_NAME = By.xpath("//a[@href=\"/product/kablucka_rozimknuta_bliskucii_" +
            "gerbarii\"]/div/div");

    public static final By SIZE = By.xpath("//li[@data-hint='¬нутр≥шн≥й д≥аметр 15.3 мм']");

    public static final By ORDER_BUTTON = By.xpath("//*[@id=\"__layout\"]/div/div/div/div/div/div/div/div" +
            "/div/button");

    public Product(WebDriver driver) {
        super(driver);
    }

    public WebElement getProductName() {
        return driver.findElement(PRODUCT_NAME);
    }

    public WebElement getSize() {
        return driver.findElement(SIZE);
    }

    public WebElement getOrderButton() {
        return driver.findElement(ORDER_BUTTON);
    }
}
