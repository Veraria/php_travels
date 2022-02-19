package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {

    private WebDriver driver;
    private By welcomeAlert = By.xpath("//span[contains(text(),'Welcome Back')]");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getAlertText(){
        return driver.findElement(welcomeAlert).getText();
    }

    public void waitForElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf((WebElement) welcomeAlert));
    }
}
