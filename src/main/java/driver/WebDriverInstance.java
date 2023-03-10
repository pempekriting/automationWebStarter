package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;

public class WebDriverInstance {
    static RemoteWebDriver remoteWebDriver;

    public static RemoteWebDriver initializeDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        //Auto download driver
        WebDriverManager.chromedriver().setup();

        remoteWebDriver = new ChromeDriver(options);
        remoteWebDriver.get("https://www.saucedemo.com/");
        remoteWebDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return remoteWebDriver;
    }

    public static RemoteWebDriver getRemoteDriver() {
        return remoteWebDriver;
    }
}
