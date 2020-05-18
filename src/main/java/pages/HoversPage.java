package pages;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HoversPage {
    private WebDriver driver;
    private By figureBox = By.xpath("//div[@class='figure']");
    private By figCaption = By.className("figcaption");

    public HoversPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     *
     * @param index starts at 1
     */
    public FigureCaption hoverOverFigure(int index){
//        List<WebElement> hoverImages = driver.findElements(figureBox);
        Actions action = new Actions(driver);
        WebElement figure = driver.findElements(figureBox).get(index-1);
        action.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(figCaption));


    }

    public class FigureCaption{

        private WebElement caption;
        private By headerLocator = By.tagName("h5");
        private By tagLocator = By.tagName("a");

        public FigureCaption(WebElement caption){
            this.caption = caption;

        }

        public String getCaption(){
           return caption.findElement(headerLocator).getText();
        }
        public String getLinkText(){
            return caption.findElement(tagLocator).getText();
        }
        public String getLink(){
            return caption.findElement(tagLocator).getAttribute("href");
        }

        public Boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }

    }



}
