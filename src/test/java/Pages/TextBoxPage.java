package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage extends BaseTest {
    public TextBoxPage (){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "userName")
    public WebElement fullName;

    @FindBy(id = "userEmail")
    public WebElement email;

    @FindBy(id = "currentAddress")
    public WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddress;

    @FindBy(id = "submit")
    public WebElement submitButton;

    @FindBy(id = "output")
    public WebElement result;

    @FindBy (id= "name")
    public WebElement nameOutput;

    @FindBy (id = "email")
    public WebElement emailOutput;

    @FindBy (css="p[id = 'currentAddress']")
    public WebElement currentAddressOutput;

    @FindBy (css="p[id = 'permanentAddress']")
    public WebElement permanentAddressOutput;

    public void fillInTextBoxApplication (String name, String emailAddress, String currentA, String permanentA) {
        fullName.sendKeys(name);
        email.sendKeys(emailAddress);
        currentAddress.sendKeys(currentA);
        permanentAddress.sendKeys(permanentA);
        submitButton.click();
    }

    public void fillInWithoutFullName (String emailAddress, String currentA, String permanentA) {
        email.sendKeys(emailAddress);
        currentAddress.sendKeys(currentA);
        permanentAddress.sendKeys(permanentA);
        submitButton.click();
    }

    public void fillInWithoutEmail (String name, String currentA, String permanentA) {
        fullName.sendKeys(name);
        currentAddress.sendKeys(currentA);
        permanentAddress.sendKeys(permanentA);
        submitButton.click();
    }

    public void fillInWithoutCurrentAddress (String name, String emailAddress,String permanentA) {
        fullName.sendKeys(name);
        email.sendKeys(emailAddress);
        permanentAddress.sendKeys(permanentA);
        submitButton.click();
    }

    public void fillInWithoutPermanentAddress (String name, String emailAddress, String currentA) {
        fullName.sendKeys(name);
        email.sendKeys(emailAddress);
        currentAddress.sendKeys(currentA);
        submitButton.click();
    }

}
