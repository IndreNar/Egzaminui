package lt.itacademy.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage{

    @FindBy(css = ".list-inline > li:nth-child(2)")
    private WebElement myAccountDropdown;

    @FindBy(css = ".dropdown-menu > li:first-child >  a")
    private WebElement registerButton;

    @FindBy(css = ".dropdown-menu > li:nth-child(2) >  a")
    private WebElement loginButton;

    @FindBy(css = ".dropdown-menu > li:nth-child(5) >  a")
    private WebElement logoutButton;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickMyAccountDropdown(){
        myAccountDropdown.click();
    }

    public void clickRegisterButton(){
        registerButton.click();
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public void clickLogoutButton(){
        logoutButton.click();
    }


}
