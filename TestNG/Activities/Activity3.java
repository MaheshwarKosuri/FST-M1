package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {

    public WebDriver driver;

    @BeforeClass
    public void invokingBrowser(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @Test
    public void testMethod1(){
        WebElement un = driver.findElement(By.cssSelector("input#username"));
        WebElement pw = driver.findElement(By.cssSelector("input#password"));
        WebElement login = driver.findElement(By.xpath("//button[@onclick='signIn()']"));

        un.clear();
        un.sendKeys("admin");
        pw.clear();
        pw.sendKeys("password");
        login.click();

        WebElement successMsg = driver.findElement(By.id("action-confirmation"));
        Assert.assertEquals(successMsg.getText(), "Welcome Back, admin", "SuccessMsg is not matching");


    }

    @AfterClass
    public void closeBrowser(){
        driver.close();
    }
}
