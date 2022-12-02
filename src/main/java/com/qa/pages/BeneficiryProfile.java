package com.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.pages.Approvalpage;
import com.qa.util.WaitFunctions;

public class BeneficiryProfile extends WaitFunctions {

	public BeneficiryProfile(WebDriver driver) {
		super(driver);
		}
	String beneficiarynumber = RandomStringUtils.random(22, false, true);
	String Beneficiryname=randomString();
	public static final By Beneficiries=By.xpath("//ul[@class='isFlexColumn']//a[contains(text(),'Beneficiaries')]");
	public static final By Selectbank=By.xpath("//div[contains(text(),'Select bank')]");
	public static final By BankNamess=By.xpath("//div[contains(text(),'ACUITY SECURITIES LIMITED')]");

	public static final By ANB=By.xpath("//div[@class='selectOptionFont css-b62m3t-container']//*[contains(text(),'ANB')]");
	public static final By Name=By.xpath("//input[@placeholder='Select or Add beneficiary name']");
	public static final By IbanNumber=By.xpath("(//div[@class='formControl']//label/following-sibling::div/input[@name='account_number'])[2]");
	public static final By Category=By.xpath("(//div[contains(text(),'Select category')])[2]");
	public static final By Categoryname=By.xpath("(//*[contains(text(),'Vendor')])[3]");
	public static final By Address=By.xpath("//input[contains(@name,'address')]");
	public static final By addbeneficiries=By.xpath("//button[normalize-space()='Add to beneficiaries']");
	public static final By International=By.xpath("(//input[@name='type'])[2]");
	public static final By Swiftcode=By.xpath("//input[contains(@name,'ifscCode')]");
	public  void createlocal(String type) throws InterruptedException, AWTException
	{
		waitForElementvisible(Beneficiries);
		click(Beneficiries);
		
		if(type.equalsIgnoreCase("International"))
		{
			click(String.format(Approvalpage.Dynamicxpath, "+ Add beneficiary"));
			Actions ob = new Actions(driver);
			ob.click(driver.findElement(International));
			Action action = ob.build();
			action.perform();
			
			ob.click(driver.findElement(Selectbank));
			Action action1 = ob.build();
			action1.perform();
			Thread.sleep(5000);
			ob.moveToElement(driver.findElement(BankNamess));
			ob.click().build().perform();
			
		
		}
		click(String.format(Approvalpage.Dynamicxpath, "+ Add beneficiary"));
		
		Thread.sleep(5000);
		Actions ob = new Actions(driver);
		ob.click(driver.findElement(Selectbank));
		Action action = ob.build();
	action.perform();
		
	Actions obs = new Actions(driver);
	obs.click(driver.findElement(ANB));
	Action actionone = ob.build();
    actionone.perform();
	
		Thread.sleep(2000);
		
		Actions obss = new Actions(driver);
		obss.click(driver.findElement(Name));
		//Action actio= obss.build();
			//actio.perform();
		waitForElementvisible(Name);
		
			
			driver.findElement(Name).sendKeys(Beneficiryname);
		
			Thread.sleep(2000);
			ob.click(driver.findElement(IbanNumber));
			 ob.build().perform();
			String benenumber=beneficiarynumber;
			//ob.sendKeys(benenumber);
			driver.findElement(IbanNumber).sendKeys("SA"+beneficiarynumber);
			
			ob.moveToElement(driver.findElement(Category));
			ob.click().build().perform();
			ob.moveToElement(driver.findElement(Categoryname));
			ob.click().build().perform();
			if(type.contains("International"))
			{
				ob.click(driver.findElement(Swiftcode));
				 ob.build().perform();
			
				driver.findElement(Swiftcode).sendKeys(benenumber);
			
			}
			
			ob.click(driver.findElement(Address));
			 ob.build().perform();
		
			driver.findElement(Address).sendKeys(benenumber);
			
			
			
			ob.moveToElement(driver.findElement(addbeneficiries));
			ob.click().build().perform();
		
			Thread.sleep(20000);
			
		}
	
	public static String randomString()
	{

		Random random = new Random();
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		// create random string builder
		StringBuilder sb = new StringBuilder();

		// specify length of random string
		int length = 3;

		for (int i = 0; i < length; i++) {

			// generate random index number
			int index = random.nextInt(alphabet.length());

			// get character specified by index
			// from the string
			char randomChar = alphabet.charAt(index);

			// append the character to string builder
			sb.append(randomChar);
		}

		String randomString = sb.toString();
		return randomString;
	}


}
