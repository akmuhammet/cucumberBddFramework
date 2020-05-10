package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"loginDataSubmit\"]/div[3]/div/button")
    WebElement signInButton;

    public void setEmail(String email) {
        this.email.sendKeys(email);
    }

    public void setPassword(String password) {
        this.password.sendKeys(password);
    }

    public void doLogin() {
        signInButton.click();
    }

    public String getPageTitle() {
        return Driver.get().getTitle();
    }
}
