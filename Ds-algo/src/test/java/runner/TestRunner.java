package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\features\\Test01_ds_GetStarted.feature",
                  glue={"dsStepDefinitions","hooks"},
                  monochrome=true,
                  publish=true,
                  tags="@all",
                		  plugin= {"pretty",
                					"html:target/CucumberReports/CucumberReport.html",
                					"json:target/CucumberReports/CucumberReport.json",
                					"junit:target/CucumberReports/CucumberReport.xml",
                					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
})
public class TestRunner {

}
