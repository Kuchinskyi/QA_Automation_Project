package org.project.domria.flow.commonflow;

import org.openqa.selenium.WebDriver;

public abstract class BaseFlow {

    private final MainMenuFlow mainMenuFlow;

    public BaseFlow(WebDriver driver) {
        mainMenuFlow = new MainMenuFlow(driver);
    }

    public MainMenuFlow getMainMenuFlow() {
        return mainMenuFlow;
    }
}
