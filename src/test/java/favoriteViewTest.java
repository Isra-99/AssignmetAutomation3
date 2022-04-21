import actions.actionsOnDataCatalogDropDown;
import actions.actionsOnSignInPage;
import actions.actionsOnViewSettingsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import steps.favoriteViewPage;

import java.util.concurrent.TimeUnit;

import static components.favoriteViewLocators.currentFavView;
import static components.favoriteViewLocators.favView;
import static components.viewDropDownLocators.desiredView;
import static components.viewLocators.viewNameField;
import static org.testng.AssertJUnit.assertEquals;

public class favoriteViewTest extends baseTest{
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void favoriteViewTesting(){
        favoriteViewPage favoriteView = new favoriteViewPage(driver);
        favoriteView.checkingFavoriteViewList();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(currentFavView));
       String favorite = driver.findElement(currentFavView).getText();
       System.out.println(favorite);
      Assert.assertEquals("VIEW2Favorite",favorite);
    }
}
