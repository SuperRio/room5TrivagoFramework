package runner;
import cucumber.api.CucumberOptions;
import tests.TestBase;

@CucumberOptions(features="src/test/java/features/NavigateToDestination.feature"
,glue= {"steps"}
,plugin= {"pretty","html:target/cucumber-html-report"})
public class TestRunner extends TestBase
{
	

}