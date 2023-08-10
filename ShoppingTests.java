import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ShoppingTests {
    @Test
    public void shouldAddToCart() {
        // 1. Arrange
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        // 2. Act
        driver.get("https://testvagrant.myshopify.com/");
        WebElement product = driver.findElement(By.partialLinkText("ADIDAS | CLASSIC BACKPACK"));
        product.click();
        WebElement addToCartButton = driver.findElement(By.name("add"));
        addToCartButton.click();

        // 3. Assert
        WebElement itemCountElement = driver.findElement(By.cssSelector(".cart-count-bubble > span"));
        Assert.assertEquals(itemCountElement.getText(), "1", "Item count is not matching");

    }
}
