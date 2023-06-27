package lt.itacademy.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoggedInPage extends AbstractPage {

    @FindBy(xpath = "//h2")
    private WebElement userLoggedInMessage;

    public LoggedInPage(WebDriver driver) {
        super(driver);
    }

    public String getLoggedInUserMessageText(){
        return userLoggedInMessage.getText();
    }
}
