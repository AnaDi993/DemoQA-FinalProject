package Tests;

import Base.BaseTest;
import Pages.ButtonsPage;
import Pages.HomePage;
import Pages.Sidebar;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ButtonsTest extends BaseTest {
    // Test class that validates all button actions on the Buttons page
    // Uses TestNG framework and Page Object Model

    @BeforeMethod
    public void goToButtonsPage() {
        homePage = new HomePage();
        sidebar = new Sidebar();

        scrollDown(homePage.elements.get(0));
        homePage.clickOnCardName("Elements");
        sidebar.clickOnSideButton("Buttons");

        buttonsPage = new ButtonsPage();
    }

    @Test
        public void checkAllButtons () {
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/buttons");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        scrollDown(buttonsPage.doubleClickButton);
        buttonsPage.doubleClick();
        wait.until(ExpectedConditions.visibilityOf(buttonsPage.doubleMessage));
        Assert.assertTrue(buttonsPage.doubleMessage.isDisplayed());

        scrollDown(buttonsPage.rightClickButton);
        buttonsPage.rightClick();
        wait.until(ExpectedConditions.visibilityOf(buttonsPage.rightMessage));
        Assert.assertTrue(buttonsPage.rightMessage.isDisplayed());

        scrollDown(buttonsPage.clickMeButton);
        buttonsPage.dynamicClick();
        wait.until(ExpectedConditions.visibilityOf(buttonsPage.clickMeMessage));
        Assert.assertTrue(buttonsPage.clickMeMessage.isDisplayed());
    }

}
