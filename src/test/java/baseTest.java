import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.signInPage;

public class baseTest {
    static public WebDriver driver;
    @BeforeTest
    public void openingChrome(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://devqa.dvsum.com/login");
        signInPage sign = new signInPage(driver);
        sign.userSigningIn();
    }


}

