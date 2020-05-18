package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By contextArea = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void rightClick(){

        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(contextArea)).contextClick().perform();
    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }

    public void closeAlertBox(){
        driver.switchTo().alert().accept();
    }
}
