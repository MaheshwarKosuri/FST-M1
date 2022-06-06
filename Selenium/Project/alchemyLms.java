package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class alchemyLms extends BaseClass {

    //Activity1 - Verify the website title
    //Goal: Read the title of the website and verify the text
    @Test(priority = 0)
    public void verifyTheWebsiteTitle() {
        String actualTitle = driver.getTitle();
        System.out.println("Title of the page is " + actualTitle);

        Assert.assertEquals(actualTitle, "Alchemy LMS – An LMS Application", "Expected Title of the page is 'Alchemy LMS – An LMS Application' but found " + actualTitle);
    }

    //Activity2 - Verify the website heading
    //Goal: Read the heading of the website and verify the text
    @Test(priority = 1)
    public void verifyTheWebsiteHeading() {
        String actualPageHeading = driver.findElement(By.xpath("//h1[contains(@class,'title')]")).getText();
        System.out.println("Heading of the page is " + actualPageHeading);

        Assert.assertEquals(actualPageHeading, "Learn from Industry Experts", "Expected Heading of the page is 'Alchemy LMS – An LMS Application' but found " + actualPageHeading);
    }

    //Activity3 - Verify the title of the first info box
    //Goal: Read the title of the first info box on the website and verify the text
    @Test(priority = 2)
    public void verifyTitleOfFirstInfoBox() {
        String actualTitle = driver.findElement(By.xpath("//h3[contains(@class,'title')][contains(.,'Actionable Training')]")).getText();
        System.out.println("Title of the first info box in the page is " + actualTitle);

        Assert.assertEquals(actualTitle, "Actionable Training", "Expected Title of the first info box is 'Actionable Training' but found " + actualTitle);
    }

    //Activity4 - Verify the title of the second most popular course
    //Goal: Read the title of the second most popular course on the website and verify the text
    @Test(priority = 3)
    public void verifyTitleOfSecondMostPopularCourse() {
        String actualTitle = driver.findElement(By.xpath("//a[contains(@href,'email-marketing-strategies')]/following-sibling::div/h3")).getText();
        System.out.println("Title of the second most popular course in the page is " + actualTitle);

        Assert.assertEquals(actualTitle, "Email Marketing Strategies", "Expected Title of the second most popular course is 'Email Marketing Strategies' but found " + actualTitle);
    }

    //Activity5 - Navigate to another page
    //Goal: Navigate to the “My Account” page on the site.
    @Test(priority = 4)
    public void navigateToMyAccountPage() {
        driver.findElement(By.xpath("//a[contains(@href,'my-account')]")).click();

        String actualTitle = driver.getTitle();
        System.out.println("Title of the page is " + actualTitle);

        Assert.assertEquals(actualTitle, "My Account – Alchemy LMS", "Expected Title of the page is 'My Account – Alchemy LMS' but found " + actualTitle);
    }

    //Activity6 - Logging into the site
    //Goal: Open the website and log-in using the provided credentials.
    @Test(priority = 5)
    public void loginUsingCredentials() {
        navigateToMyAccountPage();

        WebElement login = driver.findElement(By.xpath("//a[@href='#login']"));
        login.click();

        driver.findElement(By.id("user_login")).sendKeys(userName);
        driver.findElement(By.id("user_pass")).sendKeys(password);
        driver.findElement(By.id("wp-submit")).click();

        Assert.assertTrue(driver.findElement(By.className("ld-profile-avatar")).isDisplayed(), "User not logged in");
    }

    //Activity7 - Count the number of courses
    //Goal: Navigate to the “All Courses” page and count the number of courses.
    @Test(priority = 6)
    public void countNumberOfCourses() {
        loginUsingCredentials();

        driver.findElement(By.xpath("//a[contains(@href,'all-courses')]")).click();

        List<WebElement> articleCount = driver.findElements(By.xpath("//div[contains(@class,'ld_course_grid col-sm-8 col-md-4')]"));
        System.out.println("Number of courses in the page is " + articleCount.size());
    }

    //Activity8 - Contact the admin
    //Goal: Navigate to the “Contact Us” page and complete the form.
    @Test(priority = 7)
    public void navigateToContactUsAndCompleteForm() {

        loginUsingCredentials();

        driver.findElement(By.xpath("//a[contains(@href,'contact')]")).click();
        driver.findElement(By.xpath("//div[@class='wpforms-field wpforms-field-name']//input")).sendKeys("MK");
        driver.findElement(By.xpath("//div[@class='wpforms-field wpforms-field-email']//input")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//div[@class='wpforms-field wpforms-field-textarea']//textarea")).sendKeys("Help please");

        driver.findElement(By.id("wpforms-submit-8")).click();

        String confirmationMessage = driver.findElement(By.cssSelector("div#wpforms-confirmation-8>p")).getText();
        System.out.println("Confirmation message is " + confirmationMessage);
        String expectedMessage = "Thanks for contacting us! We will be in touch with you shortly.";

        Assert.assertEquals(confirmationMessage, expectedMessage, "You entered something wrong");
    }

    //Activity9 - Complete a simple lesson
    //Goal: Navigate to a particular lesson and complete it.
    @Test(priority = 8)
    public void navigateToLessonAndCompleteIt() {
        countNumberOfCourses();

        driver.findElement(By.xpath("//a[contains(@href,'social-media-marketing')][.='See more...']")).click();

        driver.findElement(By.xpath("//div[@class='ld-item-title'][contains(.,'Developing Strategy')]")).click();

        String title = driver.getTitle();
        System.out.println("title is " + title);

        Assert.assertEquals(title, "Developing Strategy – Alchemy LMS", "Title doesn't match");
    }

}
