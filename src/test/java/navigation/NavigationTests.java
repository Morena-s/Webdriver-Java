package navigation;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import utils.WindowManager;


public class NavigationTests extends BaseTest {

    public void testNavigation(){
        homePage.clickDynamicLoadingLink().clickHiddenElementLink();
        getWindowManager().goBack();
    }


}
