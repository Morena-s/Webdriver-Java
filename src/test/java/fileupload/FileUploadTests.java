package fileupload;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUploadTests extends BaseTest {

    @Test
    public void uploadFile(){
        FileUploadPage fileupload = homePage.clickFileUpload();
        fileupload.uploadFile("/Users/sally/IdeaProjects/webdriver_java/resources/chromedriver-2");
        fileupload.submitFile();
        Assert.assertEquals(fileupload.uploadedFilesMessage(),"chromedriver-2");
    }
}
