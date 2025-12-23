package Tests;

import Base.BaseTest;
import Pages.CheckBoxPage;
import Pages.HomePage;
import Pages.Sidebar;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {
    @BeforeMethod
    public void goToCheckBoxPage (){
        homePage = new HomePage();
        sidebar = new Sidebar();

        scrollDown(homePage.elements.get(0));
        homePage.clickOnCardName("Elements");
        sidebar.clickOnSideButton("Check Box");

        checkBoxPage = new CheckBoxPage();
    }

    @Test
    public void selectAllCheckboxes() {
        checkBoxPage.expandButton.click();
        checkBoxPage.clickAll();
        scrollDown(checkBoxPage.result);
        Assert.assertTrue(checkBoxPage.result.getText().contains("You have selected"));
        Assert.assertTrue(checkBoxPage.result.isDisplayed());
    }
}
