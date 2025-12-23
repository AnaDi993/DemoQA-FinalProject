package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Sidebar extends BaseTest {
    public Sidebar (){
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "text")
    public List<WebElement> sideButtons;

    public void clickOnSideButton (String buttonName) {
        for (int i = 0; i < sideButtons.size(); i++) {
            if (sideButtons.get(i).getText().equals(buttonName)) {
                sideButtons.get(i).click();
                break;
            }
        }
    }

}
