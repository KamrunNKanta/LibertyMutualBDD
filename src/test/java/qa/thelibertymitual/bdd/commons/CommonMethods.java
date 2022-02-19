package qa.thelibertymitual.bdd.commons;

import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import qa.thelibertymitual.bdd.setup.BaseClass;
import qa.thelibertymitual.bdd.utilities.ConsoleLogger;

public class CommonMethods {
	public void click(WebElement element) {
		try {
			BaseClass.wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			ConsoleLogger.log(element + "Clicked");
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			ConsoleLogger.log(element + "Element not clicked");
			Assert.fail();
		}
	}

	public void writeText(WebElement element, String value) {
		try {
			BaseClass.wait.until(ExpectedConditions.elementToBeClickable(element));
element.sendKeys(value);
		} catch (NullPointerException |NoSuchElementException e) {
		e.printStackTrace();
		ConsoleLogger.log(element+"Element not found");
		Assert.fail();
		}
	}

}
