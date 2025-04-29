package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/features",
				glue={"stepDefinations","hooks"},
				plugin= {"pretty","html:target/CucumberReports/Cucumber.html"},
				tags= "@Smoke and not @Sanity",
				publish=true)
public class TestRunnerClass 
{
	

}
