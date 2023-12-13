import courgette.api.CourgetteOptions;
import courgette.api.CourgetteRunLevel;
import courgette.api.CucumberOptions;
import courgette.api.junit.Courgette;
import org.junit.runner.RunWith;

@RunWith(Courgette.class)
@CourgetteOptions(
        threads = 1,
        runLevel = CourgetteRunLevel.FEATURE,
        rerunFailedScenarios = false,
        rerunAttempts = 1,
        reportTargetDir = "build",
        cucumberOptions = @CucumberOptions(
                features = {"src/test/resources/features"},
                glue = {"rest_api", "ui_test"},
                tags = {"@POC"})
        )



public class ParallelRunner {
}
