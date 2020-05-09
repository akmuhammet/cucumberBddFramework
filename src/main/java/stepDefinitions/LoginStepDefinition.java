package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinition {
    WebDriver driver;

    @Before
    public void setUp() {
        System.out.println("Into the setup method of AccountStep...");
        System.setProperty("webdriver.chrome.driver", "/Users/akmuhammet/Desktop/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void cleanUp() {
        System.out.println("Into the cleanUp method of AccountStep...");
        if (null != driver) {
            driver.close();
            driver.quit();
        }
    }

    @Given("^User is already on Login Page$")
    public void user_is_already_on_Login_Page() {
        driver.get("https://global.americanexpress.com/login");
    }

    @When("title of page is {string}")
    public void title_of_page_is(String expected) {
        System.out.println("This is parameter:" + expected);
        String title = driver.getTitle();
        Assert.assertEquals(expected, title);
    }

    @Then("User enters User Id with {string} and Password with {string}")
    public void user_enters_User_Id_with_and_Password_with(String string, String string2) {
        WebElement userId = driver.findElement(By.id("eliloUserID"));
        WebElement password = driver.findElement(By.id("eliloPassword"));

        userId.sendKeys(string);
        password.sendKeys(string2);
    }

    @Then("User clicks on Log In button")
    public void user_clicks_on_Log_In_button() {
    }

    @Then("User is on Dashboard Page")
    public void user_is_on_Dashboard_Page() {
    }
}
