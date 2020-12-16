package stepdefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"stepdefinitions"}
,monochrome = true
,strict = true
,plugin= {"json", "json:target/jsonReports/cucumber-report.json"})

public class TestRunnerDummy { 

}


 