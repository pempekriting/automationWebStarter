package hooks;

import driver.WebDriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CucumberHooks {
    RemoteWebDriver remoteWebDriver;

    @Before
    public void beforeTest() {
        remoteWebDriver = WebDriverInstance.initializeDriver();
    }

    @After
    public void after(Scenario scenario) {
        scenario.attach(((TakesScreenshot) remoteWebDriver).getScreenshotAs(OutputType.BYTES), "image/png", "attachment");
        remoteWebDriver.quit();
    }
}
