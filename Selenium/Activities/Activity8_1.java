package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_1 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");

        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));

        System.out.println("Number of rows are: " + rows.size());
        System.out.println("Number of columns are: " + cols.size());

        List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
        for(WebElement cellValue : thirdRow) {
            System.out.println("Cell Value: " + cellValue.getText());
        }

        WebElement cellSecondRowSecondCol = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second column value: " + cellSecondRowSecondCol.getText());

        driver.close();

    }
}
