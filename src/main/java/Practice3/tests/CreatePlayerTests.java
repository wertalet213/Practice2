package Practice3.tests;

import Practice3.pages.CreatePlayerPage;
import Practice3.pages.LoginPage;
import Practice3.pages.PlayersPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class CreatePlayerTests {

    private WebDriver driver;
    private LoginPage loginPage;
    private CreatePlayerPage createPlayerPage;
    private PlayersPage playersPage;

    @BeforeMethod
    public void beforeMethod() {
        createPlayerPage = new CreatePlayerPage(driver);

    }

    @BeforeTest
    public void beforeTest() {
        driver = new FirefoxDriver();
        //wait while driver find element
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

        loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.setUsername("admin");
        loginPage.setPassword("123");
        loginPage.logIn();


    }

    @Test
    public void cNP(){
        playersPage = new PlayersPage(driver);
        playersPage.clickInsert();
        createPlayerPage.fillUsernameField();
        createPlayerPage.fillFNameField();
        createPlayerPage.fillLNameField();
        createPlayerPage.fillPhoneField();
        createPlayerPage.fillCityField();
        createPlayerPage.fillEmailField();
        createPlayerPage.fillAddressField();
        createPlayerPage.fillPasswordField();
        createPlayerPage.fillPasswordConfirmField();
        createPlayerPage.click();
        createPlayerPage.findMe();


    }

    /**
     * Create player without one of required field "Username"
     */
    @Test
    public void negativeCNP() {
        playersPage = new PlayersPage(driver);
        playersPage.clickInsert();
        createPlayerPage.fillFNameField();
        createPlayerPage.fillLNameField();
        createPlayerPage.fillPhoneField();
        createPlayerPage.fillCityField();
        createPlayerPage.fillEmailField();
        createPlayerPage.fillAddressField();
        createPlayerPage.fillPasswordField();
        createPlayerPage.fillPasswordConfirmField();
        createPlayerPage.click();
        createPlayerPage.findMe();
        Assert.assertEquals(createPlayerPage.getErrorMessageEmptyLogin(), "Username: Value is required and can't be empty", "Wrong error message.");
    }
    /**
     * Create player without one of required field "EMale"
     */
    @Test
    public void negative2CNP() {
        playersPage = new PlayersPage(driver);
        playersPage.clickInsert();
        createPlayerPage.fillUsernameField();
        createPlayerPage.fillFNameField();
        createPlayerPage.fillLNameField();
        createPlayerPage.fillPhoneField();
        createPlayerPage.fillCityField();
        createPlayerPage.fillAddressField();
        createPlayerPage.fillPasswordField();
        createPlayerPage.fillPasswordConfirmField();
        createPlayerPage.click();
        createPlayerPage.findMe();
        Assert.assertEquals(createPlayerPage.getErrorMessageEmptyEmaile(), "E-mail: Value is required and can't be empty", "Wrong error message.");
    }
    /**
     * Create player without one of required field "Password"
     */
    @Test
    public void negative3CNP() {
        playersPage = new PlayersPage(driver);
        playersPage.clickInsert();
        createPlayerPage.fillUsernameField();
        createPlayerPage.fillFNameField();
        createPlayerPage.fillLNameField();
        createPlayerPage.fillPhoneField();
        createPlayerPage.fillCityField();
        createPlayerPage.fillAddressField();
        createPlayerPage.fillPasswordField();
        createPlayerPage.fillPasswordConfirmField();
        createPlayerPage.click();
        createPlayerPage.findMe();
        Assert.assertEquals(createPlayerPage.getErrorMessageEmptyPassword(), "Password: Value is required and can't be empty", "Wrong error message.");
    }
    /**
     * Create player without one of required field "Confirm Password"
     */
    @Test
    public void negative4CNP() {
        playersPage = new PlayersPage(driver);
        playersPage.clickInsert();
        createPlayerPage.fillUsernameField();
        createPlayerPage.fillFNameField();
        createPlayerPage.fillLNameField();
        createPlayerPage.fillPhoneField();
        createPlayerPage.fillCityField();
        createPlayerPage.fillAddressField();
        createPlayerPage.fillPasswordField();
        createPlayerPage.fillPasswordConfirmField();
        createPlayerPage.click();
        createPlayerPage.findMe();
        Assert.assertEquals(createPlayerPage.getErrorMessageEmptyConfirmPassword(), "Confirm Password: Value is required and can't be empty", "Wrong error message.");
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
