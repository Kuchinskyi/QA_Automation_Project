package pandora.pagelogontest;

import pandora.BaseTest;
import org.project.domria.flow.LoginFlow;
import org.junit.jupiter.api.*;

import static org.project.domria.utils.PopHelpers.closeCountryPopUpButton;

public class LoginTest extends BaseTest {

    private final LoginFlow loginFlow = new LoginFlow(driver);

    @BeforeEach
    public void openPage() {
        driver.get("https://e-pandora.ua/account/login");
        driver.manage().window().maximize();
        closeCountryPopUpButton(driver);
    }

    @Test
    @DisplayName("Password Error")
    public void textErrorPasswordText() throws InterruptedException {
        loginFlow.setEmailAddressField("0991456789");
        loginFlow.clickSubmitButton();
        Assertions.assertTrue(loginFlow.isPasswordErrorDisplayed());
        Assertions.assertEquals(loginFlow.getPasswordErrorText(), "*Поле обов'язкове для заповнення");
    }

    @Test
    @DisplayName("Login Error")
    public void textErrorLoginText() throws InterruptedException {
        loginFlow.setEmailAddressField("000000000");
        loginFlow.clickSubmitButton();
        Assertions.assertTrue(loginFlow.isEmailErrorDisplayed());
        Assertions.assertEquals(loginFlow.getLoginErrorText(), "*Здається, в номері помилка. Перевіримо ще раз?");
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
