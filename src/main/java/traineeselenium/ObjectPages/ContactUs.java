package traineeselenium.ObjectPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs {

    WebDriver driver;

    public ContactUs(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="a[href='/contact_us']")
    WebElement contactUs;

    @FindBy(css = "input[name='name']")
            WebElement setName;

    @FindBy(css = "input[name='email']")
            WebElement setEmail;

    @FindBy(css = "input[name='subject']")
            WebElement setSubject;

    @FindBy(css = "textarea[name='message']")
            WebElement setMessage;

    @FindBy(css = "input[type='submit']")
            WebElement submitBtn;

    @FindBy(css = "a[class='btn btn-success']")
            WebElement sucessBtn;

    By setFile = By.cssSelector("input[type='file']");

        public void countactUsForm(String name, String email, String subject, String message, String fileRoot){
            setName.sendKeys(name);
            setEmail.sendKeys(email);
            setSubject.sendKeys(subject);
            setMessage.sendKeys(message);
            WebElement file = driver.findElement(setFile);
            file.sendKeys(fileRoot);
            submitBtn.click();
        }

    public void setContactUs(){
        contactUs.click();
    }

    public void alertBtn(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void success(){
            sucessBtn.click();
    }

}
