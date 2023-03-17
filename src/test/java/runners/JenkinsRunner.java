package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features"}, // feature file folder name
        glue = {"stepDefs"}, // folder with step definitions
        tags = "@jenkins"
)
public class JenkinsRunner {
}
