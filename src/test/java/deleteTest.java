import org.testng.annotations.Test;
import steps.deleteViewPage;

public class deleteTest extends baseTest{
    @Test
    public void deleteTesting(){
        deleteViewPage deleteView = new deleteViewPage(driver);
        deleteView.deletingView();
    }
}
