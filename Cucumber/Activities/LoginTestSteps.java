package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTestSteps{
WebDriver driver;
    @Given("^User is on Login page$")
    public void browserInvoke(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @When("^User enters username and password$")
    public void loginForm(){
        WebElement un = driver.findElement(By.cssSelector("input#username"));
        WebElement pw = driver.findElement(By.cssSelector("input#password"));
        WebElement login = driver.findElement(By.xpath("//button[@onclick='signIn()']"));

        un.sendKeys("admin");
        pw.sendKeys("password");
        login.click();

    }

    @Then("^Read the page title and confirmation message$")
    public void validation(){
        String pageTitle = driver.getTitle();

        Assert.assertEquals("page title doesn't match", "Login Form", pageTitle);

        WebElement successMsg = driver.findElement(By.id("action-confirmation"));
        String succmsg = successMsg.getText();
        Assert.assertEquals("text doesn't match", succmsg, "Welcome Back, admin");
    }

    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void enterCredentials(String username, String password){
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
