import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    public void goToCatalogPage(ChromeDriver driver){
        driver.findElement(By.partialLinkText("Shop all")).click();

    }
}
