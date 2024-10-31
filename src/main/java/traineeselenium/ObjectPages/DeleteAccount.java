package traineeselenium.ObjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAccount {
    WebDriver driver;

    public DeleteAccount(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[href='/delete_account']")
    WebElement deleteAccnt;

    @FindBy (css = "a[href='/']")
    WebElement acceptBtn;

    public void accDeleted(){
        deleteAccnt.click();
    }


    public void acceptBtn(){
        acceptBtn.click();
    }
}
