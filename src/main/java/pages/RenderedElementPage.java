package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RenderedElementPage {
    private WebDriver driver;
    private By startButton = By.cssSelector("div#start button");
    private By text = By.cssSelector("div#finish");
//    private By loadingImage = By.id("loading");

    public RenderedElementPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickStartButton(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, 7);
        wait.until(ExpectedConditions.presenceOfElementLocated(text));
    }

    public String getLoadedText(){
        return driver.findElement(text).getText();
    }
}
