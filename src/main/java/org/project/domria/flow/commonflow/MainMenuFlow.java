package org.project.domria.flow.commonflow;

import org.openqa.selenium.WebDriver;
import org.project.domria.pages.fragments.MainMenu;

public class MainMenuFlow {

    private final MainMenu mainMenu;

    public MainMenuFlow(WebDriver driver) {
        this.mainMenu = new MainMenu(driver);
    }

    public MainMenu getMainMenu(){
        return mainMenu;
    }

    public void navigateToAccount(){
        mainMenu.getMyAccount().click();
    }

    public void navigateToCart(){
        mainMenu.getCartButton().click();
    }
}
