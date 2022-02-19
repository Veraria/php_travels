package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By loginButton = By.cssSelector("header.header-area:nth-child(1) div.header-top-bar.padding-right-100px.padding-left-100px div.container div.row.align-items-center div.col-lg-6:nth-child(2) div.header-top-content div.header-right.d-flex.align-items-center.justify-content-end > a.theme-btn.theme-btn-small.theme-btn-transparent.ml-1.waves-effect:nth-child(6)");
    private By signupButton = By.linkText("Signup");

    public HomePage (WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickLogin () {
        driver.findElement(loginButton).click();
        return new LoginPage(driver);
    }

    public SignupPage clickSignup (){
        driver.findElement(signupButton).click();
        return new SignupPage(driver);
    }

    public void print(String text){
        System.out.println(text);

    }
}
