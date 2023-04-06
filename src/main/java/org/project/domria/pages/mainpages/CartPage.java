package org.project.domria.pages.mainpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.project.domria.pages.AbstractPage;

public class CartPage extends AbstractPage {

    public static final By PAGE_HEADER = By.xpath("//span[@class='badge']");
    public static final By PRODUCT_NAME = By.xpath("//a[@href='/product/kablucka_rozimknuta_bliskucii_" +
            "gerbarii']/p");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getPageHeader() {
        return driver.findElement(PAGE_HEADER);
    }

    public WebElement getProductHeader() {
        return driver.findElement(PRODUCT_NAME);
    }
}
