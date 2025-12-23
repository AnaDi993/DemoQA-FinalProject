package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsPage extends BaseTest {
    // Page Object class representing the Buttons page
    // Contains web elements and user actions related to the page
    // Uses PageFactory for element initialization

    public ButtonsPage (){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClickButton;

    @FindBy(id = "rightClickBtn")
    public WebElement rightClickButton;

    @FindBy(xpath = "//button[text()='Click Me']")
    public WebElement clickMeButton;

    @FindBy(id = "doubleClickMessage")
    public WebElement doubleMessage;

    @FindBy(id = "rightClickMessage")
    public WebElement rightMessage;

    @FindBy(id = "dynamicClickMessage")
    public WebElement clickMeMessage;


    public void doubleClick() {
        new Actions(driver).doubleClick(doubleClickButton).perform();
    }

    public void rightClick() {
        new Actions(driver).contextClick(rightClickButton).perform();
    }

    public void dynamicClick() {
        clickMeButton.click();
    }
}
