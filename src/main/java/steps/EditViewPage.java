package steps;

import actions.actionsOnDesiredViewPage;
import actions.actionsOnViewSettingsPage;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class EditViewPage {
    public WebDriver driver;
    public EditViewPage(WebDriver d){this.driver = d;}
    public void selectingView(){

        actionsOnViewSettingsPage view = new actionsOnViewSettingsPage(driver);
        view.openViewDropDown();
        view.selectDesiredViewToEdit();

    }
    public ArrayList editingView(){
        actionsOnViewSettingsPage view = new actionsOnViewSettingsPage(driver);
        view.clickViewSettingsDropDown();
        view.editDesiredView();
        actionsOnDesiredViewPage desiredView  = new actionsOnDesiredViewPage(driver);
        desiredView.editViewName();
        desiredView.selectingDesiredItems();
        ArrayList<String> s = desiredView.displaySelectedItems();
        desiredView.CriteriaSelect();
        desiredView.clickSaveButton();
        System.out.println(s);
        return s;
    }

}
