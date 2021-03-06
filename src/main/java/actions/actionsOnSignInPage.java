package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static components.sawsUpdateLocator.upgradeNowButton;
import static components.signIinLocators.*;
import static constants.constants.emailId;
import static constants.constants.password;

public class actionsOnSignInPage {
    WebDriver driver;

    public actionsOnSignInPage(WebDriver d) {
        this.driver = d;

    }


    public void enterCredentials (){
        ///Entering Email
        List<WebElement> l1 = driver.findElements(emailField);
        int size1  = l1.size();
        for (int i =0;i<size1;i++){
            int x = l1.get(i).getLocation().getX();
            if (x!=0){
                l1.get(i).sendKeys(emailId);
                break;
            }
        }
        ////Entering Password
        List<WebElement> l2 = driver.findElements(passwordField);
        int size2  = l2.size();
        for (int i =0;i<size2;i++){
            int x = l2.get(i).getLocation().getX();
            if (x!=0){
                l2.get(i).sendKeys(password);
                break;
            }
        }


    }
    public void clickSignInButton(){

        List<WebElement> l3 = driver.findElements(signInButton);
        int size3  = l3.size();
        for (int i =0;i<size3;i++){
            int x = l3.get(i).getLocation().getX();
            if (x!=0){
                l3.get(i).submit();
                break;
            }
        }

    }
    public void clickUpgradeNowButton(){
        driver.findElement(upgradeNowButton).click();
    }
}
