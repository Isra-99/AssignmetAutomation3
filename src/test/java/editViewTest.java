import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import steps.EditViewPage;
import steps.signInPage;

import java.util.List;

import static components.viewLocators.specifyDropDown;
import static components.viewLocators.viewNameField;
import static constants.constants.editedViewName;

public class editViewTest extends baseTest{
    SoftAssert softAssert = new SoftAssert();
    @Test
    public void editViewTesting() {

        EditViewPage viewPage = new EditViewPage(driver);
        viewPage.selectingAndEditingView();
        String newViewName = driver.findElement(viewNameField).getText();
        softAssert.assertEquals(editedViewName,newViewName);
        Select dropDownSpecifySelect = new Select(driver.findElement(specifyDropDown));
        dropDownSpecifySelect.selectByIndex(1);
        String criteria  = dropDownSpecifySelect.getFirstSelectedOption().getText();
        System.out.println(criteria);
        softAssert.assertEquals("Analysis Type",criteria);

    }
}
