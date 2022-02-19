package qa.thelibertymitual.bdd.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "features" },
                        glue = { "classpath:qa/thelibertymitual/bdd/steps" },                                                                                                                                 
                        monochrome = true,
                        dryRun = false,
                        plugin = {
		"json:target/jsonReport.json", "junit:target/xmlReport.xml", "html:target/htmlReport.html" }

)

public class TestRunner {

}
