package qa.thelibertymitual.bdd.setup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import qa.thelibertymitual.bdd.commons.CommonMethods;
import qa.thelibertymitual.bdd.objects.Mainpage;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static CommonMethods commonMethods;
	public static Mainpage mainpage;

	public static void initDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.libertymutual.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		initClasses();
	}

	private static void initClasses() {
		commonMethods = new CommonMethods();
		mainpage = new Mainpage(driver);
	}

}
