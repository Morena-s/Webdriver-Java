package horizontalslider;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

public class HorizontalSliderTest extends BaseTest {

    int value = 4;

    @Test
    public void testHorizontalSliderValue(){
        HorizontalSliderPage hSPage = homePage.clickHorizontalSlider();
        hSPage.setSliderValue(Keys.ARROW_RIGHT,value);
        Assert.assertEquals(hSPage.getRange(),value/2);

    }
}
