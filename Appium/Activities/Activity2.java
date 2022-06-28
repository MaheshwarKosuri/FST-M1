package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity2 {
    AndroidDriver driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Galaxy M51");
        options.setPlatformName("android");
        options.setAutomationName("UIAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.noReset();

        URL serviceURL = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(serviceURL, options);
    }

    @Test
    public void openAndVerifyWebPage() throws InterruptedException {
        driver.get("https://www.training-support.net");
        Thread.sleep(10000);

        String pageTitle = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Training Support']")).getText();
        System.out.println("Title of the page is "+pageTitle);

        WebElement aboutUs = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='About Us']"));
        aboutUs.click();
        Thread.sleep(10000);

        String aboutUsPageTitle = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='About Us']")).getText();
        System.out.println("Title of the aboutUs page is "+aboutUsPageTitle);

    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}
