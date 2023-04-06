package pandora.navigator;

import pandora.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.project.domria.flow.CartFlow;
import org.project.domria.flow.LoginFlow;

import static org.project.domria.utils.PopHelpers.closeCountryPopUpButton;

public class NavigationTest extends BaseTest {

    private final LoginFlow loginFlow = new LoginFlow(driver);
    private final CartFlow cartFlow = new CartFlow(driver);

    @BeforeEach
    public void openPage() {
        driver.get("https://e-pandora.ua");
        driver.manage().window().maximize();
        closeCountryPopUpButton(driver);
    }

    @Test
    @DisplayName("Navigation")
    public void testToNavigation() {
        loginFlow.getMainMenuFlow().navigateToCart();
        String expected = "0";
        Assertions.assertEquals(expected, cartFlow.getHeaderText());
    }
}
