package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static components.menuDataCatalogLocators.columnDictionary;
import static components.menuDataCatalogLocators.dataCataLogDropDown;

public class actionsOnDataCatalogDropDown {
    public WebDriver driver;
    public actionsOnDataCatalogDropDown (WebDriver d){this.driver=d;}
    public void openColumnDictionary(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(columnDictionary));
        driver.findElement(columnDictionary).click();
    }
    public void openDataCataLog(){
        driver.findElement(dataCataLogDropDown).click();

    }
}
