package traineeselenium.ObjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountInfo{

    WebDriver driver;

    public AccountInfo(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "id_gender1")
    WebElement genderCheck;

    @FindBy (id = "password")
            WebElement password;

    @FindBy(id = "newsletter")
            WebElement newsCheck;

    @FindBy(id = "optin")
            WebElement optionCheck;

    @FindBy(id = "first_name")
    WebElement firstName;

    @FindBy(id = "last_name")
            WebElement lastName;

    @FindBy(id = "company")
    WebElement company;

    @FindBy(id = "address1")
            WebElement mainAddress;

    @FindBy(id = "address2")
    WebElement secAddress;


    @FindBy (id = "state")
            WebElement state;

    @FindBy (id="city")
            WebElement city;

    @FindBy (id = "zipcode")
            WebElement zipcode;

    @FindBy (id = "mobile_number")
            WebElement mobileNumber;

    @FindBy (css = "form[action='/signup'] button:last-of-type")
            WebElement signBtn;



    By selectDay = By.id("days");
    By selectMonth = By.id("months");
    By selectYear = By.id("years");
    By selectCountry = By.id("country");


    public void setGenderCheck(){
        genderCheck.click();
    }

    public void setPassword(String passw){
        password.sendKeys(passw);
    }

    public void setDate(String setDay, String setMonth, String setYear){
        Select dropdownDay = new Select(driver.findElement(selectDay));
        dropdownDay.selectByVisibleText(setDay);

        Select dropdownMonth = new Select(driver.findElement(selectMonth));
        dropdownMonth.selectByVisibleText(setMonth);

        Select dropdownYear = new Select(driver.findElement(selectYear));
        dropdownYear.selectByVisibleText(setYear);
    }

    public void acceptChecks(){
        newsCheck.click();
        optionCheck.click();
    }

    public void setCountry(String countryName){
        Select country = new Select(driver.findElement(selectCountry));
        country.selectByVisibleText(countryName);
    }

    public AccountCreated addressData(String setName, String setLastName, String setCompany, String setFistAddress, String setSecAddress, String countryName, String stateName, String cityName, String zipCode, String mobileNum){
        firstName.sendKeys(setName);
        lastName.sendKeys(setLastName);
        company.sendKeys(setCompany);
        mainAddress.sendKeys(setFistAddress);
        secAddress.sendKeys(setSecAddress);
        setCountry(countryName);
        state.sendKeys(stateName);
        city.sendKeys(cityName);
        zipcode.sendKeys(zipCode);
        mobileNumber.sendKeys(mobileNum);
        signBtn.click();
        return new AccountCreated(driver);

    }

}



