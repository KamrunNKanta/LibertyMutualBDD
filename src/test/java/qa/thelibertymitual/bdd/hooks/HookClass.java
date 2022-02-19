package qa.thelibertymitual.bdd.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import qa.thelibertymitual.bdd.setup.BaseClass;
import qa.thelibertymitual.bdd.utilities.ConsoleLogger;

public class HookClass {
	@Before
	public void initiating() {
		ConsoleLogger.log("Initiating Bdd test");
	BaseClass.initDriver();
	}
	
	@After
	public void tearUp() {
		//BaseClass.driver.quit();
	}

}
