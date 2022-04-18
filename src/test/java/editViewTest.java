import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.EditViewPage;
import steps.signInPage;

import java.util.List;

public class editViewTest extends baseTest{
    @Test
    public void editViewTesting() {

        EditViewPage viewPage = new EditViewPage(driver);
        viewPage.selectingAndEditingView();




    }
}
