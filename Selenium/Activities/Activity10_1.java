package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/input-events");

        String pageTitle = driver.getTitle();
        System.out.println("Title of the page is "+pageTitle);

        Actions actions = new Actions(driver);

        WebElement cube = driver.findElement(By.id("wrapD3Cube"));

        actions.click(cube);
        WebElement cubeVal = driver.findElement(By.className("active"));
        System.out.println("On left click, value is "+cubeVal.getText());
        Thread.sleep(3000);

        actions.doubleClick(cube);
        cubeVal = driver.findElement(By.className("active"));
        System.out.println("On double click, value is "+cubeVal.getText());
        Thread.sleep(3000);

        actions.contextClick().perform();
        cubeVal = driver.findElement(By.className("active"));
        System.out.println("On right click, value is "+cubeVal.getText());
        Thread.sleep(3000);

        driver.close();
    }
}
