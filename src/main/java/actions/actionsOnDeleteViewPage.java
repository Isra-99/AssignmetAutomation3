package actions;

import org.openqa.selenium.WebDriver;

import static components.deleteViewLocators.*;

public class actionsOnDeleteViewPage {
    public WebDriver driver;
    public actionsOnDeleteViewPage(WebDriver d){this.driver=d;}
    public void clickDeleteView(){
        driver.findElement(deleteViewButton).click();
    }
    public void clickOkToDelete(){
        //driver.switchTo().frame(driver.findElement(iframe));
        driver.findElement(okButton).click();
        //driver.switchTo().parentFrame();
    }
}
