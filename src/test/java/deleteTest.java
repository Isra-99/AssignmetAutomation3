import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import steps.deleteViewPage;
import utils.noElementOnWebPage;

import java.util.List;
import java.util.NoSuchElementException;

import static components.viewDropDownLocators.desiredViewDelete;

public class deleteTest extends baseTest{
    SoftAssert softAssert = new SoftAssert();
    @Test
    public void deleteTesting(){
        deleteViewPage deleteView = new deleteViewPage(driver);
        deleteView.deletingView();
        noElementOnWebPage noElementOnWebPage = new noElementOnWebPage(driver);
        boolean condittion = noElementOnWebPage.elementNotOnPage();
        Assert.assertTrue(condittion);

    }
}
