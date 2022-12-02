package com.qa.uat.pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.factory.DriverFactory;
import com.qa.util.AssertionMethods;
import com.qa.util.WaitFunctions;

public class Approvalpage extends WaitFunctions {

	public Approvalpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//private WebDriver driver;
	WaitFunctions w= new WaitFunctions(driver);


	
	@FindBy(xpath="//nav[@class='topNav ']//ul/li/a")
		public static	List<WebElement> element;
	
	@FindBy(xpath = "//ul[@class='flex']//a[contains(text(),'payments')]")
	WebElement payment;

	@FindBy(xpath = "//ul[@class='flex']//a[contains(text(),'Payroll')]")
	WebElement payroll;

	@FindBy(partialLinkText = "Pending approvals (")
	WebElement pendingApprovals;

	@FindBy(xpath = "//ul[@class='flex']//a[contains(text(),'Beneficiaries')]")
	WebElement beneficiry;

	@FindBy(xpath = "//a[contains(text(),'Pending approval')]")
	WebElement pendingbeneficiry;

	@FindBy(partialLinkText = "Transfers")
	WebElement transfers;

	@FindBy(partialLinkText = "Beneficiary accounts")
	WebElement Beneficirystab;

	@FindBy(xpath = "//div[@class='actionSection']//div")
	WebElement dotcursor;

	@FindBy(xpath="//form[@class='formMargin']//div//textarea")
	public static WebElement RejecttextBox;
	
	@FindBy(xpath="//button[contains(text(),'Send')]")
	public static WebElement Rejectsubmitbutton;
	
	@FindBy(xpath = "//nav[@class='topNav ']/child::ul/li[contains(.,'Overview')]")
	WebElement overviewbutton;
	
	@FindBy(xpath="//div[@class='upcoming']//div//div[2]//button[4]")
	WebElement Bulkapprove;
	
	@FindBy(xpath="//div[@class='upcoming']//div[2]/div[1]/button[1]")
	WebElement bulkapprovebutton;
	
	@FindBy(xpath="//div[@class='footerButton']//div[4]//button[2]")
	WebElement bulkapprovetwo;
	
	@FindBy(xpath="//div[@class='btnScheduleCalendar']//button")
	WebElement bulkapprovesubmit;
	
	@FindBy(xpath="//div[@class='sucessPayment transactionDetails isPopupContainer']//span[@class='icon icon-new-close-icon Cursor']")
    WebElement paymentpasspopup;
	
	@FindBy(xpath = "//div[contains(@class,'overview')]//div[1]//div[2]//div[2]//div[2]//button[1]")
	WebElement overviewApproveButton;

	@FindBy(partialLinkText = "Beneficiary accounts")
	WebElement Beneficiryac;

	@FindBy(xpath = "//textarea[@name='comments']")
	WebElement Commentsbox;

	@FindBy(xpath = "//form//div//div[2]//div[3]//button")
	WebElement Submitbutton;
	
	@FindBy(xpath = "//div[@class='btnScheduleCalendar ']//button[1]")
	WebElement OTPSubmitbutton;
	
	
	
	@FindBy(xpath = "(//button[normalize-space()='Send'])[1]")
	WebElement Sendmoreinfobutton;

	@FindBy(xpath = "//*[@id='root']/div/main/div/div/div/div[2]/div/div/div[3]/div[4]/div/div/div/div[1]/span")
	WebElement otppopup;

	@FindBy(xpath = "//*[@id='root']/div/main/div/div/div/div[2]/div/div/div[3]/div[4]/div/div/div/div[1]/span")
	WebElement otppopuptwo;

	@FindBy(linkText = "History")
	WebElement historytab;

	@FindBy(xpath = "//div[@class='transcationTooltip']//div//ul//li[1]")
	WebElement approvebutton;
	
	@FindBy(xpath="//div[@class='transcationTooltip']//div//ul//li")
	List<WebElement> approval;
	
	@FindBy(xpath ="//div[@class='chooseOtpAuth']//button")
	WebElement continuebutton;
	
	@FindBy(xpath="//div[@class='actionSection']//div[2]/div/ul/li[1]/text()")
	WebElement approvetext;

	@FindBy(xpath = "//div[@class='rightPanel rightSideBlockWidth']//li[3]")
	WebElement needmoreinfo;

	@FindBy(className = "paymentOtp")
	WebElement approvebox;

	@FindBy(xpath = "//button[@class='btn secondary']")
	WebElement OverviewApprove;

	@FindBy(xpath = "//div[@class='customReactTable']//div[1]//div[6]//div[1]//div[2]//span[1]")
	WebElement timeline;

	@FindBy(xpath = "//button[normalize-space()='Continue']")
	WebElement continuepay;
	@FindBy(xpath = "//input[@name='otp']")
	WebElement otp;

	@FindBy(xpath = "//div[@class='actionButtons isFlexColumn center']//button[@class='btn noBorder info']")
	WebElement viewdetails;
	@FindBy(xpath = "//button[@class='btn primary']")
	WebElement submitinfo;
	@FindBy(xpath = "//button[contains(text(),'Send')]")
	WebElement sendinfo;
	
	@FindBy(xpath="//div[contains(text(),'View payments history')]")
	WebElement History;

	@FindBy(xpath="//div[@class='table-tr ']//div[2]")
	WebElement firstrecord;
	
	

	@FindBy(xpath = "//div[@class='transcationTooltip']//div//ul//li[2]")
	WebElement Rejectbutton;
	
	@FindBy(xpath="//div[@class='popupBodySpacing']//button")
	WebElement RejectConformationbuttton;
	

	@FindBy(xpath = "//div[@class='transcationTooltip']//div//ul//li[3]")
	WebElement needmoreinfobutton;
	
	//WaitFunctions w ;

	//AssertionMethods assertions = new AssertionMethods();
	
	
	
	public void editSchedulepayment() throws InterruptedException
	{
	Thread.sleep(5000);
		
		w.waitForElement(dotcursor);
		Assert.assertEquals(true, dotcursor.isDisplayed());
		w.Elementtobeclickabe(dotcursor).click();
		
		w.waitForElement(Rejectbutton);
		Assert.assertEquals(true, Rejectbutton.isDisplayed());
		w.Elementtobeclickabe(Rejectbutton).click();
		

	}
	public void disableSchedulepayment() throws InterruptedException
	{
	Thread.sleep(5000);
		
		w.waitForElement(dotcursor);
		Assert.assertEquals(true, dotcursor.isDisplayed());
		w.Elementtobeclickabe(dotcursor).click();
		
		w.waitForElement(approvebutton);
		Assert.assertEquals(true, approvebutton.isDisplayed());
		w.Elementtobeclickabe(approvebutton).click();
		

	}
	

	public  void paymentApprove() throws InterruptedException {
		
		w.waitForElement(payment);
		Assert.assertEquals(true, payment.isDisplayed());
		w.Elementtobeclickabe(payment).click();
		
		w.waitForElement(transfers);
		Assert.assertEquals(true, transfers.isDisplayed());
		w.Elementtobeclickabe(transfers).click();
		
		w.waitForElement(Beneficiryac);
		Assert.assertEquals(true, Beneficiryac.isDisplayed());
		w.Elementtobeclickabe(Beneficiryac).click();
		
		Thread.sleep(5000);
		
		w.waitForElement(dotcursor);
		Assert.assertEquals(true, dotcursor.isDisplayed());
		w.Elementtobeclickabe(dotcursor).click();
		Thread.sleep(5000);
		w.Elementtobeclickabe(dotcursor).click();
		Thread.sleep(5000);
		w.Elementtobeclickabe(dotcursor).click();
		w.waitForElement(approvebutton);
		Assert.assertEquals(true, approvebutton.isDisplayed());

		w.Elementtobeclickabe(approvebutton).click();
		
		
		w.waitForElement(Commentsbox);
		Assert.assertEquals(true, Commentsbox.isDisplayed());
		w.Elementtobeclickabe(Commentsbox).click();

		Commentsbox.sendKeys("Approved");
		
		w.waitForElement(Submitbutton);
	//	Assert.assertEquals(true, Submitbutton.isDisplayed());
		//WaitFunctions.Elementtobeclickabe(Submitbutton).click();
		Thread.sleep(3000);
		/*
		 * w.waitForElement(historytab); Assert.assertEquals(true,
		 * historytab.isDisplayed()); w.Elementtobeclickabe(historytab).click();
		 */
	}
	
		public void paymentReject() throws InterruptedException {
			
			w.waitForElement(payment);
			Assert.assertEquals(true, payment.isDisplayed());
			w.Elementtobeclickabe(payment).click();
			
			w.waitForElement(transfers);
			Assert.assertEquals(true, transfers.isDisplayed());
			w.Elementtobeclickabe(transfers).click();
			
			w.waitForElement(Beneficiryac);
			Assert.assertEquals(true, Beneficiryac.isDisplayed());
			w.Elementtobeclickabe(Beneficiryac).click();
			
			Thread.sleep(5000);
			
			w.waitForElement(dotcursor);
			Assert.assertEquals(true, dotcursor.isDisplayed());
			w.Elementtobeclickabe(dotcursor).click();
			Thread.sleep(5000);
			w.Elementtobeclickabe(dotcursor).click();
			Thread.sleep(5000);
			w.Elementtobeclickabe(dotcursor).click();
			w.waitForElement(Rejectbutton);
			Assert.assertEquals(true, Rejectbutton.isDisplayed());

			w.Elementtobeclickabe(Rejectbutton).click();
			
			
			w.waitForElement(Commentsbox);
			Assert.assertEquals(true, Commentsbox.isDisplayed());
			w.Elementtobeclickabe(Commentsbox).click();

			Commentsbox.sendKeys("Rejected");
			
			w.waitForElement(RejectConformationbuttton);
			Assert.assertEquals(true, RejectConformationbuttton.isDisplayed());
			w.Elementtobeclickabe(RejectConformationbuttton).click();
			
			w.waitForElement(historytab);
			Assert.assertEquals(true, historytab.isDisplayed());
			w.Elementtobeclickabe(historytab).click();
		
		}

	

	public void payrollApprove() throws InterruptedException {
		payroll.click();
		Thread.sleep(2000);
		pendingApprovals.click();
		dotcursor.click();
		approvebutton.click();

		Commentsbox.click();
		Commentsbox.sendKeys("Approved");
		Submitbutton.click();
		Thread.sleep(2000);
	}

	public  void ExecutorApprove() throws InterruptedException {
		payroll.click();
		Thread.sleep(2000);
		pendingApprovals.click();
		dotcursor.click();
		approvebutton.click();
		continuepay.click();
		otp.click();
		otp.sendKeys("123456");
		Submitbutton.click();
	}

	public void closepopup() {
		// Robot robot = new Robot ();
		// WebDriver driver = driver;

	}

	
	public  void OverviewApprove() throws InterruptedException {
		w.waitForElement(overviewbutton);
		Assert.assertEquals(true, overviewbutton.isDisplayed());
		w.Elementtobeclickabe(overviewbutton).click();
	
		w.waitForElement(overviewApproveButton);
		Assert.assertEquals(true, overviewApproveButton.isDisplayed());
		w.Elementtobeclickabe(overviewApproveButton).click();
	
		w.waitForElement(Submitbutton);
		Assert.assertEquals(true, Submitbutton.isDisplayed());
		w.Elementtobeclickabe(Submitbutton).click();
	
	}
	public  void BulkOverviewApprove() throws InterruptedException {
		
		Thread.sleep(2000);
		
		w.waitForElement(Bulkapprove);
		Assert.assertEquals(true, Bulkapprove.isDisplayed());
		w.Elementtobeclickabe(Bulkapprove).click();
		Thread.sleep(2000);
	}
	public void bulkbutton()
	{
		
	
		w.waitForElement(bulkapprovebutton);
		Assert.assertEquals(true, bulkapprovebutton.isDisplayed());
		w.Elementtobeclickabe(bulkapprovebutton).click();
	}
	public void bulkapprovebuutton()
	{
		w.waitForElement(bulkapprovetwo);
		Assert.assertEquals(true, bulkapprovetwo.isDisplayed());
		w.Elementtobeclickabe(bulkapprovetwo).click();
	}
	public void bulkapprovesub()
	{
		w.waitForElement(bulkapprovesubmit);
		Assert.assertEquals(true, bulkapprovesubmit.isDisplayed());
		w.Elementtobeclickabe(bulkapprovesubmit).click();
	
	}

	public void OTPApproval() throws InterruptedException {
		
		w.waitForElement(overviewbutton);
		Assert.assertEquals(true, overviewbutton.isDisplayed());
		w.Elementtobeclickabe(overviewbutton).click();
	
		w.waitForElement(overviewApproveButton);
		Assert.assertEquals(true, overviewApproveButton.isDisplayed());
		w.Elementtobeclickabe(overviewApproveButton).click();
	
		w.waitForElement(otp);
		Assert.assertEquals(true, otp.isDisplayed());
		w.Elementtobeclickabe(otp).click();
		otp.sendKeys("123456");
		
	
		w.waitForElement(OTPSubmitbutton);
		Assert.assertEquals(true, OTPSubmitbutton.isDisplayed());
	//	WaitFunctions.Elementtobeclickabe(OTPSubmitbutton).click();
		Thread.sleep(5000);		
}
	public void BulkOTPapproval() throws InterruptedException
	{
		
		w.waitForElement(continuepay);
		Assert.assertEquals(true, continuepay.isDisplayed());
		w.Elementtobeclickabe(continuepay).click();
		
	
		w.waitForElement(otp);
		Assert.assertEquals(true, otp.isDisplayed());
		w.Elementtobeclickabe(otp).click();
		otp.sendKeys("123456");
		
	
		w.waitForElement(Submitbutton);
		Assert.assertEquals(true, Submitbutton.isDisplayed());
		w.Elementtobeclickabe(Submitbutton).click();
		Thread.sleep(5000);	
		
	}
	public void BulkOTPFinalApproval() throws InterruptedException
	{
		try
		{
		w.waitForElement(paymentpasspopup);
		Assert.assertEquals(true, paymentpasspopup.isDisplayed());
		w.Elementtobeclickabe(paymentpasspopup).click();
		Thread.sleep(5000);	
		}
		catch(Exception e)
		{
			
		}
	}
	
	public  void history() throws InterruptedException
	{
		Thread.sleep(4000);
		w.waitForElement(payment);
		Assert.assertEquals(true, payment.isDisplayed());
	//	w.waitForElement(payment).click();
		//w.Elementtobeclickabe(payment).click();
		/*
		 * w.waitForElement(History); Assert.assertEquals(true, History.isDisplayed());
		 * w.Elementtobeclickabe(History).click();
		 * 
		 * w.waitForElement(firstrecord); Assert.assertEquals(true,
		 * firstrecord.isDisplayed()); w.Elementtobeclickabe(firstrecord).click();
		 */	
	
		Thread.sleep(3000);
	}
	

	public  void OTPApprovalThreetimes() throws InterruptedException {
		Thread.sleep(3000);
		overviewbutton.click();
		// Thread.sleep(3000);
		// Beneficiryac.click();
		Thread.sleep(3000);
		overviewApproveButton.click();
		otp.click();
		for (int i = 0; i < 4; i++) {

			otp.sendKeys("123406");
			Submitbutton.click();
		}
		Thread.sleep(3000);
		try {
			otppopup.click();
		} catch (Exception e) {

			System.out.println("There is no popup window");
		}
	}

	public void Beneficiry_CheckboxApproval(String Decision) throws InterruptedException {
		w.waitForElement(dotcursor);
		Assert.assertEquals(true, dotcursor.isDisplayed());
		dotcursor.click();
		//Seleniumutility.clickanelementinlist(approval, Decision);
		Thread.sleep(3000);
		if(Decision.equalsIgnoreCase("Reject"))
		{
		//	w.waitForElement(RejecttextBox).sendKeys("Rejected");
			//w.waitForElement(RejectConformationbuttton).click();
		}
		if(Decision.equalsIgnoreCase("Need more info"))
		{
			
		}
		
	}
	
	public void Beneficiry_overviewApproval(String Decision)
	{
	//	Seleniumutility.clickanelementinlist(approval, Decision);
		
	}
	

	public void Beneficiry_All() {

	}

	// **************************************Need More
	// Info**********************************//

	public void needmoreinfo() throws InterruptedException {

		w.waitForElement(payment);

		Assert.assertEquals(true, payment.isDisplayed());

		payment.click();
		Thread.sleep(2000);

		// await("Download did not complete within 20 seconds").atMost(20,
		// TimeUnit.SECONDS).until(payment::getText, is("Complete!"));

		transfers.click();
		Beneficiryac.click();
		dotcursor.click();
		needmoreinfo.click();

		Thread.sleep(2000);
		Commentsbox.sendKeys("plz send more info");
		Thread.sleep(2000);

		Sendmoreinfobutton.click();
		Thread.sleep(2000);
		historytab.click();

	}

	public  void sendmoreinfo() throws InterruptedException {
		Thread.sleep(5000);
		overviewbutton.click();
		Thread.sleep(2000);
		viewdetails.click();
		submitinfo.click();
		Thread.sleep(2000);
		Commentsbox.sendKeys("plz send more info");
		Thread.sleep(2000);

		sendinfo.click();

	}

	// **************************Beneficiries Approval Page
	// ********************************//

	public void BeneficiryApproval(WebDriver driver) throws InterruptedException {
		/*
		 * SeleniumUtility.seleniumClick(driver, beneficiry);
		 * 
		 * SeleniumUtility.seleniumClick(driver, pendingbeneficiry); Thread.sleep(3000);
		 * SeleniumUtility.seleniumClick(driver, dotcursor);
		 * SeleniumUtility.seleniumClick(driver, approvebutton);
		 */ }

	// *********************************New code **********************//

	By DashboardbeneficiryApprove = By.xpath("//div[@class='actionButtons']//div//button[1]");
	By Dashboardbenfview = By.xpath("//div[@class='actionButtons']//div//button[2]");
	By DashBoardneedmoreinfo = By.xpath("(//button[normalize-space()='Need more info'])[1]");
	By DashBoardAprove = By.xpath("(//button[@class='btn success'])[1]");
	By DashBoardReject = By.xpath(
			"//div[@class='sliderPopup popupContentSlideIn']//div[@class='paymentButtons']//button[@class='btn warning'][normalize-space()='Reject']");
	By RejectCommentBox = By.xpath("//textarea[@name='reject']");
	By SendButton = By.xpath("//button[normalize-space()='Send']");

	public void DashBoardApproveBeneficiry() {
		// waitforElementclick(DashboardbeneficiryApprove);
		// click(DashboardbeneficiryApprove);

	}

	public void DashBoardviewApproveBeneficiry() {
		// click(Dashboardbenfview);
		// click(DashBoardAprove);
	}

	public void DashBoardviewrejectBeneficiry() throws InterruptedException {
		/*
		 * waitforvisibility(Dashboardbenfview); click(Dashboardbenfview);
		 * 
		 * waitforElementclick(DashBoardReject); click(DashBoardReject);
		 * type(RejectCommentBox, "Rejected"); click(SendButton);
		 */}

}
