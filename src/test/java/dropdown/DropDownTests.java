package dropdown;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DropDownPage;


public class DropDownTests extends BaseTest {

    @Test
    public void dropDownSelect(){
        DropDownPage dropdown = homePage.clickDropDownPage();
        dropdown.selectFromDropDown("Option 1");
        System.out.println(dropdown.getSelectedOptions());
        SoftAssert softassert = new SoftAssert();
        softassert.assertEquals(dropdown.getSelectedOptions().size(),1);
        softassert.assertEquals(dropdown.getSelectedOptions().get(0),"Option 1");
        softassert.assertAll();
    }


}
