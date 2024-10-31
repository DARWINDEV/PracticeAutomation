package traineeselenium.ObjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LandingPage{

    WebDriver driver;

    public LandingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[href='/login']")
    WebElement login;

    @FindBy(css = "a[href='/logout']")
    WebElement logout;


    @FindBy(css = "input[name='name']")
            WebElement setName;

    @FindBy(css = "input[data-qa='signup-email']")
            WebElement setEmail;

    @FindBy(css = "form[action='/signup'] button:last-of-type")
            WebElement signUpBtn;

    @FindBy(css = "input[data-qa='login-email']")
    WebElement loginEmail;

    @FindBy(css = "input[name='password']")
    WebElement setPassword;

    @FindBy(css = "form[action='/login'] button:last-of-type")
    WebElement userLoginBtn;


    public void setLogin(){
        login.click();
    }

    public void logoutBtn(){
        logout.click();
    }

    public AccountInfo userSignUp(String name, String email){
        setName.sendKeys(name);
        setEmail.sendKeys(email);
        signUpBtn.click();
        return new AccountInfo(driver);
    }

    public void userLogin(String email, String password){
        loginEmail.sendKeys(email);
        setPassword.sendKeys(password);
        userLoginBtn.click();
    }

    public void goTo(){
        driver.get("https://automationexercise.com/");
    }

}
