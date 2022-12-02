package parallel;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.uat.pages.Approvalpages;
import com.qa.uat.pages.BaseInterface;
import com.qa.util.BaseTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Paymentapprovalsteps{
	private WebDriver driver;
	
	Approvalpages approvalpage= new Approvalpages(DriverFactory.getDriver());
	
	@Then("Bulk payment approve")
	public void bulkreject() throws InterruptedException
	
	{
		approvalpage.BulkOverviewApprove();
	}
	
	@Then("user click on overview button")
	public void overview()
	{
		approvalpage.bulkbutton();
	}
	
	@Then("user enter otp")
	public void enterotp() throws InterruptedException
	{
		approvalpage.BulkOTPapproval();
	}
	@Then("close final payment pass or fail popup")
	public void finalpopup() throws InterruptedException
	{
		approvalpage.BulkOTPFinalApproval();
	}
	@Then("user click on upcoming payments under click on bulk button")
	public void upcomeing()
	 {
	  approvalpage.bulkapprovebuutton();
	 }
	  @Then("user click on approve button")
	  public void approvebutton()
	  {
		  approvalpage.bulkapprovesub();
	  }
	 @Then("user edit on created payment")
	 public void editpayment() throws InterruptedException
	 {
		 approvalpage.editSchedulepayment();
	 }
	 
	
	 @Then("user disable on created payment")
	 public void disablepayment() throws InterruptedException
	 {
		 approvalpage.disableSchedulepayment();
	 }
	 
		/*
		 * @And("^approvals new pages$") public void
		 * the_following_day_values(List<approvers> dayValues) { for (approvers dayValue
		 * : dayValues) { System.out.println(dayValue); } }
		 */
	
	@Then("user decision is {string} payment through {string}")
	public void paymentApprovals(String decision,String Selectingmode) throws InterruptedException
	{
		if(decision.equalsIgnoreCase("Approve"))
		{
			if(Selectingmode.equalsIgnoreCase("OverviewwithOTP"))
			{
				//sc.takeScreenShot();
				approvalpage.OTPApproval();
			}
			else if(Selectingmode.equalsIgnoreCase("Overview"))
			{
				approvalpage.OverviewApprove();
			}
			else if(Selectingmode.equalsIgnoreCase("CheckBox"))
			{
				approvalpage.paymentApprove();
			}
		}
		else if(decision.equalsIgnoreCase("Reject"))
		{
			if(Selectingmode.equalsIgnoreCase("Overview"))
			{
				
			}
			else if(Selectingmode.equalsIgnoreCase("CheckBox"))
			{
				approvalpage.paymentReject();
			}
			else if(Selectingmode.equalsIgnoreCase("DashBoard"))
			{
				
			}
		}
		else if(decision.equalsIgnoreCase("Needmoreinfo"))
		{
			if(Selectingmode.equalsIgnoreCase("Overview"))
			{
				
			}
			else if(Selectingmode.equalsIgnoreCase("CheckBox"))
			{
				approvalpage.paymentReject();
			}
			else if(Selectingmode.equalsIgnoreCase("DashBoard"))
			{
				
			}
		}
		
	}
	@Then("user verify the status of payment")
	public void status() throws InterruptedException
	{
		//approvalpage.history();
	}

	
}
