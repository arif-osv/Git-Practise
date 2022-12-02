package com.qa.uat.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.factory.DriverFactory;
import com.qa.util.WaitFunctions;

public class BulksadadPage {

	private WebDriver driver;

	paymentpage payments = new paymentpage(DriverFactory.getDriver());
	WaitFunctions w = new WaitFunctions(driver);

	public BulksadadPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/payments/bulkBills']")
	WebElement Bulksadad;

	@FindBy(xpath = "//a[@href='/payments/bulkBills/upload']")
	WebElement uploadsadad;

	@FindBy(xpath = "//a[@href='/payments/bulkBills/pending']")
	WebElement Bulksadadpending;

	@FindBy(xpath = "//div[@class='table-tr ']")
	WebElement dotcursur;
	
	
@FindBy(xpath="//button[@type='submit']")
	WebElement otpapprovebutton;



@FindBy(xpath="//button[@class='btn approveBtn success']")
	WebElement approvebutton;
	@FindBy(xpath="//textarea[@name='comments']")
	WebElement comments;	
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement approveconform;
	
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	WebElement continuee;
	
	@FindBy(xpath = "//input[@name='otp']")
	WebElement Otpblock;

	@FindBy(xpath = "(//a[normalize-space()='Upload bills'])[1]")
	WebElement uploadbill;

	@FindBy(xpath = "//form[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	WebElement selectdebitac;

	@FindBy(xpath = "//div[contains(text(),'NCB - NCB - 05100...96502')]")
	WebElement DebitAccountno;

	@FindBy(xpath = "//input[@id='fileName']")
	WebElement PaymentSheet;

	@FindBy(css = "textarea[placeholder='Write description']")
	WebElement Description;

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	WebElement clearbulkdata;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement bulksubmit;

	@FindBy(xpath = "//form[1]/div[2]/div[1]/div[1]/div[1]")
	WebElement Selectbillcategory;

	@FindBy(xpath = "//div[contains(text(),'Government Services')]")
	WebElement billcstegotyno;

	@FindBy(xpath = "//form[1]/div[3]/div[1]/div[1]/div[1]")
	WebElement Biller;

	@FindBy(xpath = "//div[contains(text(),'049 - Saudi Standards Metrology and Quality Organi')]")
	WebElement BillerID;

	public void clickonpayments() {

		w.Elementtobeclickabe(payments.paymentlink);
		payments.paymentlink.click();

		w.Elementtobeclickabe(Bulksadad);
		Bulksadad.click();

		w.Elementtobeclickabe(uploadsadad).click();
	}

	public void approve() throws InterruptedException {
		Thread.sleep(2000);
		w.Elementtobeclickabe(payments.paymentlink);
		payments.paymentlink.click();

		w.Elementtobeclickabe(Bulksadad);
		Bulksadad.click();

		w.Elementtobeclickabe(Bulksadadpending);
		Bulksadadpending.click();

		w.Elementtobeclickabe(dotcursur);
		dotcursur.click();
w.Elementtobeclickabe(approvebutton);
		approvebutton.click();
		
		w.Elementtobeclickabe(comments);
		comments.sendKeys("Bill Approved");
		w.Elementtobeclickabe(approveconform);		
		approveconform.click();
		Thread.sleep(3000);
	}
	public void OTPapprove() throws InterruptedException {
		w.Elementtobeclickabe(payments.paymentlink);
		payments.paymentlink.click();

		w.Elementtobeclickabe(Bulksadad);
		Bulksadad.click();

		w.Elementtobeclickabe(Bulksadadpending);
		Bulksadadpending.click();

		w.Elementtobeclickabe(dotcursur);
		dotcursur.click();
w.Elementtobeclickabe(approvebutton);
		approvebutton.click();
		
		Thread.sleep(3000);
		w.Elementtobeclickabe(continuee);
		continuee.click();
w.Elementtobeclickabe(Otpblock);
Otpblock.click();
		
		w.Elementtobeclickabe(Otpblock);
		Otpblock.sendKeys("123456");

		w.waitForElement(otpapprovebutton);
		Assert.assertEquals(true, otpapprovebutton.isDisplayed());
		w.Elementtobeclickabe(otpapprovebutton).click();
		Thread.sleep(5000);		

		
		
	}

	public void SelectDebitaccount() {
		w.Elementtobeclickabe(selectdebitac);
		selectdebitac.click();
		w.Elementtobeclickabe(DebitAccountno);
		DebitAccountno.click();

	}

	public void BillCategory() {
		w.Elementtobeclickabe(Selectbillcategory);
		Selectbillcategory.click();
		w.Elementtobeclickabe(billcstegotyno);
		billcstegotyno.click();

	}

	public void BillerID() {
		w.Elementtobeclickabe(Biller);
		Biller.click();
		w.Elementtobeclickabe(BillerID);
		BillerID.click();

	}

	public void selectpaymentsheet() throws InterruptedException {
		Thread.sleep(2000);
		// JavascriptExecutor executor = (JavascriptExecutor)driver;
		// executor.executeScript("arguments[0].click();", PaymentSheet);
		PaymentSheet.sendKeys("C:\\Users\\Varuna\\Desktop\\sadad_bulk_sample.xlsx");
	}

	public void Continue() {
		w.Elementtobeclickabe(bulksubmit);
		bulksubmit.click();

	}
}
