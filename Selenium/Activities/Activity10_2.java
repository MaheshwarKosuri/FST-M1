package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);

        driver.get("https://www.training-support.net/selenium/input-events");

        String pageTitle = driver.getTitle();
        System.out.println("Title of the page is "+pageTitle);

        WebElement keyPressed = driver.findElement(By.id("keyPressed"));

        Action firstAct = actions.sendKeys("M").build();
        firstAct.perform();

        System.out.println("Key Pressed is "+keyPressed.getText());

        Action secondAct = actions.keyDown(Keys.CONTROL)
                .sendKeys("a")
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .build();
        secondAct.perform();

        Action pasteText = actions.keyDown(Keys.CONTROL)
                        .sendKeys("v")
                                .keyUp(Keys.CONTROL)
                                        .build();

        pasteText.perform();
        String s = pasteText.toString();

        System.out.println("Key Pressed is "+s);


    }
}
