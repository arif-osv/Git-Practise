package com.qa.uat.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.qa.util.WaitFunctions;

public class Dualadminpage extends WaitFunctions {
	
	public Dualadminpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//a[@href='/masterdata']")
	public WebElement masterdata;
	
	@FindBy(xpath="//a[@href='/masterdata/groups/create']")
	public WebElement createGroup;
	
	@FindBy(name="english")
	private WebElement Englishname;
	
	@FindBy(name="arabic")
	public WebElement arabic;
	
	@FindBy(xpath="//div[contains(text(),'Select')]")
	public WebElement CurrencySelect;
	
	@FindBy(xpath="//div[contains(text(),'SAR')]")
	public WebElement Currency;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement Addgroup;
	
	@FindBy(xpath="//a[@href='/userprofile']")
	public WebElement userprofile;
	
	@FindBy(name="search")
	public WebElement profilesearch;
	
	@FindBy(xpath="//div[@class='inpGroup']//button")
	public WebElement SearchButton;
	
	@FindBy(className = "icon-eye-view iconEye")
	public WebElement searchicon;
	
	@FindBy(xpath="//form[@action='#']/div[4]/div[1]/div/div[1]/div[1]")
	public WebElement dualadmin;
	
	@FindBy(xpath="//*[contains(text(),'Dual Admin')]")
	public WebElement SelectyDualAdmin;

	WaitFunctions w= new WaitFunctions(driver);
	public void CreateGroupforSUperAdmin() throws InterruptedException
	{
		w.waitForElement(masterdata);
		w.Elementtobeclickabe(masterdata).click();
		w.Elementtobeclickabe(createGroup).click();
		w.waitForElement(Englishname);
		Englishname.sendKeys("IftekharOSV");
		w.waitForElement(arabic);
		arabic.sendKeys("العربيالعربيالعربي");
		w.Elementtobeclickabe(CurrencySelect).click();
		w.Elementtobeclickabe(Currency).click();
		w.Elementtobeclickabe(dualadmin).click();
		w.Elementtobeclickabe(SelectyDualAdmin).click();
		
		
		w.Elementtobeclickabe(Addgroup).click();
		Thread.sleep(10000);
		
	}

public void OpenCreateGroup() throws InterruptedException
{
	Thread.sleep(5000);
	w.Elementtobeclickabe(userprofile).click();
	//w.Elementtobeclickabe(profilesearch).click();
	//w.Elementtobeclickabe(profilesearch).sendKeys("Testingsample");
	Thread.sleep(5000);
	//w.Elementtobeclickabe(SearchButton).click();
	//w.Elementtobeclickabe(searchicon).click();
		
}
	

}
