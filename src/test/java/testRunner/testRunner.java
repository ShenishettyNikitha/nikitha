package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Training_h2a.06.17\\Documents\\Selenium\\Casestudys\\Features\\casestudy4.feature",
glue= {"stepdefinition"},
plugin= {"pretty","html:target/casestudy4-report"})
public class testRunner {
	
}
