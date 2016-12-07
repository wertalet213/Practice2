package Practice3.pages;

import Practice3.PokerPlayer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by StarKiler on 05.12.2016.
 */
public class EditPlayerPage {
    private WebDriver driver;

    private PokerPlayer pokerPlayer = new PokerPlayer();

    public EditPlayerPage(WebDriver driver) {
        this.driver = driver;
    }



    public void changeFName() {
        WebElement nFirstName = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_fname']"));
        nFirstName.clear();
        nFirstName.sendKeys(pokerPlayer.getFirstName());
    }

    public void changeLName() {
        WebElement nLastName = driver.findElement(By.xpath("./*//*[@id='ff14642ac1c__us_lname']"));
        nLastName.clear();
        nLastName.sendKeys(pokerPlayer.getLastName());
    }

    public void changeEMale() {
        WebElement newEmail = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_email']"));
        newEmail.clear();
        newEmail.sendKeys(pokerPlayer.getEmail());
    }

    public void changePhone() {
        WebElement nPhone = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_phone']"));
        nPhone.clear();
        nPhone.sendKeys(pokerPlayer.getPhone());
    }

    public void changeAddress() {
        WebElement nAddress = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_address']"));
        nAddress.clear();
        nAddress.sendKeys(pokerPlayer.getAddress());
    }

    public void changeCity() {
        WebElement nCity = driver.findElement(By.xpath("./*//*[@id='ff14642ac1c__us_city']"));
        nCity.clear();
        nCity.sendKeys(pokerPlayer.getCity());
    }

    public void clickSave() {
        WebElement aSaveButton = driver.findElement(By.xpath(".//*[@id='ff14642ac1c_tabs']/div[2]/input[1]"));
        aSaveButton.click();
    }

    public void clickEdit() {
        WebElement editButton = driver.findElement(By.xpath(".//*/td[1]/a/img"));
        editButton.click();
    }

    public void searchUserName() {
        String s = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_login']")).getAttribute("value");
        assertText(s, pokerPlayer.getUsername());
    }

    private void assertText(String actualValue, String expectedValue) {
        if (actualValue.equals(expectedValue)) {
            System.out.println("Passed.");
        } else {
            System.err.println("Failed. Expected text is "
                    + expectedValue + ", but Actual title is " + actualValue);
        }
    }


    public void searchFName() {
        String s = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_fname']")).getAttribute("value");
        assertText(s, pokerPlayer.getFirstName());
    }

    public void searchLName() {
        String s = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_lname']")).getAttribute("value");
        assertText(s, pokerPlayer.getLastName());
    }

    public void searchEMale() {
        String s = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_email']")).getAttribute("value");
        assertText(s, pokerPlayer.getEmail());

    }

    public void searchPhone() {
        String s = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_phone']")).getAttribute("value");
        assertText(s, pokerPlayer.getPhone());

    }

    public void searchAddress() {
        String s = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_address']")).getAttribute("value");
        assertText(s, pokerPlayer.getAddress());
    }

    public void searchCity() {
        String s = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_city']")).getAttribute("value");
        assertText(s, pokerPlayer.getCity());
    }

    public void findMe() {

        WebElement searchUsername = driver.findElement(By.xpath(".//*[@id='723a925886__login']"));
        searchUsername.clear();
        searchUsername.sendKeys(pokerPlayer.getUsername());
        WebElement searchButton = driver.findElement(By.xpath(".//*[@id='filter_panel_buttons']/input[2]"));
        searchButton.click();
    }

    public void clickDelete() {
        WebElement deleteButton = driver.findElement(By.xpath(".//td[14]/a/img"));
        deleteButton.click();
    }
}

