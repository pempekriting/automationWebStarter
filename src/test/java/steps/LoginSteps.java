package steps;

import driver.WebDriverInstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import page.InventoryPage;
import page.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage(WebDriverInstance.getRemoteDriver());
    InventoryPage inventoryPage = new InventoryPage(WebDriverInstance.getRemoteDriver());

    @Given("the user is already on the login page")
    public void theUserIsAlreadyOnTheLoginPage() {
        Assert.assertTrue(loginPage.isUserAlreadyOnTheLoginPage());
    }

    @When("the user login with valid credentials")
    public void theUserLoginWithValidCredentials() {
        loginPage.login();
    }

    @Then("the user should directed to the dashboard user")
    public void theUserShouldDirectedToTheDashboardUser() {
        Assert.assertTrue(inventoryPage.isAlreadyOnTheInventoryPage());
    }

    @Given("the user already login into the website")
    public void theUserAlreadyLoginIntoTheWebsite() {
        loginPage.login();
    }

    @Then("the user should see catalogue product with {}")
    public void theUserShouldSeeCatalogueProductWithProductName(String productName) {
        Assert.assertTrue(inventoryPage.isProductDisplayed(productName));
    }
}
