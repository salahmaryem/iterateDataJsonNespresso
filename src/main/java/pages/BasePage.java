package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    private By popUp = By.id("_evidon-banner-acceptbutton");

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void handleCookiePopup(){
        waitElement(driver,20,popUp);
        driver.findElement(popUp).click();
        driver.manage().deleteAllCookies();
    }
    public void waitElement(WebDriver driver, int time,By element){
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void scrollDown(WebDriver driver) {
        JavascriptExecutor java =(JavascriptExecutor) driver;
        java.executeScript("scroll(0,250)");
    }
}
