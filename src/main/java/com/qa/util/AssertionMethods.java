package com.qa.util;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.factory.DriverFactory;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class AssertionMethods extends WaitFunctions {
	
	
	public AssertionMethods(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/*
	 * public AssertionMethods(WebDriver driver) { super(driver); // TODO
	 * Auto-generated constructor stub }
	 */
//	private WebDriver driver;
	WaitFunctions w= new WaitFunctions(driver);
	

	
	
	
    public void assertElementsIsDisplayed(WebElement element, String message) {
    	boolean elementfound = false;
    	try {
    	//	elementfound = w.waitForElement(element).isDisplayed();
    	} catch (TimeoutException exp) {
    		//Logging.logger.error("Exception: " + exp.getCause().toString());
    	}
        Assert.assertTrue(elementfound, message +". Unable to locate element: " + element);
    }
    
    public void assertElementIsDisplayed(WebElement element, String message,int durationInseconds) {
    	boolean elementFound = false;
    	try {
    		elementFound = w.waitForElement(element,durationInseconds).isDisplayed();
    	} catch (TimeoutException exp ) {
    	//	Logging.logger.error("Exception: " + exp.getCause().toString());
    	}
    	Assert.assertTrue(elementFound, message+ ". Unable to locate element: " + element);
    }
	
    public  void assertElementdisplayed(WebElement element) {
    	boolean elementFound = false;
    	try {
    	//	elementFound = w.waitForElement(element).isDisplayed();
    	} catch (TimeoutException exp ) {
    	//	Logging.logger.error("Exception: " + exp.getCause().toString());
    	}
    	Assert.assertTrue(elementFound,  ". Unable to locate element: " + element);
    }
	
	
	
	
}
