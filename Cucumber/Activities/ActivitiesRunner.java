package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepDefinitions"},
        plugin = {"json: test-reports/json-report.html"},
        monochrome = true,
        tags = "@activity5"

)
public class ActivitiesRunner {
    //This should be empty.
}
