import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

public class PoehaliSerii {

    public static void assertText(String actualValue, String expectedValue) {
        if (actualValue.equals(expectedValue)) {
            System.out.println("Passed.");
        } else {
            System.err.println("Failed. Expected text is "
                    + expectedValue + ", but Actual title is " + actualValue);
        }
    }


    public static void main(String[] args) throws InterruptedException {

        PokerPlayer a = new PokerPlayer();


        WebDriver driver = new FirefoxDriver(); // Open Firefox
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        String URL = "http://80.92.229.236:81"; // Poker URL
        driver.get(URL + "/auth/login"); // Open Poker


        WebElement usernameInput = driver.findElement(By.id("username")); // Find username input
        usernameInput.sendKeys("admin"); // Set username

        WebElement passwordInput = driver.findElement(By.id("password")); // Find password input
        passwordInput.sendKeys("123"); // Set password

        WebElement loginButton = driver.findElement(By.id("logIn")); // Find login button
        loginButton.click(); // click on LogIn button

        //Fill all fields


        WebElement InsertButton = driver.findElement(By.xpath(".//*[@id='datagrid_actionpanel__723a925886']/a[2]"));
        InsertButton.click();//click insert button

        WebElement username = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_login']"));
        username.sendKeys(a.getUsername());//Fill username

        WebElement email = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_email']"));
        email.sendKeys(a.getEmail());//Fill email

        WebElement phone = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_phone']"));
        phone.sendKeys(a.getPhone());//Fill phone number

        WebElement firstName = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_fname']"));
        firstName.sendKeys(a.getFirstName());//Fill firstName

        WebElement lastName = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_lname']"));
        lastName.sendKeys(a.getLastName());//Fill lastName

        WebElement city = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_city']"));
        city.sendKeys(a.getCity()); //Fill city

        WebElement password = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_password']"));
        password.sendKeys(a.getPassword());//Fill password

        WebElement confirmPassword = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__confirm_password']"));
        confirmPassword.sendKeys(a.getPassword());//Fill confirm password

        WebElement address = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_address']"));
        address.sendKeys(a.getAddress());//Fill address

        WebElement saveButton = driver.findElement(By.xpath(".//*[@id='ff14642ac1c_tabs']/div[2]/input[1]"));
        saveButton.click();//click save

        String actualTitle = driver.getTitle();
        String expectedTitle = "Players";

        assertText(actualTitle, expectedTitle); // Make assertions

        WebElement searchUsername = driver.findElement(By.xpath(".//*[@id='723a925886__login']"));
        searchUsername.sendKeys(a.getUsername());// Fill the username field

        WebElement searchButton = driver.findElement(By.xpath(".//*[@id='filter_panel_buttons']/input[2]"));
        searchButton.click();//Find this shit for me

        WebElement editButton = driver.findElement(By.xpath(".//*/td[1]/a/img"));
        editButton.click();//Lets change him a little

        //Assert

        String s = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_login']")).getAttribute("value");
        assertText(s, a.getUsername());

        s = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_email']")).getAttribute("value");
        assertText(s, a.getEmail());

        s = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_fname']")).getAttribute("value");
        assertText(s, a.getFirstName());

        s = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_lname']")).getAttribute("value");
        assertText(s, a.getLastName());

        s = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_city']")).getAttribute("value");
        assertText(s, a.getCity());

        s = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_address']")).getAttribute("value");
        assertText(s, a.getAddress());

        s = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_phone']")).getAttribute("value");
        assertText(s, a.getPhone());




        //New value

        WebElement newEmail = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_email']"));
        newEmail.clear();
        newEmail.sendKeys(a.getEmail());//Fill email

        WebElement nPhone = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_phone']"));
        nPhone.clear();
        nPhone.sendKeys(a.getPhone());//Fill phone number

        WebElement nFirstName = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_fname']"));
        nFirstName.clear();
        nFirstName.sendKeys(a.getFirstName());//Fill firstName

        WebElement nLastName = driver.findElement(By.xpath("./*//*[@id='ff14642ac1c__us_lname']"));
        nLastName.clear();
        nLastName.sendKeys(a.getLastName());//Fill lastName

        WebElement nCity = driver.findElement(By.xpath("./*//*[@id='ff14642ac1c__us_city']"));
        nCity.clear();
        nCity.sendKeys(a.getCity()); //Fill city*/

        WebElement nAddress = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_address']"));
        nAddress.clear();
        nAddress.sendKeys(a.getAddress());//Fill address

        WebElement aSaveButton = driver.findElement(By.xpath(".//*[@id='ff14642ac1c_tabs']/div[2]/input[1]"));
        aSaveButton.click();//click save



        WebElement nSearchButton = driver.findElement(By.xpath(".//*[@id='filter_panel_buttons']/input[2]"));
        nSearchButton.click();//Find this shit for me
        WebElement nEditButton = driver.findElement(By.xpath(".//*/td[1]/a/img"));
        nEditButton.click();

        System.out.println("New assert: ");

        s = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_login']")).getAttribute("value");
        assertText(s, a.getUsername());

        s = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_email']")).getAttribute("value");
        assertText(s, a.getEmail());

        s = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_fname']")).getAttribute("value");
        assertText(s, a.getFirstName());

        s = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_lname']")).getAttribute("value");
        assertText(s, a.getLastName());

        s = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_city']")).getAttribute("value");
        assertText(s, a.getCity());

        s = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_address']")).getAttribute("value");
        assertText(s, a.getAddress());

        s = driver.findElement(By.xpath(".//*[@id='ff14642ac1c__us_phone']")).getAttribute("value");
        assertText(s, a.getPhone());







    }


}