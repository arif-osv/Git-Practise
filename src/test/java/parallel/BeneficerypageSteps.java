package parallel;

import com.qa.uat.pages.Approvalpages;

import com.qa.pages.BeneficiryProfile;
import com.qa.util.WaitFunctions;

import java.awt.AWTException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;

public class BeneficerypageSteps {
	
	private WebDriver driver;
	private Approvalpages approPage = new Approvalpages(DriverFactory.getDriver());
	//WaitFunctions w = new WaitFunctions(driver);
//	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	
	
private BeneficiryProfile beneficiryPage = new BeneficiryProfile(DriverFactory.getDriver());
	



@And("I can create {string} Beneficiry profile")
public void localbeneficiry(String Type) throws InterruptedException, AWTException
{
	beneficiryPage.createlocal(Type);
}

@And("I can Delete {string} Beneficiry profile")
public void Delete(String Type) throws InterruptedException, AWTException
{
	beneficiryPage.createlocal(Type);
}

























@And("user self Approve the Beneficiry")
public void user_Approve_Beneficiry() throws InterruptedException {

	//approPage.Beneficiry_CheckboxApproval(Decision);

}
@And("user Decide to {string} the Beneficiry through checkbox")
public void user_Decision(String Decision) throws InterruptedException {

	approPage.Beneficiry_CheckboxApproval(Decision);

}
@And("user Decide to {string} the Beneficiry through {string}")
public void user_Decision_Overview(String Decision,String type) throws InterruptedException {
	//w.Elementtobeclickabelist(Approvalpages.element);
	//Seleniumutility.clickanelementinlist(Approvalpages.element, type);
	if(Decision.contains("Approve"))
	{
	Thread.sleep(2000);
	DriverFactory.getDriver().findElement(By.xpath("//div[@class='actionButtons']//div//button[1]")).click();
	}
	if(Decision.contains("Reject"))
	{
		Thread.sleep(2000);
		DriverFactory.getDriver().findElement(By.xpath("//div[@class='actionButtons']//div//button[2]")).click();
		Thread.sleep(3000);
		DriverFactory.getDriver().findElement(By.xpath("//div[@class='paymentButtons']//div//button[2]")).click();
		Thread.sleep(3000);
		//w.waitForElement(Approvalpage.Rejectsubmitbutton).sendKeys("Rejected");
	//	w.waitForElement(Approvalpage.RejectConformationbuttton).click();
	
		
	}

	
}

@And("user Approve the Benficiry")
public void Approvebeneficiry() throws InterruptedException {
	//approPage.BeneficiryApproval(driver);
}

@Then("user Approve the Beneficiry through dashboard")
public void Approvebeneficirydashboard() {
//	approPage.DashBoardApproveBeneficiry();
}

@Then("user reject the Beneficiry through dashboard")
public void rejectbeneficirydashboard() throws InterruptedException {

//	approPage.DashBoardviewrejectBeneficiry();
}



@And("user click on {string} link")
public void userclick (String link) throws InterruptedException
{
//	w.Elementtobeclickabelist(Approvalpages.element);
//	Seleniumutility.clickanelementinlist(Approvalpages.element, link);
}
	
@And("user click on {string} tab")
public void usertab(String link)
{
	List<WebElement> element = DriverFactory.getDriver().findElements(By.xpath("//nav[@class='toggleSideNavBar']//ul//li"));
//	Seleniumutility.clickanelementinlist(element, link);
	
}

@And("user click on {string}")
public void paymentlink(String linkname) throws InterruptedException
{
	Thread.sleep(5000);
	DriverFactory.getDriver().findElement(By.partialLinkText(linkname)).click();
}

@Then("User click on payment switch icon")
public void paymentswitchicon() throws InterruptedException
{
	Thread.sleep(5000);
	DriverFactory.getDriver().findElement(By.xpath("//span[@class='icon-column-switch Cursor ']")).click();

}
public void datatablecount()
{
	int count =DriverFactory.getDriver().findElements(By.xpath("//div[@class='table-tr']/div")).size();
	System.out.print("Before data table count"+count);
}
@And("user count before swich tabs count")
public void beforedatatablecount() throws InterruptedException
{
datatablecount();

}

@And("user count after swich tabs count")
public void aftercount()
{
	datatablecount();
	
}
@Then("user verified both are not matching")
public void validate()
{
	
}
	
	@Then("click and Data table search name box")
	public void Search_Name() throws InterruptedException
	{
	//	beneficiryPage.DatatablenameSearch();
	}
	@Then("user click and Data table search Account Number")
	public void Search_Acnumber() throws InterruptedException
	{
	//	beneficiryPage.DatatableAccountnumberSearch();
	}
	
	@Then("Click on add account button in existing local beneficiary")
	public void user_clickonExistingbenf() throws InterruptedException
	{
	//	beneficiryPage.Existingbenf();
	}
	
	@And("user click on addBeneficiry Button")
	public void addBeneficrybutton() throws InterruptedException
	{
	//	beneficiryPage.AddBeneficiry();
		}
	
	@And("click on add Beneficiries")
	public void addbutton()
	{
		//beneficiryPage.addbeneficirires();
	}
	
	@Then("Click on view more tab under Beneficiry tags")
	public void viewmoretab() throws InterruptedException
	{
		//beneficiryPage.viewmore();	
	}
	
	@Then("verify beneficiry with beneficiry name and IBAN number")
	public void verify_beneficiry_with_beneficiry_name_and_iban_number() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		
	//beneficiryPage.validBeneficirySearch();
		
		
	}

	@Then("verify valid beneficiry name and IBAN number")
	public void verify_valid_beneficiry_name_and_iban_number() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		
	//	beneficiryPage.BeneficirySearch();
		
		
	}
	
	@Then("click on the verify beneficiry")
	public void click_on_the_verify_beneficiry() {
	//	beneficiryPage.verifyBeneficiry.click();
	    // Write code here that turns the phrase above into concrete actions
	   }
	
	
	@And("user Select on Bank {string}")
	public void Beneficiry(String BankName) throws InterruptedException
	{
	//	beneficiryPage.selectbanks(BankName);
	}
	@And("user fill all the details and create new beneficiry and create new payment {string}")
	public void NewBeneficiry(String BankName) throws InterruptedException
	{
		//beneficiryPage.selectbanks(BankName);
	//	beneficiryPage.createnewbeneficiry_Payments(BankName);
		
	}
	
	@And("Add Account details with existing beneficiry")
	public void addaccount() throws InterruptedException
	{
	//	beneficiryPage.IBANNumber();
	}
	@But("user wants disable this beneficiry")
	public void disablebeneficiry() throws InterruptedException
	{
		//beneficiryPage.disablebeneficiry();
	}
	
	@And("user fill all the details and create new beneficiry and payment {string}")
	public void createNewBeneficiry(String BankName) throws InterruptedException
	{
		//beneficiryPage.selectbanks(BankName);
	//	beneficiryPage.createnewbeneficiry_Payments(BankName);
		
	}
	@And("user fill all the details and create new beneficiry {string}")
	public void usercreateNewBeneficiry(String BankName) throws InterruptedException
	{
		//beneficiryPage.selectbanks(BankName);
		//beneficiryPage.createnewbeneficiry(BankName);
		
	}
	
	@And("user fill all the details and create new International beneficiry {string}")
	public void usercreatenewInternationalBeneficiry(String BankName) throws InterruptedException
	{
		//beneficiryPage.selectbanks(BankName);
	//	beneficiryPage.createnewInternationalbeneficiry(BankName);
		
	}
	
	
	
	
	@And("user create payment with newly created beneficiry")
	public void createpaymentwithnewbenefiry(String BankName)  throws InterruptedException
	{
	//	beneficiryPage.createnewbeneficiry_Payments(BankName);	
	}
	@And("user fill all the details and create new beneficiry with out tagname {string}")
	public void NewBeneficirywithouttagname(String BankName) throws InterruptedException
	{
	//	beneficiryPage.withouttagname(BankName);
	}
	
	@And("user open the newly created Beneficiary and verify the details")
	public void opennewbenef() throws InterruptedException
	{
	//	beneficiryPage.clickonexistingbeficiry();
	}
	@And("user Edit the tag name and try to save the tagname field empty")
	public void Blanktag() throws InterruptedException
	{
	//	beneficiryPage.Emptytag();
	}
	@And("user Edit the Categery name and try to save the Category field empty")
	public void Category() throws InterruptedException
	{
	//	beneficiryPage.Category();
	}
	@And("user click on the add tag name and save the new tagname")
	public void addtag() throws InterruptedException
	{
	//	beneficiryPage.Addnewtag();
	}
	
	@And("user Edit the tag name and save the new tagname")
	public void Edittag() throws InterruptedException
	{
	//	beneficiryPage.EditTag();
	}

	@And("user click on addaccount tab")
	public void addnewaccount() throws InterruptedException
	{
		//beneficiryPage.Addaccount();
	}
	
	@And("add beneficity tab")
	public void addbeneficiry() throws InterruptedException
	{
	//	DriverFactory.getDriver().findElement(By.cssSelector("div[class='popupDownShadow createPaymentBtn'] button[type='submit']")).click();
		Thread.sleep(2000);
	}
	@And("Verify The error message")
	public void verifymsg()
	{
		
	}
	@And("Enter beneficiry Address with special charectrs")
	public void BeneficiryAdd() throws InterruptedException
	{
	//	DriverFactory.getDriver().findElement(By.cssSelector("input[name='address']")).click();
		Thread.sleep(2000);

	//	DriverFactory.getDriver().findElement(By.cssSelector("input[name='address']")).sendKeys("HYD");
		
	}
	
	@And("again user create new Beneficiry {string}")
	public void addnewaccountdetails(String BankName) throws InterruptedException
	{
		//beneficiryPage.addbeneficirythroughaddaccount(BankName);
	}
	@And("user Enter the Beneficiry Name {string}")
	public void BeneficiryName(String Bankname) throws InterruptedException
	{
		//beneficiryPage.EnterBeneficiryname();
	}
	
	@And("User Enters the IBAN Number {string}")
	public void IBANNumber(String number) throws InterruptedException
	{
	//	beneficiryPage.IBANNumber();
	}
	
	
	@And("user click on Pending  Approval Button")
	public void PendingApproval() throws InterruptedException
	{
		//beneficiryPage.PendingApproval();
	}
	
	@And("user click on Multiple checkBoxes")
	public void Multiple_CheckBoxes() throws InterruptedException
	{
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[normalize-space()='Pending approval']")).click();
		//Thread.sleep(3000);
	//	driver.findElement(By.xpath("(//input[@id='c1'])[1]")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//button[normalize-space()='Proceed']")).click();
		Thread.sleep(2000);
		
	}
	
	@Then("User want to create local beneficiry profile {string}")
	public void  CreateLocalBeneficiry(String Bankname) throws InterruptedException {
		
	//	beneficiryPage.selectbanks(Bankname);
		
	}
	@Then("User click on Payroll link and upload payroll sheet")
	public void Upload_Payroll() throws InterruptedException, IOException
	{
	//	beneficiryPage.payroll();
	}

}
