package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModalPage {
    WebDriver driver;
    private By modalWindow = By.cssSelector("div.modal");
    private By closeModal = By.partialLinkText("//p[text()='Close']");


    public ModalPage(WebDriver driver){
        this.driver = driver;
    }

    public void moveToModal(){
        driver.findElement(modalWindow);

    }
    public void closeModal(){
        driver.findElement(closeModal);
    }
}
