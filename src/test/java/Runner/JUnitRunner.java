package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@ValidCredentials",features = "src/test/resources/Features/LogIn.feature", glue = "com.RameezAliRaja.TechnicalAssesment3",plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class JUnitRunner {

}
