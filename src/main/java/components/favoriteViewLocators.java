package components;

import org.openqa.selenium.By;

public class favoriteViewLocators {
    public static By favoriteStarButton = By.id("favoriteViewBtn");
    public static By favView = By.xpath("//div[@id=\"favouriteViews\"]//li");
    public static By currentFavView  = By.xpath("//div[@id='favouriteViews']//li[@title='VIEW2Favorite']");
}
