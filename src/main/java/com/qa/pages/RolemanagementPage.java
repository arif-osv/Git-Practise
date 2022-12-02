package com.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.WaitFunctions;

public class RolemanagementPage extends WaitFunctions {

	public RolemanagementPage(WebDriver driver) {
		super(driver);
		
	}

	public static final  By Settings=By.xpath("//ul[@class='isFlexColumn']//a[contains(text(),'Settings')]"); 
	public static final By Createrole=By.xpath("//button[normalize-space()='+ Create role']");
	public static final By users=By.xpath("//span[contains(text(),'Users')]");
	public static final By Createnewuser=By.xpath("//button[normalize-space()='+ Create new user']");
	public static final By rolename=By.xpath("//input[@name='roleName']");
	public static final By username=By.xpath("//input[@name='name']");
	public static final By Email=By.name("email");
	public static final By Phone =By.name("phone");
	public static final By NationalId =By.name("nationalId");
	public static final By SelectRole=By.xpath("//div[@id='roleId']/div/div/div[2]");
	public static final By Rolename=By.xpath("//div[@class=' css-qc6sy-singleValue'][contains(text(),'Initiator')]");
	
	
	
	public static final By rolesec=By.xpath("//div[@class='checkBoxListColumn']//h4/input");
	
	
	public void CreateRolemanagement() throws InterruptedException
	{
		click(Settings);
		click(String.format(Approvalpage.Dynamicxpath,"Roles"));
		click(Createrole);
		click(rolename);
		Entertext(rolename, "Automation");
		}
	public void rolesselection() throws InterruptedException
	{
		List<WebElement> li= driver.findElements(By.xpath("//div[@class='checkBoxListColumn']//h4//input"));
		for (WebElement element : li) {
			System.out.println(element.getText());
			
			if(element.getText().equalsIgnoreCase("Beneficiaries"));
			{
				System.out.println("matched text");
			element.click();
			Thread.sleep(5000);
			}
		}
	}
	public void createrole() throws InterruptedException
	{
		click(String.format(Approvalpage.Dynamicxpath,"Create"));

		Thread.sleep(5000);
	}
	
	public void createnewuser() throws InterruptedException
	{
		click(Settings);
		click(users);
		click(Createnewuser);
		click(username);
		Entertext(username, "Automation");
		Entertext(Email, "Automation");
		Entertext(Phone, "123432123");
		Entertext(NationalId, "123123123");
		Thread.sleep(5000);
		click(SelectRole);
		//click(Rolename);
		Thread.sleep(10000);
		WebElement ele=driver.findElement(By.xpath("//input[@id='react-select-33-input']"));
		
		ele.sendKeys(Keys.DOWN);
		ele.sendKeys(Keys.RETURN);
		Thread.sleep(10000);
	}
	
}
