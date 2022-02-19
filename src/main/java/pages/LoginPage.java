package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {

    private WebDriver driver;

    private By emailField = By.xpath("//input[@placeholder='Email']");
    private By passwordField = By.xpath("//input[@placeholder='Password']");
    private By loginButton = By.xpath("//button[contains(@class, 'btn-lg')]");


    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail (String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPassword (String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public DashboardPage clickLoginButton (){

        WebElement element = driver.findElement(loginButton );
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);

        return new DashboardPage (driver);
    }
}
