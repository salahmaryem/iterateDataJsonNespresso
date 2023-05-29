package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage{

    private By machineMenuItem = By.xpath("//*[contains(text(),'Machines') and @class='HeaderNavigationBarItem__title']");
    private By machineSubMenuVertuo = By.xpath("//a[@href=\"/fr/en/order/machines/vertuo\" and contains(text(),'Order')]");

    private By capsuleMenuItem = By.xpath("//*[contains(text(),'Order Coffee') and @class='HeaderNavigationBarItem__title']");
    private By capsuleSubMenuVertuo = By.xpath("//a[@href=\"/fr/en/order/capsules/vertuo/\" and contains(text(),'Order')]");
    private By cart = By.id("ta-mini-basket__open");
    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void navigateToVertuoMachines(){
        WebElement order = driver.findElement(machineMenuItem);
        Actions actions = new Actions(driver);
        actions.moveToElement(order).perform();
    }
    public void clickOnOrderMachineVertuo(){
        waitElement(driver,10,machineSubMenuVertuo);
        driver.findElement(machineSubMenuVertuo).click();
        handleCookiePopup();
    }
    public void navigateToVertuoCapsules(){
        WebElement order = driver.findElement(capsuleMenuItem);
        Actions actions = new Actions(driver);
        actions.moveToElement(order).perform();
    }
    public void dropDownClick(){
        waitElement(driver,10,capsuleSubMenuVertuo);
        driver.findElement(capsuleSubMenuVertuo).click();
        handleCookiePopup();
    }
    public void checkCart(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement check = driver.findElement(cart);
        check.click();
    }
}
