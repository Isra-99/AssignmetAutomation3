package actions;

import org.openqa.selenium.WebDriver;

import static components.menuDataCatalogLocators.columnDictionary;
import static components.menuDataCatalogLocators.dataCataLogDropDown;

public class actionsOnDataCatalogDropDown {
    public WebDriver driver;
    public actionsOnDataCatalogDropDown (WebDriver d){this.driver=d;}
    public void openColumnDictionary(){
        driver.findElement(columnDictionary).click();
    }
    public void openDataCataLog(){
        driver.findElement(dataCataLogDropDown).click();

    }
}
