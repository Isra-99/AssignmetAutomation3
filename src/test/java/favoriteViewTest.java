import actions.actionsOnDataCatalogDropDown;
import actions.actionsOnSignInPage;
import actions.actionsOnViewSettingsPage;
import org.openqa.selenium.By;
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
        String favView = driver.findElement(By.xpath("//div[@id='favouriteViews']//li[@title='VIEW2Favorite']")).getText();
        Assert.assertEquals("VIEW2Favorite",favView);

    }
}
