package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class KeyPressesPage {
    private WebDriver driver;
    private By keyPressField = By.id("target");
    private By resultParagraph = By.id("result");
    public KeyPressesPage(WebDriver driver){
        this.driver= driver;
    }

    public void enterText(String input){
        driver.findElement(keyPressField).sendKeys(input);

    }

    public String getResult(){
        return driver.findElement(resultParagraph).getText();

    }
}
