import org.testng.annotations.Test;
import steps.deleteViewPage;

import java.util.NoSuchElementException;

import static components.viewDropDownLocators.desiredViewDelete;

public class deleteTest extends baseTest{
    @Test
    public void deleteTesting(){
        deleteViewPage deleteView = new deleteViewPage(driver);
        deleteView.deletingView();
        boolean present;
        try {
            driver.findElement(desiredViewDelete);
            present = true;
        } catch (NoSuchElementException e) {
            present = false;
        }
    }
}
