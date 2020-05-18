package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicLoadingExample1Page {
    private WebDriver driver;
    private By hiddenElementLink = By.linkText("Example 1: Element on page that is hidden");
    private By renderedElement = By.linkText("Example 2: Element rendered after the fact");

    public DynamicLoadingExample1Page(WebDriver driver){
        this.driver = driver;
    }

    public void clickElement(By locator){
        driver.findElement(locator).click();
    }

    public DynamicallyLoadedPage clickHiddenElementLink(){
        clickElement(hiddenElementLink);
        return new DynamicallyLoadedPage(driver);
    }
    public RenderedElementPage clickRenderedElementLink(){
        clickElement(renderedElement);
        return new RenderedElementPage(driver);
    }

}
