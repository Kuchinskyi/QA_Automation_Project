package org.project.domria.flow;

import org.openqa.selenium.WebDriver;
import org.project.domria.flow.commonflow.BaseFlow;
import org.project.domria.pages.mainpages.CartPage;

public class CartFlow extends BaseFlow {

    private final CartPage cartPage;

    public CartFlow(WebDriver driver) {
        super(driver);
        this.cartPage = new CartPage(driver);
    }

    public CartPage getCartPage() {
        return cartPage;
    }

    public String getHeaderText() {
        return cartPage.getPageHeader().getText();
    }

    public String getProductText() {
        return cartPage.getProductHeader().getText();
    }
}
