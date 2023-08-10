import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShippingAddressPage {
    public void addShippingAddress(ChromeDriver driver) {
        addContactDetails(driver);

        WebElement addFirstName = driver.findElement(By.name("firstName"));
        addFirstName.sendKeys("Gaurav");

        WebElement addLastName = driver.findElement(By.name("lastName"));
        addLastName.sendKeys("Jaiswal");

        WebElement addDeliveryAddress = driver.findElement(By.name("address1"));
        addDeliveryAddress.sendKeys("TestVagrant Technology");

        WebElement addOptionalAddress = driver.findElement(By.name("address2"));
        addOptionalAddress.sendKeys("near Mi Showroom");

        WebElement addCity = driver.findElement(By.name("city"));
        addCity.sendKeys("Banglore");

        WebElement addState = driver.findElement(By.name("zone"));
        addState.sendKeys("Karnataka");

        WebElement addPostalCode = driver.findElement(By.name("postalCode"));
        addPostalCode.sendKeys("560026");

        WebElement addInformationForNextTime = driver.findElement(By.name("save_shipping_information"));
        addInformationForNextTime.click();

        WebElement continueToShoppingButton = driver.findElement(By.cssSelector("#Form3 > div:nth-child(1) > div > div.VheJw > div.oQEAZ.WD4IV > div > button)"));
        continueToShoppingButton.click();
    }

    private void addContactDetails(ChromeDriver driver) {
        WebElement addEmailInTextBox= driver.findElement(By.name(("email")));
        addEmailInTextBox.sendKeys("gauravjais4491@gmail.com");

        WebElement checkUpdateNewsAndOfferButton = driver.findElement(By.name("marketing_opt_in"));
        checkUpdateNewsAndOfferButton.click();
    }
}
