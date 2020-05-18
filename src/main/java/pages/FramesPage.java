package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesPage {
    private WebDriver driver;
    private By nestedFramesLink = By.linkText("Nested Frames");

    public FramesPage(WebDriver driver){
        this.driver = driver;
    }

    private void clickLink(By element){
        driver.findElement(element).click();
    }

    public NestedFramesPage clickOnNestedFramesLink(){
        clickLink(nestedFramesLink);
        return new NestedFramesPage(driver);
    }


}
