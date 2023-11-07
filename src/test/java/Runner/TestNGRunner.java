package Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@ValidCredentials",features = "src/test/resources/Features/LogIn.feature", glue = "com.RameezAliRaja.TechnicalAssesment3")

	public class TestNGRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
}

