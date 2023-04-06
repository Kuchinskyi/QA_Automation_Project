package org.project.domria.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitersManager {

    public final static int TIME_OUT = 3;

    private WaitersManager() {
    }

    public static WebElement webUntilElementIsVisible(WebDriver driver, By selector) {
        return new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT))
                .until(ExpectedConditions.visibilityOf(driver.findElement(selector)));
    }

    public static WebElement webUntilElementIsClickableFluent(WebDriver driver, By selector) {
        return new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(TIME_OUT))
                .pollingEvery(Duration.ofMillis(50))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions
                        .visibilityOf(driver.findElement(selector)));
    }
}
