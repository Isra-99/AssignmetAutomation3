import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import steps.deleteViewPage;

import java.util.NoSuchElementException;

import static components.viewDropDownLocators.desiredViewDelete;

public class deleteTest extends baseTest{
    SoftAssert softAssert = new SoftAssert();
    @Test
    public void deleteTesting(){
        deleteViewPage deleteView = new deleteViewPage(driver);
        deleteView.deletingView();
        boolean present;
        if (driver.findElement(desiredViewDelete).getText().isEmpty()) {
            present = true;
        }else
        {            present = false;
        }
        softAssert.assertEquals(true,present);
    }
}
