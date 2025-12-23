package Tests;

import Base.BaseTest;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class BannerTest extends BaseTest {
    @BeforeMethod
    public void goHomePage() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homePage = new HomePage();
    }

    @Test
    public void bannerVisualTest() {
        /* Hexadecimal color od the background is #378ec4, which converted to
           RGB color is (55, 142, 196). Adding the alpha chanel for transparency it
           becomes RGBA (55, 142, 196, 1).
        */

        String color = homePage.getBannerColor();
        Assert.assertEquals(color, "rgba(55, 142, 196, 1)");

        String text = homePage.getBannerText();
        Assert.assertFalse(text.contains("Cucumber"));

        String fontSize = homePage.getBannerFontSize();
        Assert.assertEquals(fontSize, "16px");
    }
}
