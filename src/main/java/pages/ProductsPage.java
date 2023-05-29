package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage{
    private By buttonDetails = By.className("AccessibleLink ElementWithChevron CheckoutActionButton ProductListElement__details-link ProductListElement__details-link--machine track-product-click");
    public ProductsPage(WebDriver driver) {
        super(driver);
    }
    public void seeDetails(){
        waitElement(driver,10,buttonDetails);
        driver.findElement(buttonDetails).click();
        handleCookiePopup();
    }
}
