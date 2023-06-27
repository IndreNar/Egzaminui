package lt.itacademy.pom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegisterUserTest extends BaseTest{

    private String firstName = "Momo";
    private String lastName = "Lala";
    private String telephoneNumber = "861234567";
    private String alreadyUsedEmail = "abc191@email.com";
    private String password = "password";


    HomePage homePage;
    CustomerPage customerPage;
    RegisterAccountPage registerAccountPage;
    LogInPage logInPage;



    @Test
    public void registerNewUserSuccessfully(){
        homePage = new HomePage(driver);
        customerPage = new CustomerPage(driver);
        registerAccountPage = new RegisterAccountPage(driver);

        homePage.clickMyAccountDropdown();
        homePage.clickRegisterButton();
        registerAccountPage.sendFirstNameText(firstName);
        registerAccountPage.sendLastNameText(lastName);
        registerAccountPage.sendEmailText("abc" + registerAccountPage.generateRandomNumber() + "@email.com");
        registerAccountPage.sendTelephoneNumber(telephoneNumber);
        registerAccountPage.sendPassword(password);
        registerAccountPage.sendConfirmPassword(password);
        registerAccountPage.clickPrivacyPolicyCheckbox();
        registerAccountPage.clickRegisterAccountContinueButton();

        String successMessage = "Your Account Has Been Created!";
        String displayedMessage = registerAccountPage.getMessageText();

        Assertions.assertEquals(successMessage, displayedMessage, "Messages do not match");

    }

    @Test
    public void registerNewUserUnsuccessfully(){
        homePage = new HomePage(driver);
        customerPage = new CustomerPage(driver);
        registerAccountPage = new RegisterAccountPage(driver);
        logInPage = new LogInPage(driver);

        homePage.clickMyAccountDropdown();
        homePage.clickRegisterButton();
        registerAccountPage.sendFirstNameText(firstName);
        registerAccountPage.sendLastNameText(lastName);
        registerAccountPage.sendEmailText(alreadyUsedEmail);
        registerAccountPage.sendTelephoneNumber(telephoneNumber);
        registerAccountPage.sendPassword(password);
        registerAccountPage.sendConfirmPassword(password);
        registerAccountPage.clickPrivacyPolicyCheckbox();
        registerAccountPage.clickRegisterAccountContinueButton();

        String warningMessage = "Warning: E-Mail Address is already registered!";
        String displayedMessage = logInPage.getWarningMessage();

        Assertions.assertEquals(warningMessage, displayedMessage, "Warning messages do not match");

    }

}
