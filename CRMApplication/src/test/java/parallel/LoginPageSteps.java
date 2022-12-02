package parallel;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.qa.*;
import com.qa.factory.DriverFactory;
import com.qa.pages.RolemanagementPage;
import com.qa.uat.pages.LoginPage;
import com.qa.uat.pages.credentials;
import com.qa.util.BaseTest;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps implements BaseTest{
private WebDriver driver;
	//private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	//private WebDriver driver;
LoginPage login = new LoginPage(DriverFactory.getDriver());
RolemanagementPage rm= new RolemanagementPage(DriverFactory.getDriver());

	@Given("^user is on staging url login page$")
	public void user_is_on_login_page() {

		DriverFactory.getDriver().get("https://staging.onesingleview.com");

	}

	@Given("^user is on uat url login page$")
	public void user_is_on_uat_login_page() {

		DriverFactory.getDriver().get("https://uat.onesingleview.com");
		
	}
	@Then("User create new Role")
	public void role() throws InterruptedException
	{
		rm.CreateRolemanagement();
		rm.rolesselection();
		rm.createrole();
	}
	@Then("I Can create new user")
	public void createnewuser() throws InterruptedException
	{
		rm.createnewuser();
	}
	

	@When("user enters username  and PassWord {string}{string}")
	public void user_enters_username(String username, String Password) throws InterruptedException {

		login.doLogin(username, Password);
	}
	
	@When("^User enters Credentials to LogIn$")
	public void user_enters_testuser_and_Test(List<credentials>  usercredentials) throws Throwable {

		//Write the code to handle Data Table
		for (credentials credentials : usercredentials) {	
			driver.findElement(By.name("userName")).sendKeys(credentials.getUsername());

			driver.findElement(By.name("password")).sendKeys(credentials.getUsername());
			login.signInButton.click();
			}		
	}
	@When("User enters invalid credentials and Login will be unsuccessfull with error message")
    public void entersInvalidCredentials(DataTable userTable) throws InterruptedException {
  
        System.out.println("Enter Credentials");         
        
        
         
        List<Map<String, String>> user = userTable.asMaps(String.class, String.class);       
        for (Map<String, String> form : user) {
         
        String userName = form.get("Username");
        System.out.println("Username :" + userName);
        login.username.sendKeys(userName);

        String passWord = form.get("Password");
        System.out.println("Password :" + passWord);
        login.Password.sendKeys(passWord);    
   
        login.signInButton.click();   
      
  
      //  Assert.assertTrue(actualErrorMessage.equalsIgnoreCase(errorMessage));
       
        }         
    }

	@Then("user logout the application")
	public void logout() throws InterruptedException {
		login.LogoutApplication();
		}

	
	
}
