package testRunner;



import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features ="src/test/resources/Features",
	glue= "testSteps",

	//dryRun=false,
	plugin = { "pretty", "html:target/cucumber-reports.html" },
	// plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

	//plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
	monochrome = true
	//plugin = {"pretty","html:test-output"}
	//plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	//plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
	)











public class Runner {

}
