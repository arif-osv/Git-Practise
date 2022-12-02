package com.qa.uat.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.factory.DriverFactory;
import com.qa.util.WaitFunctions;

public class SchedulepaymentPage {

	private WebDriver driver;
	

	public SchedulepaymentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	

}
	
	@FindBy(partialLinkText = "Schedule payments")
	WebElement Schedulepayment;

//	WaitFunctions w= new WaitFunctions(DriverFactory.getDriver());
	
}