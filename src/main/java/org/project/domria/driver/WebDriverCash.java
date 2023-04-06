package org.project.domria.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.rmi.Remote;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WebDriverCash {

    private static final Map<String, WebDriver> drivers =new HashMap<>();

    private WebDriverCash() {
    }

    public static WebDriver getDriver(String browserName) {
        if (Objects.nonNull(drivers.get(browserName))
            && Objects.nonNull(((RemoteWebDriver)drivers.get(browserName)).getSessionId())) {
            return drivers.get(browserName);
        } else {
            drivers.put(browserName, WebDriverFactory.getDriver(browserName));
            return drivers.get(browserName);
        }
    }
}
