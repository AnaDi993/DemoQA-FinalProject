package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage extends BaseTest {
    public RadioButtonPage (){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "label[for='yesRadio']")
    public WebElement yesButton;

    @FindBy(css = "label[for='impressiveRadio']")
    public WebElement impressiveButton;

    @FindBy(css = "label[for='noRadio']")
    public WebElement noButton;

    @FindBy(className = "text-success")
    public WebElement message;
}


