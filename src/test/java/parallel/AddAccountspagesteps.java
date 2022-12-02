package parallel;

import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.pages.Addaccounts;
import com.qa.uat.pages.Approvalpages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AddAccountspagesteps {
	private WebDriver driver;
	private Addaccounts accounts = new Addaccounts(DriverFactory.getDriver());

	
	 @Then("I click on Settings")
	 public void clickSettings() throws InterruptedException {
		accounts.settings();
		
	 }
	 @And("I click on Add Bank Accounts")
	 public void addBankaccounts() throws InterruptedException
	 {
		 accounts.AddBankAccount();
			
	 }
	 @Then("I can Select Saudi Central bank")
	 public void selectbank() throws InterruptedException
	   {
		 accounts.Bankname();
	   }
	 @Then("I Select Permission of only {string}")
	 public void selectpermission(String permissionname) throws InterruptedException
	 {
		 accounts.permission(permissionname);
	 }
	    
	   
}
