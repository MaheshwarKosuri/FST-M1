package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        driver.findElement(By.cssSelector("button#confirm")).click();

        Alert alert = driver.switchTo().alert();

        String alertText = alert.getText();
        System.out.println("Alert text is: " + alertText);

        alert.accept();
        driver.close();
    }
}
