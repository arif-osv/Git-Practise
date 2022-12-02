package com.qa.uat.pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qa.factory.DriverFactory;
import com.qa.pages.Approvalpage;
import com.qa.pages.Paymentpage;

import com.qa.util.AssertionMethods;
import com.qa.util.BaseTest;
import com.qa.util.WaitFunctions;


public class paymentpage extends WaitFunctions   {

		public paymentpage(WebDriver driver)
		{
			super(driver);
		}
		Bulkpaymentpage bulkpaymentpage= new Bulkpaymentpage(DriverFactory.getDriver());
			
	@FindBy(xpath = "//nav/ul/li/a[contains(@href,'/payments')]")
	WebElement paymentlink;

	@FindBy(xpath = "//a[@href='/payments/bulkTransfers']")
	WebElement bulktransfer;

	@FindBy(xpath = "(//a[normalize-space()='Upload payments'])[1]")
	WebElement uploadbulk;

	@FindBy(xpath = "//h4[contains(text(),'Create payment')]")
	public static WebElement QuickPayment;

	@FindBy(partialLinkText = "Schedule payments")
	public static WebElement Schedulepayment;

	@FindBy(css = "a[class='activeSubMenu']")
	public static WebElement Scheduletransfertab;

	@FindBy(partialLinkText = "Same bank")
	public static WebElement samebank;

	@FindBy(xpath = "//input[@name='transfer_type'][@value='SWIFT']")
	public static WebElement Swiftpayment;

	@FindBy(xpath = "//button[@class='btn createBtn ']")
	public static WebElement CreateSchedulepayment;

	@FindBy(xpath = "(//div[@class='name-select__value-container css-1hwfws3'])[1]")
	public static WebElement fromac;

	@FindBy(xpath = "//div[@class='isDropdownPlaceholder']")
	public static WebElement debitaccount;

	@FindBy(xpath = "//div[contains(text(),'SAR')]")
	public static WebElement Currency;

	@FindBy(xpath = "//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'204000010006085129123')]")
	public static WebElement fromacno;

	@FindBy(xpath = "//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'SA7580000260752019000935')]")
	public static WebElement samebankacno;

	// By Header=By.xpath("//div[@class='selectOptionFont
	// css-2b097c-container']//*[contains(text(),"+Fromac+")]");

	@FindBy(xpath = ("//input[@name='beneficiaryaccount']//preceding-sibling::div"))
	public static WebElement benfone;

	@FindBy(xpath = "//label[contains(text(),'Beneficiary account')]//following-sibling::div/div/div/div/following-sibling::div")
	public static WebElement beneficiryac;

	@FindBy(xpath = ("//input[@name='debitAccount']//preceding-sibling::div"))
	public static WebElement benf;

	@FindBy(xpath = ("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'204000010006085129115')]"))
	public static WebElement benfno;

	@FindBy(xpath = ("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'204000010006085129123')]"))
	public static WebElement credacno;

	@FindBy(name = "amount")
	public static WebElement amount;

	@FindBy(xpath = "//div[contains(text(),'How often?')]")
	public WebElement howoften;

	@FindBy(xpath = "//label[contains(text(),'Purpose (POR)')]//following-sibling::div/div/div")
	public static WebElement POR;

	@FindBy(xpath = "//div[@class='formControl']//*[contains(text(),'Travel Requirements')]")
	public static WebElement PORcode;
	
	@FindBy(xpath = "//textarea[@name='description']")
	public static WebElement testarea;

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/span[1]")
	WebElement closepopup;

	@FindBy(xpath = "//div[@class='createPaymentBody']//div[2]//div//button[1]")
	public static WebElement addpayment;

	@FindBy(xpath = "//button[contains(text(),'Schedule payment')]")
	public static WebElement schedulepaybutton;

	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[2]")
	public static WebElement checkBoxone;

	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[4]")
	public static WebElement checkBoxtwo;

	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[5]")
	public static WebElement checkBoxthree;

	@FindBy(xpath = "//button[contains(text(),'Proceed')]")
	public static WebElement Proceed;

	@FindBy(xpath = "//button[normalize-space()='Approve']")
	public static WebElement Approve;

	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement Approvesecondbutton;

	@FindBy(xpath = "//div[@class='chooseOtpAuth']")
	public static WebElement Authentication;

	@FindBy(xpath = "//input[@name='otp']")
	public static WebElement otp;

	@FindBy(xpath = "//i[@class='icon icon-down-arrow']")
	public static WebElement DatatableArrow;

	@FindBy(xpath = "//div[contains(@class,'table-th schedulePayStatus')]//div[2]//input[1]")
	public static WebElement MonthlySection;

	@FindBy(xpath = "//span[@class='tableDataSubTitle dateTimeColor']//span")
	public static WebElement Monthdata;

	@FindBy(xpath = "//span[@class='filterBtn']//span[2]")
	public static WebElement Monthdatapopup;

	@FindBy(xpath = "//input[@placeholder='Search beneficiary name']")
	public static WebElement Beneficiryname;

	
	@FindBy(partialLinkText = "Beneficiary accounts")
	 WebElement Beneficiryac;

	@FindBy(xpath = "//div[@class='tableBody']//div[2]//div[6]//span[2]")
	 WebElement amounttag;

	@FindBy(xpath = "//textarea[@name='comments']")
	 WebElement Commentsbox;

	@FindBy(xpath = "//button[@type='submit']")
	 WebElement Submitbutton;

	@FindBy(xpath = "//div[@class='actionSection']//div")
	 WebElement dotcursor;

	@FindBy(linkText = "History")
	 WebElement historytab;

	@FindBy(xpath = "//div[@class='transcationTooltip']//div//ul//li[1]")
	static WebElement approvebutton;

	static Random random = new Random();
	public static int num = random.nextInt(90) + 10;
	public static String a = "";
	//WaitFunctions w= new WaitFunctions();
	
	
	
	
	public void usercreatepay(String Paymenttype) throws InterruptedException {
		Thread.sleep(5000);
		click(Paymentpage.payment);
		click(String.format(Approvalpage.Dynamicxpath,Paymenttype));
		if(Paymenttype.equalsIgnoreCase("SADAD"))
		{
			
			click(String.format(Approvalpage.Dynamicxpath,"Ministry of interior (MOI)"));
			
		}
		if(Paymenttype.equalsIgnoreCase("Split payment"))
		{
			System.out.println("Paymenet type is "+Paymenttype);
			click(String.format(Paymentpage.createpayments, "split payment"));
			Paymentpage o =new Paymentpage(driver);
			o.Spiltpayment();
		
			Thread.sleep(5000);
			
		}	
		
	if(Paymenttype.equalsIgnoreCase("Schedule payment"))
	{
		click(Paymentpage.createSchedulepayment);
		Thread.sleep(5000);
		
	}
	else if(Paymenttype.equalsIgnoreCase("Bulk transfers"))
	{
		click(String.format(Approvalpage.Dynamicxpath,"Upload payments"));
		
	}
		
	int count=	driver.findElements(By.xpath("//a[@class='activeSideNav']//following-sibling::ul/li")).size();
	 if(Paymenttype.equalsIgnoreCase("Transfers")&&count==3)
	{
		click(Paymentpage.BeneficiryAccount);
		click(Paymentpage.createpayment);
	
		}
      else if(count==5)
	{
		System.out.println("this is grid view");
		click(String.format(Approvalpage.Dynamicxpath, "Same bank"));
		click(Paymentpage.createpayment);
	
	}
	}
	public void gridcreatepay() throws InterruptedException
	{
		click(Paymentpage.payment);
		click(Paymentpage.transfers);
		click(String.format(Approvalpage.Dynamicxpath, "Same bank"));
		click(Paymentpage.createpayment);
	
	}
	
	
	
	public void schedulepayment()
	{
		
		Schedulepayment.click();
		CreateSchedulepayment.click();
	
	}

	public void transfer() {
		click(Paymentpage.transfers);
		click(Paymentpage.BeneficiryAccount);
		click(Paymentpage.createpayment);
		
		
		}

	

	public void Transfertype(String Transfertype) throws InterruptedException {
			
	WebElement transfertype=driver.findElement(By.xpath("//input[@name='transfer_type'][@value='" + Transfertype + "']"));
	 waitForElement(transfertype);
	Assert.assertEquals(true, transfertype.isDisplayed());
	Thread.sleep(2000);
	Elementtobeclickabe(transfertype).click();
	Thread.sleep(4000);
	
		}

	
	
	public void Alinamcreatepayment(String bankName, String debitNumber) throws InterruptedException

	{


		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		 waitForElement(debitaccount);
		Assert.assertEquals(true, debitaccount.isDisplayed());
		 Elementtobeclickabe(debitaccount).click();

		if (bankName.equalsIgnoreCase("ALRAJHI") || bankName.equalsIgnoreCase("SABB")
				|| bankName.equalsIgnoreCase("RIYAD")) {
			System.out.println("Selected bank account is " + bankName);
			driver.findElement(By.xpath("//div[@title='" + bankName + "']//following-sibling :: div")).click();
			Thread.sleep(5000);

			List<WebElement> li = driver.findElements(By.xpath("//div[@class='benAccNum']"));
			for (int i = 0; i < li.size(); i++) {
				String accountno = li.get(i).getText();
				System.err.println("Account numbers are " + accountno);
				if (debitNumber.contains(accountno)) {
					li.get(i).click();
					break;
				}
			}
		} else {
			WebElement Debitaccount = driver.findElement(By.xpath("//*[contains(text(),'" + debitNumber + "')]"));

			 waitForElement(Debitaccount);
			Assert.assertEquals(true, Debitaccount.isDisplayed());
			 Elementtobeclickabe(Debitaccount).click();

		}

	}
	public void createpayment(String bankName, String debitNumber, String creditAccountNumber)
			throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		click(Paymentpage.debitaccounts);
		//element.getAttribute("benAccNum") ;
		List<WebElement> kk=driver.findElements(By.xpath("//div[@class='listOfItems']//div[2]"));
		for (WebElement webElement : kk) {
			
			String textnum=	webElement.getAttribute("title");
				System.out.println("title Testing new Accounts"+textnum);
		}
		
		List<WebElement> lis=driver.findElements(By.xpath("//div[@class='listOfItems']//div[2]"));
		
		for (WebElement webElement : lis) {
			
		String textnum=	webElement.getText();
			System.out.println("Testing Accounts"+textnum);
			
			if(textnum.contains(debitNumber))
			{
				System.out.println("matched acs");
				webElement.click();
			}
			
			else
			{
			List<WebElement> lit=driver.findElements(By.xpath("//form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div/div/div/span[2]"));
			
			
			for (int i = 0; i <lit.size(); i++) {
				
		String acnd=driver.findElement(By.xpath("//form/div/div/div/div/div/div/div/div/div/div/div[2]")).getText();
				
			System.out.println("acn are"+acnd);
			
			if(acnd.contains(debitNumber))
			{
				lit.get(i).click();
			}
			
			}}}
			
					if (bankName.equalsIgnoreCase("ALRAJHI") || bankName.equalsIgnoreCase("SABB")
				|| bankName.equalsIgnoreCase("RIYAD")) {
			click(String.format(Paymentpage.BankName, bankName));
			Thread.sleep(5000);
				List<WebElement> li = driver.findElements(By.xpath("//div[@class='benAccNum']"));
			for (int i = 0; i < li.size(); i++) {
				String accountno = li.get(i).getText();
				System.err.println("Account numbers are " + accountno);
				if (debitNumber.contains(accountno)) {
					li.get(i).click();
					 takeScreenShot(bankName);
					break;
				}
			}
		} else {
			WebElement Debitaccount = driver.findElement(By.xpath("//*[contains(text(),'" + debitNumber + "')]"));

			 waitForElement(Debitaccount);
			Assert.assertEquals(true, Debitaccount.isDisplayed());
			 Elementtobeclickabe(Debitaccount).click();
			 takeScreenShot(bankName);
			 System.out.println("Selected Debit Account Bank name is"+bankName+ "and Account number "+Debitaccount);

		}

		 waitForElement(beneficiryac);
		Assert.assertEquals(true, beneficiryac.isDisplayed());
		 Elementtobeclickabe(beneficiryac).click();

		WebElement Debitaccount = driver.findElement(By.xpath("//*[contains(text(),'" + creditAccountNumber + "')]"));

		 waitForElement(Debitaccount);
		Assert.assertEquals(true, Debitaccount.isDisplayed());
		Thread.sleep(2000);
		 Debitaccount.click();
		 takeScreenShot(bankName);
		 System.out.println("Selected credit Account Bank name is"+bankName+ "and Account number "+creditAccountNumber);

		if (bankName.equalsIgnoreCase("HDFC") || bankName.equalsIgnoreCase("YES") || bankName.equalsIgnoreCase("ICICI"))

		{

			if (bankName.equals("HDFC")) {

				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class=' css-1wa3eu0-placeholder']")).click();
				driver.findElement(
						By.xpath("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'NEFT')]"))
						.click();
			} else if (bankName.equalsIgnoreCase("YesBank")) {

				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class=' css-1wa3eu0-placeholder']")).click();
				driver.findElement(
						By.xpath("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'RTGS')]"))
						.click();
			} else if (bankName.equalsIgnoreCase("ICICI")) {

				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class=' css-1wa3eu0-placeholder']")).click();
				driver.findElement(
						By.xpath("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'IMPS')]"))
						.click();
			}

		}

		 waitForElement(amount);
		 Elementtobeclickabe(amount).click();
		int num = random.nextInt(90) + 10;
		takeScreenShot(Integer.toString(num));
		System.out.println("Transaction amount is "+num);
		amount.sendKeys(Integer.toString(num));
		
		if(!driver.findElements(By.xpath("//div[@class='paymentsBodyPopupSpace']//div[5]/label[contains(text(),'Schedule')]")).isEmpty())
		
		{
			howoften.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[contains(text(),'Weekly')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[contains(text(),'Select...')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[contains(text(),'Mon')]")).click();

		}
						 
				POR.click();
				Thread.sleep(2000);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PORcode);
				
			    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", PORcode);
				 Thread.sleep(4000);
				 takeScreenShot(bankName);
				 System.out.println("POR Code is "+PORcode);
					
					 waitForElement(testarea);
		 testarea.sendKeys("Test payment Scenarios");
		 System.out.println("Entered Comments are "+ testarea);
			
	}
	public static Boolean waitForInvisibility(WebElement element, int timeToWaitInSec) {
	    WebDriverWait w = new WebDriverWait(DriverFactory.getDriver(), timeToWaitInSec);
	    return w.until(ExpectedConditions.invisibilityOf(element));
	}
	
	public void bulkamount(String bankName, String debitNumber, String creditAccountNumber) throws InterruptedException
	{


		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		 waitForElement(debitaccount);
		Assert.assertEquals(true, debitaccount.isDisplayed());
		 Elementtobeclickabe(debitaccount).click();

		if (bankName.equalsIgnoreCase("ALRAJHI") || bankName.equalsIgnoreCase("SABB")
				|| bankName.equalsIgnoreCase("RIYAD")) {
			System.out.println("Selected bank account is " + bankName);
			driver.findElement(By.xpath("//div[@title='" + bankName + "']//following-sibling :: div")).click();
			Thread.sleep(10000);

			List<WebElement> li = driver.findElements(By.xpath("//div[@class='benAccNum']"));
			for (int i = 0; i < li.size(); i++) {
				String accountno = li.get(i).getText();
				System.err.println("Account numbers are " + accountno);
				if (debitNumber.contains(accountno)) {
					li.get(i).click();
					break;
				}
			}
		} else {
			WebElement Debitaccount = driver.findElement(By.xpath("//*[contains(text(),'" + debitNumber + "')]"));

			 waitForElement(Debitaccount);
			Assert.assertEquals(true, Debitaccount.isDisplayed());
			 Elementtobeclickabe(Debitaccount).click();

		}

		 waitForElement(beneficiryac);
		Assert.assertEquals(true, beneficiryac.isDisplayed());
		 Elementtobeclickabe(beneficiryac).click();

		WebElement Debitaccount = driver.findElement(By.xpath("//*[contains(text(),'" + creditAccountNumber + "')]"));

		 waitForElement(Debitaccount);
		Assert.assertEquals(true, Debitaccount.isDisplayed());
		 Elementtobeclickabe(Debitaccount).click();

		if (bankName.equalsIgnoreCase("HDFC") || bankName.equalsIgnoreCase("YES") || bankName.equalsIgnoreCase("ICICI"))

		{

			if (bankName.equals("HDFC")) {

				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class=' css-1wa3eu0-placeholder']")).click();
				driver.findElement(
						By.xpath("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'NEFT')]"))
						.click();
			} else if (bankName.equalsIgnoreCase("YesBank")) {

				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class=' css-1wa3eu0-placeholder']")).click();
				driver.findElement(
						By.xpath("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'RTGS')]"))
						.click();
			} else if (bankName.equalsIgnoreCase("ICICI")) {

				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class=' css-1wa3eu0-placeholder']")).click();
				driver.findElement(
						By.xpath("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'IMPS')]"))
						.click();
			}

		}

		 waitForElement(amount);
		 Elementtobeclickabe(amount).click();
		int num = random.nextInt(90) + 10;
		amount.sendKeys("200000");

		if (bankName.equalsIgnoreCase("ALRAJHI") || bankName.equalsIgnoreCase("SABB")
				|| bankName.equalsIgnoreCase("NCB")) {
			By PORCODE = By.xpath(
					"//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Travel Requirements')]|//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Business:Payroll')]|//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Allowance')]");
			POR.click();
			driver.findElement(PORCODE).click();

		}

		 waitForElement(testarea);
		 Elementtobeclickabe(testarea).click();
		 Elementtobeclickabe(testarea).sendKeys("اختباراتاختبارات");

	
	}
	
	
	
	
	
	
	
	
	
	
	
		public void SchedulePayment(String bankName,String schedule, String debitNumber, String creditAccountNumber)
				throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			

			
			  boolean searchIconPresence = driver.findElement(By.xpath(
					  "/html/body/div/div/div[4]/div/div/div/div[2]/span")).isDisplayed(); //
					  boolean searchIconEnabled = driver.findElement(By.xpath(
					  "/html/body/div/div/div[4]/div/div/div/div[2]/span")).isEnabled();
					  
						if (searchIconPresence == true) { // click on the search button
							WebElement searchIcon = driver
									.findElement(By.xpath("/html/body/div/div/div[4]/div/div/div/div[2]/span"));
							searchIcon.click();
						} else {

						}
						Thread.sleep(2000);


			 waitForElement(debitaccount);
			Assert.assertEquals(true, debitaccount.isDisplayed());
			 Elementtobeclickabe(debitaccount).click();

			if (bankName.equalsIgnoreCase("ALRAJHI") || bankName.equalsIgnoreCase("SABB")
					|| bankName.equalsIgnoreCase("RIYAD")) {
				System.out.println("Selected bank account is " + bankName);
				driver.findElement(By.xpath("//div[@title='" + bankName + "']//following-sibling :: div")).click();
				Thread.sleep(10000);

				List<WebElement> li = driver.findElements(By.xpath("//div[@class='benAccNum']"));
				for (int i = 0; i < li.size(); i++) {
					String accountno = li.get(i).getText();
					System.err.println("Account numbers are " + accountno);
					if (debitNumber.contains(accountno)) {
						li.get(i).click();
						break;
					}
				}
			} else {
				WebElement Debitaccount = driver.findElement(By.xpath("//*[contains(text(),'" + debitNumber + "')]"));

				 waitForElement(Debitaccount);
				Assert.assertEquals(true, Debitaccount.isDisplayed());
				 Elementtobeclickabe(Debitaccount).click();

			}

			 waitForElement(benfone);
			Assert.assertEquals(true, benfone.isDisplayed());
			 Elementtobeclickabe(benfone).click();

			WebElement Debitaccount = driver.findElement(By.xpath("//*[contains(text(),'" + creditAccountNumber + "')]"));

			 waitForElement(Debitaccount);
			Assert.assertEquals(true, Debitaccount.isDisplayed());
			 Elementtobeclickabe(Debitaccount).click();

			if (bankName.equalsIgnoreCase("HDFC") || bankName.equalsIgnoreCase("YES") || bankName.equalsIgnoreCase("ICICI"))

			{

				if (bankName.equals("HDFC")) {

					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[@class=' css-1wa3eu0-placeholder']")).click();
					driver.findElement(
							By.xpath("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'NEFT')]"))
							.click();
				} else if (bankName.equalsIgnoreCase("YesBank")) {

					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[@class=' css-1wa3eu0-placeholder']")).click();
					driver.findElement(
							By.xpath("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'RTGS')]"))
							.click();
				} else if (bankName.equalsIgnoreCase("ICICI")) {

					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[@class=' css-1wa3eu0-placeholder']")).click();
					driver.findElement(
							By.xpath("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'IMPS')]"))
							.click();
				}

			}

			 waitForElement(amount);
			 Elementtobeclickabe(amount).click();
			int num = random.nextInt(90) + 10;
			amount.sendKeys(Integer.toString(num));
			
			if(schedule.equalsIgnoreCase("Weekly"))
			{
				howoften.click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[contains(text(),'Weekly')]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[contains(text(),'Select...')]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[contains(text(),'Mon')]")).click();

			}
			else if(schedule.equalsIgnoreCase("Monthly"))
			{
				howoften.click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[contains(text(),'Monthly')]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[contains(text(),'Select...')]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//form[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"))
						.click();

			}
			else if(schedule.equalsIgnoreCase("Yearly"))
			{
				howoften.click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[contains(text(),'Yearly')]")).click();
				Thread.sleep(2000);
				//driver.findElement(By.xpath("//div[contains(text(),'Select...')]")).click();
				Thread.sleep(2000);
			
				
			}

			if (bankName.equalsIgnoreCase("ALRAJHI") || bankName.equalsIgnoreCase("SABB")
					|| bankName.equalsIgnoreCase("NCB")) {
				By PORCODE = By.xpath(
						"//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Travel Requirements')]|//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Business:Payroll')]|//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Allowance')]");
				POR.click();
				driver.findElement(PORCODE).click();

			}

			 waitForElement(testarea);
			 Elementtobeclickabe(testarea).click();
			 Elementtobeclickabe(testarea).sendKeys("testing");

		
			
						Thread.sleep(2000);
		
			schedulepaybutton.click();
			Thread.sleep(2000);

			
		}

	public void Editamount() throws InterruptedException
	{
		click(Paymentpage.Amount);
		int num = random.nextInt(90) + 10;
		amount.sendKeys(Integer.toString(num));
		Thread.sleep(2000);
		
	schedulepaybutton.click();

	}
	
	

	public void Addtopaymentbuttondirect() throws InterruptedException {
		 click(Paymentpage.AddtoPayment);
	}

	public void Addtopaymentbutton()

	{

		try {
			 waitForElement(closepopup);
			Assert.assertEquals(true, closepopup.isDisplayed());
			 Elementtobeclickabe(closepopup).click();

		} catch (Exception e) {
			System.out.println("pop up not closeing");
		}
		 waitForElement(addpayment);
		Assert.assertEquals(true, addpayment.isDisplayed());
		 Elementtobeclickabe(addpayment).click();

	}
	
	
	
	//*************************Payments New Code******************************************//
	
	public static final By Debitnumber=By.xpath("");
	
	public void SelectDebitAccount(String DebitAccount)
	{
		
		click(Paymentpage.debitaccounts);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
