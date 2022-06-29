package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchSteps extends BaseClass{
    @Given("^User is on Google Home Page$")
    public void givenFunctionName(){
        driver.get("https://www.google.com/");
        wait.until(ExpectedConditions.titleIs("Google"));
        String pageTitle = driver.getTitle();

        Assert.assertEquals("Page loaded is not correct", pageTitle, "Google");
    }

    @When("^User types in Cheese and hits ENTER$")
    public void whenFunctionName(){
        WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
        search.sendKeys("Cheese", Keys.RETURN);
    }

    @Then("^Show how many search results were shown$")
    public void thenFunctionName() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("result-stats")));
        String result = driver.findElement(By.id("result-stats")).getText();
        System.out.println("result is "+result);
    }


}
