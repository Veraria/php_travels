package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {
    private WebDriver driver;
    private By firstNameField = By.name("first_name");
    private By lastNameField = By.name("last_name");
    private By signupButton = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[7]/button");


    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setFirstName (String firstName){
       driver.findElement(firstNameField).sendKeys(firstName);
    }
    public void setLastName (String lastName){
        driver.findElement(lastNameField).sendKeys(lastName);
    }
}