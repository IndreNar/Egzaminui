package lt.itacademy.pom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogoutPageTest extends BaseTest {

    private String email = "abc191@email.com";
    private String password = "password";
    HomePage homePage;
    RegisterAccountPage registerAccountPage;
    LogInPage logInPage;
    LoggedInPage loggedInPage;
    LogoutPage logoutPage;



    @Test
    public void accountLogout(){
        homePage = new HomePage(driver);
        registerAccountPage = new RegisterAccountPage(driver);
        logInPage = new LogInPage(driver);
        loggedInPage = new LoggedInPage(driver);
        logoutPage = new LogoutPage(driver);

        //logIn part
        homePage.clickMyAccountDropdown();
        homePage.clickLoginButton();
        registerAccountPage.sendEmailText(email);
        registerAccountPage.sendPassword(password);
        logInPage.clickReturningCustomerLoginButton();

        //logout part
        homePage.clickMyAccountDropdown();
        homePage.clickLogoutButton();

        String successLogoutMessage = "Account Logout";
        String displayedLogoutMessage = logoutPage.getLogoutMessage();

        Assertions.assertEquals(successLogoutMessage, displayedLogoutMessage, "Logout Messages do not match");


    }
}
