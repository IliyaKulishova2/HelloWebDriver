package helloWebDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

/**
 * Created by Webxloo Company on 2/23/2017.
 */
public class HelloWebDriverIT {

    private WebDriver driver;

    @Before

    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "src/drivers/firefox/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Test

    public void helloWebDriver() throws Exception {
        driver.get("http://map2.iliya.dxloo.com");

        WebElement pageHeading
                = driver.findElement(By.tagName("h1"));

        assertEquals("VIDEOS",
                pageHeading.getText());
    }

    @After

    public void tearDown() throws Exception {
        if (driver != null) {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            driver.quit();
        }
    }
}
