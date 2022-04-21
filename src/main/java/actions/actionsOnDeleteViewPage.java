package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static components.deleteViewLocators.*;
import static components.menuDataCatalogLocators.columnDictionary;

public class actionsOnDeleteViewPage {
    public WebDriver driver;
    public actionsOnDeleteViewPage(WebDriver d){this.driver=d;}
    public void clickDeleteView(){
        driver.findElement(deleteViewButton).click();
    }
    public void clickOkToDelete(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(okButton));
        driver.findElement(okButton).click();
    }
}
