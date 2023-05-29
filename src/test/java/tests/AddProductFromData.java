package tests;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.ProductsPage;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class AddProductFromData extends BaseTests{
    public BasePage basePage;
    public HomePage homePage;
    public ProductsPage productsPage;




    @Test

    public void testingData() {
        basePage = new BasePage(driver);
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);

    }}


