package com.qa.uat.pages;

import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.util.AssertionMethods;
import com.qa.util.WaitFunctions;


public interface BaseInterface    {
	public static final WebDriver driver = DriverFactory.getDriver();
	
//	WaitFunctions w=new WaitFunctions(driver);
	//AssertionMethods assertions = new AssertionMethods();
	
//	LoginPage login = new LoginPage(DriverFactory.getDriver());
	Approvalpages approvalpage= new Approvalpages(DriverFactory.getDriver());
	paymentpage payments= new paymentpage(DriverFactory.getDriver());
	
	//Screenshotpage sc= new Screenshotpage();
	
	

}
