package traineeselenium.ObjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AccountCreated {

    WebDriver driver;

    public AccountCreated(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[href='/']")
    WebElement acceptBtn;


    public DeleteAccount accept(){
        acceptBtn.click();
        return new DeleteAccount(driver);
    }


}


