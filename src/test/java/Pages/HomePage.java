package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BaseTest {
    // Clicks on a card based on its visible text
    // Used for navigation on the homepage

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "card-body")
    public List<WebElement> elements;

    @FindBy(className = "home-banner")
    public WebElement banner;

    public void clickOnCardName(String cardName) {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getText().equals(cardName)) {
            elements.get(i).click();
            break;
            }
        }
    }

    public String getBannerColor() {
        return banner.getCssValue("background-color");
    }

    public String getBannerText() {
        return banner.getText();
    }

    public String getBannerFontSize() {
        return banner.getCssValue("font-size");
    }

}
