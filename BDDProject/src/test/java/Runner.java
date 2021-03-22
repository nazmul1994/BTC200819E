import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\babu0\\eclipse-workspace\\BDDProject\\login.feature"}
,tags= {"@ui"},plugin= {"pretty:html:report"},glue= {"packagename"},dryRun=true)
public class Runner {

}
