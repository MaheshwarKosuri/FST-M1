package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Activity11_4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.training-support.net/selenium/tab-opener");
        System.out.println("Page title is: " + driver.getTitle());

        String currentWin = driver.getWindowHandle();
        System.out.println("currentWindow is: " + currentWin);

        WebElement clickBtn = driver.findElement(By.xpath("//a[@href='newtab']"));
        clickBtn.click();

        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("All window handles are "+allWindowHandles);

        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        System.out.println("Current window handle: " + driver.getWindowHandle());

        wait.until(ExpectedConditions.titleIs("Newtab"));

        System.out.println("New Tab Title is " + driver.getTitle());



        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.content")));

        WebElement ele = driver.findElement(By.cssSelector("div.content"));
        String newTabText = ele.getText();
        System.out.println("New tab heading is " + newTabText);

        driver.findElement(By.linkText("Open Another One!")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));


        allWindowHandles = driver.getWindowHandles();
        System.out.println("All window handles: " + allWindowHandles);

        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        System.out.println("New tab handle: " + driver.getWindowHandle());

        wait.until(ExpectedConditions.titleIs("Newtab2"));

        System.out.println("New Tab Title is: " + driver.getTitle());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.content")));

        newTabText = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("New tab heading is: " + newTabText);

        driver.quit();
    }
}
