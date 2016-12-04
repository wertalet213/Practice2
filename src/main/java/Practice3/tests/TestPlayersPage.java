package Practice3.tests;

import Practice3.pages.LoginPage;
import Practice3.pages.PlayersPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by StarKiller on 04.12.2016.
 */
public class TestPlayersPage {



    private WebDriver driver;
    private LoginPage loginPage;
    public PlayersPage playersPage;

    @BeforeMethod
    public void beforeMethod() {
        playersPage = new PlayersPage(driver);
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
    public void searchPlayer(){
        playersPage.setPlayerName("Vova");
        playersPage.search();

    }
}
