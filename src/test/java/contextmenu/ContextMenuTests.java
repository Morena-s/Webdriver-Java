package contextmenu;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

public class ContextMenuTests extends BaseTest {

    @Test
    public void getContextMenuTest(){
        ContextMenuPage contextMenu = homePage.clickContextMenuLink();
        contextMenu.rightClick();
        Assert.assertEquals(contextMenu.getAlertText(),"You selected a context menu","Something gone wrong!");
        contextMenu.closeAlertBox();
    }
}
