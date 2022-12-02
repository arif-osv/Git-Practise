package com.qa.uat.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.pages.Approvalpage;
import com.qa.pages.Paymentpage;
import com.qa.util.WaitFunctions;

public class SadadPayment extends WaitFunctions{

	public SadadPayment(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public static final By subnumber=By.name("subscriberNum");
	
	public void CreateSadadbill(String debitaccount) throws InterruptedException
	{
		Thread.sleep(5000);
		click(String.format(Approvalpage.Dynamicxpath, "Bills & utilities"));
		Thread.sleep(3000);
		click(String.format(Approvalpage.Dynamicxpath, "Create Bill & MOI"));
		Thread.sleep(3000);
		click(Paymentpage.debitaccounts);
		Thread.sleep(3000);
		click(String.format(Approvalpage.Dynamicxpath, debitaccount));
		Thread.sleep(3000);
		WebElement sel=driver.findElement(By.xpath("//div[@class='createPaymentBody sadadBillsBody']//label[contains(text(),'Bill category')]//following-sibling::div"));
		sel.click();
		//click(String.format(Approvalpage.Dynamicxpath, "//input[@name='fk_Bill_Category']//preceding-sibling::div"));
		Thread.sleep(3000);
		
		click(String.format(Approvalpage.Dynamicxpath, "Government Services"));
		Thread.sleep(3000);
		WebElement selq=driver.findElement(By.xpath("//div[@class='createPaymentBody sadadBillsBody']//label[contains(text(),'Biller')]//following-sibling::div"));
		selq.click();
		Thread.sleep(3000);
		click(String.format(Approvalpage.Dynamicxpath, "049 - Saudi Standards Metrology and Quality Organization"));
		Thread.sleep(3000);
		Entertext(subnumber, "");	
		click(String.format(Approvalpage.Dynamicxpath,"Search bill"));
	}
	
	
}
