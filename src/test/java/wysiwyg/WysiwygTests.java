package wysiwyg;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WYSIWYGPage;

public class WysiwygTests extends BaseTest {

    @Test
    public void switchToIFrame(){
        WYSIWYGPage iframe = homePage.clickWysiwygLink();
        iframe.clearTextArea();
        iframe.writeText("Hello");
        iframe.decreaseIndent();
        iframe.writeText(" Sally");
        Assert.assertEquals(iframe.getText(),"Hello Sally");


    }
}
