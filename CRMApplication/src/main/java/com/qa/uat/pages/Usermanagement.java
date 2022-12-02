package com.qa.uat.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.factory.DriverFactory;
import com.qa.util.AssertionMethods;
import com.qa.util.WaitFunctions;

public class Usermanagement {

	private WebDriver driver;
	WaitFunctions w = new WaitFunctions(driver);

	
	@FindBy(xpath="//span[@class='userTitle']")
	 public static WebElement UserName;
	
	@FindBy(xpath="//h5[normalize-space()='Users']")
	public static WebElement usermanagement;
	
	@FindBy(xpath="//h5[normalize-space()='Roles']")
	 public static WebElement roles;
	
	@FindBy(xpath="//button[@class='createBtn createBtnRole']")
	public static WebElement createnewuser;
	
	@FindBy(xpath="//h3[@class='editTitle isRolePopupTitle']")
	public static WebElement createnewuserpopup;
	
	@FindBy(css="[name='name']")
	public static WebElement newusername;
	

	@FindBy(css="[name='email']")
	public static WebElement EmailId;

	@FindBy(xpath="//input[@name='phone']")
	public static WebElement mobilenumber;
	
	@FindBy(xpath="//form/div[1]/div/div[2]/div[2]/div[3]/div/div[1]/div[1]/div/div[1]/div[2]/div/input")
	 public static WebElement Countrycodebox;

	@FindBy(xpath="//img[@src='/assets/images/countryFlags/uae.png']")
	 public static WebElement Countrycode;

	@FindBy(xpath="//form[1]/div[1]/div[1]/div[2]/div[2]/div[4]/input[1]")
	public static WebElement NationalId;

	@FindBy(css="[name='name']")
	public static WebElement DailyAproval;
	
	@FindBy(xpath="//form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]")
	public static WebElement clickrole;
	
	@FindBy(xpath="//div[@class='createNewUser']//div[2]//div[@id='react-select-25-option-3']")
	public static WebElement Selectrole;
	
	
	@FindBy(xpath="//*[@id='userManagement']/div/div/div[2]/a")
	public  static WebElement Addmoreusers;
	
	
	@FindBy(xpath="//input[@id='react-select-84-input']")
	public static WebElement Dailyapproval;
	
	@FindBy(xpath=" //div[contains(text(),'SAR')]")
	public static WebElement DailyapprovalCurrency;
	
	@FindBy(xpath="//input[@name='fundTransferLimit.amount']")
	public static WebElement Currencylimit;
	
	@FindBy(xpath="//input[@name='walletFundTransferLimit.amount']")
	public static WebElement walletAmount;
	
	
	
	
	
	
	
	public Usermanagement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Createnewuser() throws InterruptedException
	{
	
		w.waitForElement(UserName);
		
		Assert.assertEquals(true, UserName.isEnabled());
		UserName.click();
		w.waitForElement(usermanagement);
		Assert.assertEquals(true, usermanagement.isEnabled());
		usermanagement.click();
		w.Elementtobeclickabe(createnewuser);
		Assert.assertEquals(true, createnewuser.isEnabled());
		System.out.println("sign in button should be eneabled");
		Thread.sleep(3000);
		createnewuser.click();
		
	}
	public void filluserdeatils() throws InterruptedException
	{
		
		
//w.waitForElement(Addmoreusers);
//Addmoreusers.click();
		//	newusername.click();

//w.waitForElement(Addmoreusers);
		
		//Assert.assertEquals(true, newusername.isDisplayed());
		newusername.click();
		newusername.sendKeys("Osv");
		w.waitForElement(EmailId);
		Assert.assertEquals(true, EmailId.isDisplayed());
		EmailId.click();
		EmailId.sendKeys("pashamda@gmail.com");
		
		
		w.Elementtobeclickabe(Countrycodebox);
		Assert.assertEquals(true, Countrycodebox.isEnabled());
		Countrycodebox.click();
		
		w.Elementtobeclickabe(Countrycode);
		Assert.assertEquals(true, Countrycode.isEnabled());
		Countrycode.click();
		w.Elementtobeclickabe(mobilenumber);
		Assert.assertEquals(true, mobilenumber.isEnabled());
		mobilenumber.sendKeys("1234123423");
		
		w.Elementtobeclickabe(NationalId);
		Assert.assertEquals(true, NationalId.isEnabled());
		NationalId.sendKeys("1234123423");
		
		/*
		 * w.Elementtobeclickabe(clickrole); Assert.assertEquals(true,
		 * clickrole.isEnabled()); //clickrole.click();
		 * 
		 * Thread.sleep(4000); clickrole.sendKeys("Reviewer");
		 * clickrole.sendKeys(Keys.DOWN); clickrole.sendKeys(Keys.RETURN);
		 */
	
		w.Elementtobeclickabe(Dailyapproval);
		Assert.assertEquals(true, Dailyapproval.isEnabled());
		Dailyapproval.click();
	
		w.Elementtobeclickabe(DailyapprovalCurrency);
		Assert.assertEquals(true, DailyapprovalCurrency.isEnabled());
		DailyapprovalCurrency.click();
	
		w.Elementtobeclickabe(Currencylimit).click();
		Assert.assertEquals(true, Currencylimit.isEnabled());
		Currencylimit.sendKeys("50000");
	
		w.Elementtobeclickabe(walletAmount);
		Assert.assertEquals(true, walletAmount.isEnabled());
		walletAmount.sendKeys("1000");
	
		
	}

}
