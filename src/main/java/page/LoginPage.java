package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(css = "#user-name")
    WebElement usernameField;

    @FindBy(css = "#password")
    WebElement passwordField;

    @FindBy(css = "#login-button")
    WebElement loginButton;

    public boolean isUserAlreadyOnTheLoginPage() {
        return usernameField.isDisplayed();
    }

    public void login() {
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();
    }

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
