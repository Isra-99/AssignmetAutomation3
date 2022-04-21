package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static components.viewDropDownLocators.*;
import static components.viewSettingsDropDownLocators.editButton;
import static components.viewSettingsDropDownLocators.viewDropDown;

public class actionsOnViewSettingsPage {
    public WebDriver driver;
    public actionsOnViewSettingsPage(WebDriver d){this.driver =d;}
    public void selectDesiredViewToEdit(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(desiredViewEdit));
        driver.findElement(desiredViewEdit).click();}
    public void selectDesiredViewToFavorite(){
        driver.findElement(desiredViewFavorite).click();
    }
    public void selectDesiredViewToDelete(){
        driver.findElement(desiredViewDelete).click();
    }

    public void openViewDropDown(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated((dropDown)));
        driver.findElement(dropDown).click();

    }
    public void clickViewSettingsDropDown(){
        driver.findElement(viewDropDown).click();

    }
    public void editDesiredView(){
        driver.findElement(editButton).click();
    }

}
