package lt.itacademy.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerPage extends AbstractPage{

    @FindBy(css = ".well > a")
    private WebElement newCustomerContinueButton;

    public CustomerPage(WebDriver driver) {
        super(driver);
    }

    public void clickContinueButtonForNewCustomer(){
        newCustomerContinueButton.click();
    }
}
