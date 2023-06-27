package lt.itacademy.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LogoutPage extends AbstractPage {

    @FindBy(xpath = "//h1")
    private WebElement logoutMessage;


    public LogoutPage(WebDriver driver) {
        super(driver);
    }

    public String getLogoutMessage(){
        return logoutMessage.getText();
    }
}
