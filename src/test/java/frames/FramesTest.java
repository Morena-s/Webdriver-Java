package frames;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FramesPage;
import pages.NestedFramesPage;

public class FramesTest extends BaseTest {

    @Test
    public void testFrames(){
        FramesPage frames = homePage.clickFramesLink();
        NestedFramesPage nested =frames.clickOnNestedFramesLink();
        Assert.assertEquals(nested.getLeftFrameText(),"LEFT");

    }
}
