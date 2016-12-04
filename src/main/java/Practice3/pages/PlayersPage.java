package Practice3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by StarKiler on 04.12.2016.
 */
public class PlayersPage {

    private WebDriver driver;


    public PlayersPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setPlayerName(String value) {
        waitForPresenceOfElementLocated(By.xpath(".//*[@id='723a925886__login']"));
        WebElement playerNameInput = driver.findElement(By.xpath(".//*[@id='723a925886__login']"));
        playerNameInput.clear();
        playerNameInput.sendKeys(value);
    }

    public void waitForPresenceOfElementLocated(By locator) {
        Wait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }


    public void search() {
        //find logIn button and click
        WebElement searchBtn = driver.findElement(By.xpath(".//*[@id='filter_panel_buttons']/input[2]"));
        searchBtn.click();
    }



    public void clickInsert() {
        WebElement searchBun = driver.findElement(By.xpath(".//*[@id='datagrid_actionpanel__723a925886']/a[1]/img"));
        searchBun.click();
    }
}
