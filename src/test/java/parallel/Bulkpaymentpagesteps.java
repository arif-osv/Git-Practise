package parallel;

import com.qa.factory.DriverFactory;
import com.qa.pages.Paymentpage;
import com.qa.uat.pages.Bulkpaymentpage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Bulkpaymentpagesteps {
	
	Bulkpaymentpage paymentpage= new Bulkpaymentpage(DriverFactory.getDriver());
	Screenshotpage sc= new Screenshotpage();
	Paymentpage Payment=new Paymentpage(DriverFactory.getDriver());
	
	
	
	@Then("create a Bulk Payment")
	public void CreateBulkPayment() throws InterruptedException
	{
		Payment.CreateBulkPayment();
	}
	
	
	
	


	@Then ("user Select the Debit Account")
	 public void selectDebitaccount() throws InterruptedException
	 {
		sc.takeScreenShot();
		 paymentpage.selectDebitaccount();
		
	 }
	
	  @Then("user upload payment sheet")
	    public void selectpaymentsheet() throws InterruptedException
	    {
		  sc.takeScreenShot();
	    	paymentpage.selectpaymentsheet();
	    }
	    @Then ("select payment due date")
	    public void paymentduedate() throws InterruptedException
	    {
	    	sc.takeScreenShot();
	    		paymentpage.paymentduedate();
	    }
	    @And  ("enter the description in English language")
	    public void description_English() throws InterruptedException
	    {
	    	sc.takeScreenShot();
	    	paymentpage.paymentduedate();
		    paymentpage.description_English();
	    }
	    @And  ("enter the description in Arabic language")
	    public void description_Arabic() throws InterruptedException
	    {
	    	sc.takeScreenShot();
	    	paymentpage.description_English();
	    }
	    @Then ("click on clear the data")
	    public void clearbulkdata() throws InterruptedException
	    {
	    	sc.takeScreenShot();
	    	paymentpage.clearbulkdata();
	    }

	    @Then ("click on upload the data")
	    public void uploadbulkdata() throws InterruptedException
	    {
	    	sc.takeScreenShot();
	    	paymentpage.uploaddata();
	    }
	    
	    @And("click on accept and upload")
	    public void acceptandupload() throws InterruptedException
	    {
	    	sc.takeScreenShot();
	    	
	    	paymentpage.acceptandupload();
	    }
	    @And("click on approve button")
	    public void approve() throws InterruptedException
	    {
	    	sc.takeScreenShot();
	    	paymentpage.bulkapprovebutton();
	    }
	    
	    @And("enter comments on approve popup and approve")
	    public void commentsonapprovebox() throws InterruptedException
	    {
	    	paymentpage.commentsonapprovebox();
	    	sc.takeScreenShot();
	    	paymentpage.Approvebox();
	    }
	    @And("user verify upload successful message")
	    public void Verifyuploadmsg() throws InterruptedException
	    {
	    	sc.takeScreenShot();
	    	paymentpage.uploadtextverify();
	    }
	    
	    @Then ("user Select the Debit Account after clear")
		 public void selectDebitaccountse() throws InterruptedException
		 {
	    	sc.takeScreenShot();
			 paymentpage.selectDebitaccountsecond();
		 }
		 
	    
	    @Then("after clear user verify write description text displayed or not")
	    public void description()
	    {
	    	sc.takeScreenShot();
	    	
	    	paymentpage.Description();
	    }

	
}