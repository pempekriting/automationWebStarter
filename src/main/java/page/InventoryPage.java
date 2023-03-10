package page;

import driver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {

    @FindBy(className = "app_logo")
    WebElement headerInventoryPage;

    public InventoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public boolean isProductDisplayed(String productName) {
        WebElement dataSample = WebDriverInstance.getRemoteDriver().findElement(By.xpath("//div[@class='inventory_item_name'][text()='" + productName + "']"));
        System.out.printf("Data di element adalah: %s. Data yang ingin diassert adalah %s%n", dataSample.getText(), productName);
        return dataSample.isDisplayed();
    }

    public boolean isAlreadyOnTheInventoryPage() {
        return headerInventoryPage.isDisplayed();
    }
}
