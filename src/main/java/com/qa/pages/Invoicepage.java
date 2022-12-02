package com.qa.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.WaitFunctions;

public class Invoicepage extends WaitFunctions {

	public Invoicepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	String rnumber = RandomStringUtils.random(1, false, true);
	
	public static final By Invoice=By.xpath("//a[normalize-space()='Invoice']");
	public static final By sales=By.xpath("//span[contains(text(),'Sales')]");
	public static final By CreateInvoice=By.xpath("(//button[@type='submit'][normalize-space()='+ Create invoice'])[1]");
	
	public static final By Date=By.xpath("//input[contains(@name,'createdDate')]");
	public static final By Duedate=By.xpath("//input[contains(@name,'dueDate')]");
	public static final By Invoicetitle=By.name("billedBy");
	
	public static final By clientname=By.name("billedTo");
	public static final By Bankaccounts=By.className(" css-1jqq78o-placeholder");
	public static final By email=By.name("billedEmail");
	public static final By ItemNumber=By.xpath("//div[@class='invoice-tr']/div/input");
	
	public static final By DeductionsSAR=By.xpath("//span[@class='deductionInputField']/input");
	public static final By SaveButton=By.xpath("//button[normalize-space()='Save & continue']");
	


public void createInvoice() throws InterruptedException
{
	click(Invoice);
	click(sales);
	click(CreateInvoice);
	Thread.sleep(3000);
	
	WebElement el=driver.findElement(By.xpath("//input[contains(@name,'createdDate')]"));

	el.sendKeys(Datefunction(el,10));
	Thread.sleep(3000);
	click(Duedate);
	Entertext(Duedate, Datefunction(el,15));
	Entertext(clientname, "AutomationTesting");
	click(email);
	Entertext(email, "pashamda@gmail.com");
	click(ItemNumber);
	List<WebElement> li= driver.findElements(By.xpath("//div[@class='invoice-tr']/div/input"));
	
for (WebElement webElement : li) {
	webElement.sendKeys(rnumber);
	}

Entertext(DeductionsSAR, rnumber);
click(SaveButton);
Thread.sleep(5000);
}

public String Datefunction(WebElement element,int value)
{
	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	Date currentDate = new Date();
	Calendar c = Calendar.getInstance();
	c.setTime(currentDate);
	c.add(Calendar.DATE, value);
	
	// convert calendar to date Date
	Date currentDatePlusOne = c.getTime();
	String currentDat = dateFormat.format(currentDatePlusOne);
	//element.sendKeys(currentDat);
	System.out.println("Date is "+currentDat);
	//return;
	return currentDat;
}

public void RandomNumber()
{
	
}





}