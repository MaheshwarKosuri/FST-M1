package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/selects");

        WebElement isMultiSel = driver.findElement(By.id("multi-value"));
        WebElement multiSel = driver.findElement(By.id("multi-select"));
        Select multiSelEle = new Select(multiSel);

        if(multiSelEle.isMultiple()){
            System.out.println("Multi Select is there in html");

            multiSelEle.selectByVisibleText("Javascript");
            multiSelEle.selectByValue("node");
            for(int i=4; i<=6; i++)
                multiSelEle.selectByIndex(i);

            Thread.sleep(3000);
            System.out.println("Deselecting by Value");
            multiSelEle.deselectByValue("node");

            Thread.sleep(3000);
            System.out.println("Deselecting by Index");
            multiSelEle.deselectByIndex(7);

            System.out.println("First Selected option is "+multiSelEle.getFirstSelectedOption());

            List<WebElement> ele = multiSelEle.getAllSelectedOptions();
            for (WebElement els: ele)
                System.out.println("Selected options are: "+els.getText());

            Thread.sleep(3000);
            System.out.println("Deselecting all options");

            multiSelEle.deselectAll();

            Thread.sleep(3000);
            System.out.println("Deselected all");

        }
        else System.out.println("Multi Select is not there in html");

        driver.close();

    }
}
