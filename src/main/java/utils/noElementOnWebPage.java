package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static components.viewDropDownLocators.desiredViewDelete;

public class noElementOnWebPage {
    public WebDriver driver;
    public noElementOnWebPage (WebDriver d){this.driver = d;}
    public boolean elementNotOnPage(){
        boolean elementIsNotOnPage = false;

        List<WebElement> element = driver.findElements(desiredViewDelete);

        if(element.size() == 0){
            elementIsNotOnPage = true;
        }

        return elementIsNotOnPage;

    }
}
