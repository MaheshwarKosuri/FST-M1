package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class FirstTest extends BaseClass{
    @Given("^user is on test page$")
    public void openTestPage(){
        driver.get("https://www.training-support.net/");

        String pageTitle = driver.getTitle();
        System.out.println("pageTitle is "+pageTitle);

        Assert.assertEquals("Page is not correct","Training Support", pageTitle);
    }

    @When("^user click about us button$")
    public void clickAboutUsButton(){
        driver.findElement(By.id("about-link")).click();
    }

    @Then("^user should redirect to about us page$")
    public void verifyRedirection(){
        String newPageTitle = driver.getTitle();

        Assert.assertEquals("Not navigated to new page", "About Training Support", newPageTitle);
    }


}
