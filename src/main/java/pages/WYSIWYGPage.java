package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGPage {
    private WebDriver driver;
    private By iFrameLocator = By.id("mce_0_ifr");
    private By textAreaLocator = By.id("tinymce");
    private By decreaseIndentLocator = By.cssSelector("#mceu_12 button");

    public WYSIWYGPage(WebDriver driver){
        this.driver = driver;

    }

    private void switchToIFrame(){
        driver.switchTo().frame(driver.findElement(iFrameLocator));
    }

    public void clearTextArea(){
        switchToIFrame();
        driver.findElement(textAreaLocator).clear();
        returnBackToMain();
    }

    public void writeText(String text){
        switchToIFrame();
        driver.findElement(textAreaLocator).sendKeys(text);
        returnBackToMain();
    }

    public void returnBackToMain(){
        driver.switchTo().parentFrame();
    }

    public void decreaseIndent(){
        driver.findElement(decreaseIndentLocator).click();
    }

    public String getText(){
        switchToIFrame();
        String text = driver.findElement(textAreaLocator).getText();
        returnBackToMain();
        return text;
    }




}
