package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_1 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        String pageTitle = driver.getTitle();
        System.out.println("Title of the page is "+pageTitle);

        WebElement simple = driver.findElement(By.id("simple"));
        simple.click();

        Alert simpleAlert = driver.switchTo().alert();
        String simpleAlertText = simpleAlert.getText();
        System.out.println(" simpleAlertText is "+ simpleAlertText);

        simpleAlert.accept();

        driver.close();

    }
}
