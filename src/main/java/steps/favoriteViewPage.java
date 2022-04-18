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
        actionsOnSignInPage actionsOnWebsite = new actionsOnSignInPage(driver);
        actionsOnWebsite.enterCredentials();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        actionsOnWebsite.clickSignInButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        actionsOnWebsite.clickUpgradeNowButton();
        actionsOnDataCatalogDropDown dataCatalog = new actionsOnDataCatalogDropDown(driver);
        dataCatalog.openDataCataLog();
        dataCatalog.openColumnDictionary();
        actionsOnViewSettingsPage view = new actionsOnViewSettingsPage(driver);
        view.openViewDropDown();
        view.selectDesiredView();
        actionsOnFavoriteViewPage favorite = new actionsOnFavoriteViewPage(driver);
        favorite.clickingFavoriteButton();
        view.openViewDropDown();
    }

}
