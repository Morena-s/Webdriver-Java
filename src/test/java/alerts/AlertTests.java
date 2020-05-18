package alerts;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.JavaScriptAlertPage;

public class AlertTests extends BaseTest {

    @Test
    public void testAcceptAlert(){

        JavaScriptAlertPage jspage = homePage.clickJavaScriptAlert();
        jspage.triggerAlert();
        jspage.alert_clickToAccept();
        //FIXME typo error in successfully needs to be solved
        //TODO typo error in successfully needs to be solved
        Assert.assertEquals(jspage.alertResult(),"You successfuly clicked an alert");

    }


    @Test
    public void testSetInputInAlert(){
        JavaScriptAlertPage jspage = homePage.clickJavaScriptAlert();
        jspage.triggerPrompt();
        jspage.alert_setInput("Hello My name is Sally");
        jspage.alert_clickToAccept();
        String alertText = jspage.alert_getTextResult();


        Assert.assertEquals(alertText,"You entered: Hello My name is Sally");
    }
}
