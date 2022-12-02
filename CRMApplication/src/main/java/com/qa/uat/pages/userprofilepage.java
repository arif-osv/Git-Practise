package com.qa.uat.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.util.WaitFunctions;

public class userprofilepage extends WaitFunctions{

	public userprofilepage(WebDriver driver) {
		super(driver);
		}
	
	@FindBy(name="companyName")
	public WebElement companaynameenglish;
	
	@FindBy(name="companyNameAr")
	public WebElement companaynamearabic;

	@FindBy(xpath="//*[@id='companyInfo']/form/div/div[3]/div[1]/div/div/div/div[1]/div[1]")
	public WebElement Groupdropdown;
	
	@FindBy(xpath="")
	public WebElement Groupname;
	
	@FindBy(xpath="//*[@id='companyInfo']/form/div/div[5]/div[1]/div/div/div/div[1]")
	public WebElement BusinessType;
	
	@FindBy(xpath="//div[contains(text(),'Food Industries')]")
	public WebElement SelectBusineessType;
	
	
	@FindBy(xpath="//*[@id='companyInfo']/form/div/div[7]/div/div[1]/div[1]/div/div[2]")
	public WebElement licenecetype;
	
	@FindBy(xpath="//div[contains(text(),'Basic')]")
	public WebElement SelectLicenceType;
	
	@FindBy(name="licenseExpiryDate")
	public WebElement LicenceExpirydate;
	
	@FindBy(xpath="//*[@id='companyInfo']/form/div/div[8]/div/div/div/div/div[1]")
	public WebElement numberofadmins;
	
	@FindBy(xpath="//div[contains(text(),'Dual admin')]")
	public WebElement dualadmincheckBox;
	
	@FindBy(xpath="//input[@name='isDualApproval']")
	public WebElement ApprovalmandatorycheckBox;
	
	@FindBy(xpath="//*[@id='companyInfo']/form/div/div[9]/div/div/div/div/div[1]")
	public WebElement ErpService;
	
	@FindBy(xpath="//div[contains(text(),'SAP')]")
	public WebElement SelectErpService ;
	
	@FindBy(xpath="//*[@id='companyInfo']/form/div/div[11]/div[1]/div/div/div/div[1]")
	public WebElement SelectCurrency ;
	
	@FindBy(xpath="//div[contains(text(),'SAR')]")
	public WebElement SelectCurrencyType;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	public WebElement SaveCompanyinfo ;
	
	@FindBy(xpath="//a[@href='/userprofile']")
	public WebElement userprofile;
	
	@FindBy(xpath="//a[@class='btn createBtn']")
	public WebElement addtonewprofile;
	
	WaitFunctions w=new WaitFunctions(driver);
	
	
	public void Companyinfo(String Companyname) throws InterruptedException
	{
		w.Elementtobeclickabe(addtonewprofile).click();
		
		//w.Elementtobeclickabe(userprofile).click();
		
		w.Elementtobeclickabe(companaynameenglish).click();
		w.Elementtobeclickabe(companaynameenglish).sendKeys(Companyname);
		
		w.Elementtobeclickabe(companaynamearabic).sendKeys("العربيالعربيالعربي");
		w.Elementtobeclickabe(Groupdropdown).click();
		
		WebElement Companynames=driver.findElement(By.xpath("//div[contains(text(),'"+Companyname+"')]"));
		Thread.sleep(3000);
		w.Elementtobeclickabe(Companynames).click();
		
		w.Elementtobeclickabe(BusinessType).click();
	
		
		w.Elementtobeclickabe(SelectBusineessType).click();
		w.Elementtobeclickabe(licenecetype).click();
		w.Elementtobeclickabe(SelectLicenceType).click();
		w.Elementtobeclickabe(LicenceExpirydate).click();
		w.Elementtobeclickabe(LicenceExpirydate).sendKeys("12-08-2023");
		w.Elementtobeclickabe(numberofadmins).click();
		w.Elementtobeclickabe(dualadmincheckBox).click();
		

		w.Elementtobeclickabe(ApprovalmandatorycheckBox).click();
		w.Elementtobeclickabe(ErpService).click();
		w.Elementtobeclickabe(SelectErpService).click();
		
		w.Elementtobeclickabe(SelectCurrency).click();
		w.Elementtobeclickabe(SelectCurrencyType).click();
		w.Elementtobeclickabe(SaveCompanyinfo).click();
		Thread.sleep(5000);
		
	}
	

}
