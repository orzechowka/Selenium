package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Anna on 2018-01-18.
 */
public class HomePage {

    protected WebDriver driver;

    private final By draggableSelector = By.id("menu-item-140");

    private WebElement draggable;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToDraggablePage() {
        draggable = driver.findElement(draggableSelector);
        draggable.click();
    }
}
