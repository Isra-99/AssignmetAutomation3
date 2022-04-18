package actions;

import org.openqa.selenium.WebDriver;

import static components.favoriteViewLocators.favoriteStarButton;

public class actionsOnFavoriteViewPage {
    public WebDriver driver;
    public actionsOnFavoriteViewPage (WebDriver d){this.driver = d;}
    public void clickingFavoriteButton(){
        driver.findElement(favoriteStarButton).click();
    }
}
