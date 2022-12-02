package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.SendKeysAction;

import com.qa.factory.DriverFactory;
import com.qa.pages.BeneficiryProfile;
import com.qa.util.WaitFunctions;


public class Approvalpage extends WaitFunctions {
	

	public Approvalpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public   void takeScreenShot(String name) {
		 driver = DriverFactory.getDriver();
		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		System.out.println("The screen shot name is "+name);
	    
		
	}

	public static final By HamberIcon = By.xpath("//button[contains(text(),'Add to payments')]");

	public static final String Dynamicxpath = "//*[contains(text(),'%s')]";

	public static final By Icondots = By.xpath("//div[@class='actionSection']/div");
	public static final String ApproveButton = "//button[contains(text(),'%s')]";

	public static final By Commenets = By.name("comments");

	public static final By OTP = By.name("otp");
	
	public static final By Authpopupname=By.xpath("//div[@class='transactionDetails isPopupContainer']/div/h3");

	public static final By ham=	By.xpath("//div[@class='isNavigation isAnimation']");
	
	public boolean isElementPresent(By locatorKey) {
	    try {
	        driver.findElement(locatorKey);
	        return true;
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	        return false;
	    }
	}

	
	public void checkBoxApproval(String Paymenttype, String TransferType,String Decision) throws InterruptedException {
		
	
	
		click(Paymentpage.payment);
		//click(Paymentpage.transfers);
		System.out.println("Selected Payment type is " + Paymenttype);
		click(String.format(Dynamicxpath, Paymenttype));
		takeScreenShot(Paymenttype);

		click(String.format(Dynamicxpath, TransferType));
		takeScreenShot(TransferType);

		click(Icondots);
		Thread.sleep(500);
		takeScreenShot(Decision);

		Thread.sleep(500);
		click(String.format(Dynamicxpath, Decision));
		
		if(driver.findElements(Authpopupname).size()!=0)
		{
			click(String.format(Dynamicxpath, "Continue"));
			click(OTP);
			Entertext(OTP, "123456");
		}
		
		takeScreenShot(Decision);
		click(String.format(ApproveButton, Decision));
		takeScreenShot(Decision);
		Thread.sleep(3000);
		takeScreenShot(Decision);

	}
	public static By DynamicElement(final String Values, final String Type) {
		By by = null;
		by = By.xpath(Values.replace("Type", Type));
		return by;

	}
	public void Approval(String Decision) throws InterruptedException
	{
		click(BeneficiryProfile.Beneficiries);
		click(String.format(Dynamicxpath, "Pending"));
		
		click(Icondots);
		Thread.sleep(500);
		takeScreenShot(Decision);

		Thread.sleep(500);
		click(String.format(Dynamicxpath, Decision));
		takeScreenShot(Decision);
		Thread.sleep(3000);
	
	}

}
