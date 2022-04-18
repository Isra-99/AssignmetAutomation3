package steps;

import actions.actionsOnDataCatalogDropDown;
import actions.actionsOnDesiredViewPage;
import actions.actionsOnSignInPage;
import actions.actionsOnViewSettingsPage;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class EditViewPage {
    public WebDriver driver;
    public EditViewPage(WebDriver d){this.driver = d;}
    public void selectingAndEditingView(){
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
        view.selectDesiredViewToEdit();
        view.clickViewSettingsDropDown();
        view.editDesiredView();
        actionsOnDesiredViewPage desiredView  = new actionsOnDesiredViewPage(driver);
        desiredView.editViewName();
        desiredView.selectingDesiredItems();
        desiredView.CriteriaSelect();
        desiredView.clickSaveButton();
    }

}
