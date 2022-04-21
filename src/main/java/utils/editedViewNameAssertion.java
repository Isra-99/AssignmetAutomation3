package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class editedViewNameAssertion {
    public WebDriver driver;
    public editedViewNameAssertion (WebDriver d){this.driver =d;}
    public String editedName(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'THe_FINAL_VIEW')]")));
        String text = driver.findElement(By.xpath("//span[contains(text(),'THe_FINAL_VIEW')]")).getText();
        return text;
    }
}
