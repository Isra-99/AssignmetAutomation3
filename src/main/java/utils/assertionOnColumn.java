package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class assertionOnColumn {
    public WebDriver driver;
    public assertionOnColumn (WebDriver d){this.driver =d;}
    public ArrayList<String> checkingColumns(ArrayList list)
    {
        String pathBefore = "//span[@ref='eText' and contains(text(),'";
        String pathAfter = "')]";
        ArrayList<String> newList = new ArrayList<>();
        for(int i=0;i< list.size();i++){
            String path = pathBefore+list.get(i)+pathAfter;
            WebDriverWait wait = new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
            String name = driver.findElement(By.xpath(path)).getText();
            newList.add(name);
        }
        System.out.println("Actual Columns Displayed"+newList);
        return newList;
    }
}
