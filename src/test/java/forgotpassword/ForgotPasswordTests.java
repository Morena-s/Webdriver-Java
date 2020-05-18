package forgotpassword;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

public class ForgotPasswordTests extends BaseTest {

    @Test
    public void retrievePassword(){
        ForgotPasswordPage forgotPassword = homePage.clickForgotPassword();
        forgotPassword.enterEmail("ss@gmail.com");
        EmailSentPage emailSentPage = forgotPassword.submitForm();
        Assert.assertTrue(emailSentPage.getEmailSentMessage().contains("Your e-mail's been sent!"),"Sorry, There is an error!");

    }
}
