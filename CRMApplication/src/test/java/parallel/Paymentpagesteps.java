package parallel;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.factory.DriverFactory;
import com.qa.pages.Approvalpage;
import com.qa.pages.DebitAccounts;
import com.qa.pages.Paymentpage;
import com.qa.uat.pages.BaseInterface;
import com.qa.uat.pages.Bulkpaymentpage;
import com.qa.uat.pages.LoginPage;
import com.qa.uat.pages.SadadPayment;
import com.qa.uat.pages.paymentpage;
import com.qa.util.BaseTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Paymentpagesteps {
//private WebDriver driver;
Screenshotpage sc= new Screenshotpage();
paymentpage payments= new paymentpage(DriverFactory.getDriver());
Bulkpaymentpage bulkpaymentpage= new Bulkpaymentpage(DriverFactory.getDriver());
SadadPayment sadadpayment=new SadadPayment(DriverFactory.getDriver());
Paymentpage OSVpayments= new Paymentpage(DriverFactory.getDriver());


	@Then("user click on payment {string}")
	public void payment(String Paymenttype) throws InterruptedException
	{
		
		payments.usercreatepay(Paymenttype);
	}
	@Then("User click on Schedule payments")
	public void Schedulepayment()
	{
		payments.schedulepayment();
	}
	
	
	@And("user Select the transfer type {string}")
	public void Transfertype(String Transfertype) throws InterruptedException
	{
		payments.Transfertype(Transfertype);
	}
	@Then("user take screen shot")
	public void takescreenshot()
	{
		sc.takeScreenShot();
	}
	@Then("user edit amount")
	public void editamount() throws InterruptedException
	{
		payments.Editamount();
	}
	@Then("user should be create Schedule payment {string}{string}{string}{string}")
	public void createschedulepayment(String bankName,String schedule, String debitNumber, String creditAccountNumber) throws InterruptedException
	{
		payments.SchedulePayment(bankName,schedule,debitNumber,creditAccountNumber);
	}
	
	@ Then("user approve the {string}{string} approvel {string}{string}{string}")
	public void Approvalflow(String Paymenttype,String TransferType,String Approvalone,String ApprovalTwo,String ApprovalThree)
	{
		List<String> approvals= new ArrayList();
		approvals.add(Approvalone);
		approvals.add(ApprovalTwo);
		approvals.add(ApprovalThree);
		
		approvals.stream().forEach(itm ->{
			String uname = itm.split("-")[0];
			String appr = itm.split("-")[1];
			LoginPage login = new LoginPage(DriverFactory.getDriver());
			Approvalpage approval= new Approvalpage(DriverFactory.getDriver());
			
			try {
				login.doLogin(uname, "Osv@1234");
				approval.checkBoxApproval(Paymenttype,TransferType,appr);
				sc.takeScreenShot();
				login.LogoutApplication();
				
			
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		});
		
	}
	@ Then("user approve the {string}{string}{string}")
	public void BeneficiryApproval(String Approvalone,String ApprovalTwo,String ApprovalThree)
	{
		List<String> approvals= new ArrayList();
		approvals.add(Approvalone);
		approvals.add(ApprovalTwo);
		approvals.add(ApprovalThree);
		
		approvals.stream().forEach(itm ->{
			String uname = itm.split("-")[0];
			String appr = itm.split("-")[1];
			LoginPage login = new LoginPage(DriverFactory.getDriver());
			Approvalpage approval= new Approvalpage(DriverFactory.getDriver());
			
			try {
				login.doLogin(uname, "Osv@1234");
				approval.Approval(appr);
				sc.takeScreenShot();
				if(appr.contains("Reject"))
				{
			WebElement textarea=DriverFactory.getDriver().findElement(By.xpath("//*[contains(text(),'Comment')]//following-sibling::textarea"));
				textarea.sendKeys(uname+"is rejected");
				DriverFactory.getDriver().findElement(By.xpath("//button[normalize-space()='Send']")).click();
				
				}
				login.LogoutApplication();
				
			
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		});
		
		
	}
	
	@Then("user create {string} Payment {string}{string}{string}")
	public void createpayment(String Transfertype,String Bankname,String DebitNumber,String CreditAccountNumber) throws InterruptedException
	{
		payments.Transfertype(Transfertype);
		DebitAccounts dc= new DebitAccounts(DriverFactory.getDriver());
		dc.SDA(DebitNumber);
		dc.SelectDebitAccount(DebitNumber);
		payments.createpayment(Bankname, DebitNumber, CreditAccountNumber);
		payments.Addtopaymentbuttondirect();
	}
	@And("Verify the create Payment details")
	public void verifypaymentdetails() throws InterruptedException
	{
		Thread.sleep(2000);
		
		DriverFactory.getDriver().findElement(By.xpath("//div[@class='tableDataTitle']")).click();
		Thread.sleep(2000);
		
		
		List<WebElement> li= DriverFactory.getDriver().findElements(By.xpath("//div[@class='detailsRow']"));
		Thread.sleep(2000);
		
		/*
		 * for (WebElement webElement : li) { Thread.sleep(2000);
		 * System.out.println(webElement.getText()); }
		 */
	}
	
	@And("I can click on the quick payments link")
	public void quickpayment() throws InterruptedException
	{
		Thread.sleep(2000);
		
		DriverFactory.getDriver().findElement(By.xpath("//h3[normalize-space()='Quick Launch']")).click();
		Thread.sleep(2000);
		
		DriverFactory.getDriver().findElement(By.xpath("//h4[normalize-space()='New payment']")).click();
		Thread.sleep(2000);
		
		
	}
	@And("user click on share button")
	public void sharedetails() throws InterruptedException
	{
		Thread.sleep(2000);
		
		DriverFactory.getDriver().findElement(By.xpath("//span[@class='icon icon-share Cursor']")).click();
		Thread.sleep(2000);
		
		DriverFactory.getDriver().findElement(By.xpath("//input[@placeholder='Enter email address']")).sendKeys("pashamda01@gmail.com");
		Thread.sleep(2000);
		
		DriverFactory.getDriver().findElement(By.xpath("//button[normalize-space()='Send']")).click();
		Thread.sleep(2000);
		String mailstatus=DriverFactory.getDriver().findElement(By.xpath("//span[@class='stmntDownloadMsg']")).getText();
		
		System.out.println("Send Mail status msg is"+mailstatus);
		DriverFactory.getDriver().findElement(By.xpath("//div[@class='isPopupClose isFlex spacing alignCenter']//span[@class='icon icon-new-close-icon Cursor']")).click();
	Thread.sleep(3000);	
		
	}
	@And("user click on payment download button")
	public void Paymentdownload() throws InterruptedException
	{
		Thread.sleep(2000);
		
		DriverFactory.getDriver().findElement(By.xpath("//span[@class='icon icon-download Cursor']")).click();
		Thread.sleep(5000);
		
		
		String mailstatus=DriverFactory.getDriver().findElement(By.xpath("//span[@class='stmntDownloadMsg']")).getText();
		
		System.out.println("Send Mail status msg is"+mailstatus);
		DriverFactory.getDriver().findElement(By.xpath("//div[@class='isPopupClose isFlex spacing alignCenter']//span[@class='icon icon-new-close-icon Cursor']")).click();
	Thread.sleep(3000);	
		
	}
	
	@Then("user create spilt {string}{string}{string}")
	public void Spiltpayment(String Benefacnumber,String debitacone,String debittwo) throws InterruptedException
	{
		OSVpayments.BeneficiryAccount(Benefacnumber);
		OSVpayments.DebitAccountone(debitacone);
		OSVpayments.DebitAccounttwo(debittwo);
		OSVpayments.Description();
		OSVpayments.AddPayments();
		
	}
	
	@And("I can Create the Bulk Payment")
	public void BulkPayment() throws InterruptedException {
		bulkpaymentpage.selectDebitaccount();
		bulkpaymentpage.selectpaymentsheet();
		bulkpaymentpage.paymentduedate();
		bulkpaymentpage.description_English();
		bulkpaymentpage.uploaddata();
		bulkpaymentpage.acceptandupload();
    }
	@And("I can Create the MOI Payment {string}")
	public void MOIPayment(String debitaccount) throws InterruptedException
	{
		sadadpayment.CreateSadadbill(debitaccount);
	}
	
	
	 @Then("I should Verify the Upload Successfully message")
	 public void viewbulkstatus() throws InterruptedException
	 {
		 bulkpaymentpage.uploadtextverify();
	 }
	@Then("user Alinma create Payment {string}{string}")
	public void ALinmacreatepayment(String Bankname,String DebitNumber) throws InterruptedException
	{
		payments.Alinamcreatepayment(Bankname, DebitNumber);
	}
	
	@And("user select to the newly created two payments")
	public void multiplecheckboxselection() throws InterruptedException
	{
		Thread.sleep(10000);
		DriverFactory.getDriver().findElement(By.xpath("//div[@class='tableBody']//div[2]/div[1]/div/div/input")).click();
		Thread.sleep(4000);
		
	WebElement element=	DriverFactory.getDriver().findElement(By.xpath("//div[@class='tableBody']//div[3]/div[1]/div/div/input"));
		Thread.sleep(4000);
		
		JavascriptExecutor executor = (JavascriptExecutor)DriverFactory.getDriver();
		executor.executeScript("arguments[0].click();", element);
		Thread.sleep(4000);
		
	}
	 @Then("user see the remove button is displaying and click on remove button")
	 public void removebutton() throws InterruptedException
	 {

			Thread.sleep(30000);
			DriverFactory.getDriver().findElement(By.xpath("//div[@class='footerButton']/div[2]/span[2]")).click();
			Thread.sleep(2000);
			DriverFactory.getDriver().findElement(By.xpath("//div[@class='isPaymentsViewMore']/div[1]/div[2]/button")).click();
			Thread.sleep(3000);
				
	 }
	 
	@Then("user verify International payment is not allowed for selected debit account")
	public void Alinmaverifytext()
	{
		
	}
	@And("user click on the Add to Payment button")
	public void Addtopayment()
	{
		payments.Addtopaymentbutton();
	}
	@And("user click on the Add to Payment")
	public void AddtopaymentDirect() throws InterruptedException
	{
		payments.Addtopaymentbuttondirect();
	}
	@And("user create bulk amount {string}{string}{string}")
	public void Bulkamountcreate(String Bankname,String DebitNumber,String CreditAccountNumber) throws InterruptedException
	{
		payments.bulkamount(Bankname, DebitNumber, CreditAccountNumber);
			
	}

}
