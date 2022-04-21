import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import steps.signInPage;

public class baseTest {
     public WebDriver driver;
    @BeforeClass
    public void openingChromeAndSiginingIn(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://devqa.dvsum.com/login");
        signInPage sign = new signInPage(driver);
        sign.userSigningIn();
    }


}

