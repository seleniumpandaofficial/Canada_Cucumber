package runner_files;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions
               (
            		    features = "src/test/resources/features",
            		    glue = { "step_definitions" }
               )

public class Runner_TestNG extends AbstractTestNGCucumberTests {

}
