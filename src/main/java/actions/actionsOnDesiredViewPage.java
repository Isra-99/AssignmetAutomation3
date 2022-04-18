package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.WeakHashMap;

import static components.viewLocators.*;
import static constants.constants.editedViewName;

public class actionsOnDesiredViewPage {
    public WebDriver driver;
    public actionsOnDesiredViewPage(WebDriver d ){this.driver = d;}
    public void editViewName(){
        driver.findElement(viewNameField).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
        driver.findElement(viewNameField).sendKeys(editedViewName);
    }
    public void selectingDesiredItems(){
        Actions actions =  new Actions(driver);
        List<WebElement> drag  = driver.findElements(itemsToSelect);
        WebElement drop  = driver.findElement(locationToDropSelectedItems);
        for (int i = 0 ; i < drag.size() ; i++)
        {    if (drag.size()<=10) {
            actions.dragAndDrop(drag.get(i), drop).perform();
        }
            if (drag.size()>10) {
                for (int j = 0 ; j<=10; j++)
                    actions.dragAndDrop(drag.get(j), drop).perform();
                break;
            }
            break;
        }
    }
    public void CriteriaSelect(){
        Select dropDownSpecifySelect = new Select(driver.findElement(specifyDropDown));
        dropDownSpecifySelect.selectByIndex(1);
    }
    public void clickSaveButton(){
        driver.findElement(saveButton).click();
    }

}
