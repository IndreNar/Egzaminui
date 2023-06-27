package lt.itacademy.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends AbstractPage {

    @FindBy(css = "input[value=\"Login\"]")
    private WebElement returningCustomerLoginButton;

    @FindBy(css = ".alert-danger")
    private WebElement warningLogInMessage;

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    public void clickReturningCustomerLoginButton(){
        returningCustomerLoginButton.click();
    }

    public String  getWarningMessage(){
        return warningLogInMessage.getText();
    }
}
