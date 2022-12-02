package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.WaitFunctions;

public class Usermanagement  extends WaitFunctions {
	
	RolemanagementPage rolemanagementpage;

	public Usermanagement(WebDriver driver) {
		super(driver);
		} 
	
	
	public static final By Usermanagement=By.xpath("");
	
	
	public void Createnewuser()
	{
		click(rolemanagementpage.Settings);
		
	}

}
