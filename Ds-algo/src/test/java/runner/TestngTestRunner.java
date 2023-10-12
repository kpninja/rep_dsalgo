package runner;

	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
			features="src\\test\\java\\features",
			glue={"dsStepDefinitions","hooks"},
			tags="@all",
			plugin= {"pretty",
					"html:testngtarget/CucumberReports/CucumberReport.html",
					"json:testngtarget/CucumberReports/CucumberReport.json",
					"junit:testngtarget/CucumberReports/CucumberReport.xml"
					
			}
			)
	public class TestngTestRunner extends AbstractTestNGCucumberTests {
	}

