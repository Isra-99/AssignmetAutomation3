import actions.actionsOnDataCatalogDropDown;
import actions.actionsOnSignInPage;
import actions.actionsOnViewSettingsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.favoriteViewPage;

import java.util.concurrent.TimeUnit;

import static components.favoriteViewLocators.favView;
import static components.viewDropDownLocators.desiredView;
import static org.testng.AssertJUnit.assertEquals;

public class favoriteViewTest extends baseTest{
    @Test
    public void favoriteViewTesting(){
        favoriteViewPage favoriteView = new favoriteViewPage(driver);
        favoriteView.checkingFavoriteViewList();
        String fview = driver.findElement(favView).getText();
        String Desired = driver.findElement(desiredView).getText();
        Assert.assertEquals(fview,Desired);

    }
}
