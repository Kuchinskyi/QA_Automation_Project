package org.project.domria.pages.mainpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.project.domria.pages.AbstractPage;
import org.project.domria.utils.WaitersManager;


public class LoginPage extends AbstractPage {


    private static final By EMAIL_ADDRESS_FIELD = By.id("phone");
    private static final By PASSWORD_FIELD = By.id("password");
    private static final By SUBMIT_BUTTON = By.xpath("//button[@class='btn btn--fill btn--full']");
    private static final By PASSWORD_ERROR = By.xpath("//input[@id='password']/following-sibling::span[@class='error']");
    private static final By EMAIL_ERROR = By.xpath("//input[@id='phone']/following-sibling::span[@class='error']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEmailField() {
        return WaitersManager.webUntilElementIsVisible(driver, EMAIL_ADDRESS_FIELD);
    }

    public WebElement getPasswordField() {
        return driver.findElement(PASSWORD_FIELD);
    }

    public WebElement getSubmitButton() {
        return driver.findElement(SUBMIT_BUTTON);
    }

    public WebElement getPasswordError() {
        return driver.findElement(PASSWORD_ERROR);
    }

    public WebElement getLoginError() {
        return driver.findElement(EMAIL_ERROR);
    }

}
