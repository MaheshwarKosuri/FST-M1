package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class Activity2 {
    public WebDriver driver;

    @BeforeClass
    public void invokingBrowser() {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @Test
    public void testMethod1() {
        String title = driver.getTitle();
        System.out.println("Title of the page is " + title);
        Assert.assertEquals(title, "Target Practice", "Title is not matching");
    }

    @Test
    public void testMethod2() {
        WebElement black = driver.findElement(By.xpath("//button[.='Black']"));
        Assert.assertTrue(black.isDisplayed(), "Black button is not displayed");
        Assert.assertFalse(black.getText().equals("bl"), "true");
    }

    @Test(enabled = false)
    public void testMethod3() {
        System.out.println("Doesn't print anything, as the method is skipped");
    }

    @Test
    public void testMethod4() {
        String browserName = "Firefox";
        if (browserName.equals("Firefox"))
            throw new SkipException("Skipping test method 4");
    }

    @AfterClass
    public void closeBrowser() throws IOException {
        driver.close();
        //driver.quit();
    }
}
