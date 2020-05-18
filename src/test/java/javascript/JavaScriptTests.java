package javascript;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.JavaScriptAlertPage;
import pages.LargeAndDeepDomPage;

public class JavaScriptTests extends BaseTest {

    @Test
    public void testScrollToTable(){
        LargeAndDeepDomPage jsPage = homePage.clickLargeAndDeepDomLink();
        jsPage.scrollToTable();
    }
}
