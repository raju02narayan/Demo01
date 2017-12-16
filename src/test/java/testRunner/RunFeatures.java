package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "features",
		glue= {"com.sepm.stepdefinitions"},
		plugin= {"html:target/cucumber-html-report", "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt", "junit:target/cucumber-result.xml"}
		
		
		)

public class RunFeatures {
	

	

}
