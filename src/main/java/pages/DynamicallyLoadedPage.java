package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicallyLoadedPage {

    private WebDriver driver;
    private By startButton = By.cssSelector("div#start button");
    private By text = By.id("finish");
    private By loadingImage = By.id("loading");

    public DynamicallyLoadedPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickStartButton(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingImage)));
    }

    public String getLoadedText(){
        return driver.findElement(text).getText();
    }



}
