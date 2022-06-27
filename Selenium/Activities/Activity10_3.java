package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Activity10_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/drag-drop");

        String pageTitle = driver.getTitle();
        System.out.println("Title of the page is "+pageTitle);

        WebElement ball = driver.findElement(By.xpath("//img[contains(@src,'ball.png')]"));
        WebElement dropzone1 = driver.findElement(By.xpath("//div[.='Dropzone 1']"));
        WebElement dropzone2 = driver.findElement(By.xpath("//div[@id='dropzone2']"));

        actions.clickAndHold(ball).moveToElement(dropzone1).build().perform();
        actions.release(ball).build().perform();
        Thread.sleep(2000);
        String actualResult = driver.findElement(By.xpath("//div[text()='Dropzone 1']/p")).getText();
        System.out.println("Actual Result is "+actualResult);
        Assert.assertEquals(actualResult, "Dropped!", "Ball is not in Dropzone 1");

        actions.dragAndDrop(ball, dropzone2).build().perform();
        Thread.sleep(2000);
        String actualResult2 = driver.findElement(By.xpath("//div[@id='dropzone2']/p")).getText();
        Assert.assertEquals(actualResult2, "Dropped!", "Ball is not in Dropzone 2");

        driver.close();

    }
}
