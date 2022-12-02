package com.qa.uat.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.util.WaitFunctions;

public class SigninandSecuritypage extends WaitFunctions {

	public SigninandSecuritypage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
@FindBy(xpath="//form[@action='#']/div[1]/div[1]/div[1]/input[1]")
public WebElement name;

@FindBy(xpath="//form[@action='#']/div[2]/div[1]/div[1]/input[1]")
public WebElement username;

@FindBy(xpath="//form[@action='#']/div[3]/div[1]/div[1]/input[1]")
public WebElement email;

@FindBy(xpath="//form[@action='#']/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")
public WebElement countrycode;

@FindBy(xpath="//*[@id='signInSecurity']/div/form/div[4]/div/div/div[1]/div[1]/div/div[1]/div[1]/div/img")
public WebElement CountrycodeSelection;

@FindBy(xpath="//form[@action='#']/div[4]/div[1]/div[1]/div[2]/input[1]")
public WebElement phonenumber;

@FindBy(xpath="//button[contains(text(),'Save')]")
public WebElement SaveButton;


//*************************//Admin Two Data//*******************//

@FindBy(xpath="//*[@id='signInSecurity2']//form/div[1]/div/div[1]/input")
public WebElement name2;

@FindBy(xpath="//*[@id='signInSecurity2']/div/form/div[2]/div/div[1]/input")
public WebElement username2;

@FindBy(xpath="//*[@id='signInSecurity2']/div/form/div[3]/div/div[1]/input")
public WebElement email2;

@FindBy(xpath="//*[@id='signInSecurity2']//form[@action='#']/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")
public WebElement countrycode2;

@FindBy(xpath="//*[@id='signInSecurity2']/div/form/div[4]/div/div/div[1]/div[1]/div/div[1]/div[1]/div/img")
public WebElement CountrycodeSelection2;

@FindBy(xpath="//*[@id='signInSecurity2']//form[@action='#']/div[4]/div[1]/div[1]/div[2]/input[1]")
public WebElement phonenumber2;

@FindBy(xpath="//div[@class='alluserBtnRgt']//button[2]")
public WebElement SaveButton2;

@FindBy(xpath="//div[@id='signInSecurity']//div/div/button")
public WebElement FirstadminEdit;


@FindBy(xpath="//div[@id='signInSecurity2']//div/div/button")
public WebElement secondadminEdit;

WaitFunctions w= new WaitFunctions(driver);


public void Adminfilldatasecond() throws InterruptedException
{
	w.waitForElement(secondadminEdit);
	secondadminEdit.click();
	
	w.waitForElement(name2);
	w.waitForElement(name2);
	name2.sendKeys("Secondadmin");

	w.waitForElement(username2);
	username2.sendKeys("Admintwo");
	w.waitForElement(email2);
	email2.sendKeys("Admintwo@gmail.com");
	w.waitForElement(countrycode2);
	countrycode2.click();
	w.waitForElement(CountrycodeSelection2);
	CountrycodeSelection2.click();
	w.waitForElement(phonenumber2);
	phonenumber2.sendKeys("1234512349");
	Thread.sleep(5000);
	w.waitForElement(SaveButton2);
	SaveButton2.click();
	Thread.sleep(5000);
}
public void Adminfilldata() throws InterruptedException
{
	w.waitForElement(FirstadminEdit);
	FirstadminEdit.click();
	
	w.waitForElement(name);
	w.waitForElement(name);
	name.sendKeys("Firstadmin");

	w.waitForElement(username);
	username.sendKeys("Adminone");
	w.waitForElement(email);
	email.sendKeys("apasha5879@yahoo.com");
	w.waitForElement(countrycode);
	countrycode.click();
	w.waitForElement(CountrycodeSelection);
	CountrycodeSelection.click();
	w.waitForElement(phonenumber);
	phonenumber.sendKeys("1234512349");
	Thread.sleep(4000);
	w.waitForElement(SaveButton);
	SaveButton.click();
Thread.sleep(4000);
	
}


}
