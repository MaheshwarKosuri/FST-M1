package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {

    WebDriver driver;

    @BeforeMethod
    public void browserSetup(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
    }

    @Test
    public void method1(){
        String title = driver.getTitle();
        System.out.println("Title of the page is "+title);

        Assert.assertEquals(title, "Training Support", "Title is not matching");

        WebElement aboutUs = driver.findElement(By.id("about-link"));
        aboutUs.click();

        String titleNewPage = driver.getTitle();
        System.out.println("Title of the new page is "+titleNewPage);

        Assert.assertEquals(titleNewPage, "About Training Support", "Title of the new page doesn't match");
    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }

}
