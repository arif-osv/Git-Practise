package parallel;

import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;

import com.qa.util.BaseTest;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks implements BaseTest{
	
	private WebDriver driver;
	public static HashMap<Integer, Scenario> scenarios;
	private DriverFactory driverFactory;
	//public static WebDriver d;
	private ConfigReader configReader;
	Properties prop;
	
	
	@Before ()
	public void setUp(Scenario scenario) {
		 
			 if (scenarios == null) {
			  scenarios = new HashMap<>(); } Thread currentThread = Thread.currentThread();
			  scenarios.put(currentThread.hashCode(), scenario);
			  System.out.println("Set driver manager instance");
		 }
	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
	}

	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);
		
	}

	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			// take screenshot:
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);

		}}


	/*
	 * @Before public void setUp(Scenario scenario) { if (scenarios == null) {
	 * scenarios = new HashMap<>(); } Thread currentThread = Thread.currentThread();
	 * scenarios.put(currentThread.hashCode(), scenario);
	 * System.out.println("Set driver manager instance");
	 * 
	 * configReader = new ConfigReader(); prop = configReader.init_prop(); String
	 * browserName = prop.getProperty("browser"); driverFactory = new
	 * DriverFactory(); driverFactory.init_driver(browserName);
	 * 
	 * 
	 * 
	 * 
	 * // driver =DriverFactory.getDriver();
	 * 
	 * 
	 * }
	 */
	
	
	/*
	 * @After public void tearDown(Scenario scenario) { if (scenario.isFailed()) {
	 * // byte[] screenshot = ((TakesScreenshot)
	 * driver).getScreenshotAs(OutputType.BYTES);
	 * //sApplicationHooks.getScenario().attach(screenshot, "image/png",
	 * "scrrenshotName"); driver.close(); } //DriverFactory.getDriver().quit();
	 * driver.quit(); }
	 */
	
	public static Scenario getScenario() {
		Thread currentThread = Thread.currentThread();
		return scenarios.get(currentThread.hashCode());
	}
}
