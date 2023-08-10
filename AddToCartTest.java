import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddToCartTest {
    @Test
    public void shouldTestIncreasingQuantity() {
        // 1. Arrange
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        // 2. Act
        driver.get("https://testvagrant.myshopify.com/collections/all");
        WebElement product = driver.findElement(By.partialLinkText("ADIDAS | KID'S STAN SMIT"));
        product.click();
        WebElement quantityElement = driver.findElement(By.name("quantity"));
        quantityElement.clear();
        quantityElement.sendKeys("4");
        WebElement addToCartButton = driver.findElement(By.name("add"));
        addToCartButton.click();

        // 3. Assert
        WebElement cartCountElement = driver.findElement(By.cssSelector("#cart-icon-bubble > div > span:nth-child(1)"));
        Assert.assertEquals(cartCountElement.getText(), "4", "Item count is not matching");
        driver.quit();
    }
}
