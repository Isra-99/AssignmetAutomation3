package steps;

import actions.actionsOnDataCatalogDropDown;
import actions.actionsOnFavoriteViewPage;
import actions.actionsOnSignInPage;
import actions.actionsOnViewSettingsPage;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class favoriteViewPage {
    public WebDriver driver;
    public favoriteViewPage (WebDriver d){this.driver = d;}
    public void checkingFavoriteViewList(){

        actionsOnViewSettingsPage view = new actionsOnViewSettingsPage(driver);
        view.openViewDropDown();
        view.selectDesiredViewToFavorite();
        view.clickViewSettingsDropDown();
        actionsOnFavoriteViewPage favorite = new actionsOnFavoriteViewPage(driver);
        favorite.clickingFavoriteButton();


    }

}
