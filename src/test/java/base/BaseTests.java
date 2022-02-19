package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
@BeforeClass
    public void setUp () {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Verica\\IdeaProjects\\php_travel\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.phptravels.net/");
        driver.manage().window().fullscreen();

        homePage = new HomePage(driver);
    }
@AfterClass
    public void tearDown (){
    driver.quit();
    }

    public boolean isCurrentUrlEqualTo(String expectedUrl) {
        String currentUrl = driver.getCurrentUrl();
        boolean b = currentUrl.equals(expectedUrl);
        return b;
    }
}
