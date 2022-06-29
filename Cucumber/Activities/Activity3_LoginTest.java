package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Activity3_LoginTest extends BaseClass{

    Alert alert;

    @Given("^User is on the page$")
    public void browserInvoke(){
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
    }

    @When("^User clicks the Simple Alert button$")
    public void clickSimpleAlert(){
        driver.findElement(By.cssSelector("button#simple")).click();
    }

    @When("^User clicks the Confirm Alert button$")
    public void clickConfirmAlert(){
        driver.findElement(By.cssSelector("button#confirm")).click();
    }

    @When("^User clicks the Prompt Alert button$")
    public void clickPromptAlert(){
        driver.findElement(By.cssSelector("button#prompt")).click();
    }

    @Then("^Alert opens$")
    public void switchToAlert(){
        alert = driver.switchTo().alert();
    }

    @And("^Read the text from it and print it$")
    public void readingTextFromAlert(){
        System.out.println("Alert says: " + alert.getText());
    }

    @And("^Write a custom message in it$")
    public void writingTextInAlert(){
        alert.sendKeys("Are you a prompt!!");
    }

    @And("^Close the alert$")
    public void closingTheAlert(){
        alert.accept();
    }

    @And("^Close the alert with Cancel$")
    public void closingTheAlertWithCancel(){
        alert.dismiss();
    }

    /*@And("^Read the result text$")
    public void readingResultText(){
        String resultText = driver.findElement(By.xpath("//p[@id='result']")).getText();
        System.out.println(resultText);
    }*/

}
