package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){


       LoginPage loginPage = homePage.clickLogin();

       loginPage.setEmail("agent@phptravels.com");
       loginPage.setPassword("demoagent");

       DashboardPage dashboardPage = loginPage.clickLoginButton();

       //assertTrue (dashboardPage.getAlertText().contains("Welcome Back"), "Alert text is incorrect");
        // verify that current page URL equals to dashboard page URL.
        assert isCurrentUrlEqualTo("https://www.phptravels.net/account/dashboard");
    }

}



