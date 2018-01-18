import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Anna on 2018-01-18.
 */
public class TestBase {

    public static WebDriver driver;

    @BeforeClass
    public static void start() {
        driver = new FirefoxDriver();
        driver.get("http://demoqa.com/");
    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }

}
