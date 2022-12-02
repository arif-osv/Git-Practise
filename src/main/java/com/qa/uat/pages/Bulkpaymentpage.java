package com.qa.uat.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.pages.Paymentpage;
import com.qa.util.WaitFunctions;

public class Bulkpaymentpage extends WaitFunctions   {

	public Bulkpaymentpage (WebDriver driver)
	{
		super(driver);
	}

	public static final By selectdebitac=By.xpath("//span[@class='selectedItem undefined']");
	public static final By allaccounts=By.xpath("//input[@name='all']");

	public static final By PaymentSheet=By.xpath("//input[@id='fileName']");
	public static final By Description=By.xpath("//textarea[@placeholder='Write description']");
	public static final By clearbulkdata=By.xpath("//button[normalize-space()='Clear']");
	public static final By bulksubmit=By.xpath("//button[@type='submit']");

	
	
	
	
	
	   public void paymentduedate() throws InterruptedException
	    {
	    	Thread.sleep(4000);

			DateFormat dateFormat = new SimpleDateFormat("MMMMM d, yyyy");

			Date currentDate = new Date();
			System.out.println(dateFormat.format(currentDate));

			// convert date to calendar
			Calendar c = Calendar.getInstance();
			c.setTime(currentDate);

			c.add(Calendar.DATE, 5); // convert calendar to date Date
			Date currentDatePlusOne = c.getTime();
			String currentDat = dateFormat.format(currentDatePlusOne);
			driver.findElement(By.xpath("//input[@name='dueDate']")).sendKeys(currentDat);
			Thread.sleep(2000);
	    }
	    public void description_English() throws InterruptedException
	    {
	    	click(Description);
			Entertext(Description,"Testing");
	 	 	
	    }
	    public void description_Arabic() throws InterruptedException
	    {
	    	Thread.sleep(4000);
			driver.findElement(By.cssSelector("textarea[placeholder='Write description']")).click();
			WebElement createac = driver.findElement(By.cssSelector("textarea[placeholder='Write description']"));
			createac.sendKeys("تطبيق اختبار عرض واحد");
		
	    }
	    public void clearbulkdata() throws InterruptedException
	    {
	    	click(clearbulkdata);
		
	      	}

	    public void uploaddata() throws InterruptedException
	    {
	    	click(bulksubmit);
		
	    	    
	    }
	    
		public void overviewlink() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("a[href='/user_overview']")).click();
		}
		
		public void bulkapprovebutton() throws InterruptedException
		{
		
			Thread.sleep(4000);
			driver.findElement(By.xpath("//button[normalize-space()='Approve']")).click();
			
		}
		public void commentsonapprovebox() throws InterruptedException
		{
		
			Thread.sleep(4000);
			driver.findElement(By.cssSelector("textarea[name='comments']")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("textarea[name='comments']")).sendKeys("Bulk approved");
			
		}
		public void bulkpayment() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='upcoming']/div/div[2]/button[4]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/aside[2]/div[1]/div[2]/div[2]/div/button[1]")).click();
			Thread.sleep(2000);
			
		}
		public void Approvebox() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("button[type='submit']")).click();
			Thread.sleep(3000);
		
			
		}
		 public void selectDebitaccountsecond() throws InterruptedException
		 
		 {
			
			 click(selectdebitac);
			 click(allaccounts);
			 click(selectdebitac);
					
		 }

		
		public void uploadtextverify() throws InterruptedException
		{
			Thread.sleep(10000);
			String text =driver.findElement(By.xpath("//h1[contains(text(),'Upload successful')]")).getText();
			System.out.println("Text present is "+text);
		}
		
		public void Description()
		{
			String description = driver.findElement(By.cssSelector("textarea[placeholder='Write description']")).getText();
			  Assert.assertEquals(description, "Write description");
		}
		

	public void acceptandupload() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='btn-primary btn-approve w-100 uploadButton']")).click();
		Thread.sleep(20000);
	}

	
	 public void selectpaymentsheet() throws InterruptedException
	    {
	    	Thread.sleep(2000);
	    driver.findElement(PaymentSheet).sendKeys("C:\\Users\\pasha\\Desktop\\bulk_sample_ANB_100.xlsx");
	 	}
	

	
	 public void selectDebitaccount() throws InterruptedException
	 {
		 click(selectdebitac);
		 click(allaccounts);
		 click(selectdebitac);
				
	 }
	 
	 

}
