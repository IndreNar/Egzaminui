package lt.itacademy.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class RegisterAccountPage extends AbstractPage {

    @FindBy(css = "#input-firstname")
    private WebElement firstNameInputField;

    @FindBy(css = "#input-lastname")
    private WebElement lastNameInputField;

    @FindBy(css = "#input-email")
    private WebElement emailInputField;

    @FindBy(xpath = "//*[@id='input-telephone']")
    private WebElement telephoneNumberInputField;

    @FindBy(css = "#input-password")
    private WebElement passwordInputField;

    @FindBy(css = "#input-confirm")
    private WebElement confirmPasswordInputField;

    @FindBy(css = "input[type=\"checkbox\"]")
    private WebElement privacyPolicyCheckbox;
    @FindBy(css = "input[type=\"submit\"]")
    private WebElement registerAccountContinueButton;

    @FindBy(xpath = "//h1")
    private WebElement message;


    public RegisterAccountPage(WebDriver driver) {
        super(driver);
    }

    public void sendFirstNameText(String firstName){
        firstNameInputField.sendKeys(firstName);
    }

    public void sendLastNameText(String lastName){
        lastNameInputField.sendKeys(lastName);
    }

    public void sendEmailText(String email){
        emailInputField.sendKeys(email);
    }

    public void sendTelephoneNumber(String telephoneNumber){
        telephoneNumberInputField.sendKeys(telephoneNumber);
    }

    public void sendPassword(String password){
        passwordInputField.sendKeys(password);
    }

    public void sendConfirmPassword(String password){
        confirmPasswordInputField.sendKeys(password);
    }

    public void clickPrivacyPolicyCheckbox(){
        privacyPolicyCheckbox.click();
    }
    public void clickRegisterAccountContinueButton(){
        registerAccountContinueButton.click();
    }

    public String getMessageText(){
        return message.getText();
    }


    public int generateRandomNumber(){
        Random random = new Random();
        return random.nextInt(1000);
    }
}
