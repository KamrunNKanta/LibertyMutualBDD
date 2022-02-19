package qa.thelibertymitual.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import qa.thelibertymitual.bdd.setup.BaseClass;
import qa.thelibertymitual.bdd.utilities.ConsoleLogger;

public class AutoSteps extends BaseClass {

	@When("user click cursor onto the property Tab")
	public void user_click_cursor_onto_the_property_tab() {
		commonMethods.click(mainpage.propertyTab);
		
		ConsoleLogger.log("This is when click on property");
	}

	@When("user click onto the home tab")
	public void user_click_onto_the_home_tab() {
		commonMethods.click(mainpage.homeTab);
		ConsoleLogger.log("This is When click on Home");
	}

	@When("user fill the zipcode")
	public void user_fill_the_zipcode() {
		commonMethods.writeText(mainpage.zipcodeInput, "17036");
		ConsoleLogger.log("This is when passing the Zipcode");
	}

	@Then("user click on Get my price")
	public void user_click_on_get_my_price() {
		commonMethods.click(mainpage.priceTab);
		ConsoleLogger.log("This is when click on Price tab");
	}

}
