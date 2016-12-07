package Practice3.pages;

import Practice3.PokerPlayer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by StarKiller on 04.12.2016.
 */
public class CreatePlayerPage {
    private WebDriver driver;

    private PokerPlayer pokerPlayer;

    public CreatePlayerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillUsernameField() {
        WebElement username = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_login']"));
        pokerPlayer = new PokerPlayer();
        username.sendKeys(pokerPlayer.getUsername());
    }

    public void fillFNameField() {
        WebElement firstName = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_fname']"));
        firstName.sendKeys(pokerPlayer.getFirstName());
    }

    public void fillLNameField() {
        WebElement lastName = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_lname']"));
        lastName.sendKeys(pokerPlayer.getLastName());
    }

    public void fillPhoneField() {
        WebElement phone = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_phone']"));
        phone.sendKeys(pokerPlayer.getPhone());
    }

    public void fillCityField() {
        WebElement city = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_city']"));
        city.sendKeys(pokerPlayer.getCity());
    }

    public void fillEmailField() {
        WebElement email = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_email']"));
        email.sendKeys(pokerPlayer.getEmail());
    }

    public void fillAddressField() {
        WebElement address = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_address']"));
        address.sendKeys(pokerPlayer.getAddress());
    }

    public void fillPasswordField() {
        WebElement password = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_password']"));
        password.sendKeys(pokerPlayer.getPassword());
    }

    public void fillPasswordConfirmField() {
        WebElement confirmPassword = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__confirm_password']"));
        confirmPassword.sendKeys(pokerPlayer.getPassword());

    }

    public void click() {
        WebElement saveButton = driver.findElement(By.xpath(".//*[@id='ff14642ac1c_tabs']/div[2]/input[1]"));
        saveButton.click();
    }

    public void findMe() {
        WebElement searchUsername = driver.findElement(By.xpath(".//*[@id='723a925886__login']"));
        searchUsername.clear();
        searchUsername.sendKeys(pokerPlayer.getUsername());
        WebElement searchButton = driver.findElement(By.xpath(".//*[@id='filter_panel_buttons']/input[2]"));
        searchButton.click();
    }

    public String getErrorMessageEmptyLogin() {
        WebElement errorElement = driver.findElement(By.xpath(".//*[@id='ff14642ac1c_tabs']/div[1]/ul"));
        return errorElement.getText();
    }

    public String getErrorMessageEmptyEmaile() {
        WebElement errorElement = driver.findElement(By.xpath(".//*[@id='ff14642ac1c_tabs']/div[1]/ul/li"));
        return errorElement.getText();
    }

    public String getErrorMessageEmptyPassword() {
        WebElement errorElement = driver.findElement(By.xpath(".//*[@id='ff14642ac1c_tabs']/div[1]/ul/li"));
        return errorElement.getText();
    }

    public String getErrorMessageEmptyConfirmPassword() {
        WebElement errorElement = driver.findElement(By.xpath(".//*[@id='ff14642ac1c_tabs']/div[1]/ul/li[1]"));
        return errorElement.getText();
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


    public void justFindMe() {
        WebElement searchUsername = driver.findElement(By.xpath(".//*[@id='723a925886__login']"));
        searchUsername.clear();
        searchUsername.sendKeys(pokerPlayer.getUsername());
        WebElement searchButton = driver.findElement(By.xpath(".//*[@id='r_172']/td[14]/a/img"));
        searchButton.click();
    }
}

