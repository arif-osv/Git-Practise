package com.qa.uat.pages;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;

import com.qa.factory.DriverFactory;
import com.qa.util.AssertionMethods;
import com.qa.util.BaseTest;
import com.qa.util.WaitFunctions;

public class LoginPage extends WaitFunctions {
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name = "userName")
	public static WebElement username;
	
	@FindBy(name = "password")
	public static 	WebElement Password;

	@FindBy(className = "icon-lock")
	public static WebElement signInButton;

	@FindBy(xpath = "//span[@class='userTitle']")
	WebElement usertitle;

	@FindBy(xpath = "//h5[normalize-space()='Sign out']")
	WebElement signout;


	public void doLogin(String un, String pwd) throws InterruptedException {
		Thread.sleep(5000);
		
		waitForElement(username);
		System.out.println("Login user name is"+un);
		username.sendKeys(un);
		Thread.sleep(2000);
		waitForElement(Password);
		Password.sendKeys(pwd);

		waitForElement(signInButton);
		Assert.assertEquals(true, Password.isDisplayed());
		Elementtobeclickabe(signInButton).click();
		
		//Selenium::WebDriver.logger.info('This is info message');
					try
					{
						for (int i = 0; i < 3; i++) {
							System.out.println("trying to close popup");
							
						WebElement searchIcon = driver
								.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div/div[2]/span"));
						waitForElement(searchIcon);
						
					searchIcon.click();
					}
					}
					catch(Exception e)
					{
						System.out.println("popup is not coming");
					}
				
				  
				  
				  

							try
							{
								for (int i = 0; i < 3; i++) {
									
								
								WebElement searchIcon = driver
										.findElement(By.xpath("//button[@class='createBtn']/following-sibling :: span"));
								
							searchIcon.click();
								}
								}
							catch(Exception e)
							{
								
							}
						}				

		// return new Paymentpage(driver);
	

	public void LogoutApplication() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", usertitle);
		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();", signout);
		Thread.sleep(3000);
		

	}
	

}
