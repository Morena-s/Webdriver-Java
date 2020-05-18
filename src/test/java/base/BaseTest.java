package base;


import com.applitools.eyes.selenium.Eyes;
import com.google.common.io.Files;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.util.concurrent.TimeUnit;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class BaseTest {
    private EventFiringWebDriver driver;
    protected HomePage homePage;
    protected static Eyes eyes;


    @BeforeClass
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver-2");
        driver =  new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
        initiateEyes();
        driver.register(new EventReporter());

       homePage = new HomePage(driver);
       driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        goHomePage();
        setCookie();


        driver.manage().window().maximize();

    }

    public static void initiateEyes(){
        eyes = new Eyes();
        eyes.setApiKey(System.getProperty("applitools.api.key"));

    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);

    }

    @BeforeMethod
    public void goHomePage(){
        driver.get("https://the-internet.herokuapp.com");
    }

    @AfterMethod
    public void recordFailure(ITestResult result){
        if(result.getStatus() == ITestResult.FAILURE){
            TakesScreenshot camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
//            System.out.println("The path of the screenshot is: " + screenshot.getAbsolutePath());
//            System.out.println(System.getProperty("user.dir"));
            try {
                Files.move(screenshot,new File(System.getProperty("user.dir")+"//resources//screenshots//"+result.getName() + ".png"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

    private ChromeOptions getChromeOptions(){

        ChromeOptions options = new ChromeOptions();
//        options.addArguments("disable-infobars");
//        options.setHeadless(true);
        return options;

    }

    private void setCookie(){
        Cookie cookie = new Cookie.Builder("sally","123").domain("the-internet.herokuapp.com").build();
        driver.manage().addCookie(cookie);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
