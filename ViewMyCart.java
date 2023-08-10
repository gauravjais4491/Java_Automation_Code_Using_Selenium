import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;

public class ViewMyCart {
    @Test
    public void shouldTestViewMyCart() {
        // 1. Arrange
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        // 2. Act
        driver.get("https://testvagrant.myshopify.com/");

        HomePage homePage = new HomePage();
        homePage.goToCatalogPage(driver);

        CatalogPage catalogPage = new CatalogPage();
        catalogPage.gotoProductDetailsPage(driver);

        ProductDetailsPage productDetailsPage = new ProductDetailsPage();
        productDetailsPage.addToCart(driver);
        productDetailsPage.goToViewCartPage(driver);

        ViewMyCartPage viewMyCartPage= new ViewMyCartPage();
        viewMyCartPage.clickCheckoutButton(driver);

        ShippingAddressPage shippingAddressPage = new ShippingAddressPage();
        shippingAddressPage.addShippingAddress(driver);


        // 3. Assert

//        driver.quit();
    }




}
