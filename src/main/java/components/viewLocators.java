package components;

import org.openqa.selenium.By;

public class viewLocators {
    public static By viewNameField = By.xpath("//input[@id='viewName']");
    public static By itemsToSelect  = By.xpath("//ul[@id='availableColumns']//li");
    public static By locationToDropSelectedItems = By.id("selectedColumns");
    public static By specifyDropDown = By.id("filterColumns");
    public static By saveButton = By.xpath("//button//span[contains(text(),'Save')]");
    public static By finalSelectedItems = By.xpath("//ul[@id='selectedColumns']//li");
}
