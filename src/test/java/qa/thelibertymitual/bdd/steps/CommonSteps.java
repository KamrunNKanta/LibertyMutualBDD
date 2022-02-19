package qa.thelibertymitual.bdd.steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;

import qa.thelibertymitual.bdd.setup.BaseClass;
import qa.thelibertymitual.bdd.utilities.ConsoleLogger;

public class CommonSteps extends BaseClass {

@Given("the title of the page {string}")
//
public void the_titlel_of_the_page(String string) {
   String title=driver.getTitle();
   ConsoleLogger.log("Title of the page is"+title);
	Assert.assertEquals(string, title);
}
}
