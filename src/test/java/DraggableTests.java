import org.junit.Before;
import org.junit.Test;

import pageobjects.DraggablePage;
import pageobjects.HomePage;

/**
 * Created by Anna on 2017-12-29.
 */
public class DraggableTests extends TestBase {

    HomePage homePage;
    DraggablePage draggablePage;

    @Before
    public void setUp() {
        homePage = new HomePage(driver);
        draggablePage = new DraggablePage(driver);
        homePage.goToDraggablePage();
    }

    @Test
    public void dragAndDropDownAndRight() {
        draggablePage.dragMeHorizontallyAndVertically(100, 50);
    }

    @Test
    public void dragAndDropVertically()  {
        draggablePage.goToConstrainMovementTab();
        draggablePage.dragMeVerticallyOnly(50);
    }

    @Test
    public void dragAndDropHorizontally() {
        draggablePage.goToConstrainMovementTab();
        draggablePage.dragMeHorizontallyOnly(50);
    }

}
