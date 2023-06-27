package lt.itacademy.pom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginPageTest extends BaseTest {

    private String email = "abc191@email.com";
    private String emailWrong = "cba000@email.com";
    private String password = "password";
    private String passwordWrong = "wrongPassword";
    HomePage homePage;
    RegisterAccountPage registerAccountPage;
    LogInPage logInPage;
    LoggedInPage loggedInPage;


    @Test
    public void loginUserSuccessfully(){
        homePage = new HomePage(driver);
        registerAccountPage = new RegisterAccountPage(driver);
        logInPage = new LogInPage(driver);
        loggedInPage = new LoggedInPage(driver);

        homePage.clickMyAccountDropdown();
        homePage.clickLoginButton();
        registerAccountPage.sendEmailText(email);
        registerAccountPage.sendPassword(password);
        logInPage.clickReturningCustomerLoginButton();

        String userLoggedInSuccessMessage = "My Account";
        String displayedUserLoggedInMessage = loggedInPage.getLoggedInUserMessageText();

        Assertions.assertEquals(userLoggedInSuccessMessage, displayedUserLoggedInMessage, "Messages do not match");
    }


    @Test
    public void loginUserUnsuccessfullyWrongEmail() {
        homePage = new HomePage(driver);
        registerAccountPage = new RegisterAccountPage(driver);
        logInPage = new LogInPage(driver);
        loggedInPage = new LoggedInPage(driver);

        homePage.clickMyAccountDropdown();
        homePage.clickLoginButton();
        registerAccountPage.sendEmailText(emailWrong);
        registerAccountPage.sendPassword(password);
        logInPage.clickReturningCustomerLoginButton();

        String warningMessage = "Warning: No match for E-Mail Address and/or Password.";
        String displayedMessage = logInPage.getWarningMessage();

        Assertions.assertEquals(warningMessage, displayedMessage, "Warning messages do not match");

    }


    @Test
    public void loginUserUnsuccessfullyWrongPassword() {
        homePage = new HomePage(driver);
        registerAccountPage = new RegisterAccountPage(driver);
        logInPage = new LogInPage(driver);
        loggedInPage = new LoggedInPage(driver);

        homePage.clickMyAccountDropdown();
        homePage.clickLoginButton();
        registerAccountPage.sendEmailText(email);
        registerAccountPage.sendPassword(passwordWrong);
        logInPage.clickReturningCustomerLoginButton();

        String warningMessage = "Warning: No match for E-Mail Address and/or Password.";
        String displayedMessage = logInPage.getWarningMessage();

        Assertions.assertEquals(warningMessage, displayedMessage, "Warning messages do not match");

    }
}
