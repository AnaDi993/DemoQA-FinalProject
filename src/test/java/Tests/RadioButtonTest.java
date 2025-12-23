package Tests;

import Base.BaseTest;
import Pages.HomePage;
import Pages.RadioButtonPage;
import Pages.Sidebar;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {

    @BeforeMethod
    public void goToRadioButtonPage (){
        homePage = new HomePage();
        sidebar = new Sidebar();

        scrollDown(homePage.elements.get(0));
        homePage.clickOnCardName("Elements");
        sidebar.clickOnSideButton("Radio Button");

        radioButtonPage = new RadioButtonPage();
    }

    @Test
    public void selectYesRadioButton() {
        radioButtonPage.yesButton.click();
        Assert.assertEquals(radioButtonPage.message.getText(), "Yes");
    }


    @Test
    public void selectImpressiveRadioButton() {
        radioButtonPage.impressiveButton.click();
        Assert.assertEquals(radioButtonPage.message.getText(), "Impressive");
    }

    @Test
    public void noRadioButtonIsDisabled() {
        /*Test fails because there is a bug regarding clickability od a "No" radio button.
        Eventhough you cannot click it, it is actually enabled on the webpage,
        so the assertation error occurs => expected: false, actual: true.
        */
        radioButtonPage.noButton.click();
        Assert.assertFalse(radioButtonPage.noButton.isEnabled());
    }
}
