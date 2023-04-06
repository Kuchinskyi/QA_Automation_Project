package org.project.domria.flow;

import org.openqa.selenium.WebDriver;
import org.project.domria.pages.mainpages.Product;

public class ProductListFlow {

    private final Product product;

    public ProductListFlow(WebDriver driver) {
        this.product = new Product(driver);
    }

    public Product getProduct() {
        return product;
    }
    public void clickToProduct(){
        product.getProductName().click();
    }

    public void clickSize(){
        product.getSize().click();
    }

    public void clickOrderButton(){
        product.getOrderButton().click();
    }
}
