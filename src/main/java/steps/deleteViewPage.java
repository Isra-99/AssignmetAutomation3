package steps;

import actions.actionsOnDataCatalogDropDown;
import actions.actionsOnDeleteViewPage;
import actions.actionsOnSignInPage;
import actions.actionsOnViewSettingsPage;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class deleteViewPage {
    public WebDriver driver;
    public deleteViewPage(WebDriver d){this.driver=d;}
    public void deletingView(){
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
        view.clickViewSettingsDropDown();
        actionsOnDeleteViewPage delete = new actionsOnDeleteViewPage(driver);
        delete.clickDeleteView();
        delete.clickOkToDelete();
        view.openViewDropDown();

    }

}
