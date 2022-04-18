package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static components.viewDropDownLocators.desiredView;
import static components.viewDropDownLocators.dropDown;
import static components.viewSettingsDropDownLocaotors.editButton;
import static components.viewSettingsDropDownLocaotors.viewDropDown;

public class actionsOnViewSettingsPage {
    public WebDriver driver;
    public actionsOnViewSettingsPage(WebDriver d){this.driver =d;}
    public void selectDesiredView(){
        driver.findElement(desiredView).click();
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
