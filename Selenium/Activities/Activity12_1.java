package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Activity12_1 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/iframes");
        System.out.println("Page title is: " + driver.getTitle());

        driver.switchTo().frame(0);

        WebElement frame1 = driver.findElement(By.cssSelector("div.content"));
        System.out.println(frame1.getText());

        WebElement insideButton = driver.findElement(By.cssSelector("button"));
        System.out.println(insideButton.getText());
        System.out.println(insideButton.getCssValue("background-color"));
        insideButton.click();

        System.out.println(insideButton.getText());
        System.out.println(insideButton.getCssValue("background-color"));

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);

        WebElement frame2 = driver.findElement(By.cssSelector("div.content"));
        System.out.println(frame2.getText());

        WebElement button2 = driver.findElement(By.cssSelector("button"));
        System.out.println(button2.getText());
        System.out.println(button2.getCssValue("background-color"));
        button2.click();

        System.out.println(button2.getText());
        System.out.println(button2.getCssValue("background-color"));

        driver.switchTo().defaultContent();

        driver.close();

    }
}
