package testrunner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/planoFeatures"},
plugin = {"json:target/cucumber.json"},
glue = "stepdefinition")//tags = {""})

public class RunnerClass extends AbstractTestNGCucumberTests {

			
	
	
	
}
