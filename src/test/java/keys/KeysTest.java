package keys;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

public class KeysTest extends BaseTest {

    @Test
    public void testBackSpace(){
        KeyPressesPage keyPress = homePage.clickKeyPresses();
        keyPress.enterText(Keys.chord(Keys.ALT,"p")+ " = 3.14");
//        Assert.assertEquals(keyPress.getResult(),"You entered: BACK_SPACE");

    }
}
