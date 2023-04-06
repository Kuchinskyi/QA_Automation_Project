package pandora.cart;

import pandora.BaseTest;
import org.junit.jupiter.api.*;
import org.project.domria.flow.CartFlow;

import static org.project.domria.utils.PopHelpers.closeCountryPopUpButton;

public class CartTest extends BaseTest {

    private final CartFlow cartFlow = new CartFlow(driver);


    @BeforeEach
    public void navigateToCart() {
        driver.get("https://e-pandora.ua/category/kabluchki");
        driver.manage().window().maximize();
        closeCountryPopUpButton(driver);
    }

    @Test
    @DisplayName("Empty cart")
    public void testHeader() {
        String expected = "0";
        Assertions.assertEquals(expected, cartFlow.getHeaderText());
    }

    @AfterEach
    public void clean() {
        driver.manage().deleteAllCookies();
    }

    @AfterAll
    public static void quitDriver() {
        driver.quit();
    }
}
