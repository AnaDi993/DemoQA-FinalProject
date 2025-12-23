package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    // Base test class that contains common setup and teardown logic
    // All test and page classes inherit from this class

    public static WebDriver driver; //Inicialisation of WebDriver instance used across the framework
    public HomePage homePage;
    public Sidebar sidebar;
    public TextBoxPage textBoxPage;
    public CheckBoxPage checkBoxPage;
    public RadioButtonPage radioButtonPage;
    public ButtonsPage buttonsPage;

    @BeforeMethod
    public void setup () {
        // Runs before each test method
        // Initializes WebDriver, opens browser and navigates to DemoQA homepage

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");

        ((JavascriptExecutor) driver).executeScript("const ad = document.getElementById('fixedban'); if (ad) ad.remove();");
        // Removes fixed advertisement banner to avoid element overlap issues
    }

    public void scrollDown(WebElement element) {
        // Method used to scroll to a specific web element

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    @AfterMethod
    public void tearDown() {
        // Runs after each test method
        // Closes the browser and ends driver session

        driver.quit();
    }

}
