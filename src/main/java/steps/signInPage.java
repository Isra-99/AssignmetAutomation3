package steps;

import actions.actionsOnWebsite;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static components.signIinLocators.*;

public class signInPage {
    public WebDriver driver;
    public signInPage(WebDriver d){
        this.driver = d;
    }
    public void userSigningIn(){
        actionsOnWebsite actionsOnWebsite = new actionsOnWebsite(driver);
        actionsOnWebsite.enterCredentials();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        actionsOnWebsite.clickSignInButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
