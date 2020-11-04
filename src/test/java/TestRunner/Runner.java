package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//will run feature files as junit tests (tells about the test runner class to start executing tests)
@RunWith(Cucumber.class)
//used to set some properties for our cucumber test like feature file, step definition (giving package name or file name with absolute path)
@CucumberOptions(
        features = "/Users/harindaekanayake/IdeaProjects/AutomationBDDBeta/Features/dataWithExamples.feature",
        glue = {"StepDefinition"},
        plugin = {"pretty",
                "html:report/index.html",
                "json:report/index.json",
                "junit:report/index.xml"},
        monochrome = true,
        publish = false,
        dryRun = false,
        tags = "not @RegressionTest and not @SmokeTest and not @End2End or @UI"
        )

public class Runner { //runner class should be empty without any fields or methods
}
