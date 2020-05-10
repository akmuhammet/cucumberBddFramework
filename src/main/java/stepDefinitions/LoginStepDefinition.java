package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilites.Driver;

public class LoginStepDefinition {
    LoginPage loginPage = null;

    @Before
    public void setUp() {
        loginPage = new LoginPage();
    }

    @After
    public void cleanUp() {
        System.out.println("Into the cleanUp method of AccountStep...");
    }

    @Given("^User is already on Login Page$")
    public void user_is_already_on_Login_Page() {
        Driver.get().get("https://www.dice.com/dashboard/login");
    }

    @When("title of page is {string}")
    public void title_of_page_is(String expected) {
        System.out.println("This is parameter:" + expected);
        Assert.assertEquals(expected, loginPage.getPageTitle());
    }

    @Then("User enters User Id with {string} and Password with {string}")
    public void user_enters_User_Id_with_and_Password_with(String email, String password) {
        loginPage.setEmail(email);
        loginPage.setPassword(password);
    }

    @Then("User clicks on Log In button")
    public void user_clicks_on_Log_In_button() {
        loginPage.doLogin();
    }

    @Then("User is on Dashboard Page with title {string}")
    public void user_is_on_Dashboard_Page_with_title(String string) {
        String title = Driver.get().getTitle();
        Assert.assertEquals(string, title);
        System.out.println(title);
    }
}
