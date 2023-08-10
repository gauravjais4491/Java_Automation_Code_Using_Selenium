import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductDetailsPage {

    public void addToCart(ChromeDriver driver) {
        WebElement quantityElement = driver.findElement(By.name("quantity"));
        quantityElement.clear();
        quantityElement.sendKeys("4");

        WebElement addToCartButton = driver.findElement(By.name("add"));
        addToCartButton.click();
    }

    public void goToViewCartPage(ChromeDriver driver) {
        WebElement viewMyCartButton= driver.findElement(By.id("cart-notification-button"));
        viewMyCartButton.click();
    }
}
