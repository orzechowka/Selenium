package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Anna on 2018-01-18.
 */
public class DraggablePage extends HomePage{

    private final By dragMeAroundSelector = By.id("draggable");
    private final By constrainMovementSelector = By.linkText("Constrain movement");
    private final By iCanBeDraggedVerticallySelector = By.xpath("//*[@id=\"draggabl\"]/p");
    private final By iCanBeDraggedHorizontallySelector = By.xpath("//*[@id=\"draggabl2\"]");

    WebElement dragMeAround;
    WebElement constrainMovementTab;
    WebElement canBeDraggedVertically;
    WebElement canBeDraggedHorizontally;

    Actions action;

    public DraggablePage(WebDriver driver) {
        super(driver);
    }

    public void goToConstrainMovementTab() {
        constrainMovementTab = driver.findElement(constrainMovementSelector);
        constrainMovementTab.click();
    }

    private void setUpAction() {
        action = new Actions(driver);
    }

    private void dragMe(WebElement element, int x, int y) {
        setUpAction();
        action.dragAndDropBy(element, x, y).perform();
    }

    private void dragMeHorizontally(WebElement element, int x) {
        setUpAction();
        action.dragAndDropBy(element, x, 0).perform();
    }

    private void dragMeVertically(WebElement element, int y) {
        setUpAction();
        action.dragAndDropBy(element, 0, y).perform();
    }

    public void dragMeHorizontallyAndVertically(int x, int y) {
        dragMeAround = driver.findElement(dragMeAroundSelector);
        dragMe(dragMeAround, x, y);
    }

    public void dragMeHorizontallyOnly(int x) {
        canBeDraggedHorizontally = driver.findElement(iCanBeDraggedHorizontallySelector);
        dragMeHorizontally(canBeDraggedHorizontally, x);
    }

    public void dragMeVerticallyOnly(int y) {
        canBeDraggedVertically = driver.findElement(iCanBeDraggedVerticallySelector);
        dragMeVertically(canBeDraggedVertically, y);
    }


}
