package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckBoxPage extends BaseTest {
    public CheckBoxPage (){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "button[title='Expand all']")
    public WebElement expandButton;

    @FindBy(css = "span.rct-checkbox")
    public List<WebElement> allCheckboxes;

    @FindBy(id = "result")
    public WebElement result;

    public void clickAll() {
        for (int i = 0; i < allCheckboxes.size(); i++) {
            allCheckboxes.get(i).click();
        }
    }

}
