package steps;

import actions.actionsOnDataCatalogDropDown;
import actions.actionsOnSignInPage;
import actions.actionsOnViewSettingsPage;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class signInPage {
    public WebDriver driver;
    public signInPage(WebDriver d){
        this.driver = d;
    }
    public void userSigningIn(){
        actionsOnSignInPage  actionsOnWebsite = new actionsOnSignInPage(driver);
        actionsOnWebsite.enterCredentials();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        actionsOnWebsite.clickSignInButton();
        actionsOnWebsite.clickUpgradeNowButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        actionsOnDataCatalogDropDown dataCatalog = new actionsOnDataCatalogDropDown(driver);
        dataCatalog.openDataCataLog();
        dataCatalog.openColumnDictionary();

    }
}
