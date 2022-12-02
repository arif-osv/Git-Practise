package com.qa.uat.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.qa.util.WaitFunctions;

public class Rollmanagementpage extends WaitFunctions{

	public Rollmanagementpage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[contains(text(),'Edit')]")
	public WebElement EditRoleButton;
	
	@FindBy(xpath="//a[contains(text(),'+Add new user role')]")
	public WebElement AdminCreaterole;
	
	@FindBy(css="span.userTitle")
	public WebElement username;
	

	@FindBy(xpath="//h5[contains(text(),'Roles')]")
	public WebElement Roles ;

	@FindBy(xpath="//button[@class='createBtn createBtnRole']")
	public WebElement Createrole;

	@FindBy(xpath="//div[@id='roleNameField']//following-sibling::input")
	public WebElement rollname ;

	
	@FindAll(@FindBy(xpath= "//div[@class='roleWrap ']//div//h4//input"))
	private List<WebElement> rollnamecheckBox;	

	@FindBy(xpath="//button[contains(text(),'Create')]")
	public WebElement createroleButton ;
	WaitFunctions w= new WaitFunctions(driver);

	
	public void CreateRoleManager() throws InterruptedException
	{
w.waitForElement(Usermanagement.UserName);
		
		Assert.assertEquals(true, Usermanagement.UserName.isEnabled());
		Usermanagement.UserName.click();
		w.waitForElement(Usermanagement.roles);
		Assert.assertEquals(true, Usermanagement.roles.isEnabled());
		Usermanagement.roles.click();
		w.Elementtobeclickabe(Usermanagement.createnewuser);
		Assert.assertEquals(true, Usermanagement.createnewuser.isEnabled());
		System.out.println("sign in button should be eneabled");
		Thread.sleep(3000);
		Usermanagement.createnewuser.click();
		
		
		
		//w.waitForElement(AdminCreaterole).click();
		w.waitForElement(rollname);
		rollname.click();
		
		w.waitForElement(rollname);
		rollname.sendKeys("Initiator");

		Thread.sleep(2000);
		for (int i = 0; i <rollnamecheckBox.size(); i++) {
			Thread.sleep(2000);
			String rollnames =rollnamecheckBox.get(i).getText();
			Thread.sleep(3000);
			System.out.println(rollnames);
			rollnamecheckBox.get(i).click();
			Thread.sleep(2000);
			
		}
		w.waitForElement(createroleButton);
		createroleButton.click();
		
	}
	
	
}
