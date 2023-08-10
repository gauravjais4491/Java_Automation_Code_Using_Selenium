import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewMyCartPage {
    public void clickCheckoutButton(ChromeDriver driver) {
        WebElement checkOutButton= driver.findElement(By.id("checkout"));
        checkOutButton.click();
    }
}
