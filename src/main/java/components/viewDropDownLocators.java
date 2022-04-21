package components;

import org.openqa.selenium.By;

public class viewDropDownLocators {
    public static By dropDown = By.xpath("//div[@id='viewNameCont']//child::a");
    public static By desiredView =By.xpath("//div[@class='list-items']//div//li[@title]");
    public static By desiredViewEdit =By.xpath("//div[@class='list-items']//div//li[@title='VIEW1Edit']");
    public static By desiredViewFavorite =By.xpath("//div[@class='list-items']//li[@title='VIEW2Favorite']");
    public static By desiredViewDelete =By.xpath("//div[@class='list-items']//div//li[@title='VIEW3Delete']");


}
