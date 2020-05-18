package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By horizontalInput = By.cssSelector("div.sliderContainer input");
    private By rangeValue = By.id("range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }



    public void setSliderValue(Keys key, int value){
        WebElement slider = setFocus();
        for(int i = 1; i<=value; i++)
        slider.sendKeys(key);


    }
    private WebElement setFocus(){
        return driver.findElement(horizontalInput);

    }
     public int getRange(){
        return Integer.parseInt(driver.findElement(rangeValue).getText());

     }



}
