package parallel;

import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.pages.Addaccounts;
import com.qa.pages.Supportdashboard;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SupportDashboardSteps {
	private WebDriver driver;
	private Supportdashboard sd = new Supportdashboard(DriverFactory.getDriver());

	
	 @Then("I click on Settings and Goto Support Board")
	 public void clickSettings() throws InterruptedException {
		 
		sd.support();
		
	 }
	   


}
