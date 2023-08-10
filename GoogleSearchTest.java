import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest {

    @Test
    public void testLaunchBrowser() {
        // 1. Arrange
        ChromeDriver driver = new ChromeDriver();

        // 2. Act
        driver.get("https://www.google.com/");
        String title = driver.getTitle();

        // 3. Assert
        Assert.assertEquals(title, "Google", "Title not matching");
        driver.quit();
    }

    @Test
    public void shouldDoGoogleSearch() {
        // 1. Arrange
        ChromeDriver driver = new ChromeDriver();

        // 2. Act
        driver.get("https://www.google.com/");
        WebElement searchBar = driver.findElement(By.id("APjFqb"));
        searchBar.sendKeys("amazon");
        searchBar.sendKeys(Keys.ENTER);

        // 3. Assert
        String title = driver.getTitle();
        Assert.assertEquals(
                title,
                "amazon - Google Search",
                "Title isn't matching");
        driver.quit();
    }

    @Test
    public void shouldOpenUrl() {
        // 1. Arrange
        ChromeDriver driver = new ChromeDriver();

        // 2. Act
        driver.get("https://www.google.in/");
        String title = driver.getTitle();

        // 3. Assert
        Assert.assertEquals(title, "Google", "Title not matching.");
        driver.quit();
    }
}
