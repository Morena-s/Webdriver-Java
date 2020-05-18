package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By dropDownLink = By.linkText("Dropdown");
    private By forgotPasswordLink = By.linkText("Forgot Password");
    private By hoversLink = By.linkText("Hovers");
    private By keyPressesLink = By.linkText("Key Presses");
    private By horizontalSliderLink = By.linkText("Horizontal Slider");
    private By javaScriptAlert = By.linkText("JavaScript Alerts");
    private By fileUpload = By.linkText("File Upload");
    private By modalLink = By.linkText("Entry Ad");
    private By contextMenuLink =By.linkText("Context Menu");
    private By WYSIWYGLink =By.linkText("WYSIWYG Editor");
    private By framesLink = By.linkText("Frames");
    private By dynamicLoadingLink = By.linkText("Dynamic Loading");
    private By largeAndDeepLink = By.linkText("Large & Deep DOM");
    private WebDriver driver;

    public HomePage(WebDriver drive){
        this.driver = drive;

    }

    public ForgotPasswordPage clickForgotPassword(){
        clickLink(forgotPasswordLink);
        return new ForgotPasswordPage(driver);

    }

    public LoginPage clickFormAuthentication(){
        clickLink(formAuthenticationLink);
        return new LoginPage(driver);

    }

    public void clickLink(By linkText){
        driver.findElement(linkText).click();
    }

    public DropDownPage clickDropDownPage(){
       clickLink(dropDownLink);
        return new DropDownPage(driver);
    }

    public HoversPage clickHoversPage(){
        clickLink(hoversLink);
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickLink(keyPressesLink);
        return new KeyPressesPage(driver);

    }
    public HorizontalSliderPage clickHorizontalSlider(){
        clickLink(horizontalSliderLink);
        return new HorizontalSliderPage(driver);

    }
    public JavaScriptAlertPage clickJavaScriptAlert(){
        clickLink(javaScriptAlert);
        return new JavaScriptAlertPage(driver);

    }
    public FileUploadPage clickFileUpload(){
        clickLink(fileUpload);
        return new FileUploadPage(driver);

    }
    public ModalPage clickModal(){
        clickLink(modalLink);
        return new ModalPage(driver);

    }
    public ContextMenuPage clickContextMenuLink(){
        clickLink(contextMenuLink);
        return new ContextMenuPage(driver);

    }
    public WYSIWYGPage clickWysiwygLink(){
        clickLink(WYSIWYGLink);
        return new WYSIWYGPage(driver);

    }
    public FramesPage clickFramesLink(){
        clickLink(framesLink);
        return new FramesPage(driver);

    }
    public DynamicLoadingExample1Page clickDynamicLoadingLink(){
        clickLink(dynamicLoadingLink);
        return new DynamicLoadingExample1Page(driver);

    }
    public LargeAndDeepDomPage clickLargeAndDeepDomLink(){
        clickLink(largeAndDeepLink);
        return new LargeAndDeepDomPage(driver);

    }
}
