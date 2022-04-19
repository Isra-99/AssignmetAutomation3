import actions.actionsOnDataCatalogDropDown;
import actions.actionsOnSignInPage;
import actions.actionsOnViewSettingsPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import steps.favoriteViewPage;

import java.util.concurrent.TimeUnit;

import static components.favoriteViewLocators.currentFavView;
import static components.favoriteViewLocators.favView;
import static components.viewDropDownLocators.desiredView;
import static org.testng.AssertJUnit.assertEquals;

public class favoriteViewTest extends baseTest{
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void favoriteViewTesting(){
        favoriteViewPage favoriteView = new favoriteViewPage(driver);
        favoriteView.checkingFavoriteViewList();
        String favorite = driver.findElement(currentFavView).getText();
        System.out.println(favorite);
        softAssert.assertEquals("VIEW2Favorite",favorite);
    }
}
