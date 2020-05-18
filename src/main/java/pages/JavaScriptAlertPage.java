package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertPage {

    private By triggerAlertButton = By.xpath("//button[text()='Click for JS Alert']");
    private By triggerJSConfirm = By.xpath("//button[text()='Click for JS Confirm']");
    private By triggerJSPrompt = By.xpath("//button[text()='Click for JS Prompt']");
    private By alertResult = By.id("result");

    private WebDriver driver;

    public JavaScriptAlertPage(WebDriver driver){
        this.driver=driver;
    }

    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }

    public String alertResult(){
        return driver.findElement(alertResult).getText();
    }
    public void triggerConfirm(){
        driver.findElement(triggerJSConfirm).click();
    }
    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }
    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public void triggerPrompt(){
        driver.findElement(triggerJSPrompt).click();
    }

    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);

    }

    public void alert_promptConfirm(){
        driver.switchTo().alert().accept();
    }

    public String alert_getTextResult(){
        return driver.findElement(alertResult).getText();
    }


}
