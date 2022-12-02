package com.qa.util;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qa.factory.DriverFactory;
import com.qa.uat.pages.BaseInterface;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitFunctions  {
	 private static final int TIMEOUT = 10;
	    private static final int POLLING = 500;
	    

	    protected WebDriver driver;
	    private WebDriverWait wait;

	    public WaitFunctions(WebDriver driver) {
	        this.driver = driver;
	        wait = new WebDriverWait(driver, TIMEOUT, POLLING);
	        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
	    }
	
		 // waiting 10 seconds for the "foo-button" HTML element to be present on the page, and
		 // checking for its presence after 5 seconds sleep 
	    
	   public void waitForElementvisible( By locator)
	   {
	   
	 WebDriverWait pasha = new WebDriverWait(driver, TIMEOUT, POLLING);
	 pasha.until(ExpectedConditions.presenceOfElementLocated(locator));
	 
	// WebElement fooButton = driver.findElement(locator);
	   }
	    
	    
	    
	    
	    
	    
	    

	public void waitForElement(WebElement element)
	{
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	protected void waitForElementToAppear(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

	
	public void click(By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver,TIMEOUT,POLLING);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));

		
		  // WebDriverWait w = new WebDriverWait(driver, 30);
		//w.until(ExpectedConditions.elementToBeClickable(locator));
		driver.findElement(locator).click();
	}
	
	public void Entertext(By locator,String value)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		driver.findElement(locator).sendKeys(value);
	}
	public void verifytext(By locator)
	{
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		driver.findElement(locator).getAttribute("value");
		System.out.println(	driver.findElement(locator).getAttribute("value"));
	
	
	}
	public void dynamicverifytext(String locator,String ExpectedText)
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
	String text1=	driver.findElement(By.xpath(locator)).getText();
	
	Assert.assertEquals(text1, ExpectedText);
}
	
	
	public void click(String value) throws InterruptedException
	{
		By loca=By.xpath(value);
		WebDriverWait wait = new WebDriverWait(driver, TIMEOUT, POLLING);
		wait.until(ExpectedConditions.presenceOfElementLocated(loca));
		Actions act =  new Actions(driver);
		act.moveToElement(driver.findElement(loca)).click().build().perform();
						
		
	}
	public   void takeScreenShot(String name) {
		 driver = DriverFactory.getDriver();
		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		System.out.println("The screen shot name is "+screenshot+name);
	    
		
	}
	
	
	

	public WebElement waitForElement(WebElement element,int durationInSeconds)
	{
	//	driver=	DriverFactory.getDriver();
		//WebDriverWait wait = new WebDriverWait(driver,  30);
		wait.until(ExpectedConditions.visibilityOf(element));
		
		return element;
		
	}
	public  WebElement Elementtobeclickabe(WebElement element)
	{
		driver=	DriverFactory.getDriver();
		 WebDriverWait wait = new WebDriverWait(driver, 30);
		  wait.until(ExpectedConditions.elementToBeClickable(element));

		  return element;
	}

	public List<WebElement> Elementtobeclickabelist(List<WebElement> element)
	{
		driver=	DriverFactory.getDriver();
		 WebDriverWait wait = new WebDriverWait(driver, 100);
		     wait.until(ExpectedConditions.visibilityOfAllElements(element));
			return element;

		  
	}	
	
	
}
