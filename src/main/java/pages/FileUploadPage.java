package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By fileUploadButton = By.id("file-upload");
    private By fileSubmitButton = By.id("file-submit");
    private By uploadedFiles =By.id("uploaded-files");

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }

    public void uploadFile(String path){
        driver.findElement(fileUploadButton).sendKeys(path);
    }

    public void submitFile(){
        driver.findElement(fileSubmitButton).click();
    }

    public String uploadedFilesMessage(){
        return driver.findElement(uploadedFiles).getText();
    }
}
