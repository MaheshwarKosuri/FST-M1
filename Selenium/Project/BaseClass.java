package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
    public WebDriver driver;

    String url = "https://alchemy.hguy.co/lms";
    String userName = "root";
    String password = "pa$$w0rd";

    @BeforeMethod
    public void invokeBrowser(){
        driver = new FirefoxDriver();
        driver.get(url);
    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
}
