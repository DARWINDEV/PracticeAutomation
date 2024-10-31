package traineeselenium.pageobjects;

import org.testng.annotations.Test;
import traineeselenium.AbstractComponents.AbstractComponents;
import traineeselenium.ObjectPages.*;

import traineeselenium.TestComponents.BaseTest;


public class SubmitOrderTest extends BaseTest {

    @Test
    public void Test1(){

        landingPage.setLogin();

        AbstractComponents components = new AbstractComponents(driver);
        components.assertElement("//h2[text()='New User Signup!']", "New User Signup!");

        AccountInfo accountInfo = landingPage.userSignUp("Darwin", "d12311203@gmail.com");

//        FORMULARIO

        components.assertElement("//*[text()='Enter Account Information']","ENTER ACCOUNT INFORMATION");

        accountInfo.setGenderCheck();
        accountInfo.setPassword("Test123");
        accountInfo.setDate("30", "November", "1996");
        accountInfo.acceptChecks();

////        ADDRESS INFORMATION

        AccountCreated accountCreated = accountInfo.addressData("Darwin","Jimenez","Capgemini",
                "La pimienta","la salle","Canada",
                "Alberta", "Vegreville", "28000", "555555");

        components.assertElement("//*[text()='Account Created!']","ACCOUNT CREATED!");
        DeleteAccount deleteAccount = accountCreated.accept();


////        DELETE ACCOUNT


        deleteAccount.accDeleted();
        components.assertElement("//*[text()='Account Deleted!']","ACCOUNT DELETED!");
        deleteAccount.acceptBtn();

        tearDown();

    }

    @Test()
    public void Test2(){

        landingPage.setLogin();
        AbstractComponents components = new AbstractComponents(driver);
        components.assertElement("//h2[text()='Login to your account']", "Login to your account");
        landingPage.userSignUp("Darwin", "d123112203@gmail.com");

        tearDown();
    }

    @Test
    public void Test3(){

        landingPage.setLogin();
        AbstractComponents components = new AbstractComponents(driver);
        components.assertElement("//h2[text()='Login to your account']", "Login to your account");
        landingPage.userLogin("d1231122034@gmail.com", "Test123");
        components.assertElement("//p[text()='Your email or password is incorrect!']", "Your email or password is incorrect!");
        tearDown();
    }

    @Test
    public void Test4(){
        landingPage.setLogin();
        AbstractComponents components = new AbstractComponents(driver);
        components.assertElement("//h2[text()='Login to your account']", "Login to your account");
        landingPage.userLogin("testselenium0025@gmail.com", "Test123");
        landingPage.logoutBtn();
        tearDown();
    }

    @Test
    public void Test5(){
        landingPage.setLogin();
        AbstractComponents components = new AbstractComponents(driver);
        components.assertElement("//h2[text()='New User Signup!']", "New User Signup!");

        landingPage.userSignUp("Darwin", "testselenium0025@gmail.com");
        components.assertElement("//*[text()='Email Address already exist!']", "Email Address already exist!");
        tearDown();
    }

    @Test
    public void Test6(){
        String fileRoot = "C:\\Users\\darjimen\\Downloads\\testFile.txt";

        landingPage.setLogin();
        ContactUs contact = new ContactUs(driver);
        contact.setContactUs();

        AbstractComponents components = new AbstractComponents(driver);

        components.assertElement("//h2[text()='Get In Touch']", "GET IN TOUCH");
        contact.countactUsForm("Darwin", "d123112203@gmail.com", "Mala experiencia", "en este texto va todo mi ser", fileRoot);
        contact.alertBtn();

        components.assertElement("//div[contains(@class, 'alert-success')]","Success! Your details have been submitted successfully.");

        contact.success();

    }

    @Test
    public void Test8(){

        AbstractComponents components = new AbstractComponents(driver);
        components.waitUntilItemsAppears("div[class='features_items']");

        ProductPage productPage = new ProductPage(driver);
        productPage.productItems();
        tearDown();

    }
}
