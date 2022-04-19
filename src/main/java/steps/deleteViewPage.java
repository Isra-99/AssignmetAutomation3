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

        actionsOnViewSettingsPage view = new actionsOnViewSettingsPage(driver);
        view.openViewDropDown();
        view.selectDesiredViewToDelete();
        view.clickViewSettingsDropDown();
        actionsOnDeleteViewPage delete = new actionsOnDeleteViewPage(driver);
        delete.clickDeleteView();
        delete.clickOkToDelete();

    }

}
