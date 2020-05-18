package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropDownPage {

    private WebDriver driver;
    private By dropDown = By.id("dropdown");

    public DropDownPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectFromDropDown(String option){

        findDropdownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedOptions(){
        List<String> optionsSelected = new ArrayList<String>();
        List<WebElement> options = findDropdownElement().getAllSelectedOptions();
        for (WebElement option : options){
            optionsSelected.add(option.getText());

        }
        return optionsSelected;

    }

    private Select findDropdownElement(){
        return new Select(driver.findElement(dropDown));
    }
}
