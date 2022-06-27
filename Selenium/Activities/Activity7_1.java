package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/dynamic-attributes");
        Thread.sleep(10000);

        String title = driver.getTitle();

        WebElement userName = driver.findElement(By.xpath("//div[.='Sign in!']/../following-sibling::div//input[@placeholder='Username' and contains(@class,'username')] "));
        WebElement password = driver.findElement(By.xpath("//div[.='Sign in!']/../following-sibling::div//input[@placeholder='Password' and contains(@class,'password')] "));
        WebElement loginBtn = driver.findElement(By.xpath("//button[@onclick='signIn()']"));

        userName.clear();
        userName.sendKeys("admin");
        password.clear();
        password.sendKeys("password");
        loginBtn.click();

        Thread.sleep(2000);
        WebElement loginMsg = driver.findElement(By.cssSelector("div#action-confirmation"));
        System.out.println("Login Message is "+loginMsg.getText());

        driver.close();



    }
}
