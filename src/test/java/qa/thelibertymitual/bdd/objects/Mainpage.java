package qa.thelibertymitual.bdd.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mainpage {
	public Mainpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "(//button[@class='jsx-3454191225 jsx-2858952585'])[1]")
public WebElement propertyTab;
	@FindBy(xpath="(//button[@class='jsx-1733139492'])[1]")
public WebElement homeTab;
	@FindBy(xpath = "//div[@class='lm-FieldGroup-field lm-FieldGroup-field--input']//preceding-sibling::label[@id='alphaNumericInput4523-input-label']")
	public WebElement zipcodeInput;
	@FindBy(xpath="//button[@class='lmig-Button lmig-Button--large lmig-Button--primary jsx-2812518840']")
	public WebElement priceTab;
}
