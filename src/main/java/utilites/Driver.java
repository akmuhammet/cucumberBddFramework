package utilites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static WebDriver instance = null;

    private Driver() {}

    public static WebDriver get() {
        if (instance == null) {
            System.setProperty("webdriver.chrome.driver", "/Users/akmuhammet/Desktop/chromedriver");
            instance = new ChromeDriver();
        }

        return instance;
    }
}
