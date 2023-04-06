package domria;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.project.domria.driver.WebDriverFactory;

import java.time.Duration;

public class BaseTest {

    protected static WebDriver driver;
    private static final int WAIT = 5000;

    @BeforeAll
    public static void init() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(WAIT));
    }

    @AfterAll
    public static void quitDriver() {
        driver.quit();
    }
}
