package hover;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;

public class HoverTests extends BaseTest {

    @Test
    public void testHoverUser1(){
        HoversPage hoverPage = homePage.clickHoversPage();
        HoversPage.FigureCaption figureCaption = hoverPage.hoverOverFigure(1);
        Assert.assertTrue(figureCaption.isCaptionDisplayed());
        Assert.assertEquals(figureCaption.getLinkText(),"View profile");



    }
}
