package wait;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample1Page;
import pages.DynamicallyLoadedPage;
import pages.RenderedElementPage;

public class WaitTests extends BaseTest {

    @Test
    public void testWaitUntilHidden(){
        DynamicLoadingExample1Page dynamicExample1 = homePage.clickDynamicLoadingLink();
        DynamicallyLoadedPage loadedPage = dynamicExample1.clickHiddenElementLink();
        loadedPage.clickStartButton();
        Assert.assertEquals(loadedPage.getLoadedText(),"Hello World!");
    }

    @Test
    public void testWaitUntilRendered(){
        RenderedElementPage rendered = homePage.clickDynamicLoadingLink().clickRenderedElementLink();
        rendered.clickStartButton();
        Assert.assertEquals(rendered.getLoadedText(),"Hello World!");
    }
}
