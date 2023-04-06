package org.project.domria.pages.fragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.project.domria.pages.AbstractPage;

public class MainMenu extends AbstractPage {

    private static final By MY_ACCOUNT = By.xpath("//i[@class='icon icon-profile-pink']");
    private static final By MY_CART = By.xpath("//a[@class='header__cart d-flex']");

    public MainMenu(WebDriver driver) {
        super(driver);
    }

    public WebElement getMyAccount() {
        return driver.findElement(MY_ACCOUNT);
    }

    public WebElement getCartButton() {
        return driver.findElement(MY_CART);
    }
}
