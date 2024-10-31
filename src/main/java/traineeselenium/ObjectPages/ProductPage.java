package traineeselenium.ObjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage {
    WebDriver driver;

    @FindBy (css = "ul[class='nav nav-pills nav-justified")
    WebElement product;

    By featureItems = By.cssSelector("div[class='features_items'] .col-sm-4");

    public ProductPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void productItems(){
        List<WebElement> productList = driver.findElements(featureItems);

        for (WebElement product: productList){
            System.out.println(product.isDisplayed());
        }

        Actions actions = new Actions(driver);
        actions.moveToElement(product).click().perform();
    }
}
