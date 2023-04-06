package domria.product;

import domria.BaseTest;
import org.junit.jupiter.api.*;
import org.project.domria.flow.CartFlow;
import org.project.domria.flow.ProductListFlow;

import static org.project.domria.utils.PopHelpers.closeCountryPopUpButton;

public class ProductTest extends BaseTest {

    private final CartFlow cartFlow = new CartFlow(driver);

    private final ProductListFlow productListFlow =new ProductListFlow(driver);

    @BeforeEach
    public void navigateToCart() {
        driver.get("https://e-pandora.ua/category/kabluchki");
        driver.manage().window().maximize();
        closeCountryPopUpButton(driver);
    }

    @Test
    @DisplayName("Add Product to Cart")
    public void testAddProductToCart(){
        productListFlow.clickToProduct();
        productListFlow.clickSize();
        productListFlow.clickOrderButton();
        String expected = "1";
        Assertions.assertEquals(expected, cartFlow.getHeaderText());
    }

    @AfterEach
    public void clean() {
        driver.manage().deleteAllCookies();
    }
}
