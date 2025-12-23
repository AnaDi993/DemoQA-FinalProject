package Tests;

import Base.BaseTest;
import Pages.HomePage;
import Pages.Sidebar;
import Pages.TextBoxPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class TextBoxTest extends BaseTest {

    @BeforeMethod
    public void goToTextBoxPage() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        homePage = new HomePage();
        sidebar = new Sidebar();

        scrollDown(homePage.elements.get(0));
        homePage.clickOnCardName("Elements");
        sidebar.clickOnSideButton("Text Box");

        textBoxPage = new TextBoxPage();
    }

    @Test
    public void testUserCanSuccessfullySubmitData () {
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/text-box");
        textBoxPage.fillInTextBoxApplication("Petar Petrovic","perap@mail.com","Bali, Indonesia","Belgrade, Serbia");
        Assert.assertTrue(textBoxPage.result.isDisplayed());
        Assert.assertTrue(textBoxPage.nameOutput.isDisplayed());
        Assert.assertTrue(textBoxPage.emailOutput.isDisplayed());
        Assert.assertTrue(textBoxPage.currentAddressOutput.isDisplayed());
        Assert.assertTrue(textBoxPage.permanentAddressOutput.isDisplayed());
    }

    @Test
    public void testUserCannotSubmitDataWithWrongEmailFormat () {
        textBoxPage.fillInTextBoxApplication("Petar Petrovic", "perap#mail.com", "Bali, Indonesia", "Belgrade, Serbia");
        Assert.assertFalse(textBoxPage.result.isDisplayed());
    }

    @Test
    public void testUserCanSubmitDataWithoutFullName (){
        textBoxPage.fillInWithoutFullName("perap@mail.com","Bali, Indonesia","Belgrade, Serbia");
        Assert.assertTrue(textBoxPage.result.isDisplayed());
        Assert.assertTrue(textBoxPage.emailOutput.isDisplayed());
        Assert.assertTrue(textBoxPage.currentAddressOutput.isDisplayed());
        Assert.assertTrue(textBoxPage.permanentAddressOutput.isDisplayed());
    }

    @Test
    public void testUserCanSubmitDataWithoutEmail (){
        textBoxPage.fillInWithoutEmail("Petar Petrovic","Bali, Indonesia","Belgrade, Serbia");
        Assert.assertTrue(textBoxPage.result.isDisplayed());
        Assert.assertTrue(textBoxPage.nameOutput.isDisplayed());
        Assert.assertTrue(textBoxPage.currentAddressOutput.isDisplayed());
        Assert.assertTrue(textBoxPage.permanentAddressOutput.isDisplayed());
    }

    @Test
    public void testUserCanSubmitDataWithoutCurrentAddress (){
        textBoxPage.fillInWithoutCurrentAddress("Petar Petrovic","perap@mail.com","Belgrade, Serbia");
        Assert.assertTrue(textBoxPage.result.isDisplayed());
        Assert.assertTrue(textBoxPage.nameOutput.isDisplayed());
        Assert.assertTrue(textBoxPage.emailOutput.isDisplayed());
        Assert.assertTrue(textBoxPage.permanentAddressOutput.isDisplayed());
    }

    @Test
    public void testUserCanSubmitDataWithoutPermanentAddress (){
        textBoxPage.fillInWithoutPermanentAddress("Petar Petrovic","perap@mail.com","Bali, Indonesia");
        Assert.assertTrue(textBoxPage.result.isDisplayed());
        Assert.assertTrue(textBoxPage.nameOutput.isDisplayed());
        Assert.assertTrue(textBoxPage.emailOutput.isDisplayed());
        Assert.assertTrue(textBoxPage.currentAddressOutput.isDisplayed());
    }

}
