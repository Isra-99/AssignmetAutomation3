import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import steps.signInPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static components.signIinLocators.emailField;
import static constants.constants.emailId;

public class preTest extends baseTest {
    @Test
public void signInTesting(){
 signInPage sign = new signInPage(driver);
 sign.userSigningIn();
    }
}
