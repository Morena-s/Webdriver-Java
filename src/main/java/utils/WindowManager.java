package utils;

import org.openqa.selenium.WebDriver;

import java.net.URL;

public class WindowManager {
    private WebDriver driver;

    public WindowManager(WebDriver driver){
        this.driver = driver;
    }

    public void goBack(){
        driver.navigate().back();
    }

    public void goForward(){
        driver.navigate().forward();
    }

    public void refresh(){
        driver.navigate().refresh();
    }

    public void goTo(String url){
        driver.navigate().to(url);
    }

}
