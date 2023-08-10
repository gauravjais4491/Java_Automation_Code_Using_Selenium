import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CatalogPage {
    public void gotoProductDetailsPage(ChromeDriver driver) {
        WebElement product = driver.findElement(By.partialLinkText("ADIDAS | KID'S STAN SMIT"));
        product.click();
    }
}
