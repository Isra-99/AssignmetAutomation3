import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import steps.EditViewPage;
import utils.assertionOnColumn;
import utils.editedViewNameAssertion;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static components.viewLocators.viewNameField;

public class editViewTest extends baseTest{
    @Test
    public void editViewTesting() {
        EditViewPage viewPage = new EditViewPage(driver);
        viewPage.selectingView();
        ArrayList<String> selectedColumns = (viewPage.editingView());
        System.out.println("Columns selected"+selectedColumns);
        editedViewNameAssertion editedViewNameAssertion = new editedViewNameAssertion(driver);
        String newName  = editedViewNameAssertion.editedName();
        Assert.assertEquals(newName,"THe_FINAL_VIEW");
        assertionOnColumn assertionOnColumn = new assertionOnColumn(driver);
        ArrayList<String> actualSelectedColumns = assertionOnColumn.checkingColumns(selectedColumns);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualSelectedColumns,selectedColumns);



    }
}
