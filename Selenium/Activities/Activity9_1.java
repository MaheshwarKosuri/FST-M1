package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/selects");

        WebElement drpdwn = driver.findElement(By.id("single-select"));
        Select select = new Select(drpdwn);
        select.selectByVisibleText("Option 2");
        Thread.sleep(5000);
        select.selectByIndex(3);
        Thread.sleep(5000);
        select.selectByValue("4");
        Thread.sleep(5000);

        List<WebElement> allOpts = select.getOptions();
        for (WebElement ele: allOpts)
            System.out.println("Element in the dropdown is "+ele.getText());

        driver.close();
    }
}
