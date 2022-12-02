package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.WaitFunctions;

public class Addaccounts extends WaitFunctions {
	

	public Addaccounts(WebDriver driver) {
		super(driver);
	} 
	
	public static final By HamberIcon = By.xpath("//button[contains(text(),'Add to payments')]");
	public static final By Settings=By.xpath("//*[@id='root']/div/div[3]/div[1]/div/div/div/nav/ul/li[8]");
	public static final By BankAccounts=By.xpath("//*[@class='activeSideNav']");
	public static final By AddBankAccount=By.xpath("//button[@class='createBtn createBtnRole btn']");
	
	public static final By Bankname=By.xpath("//img[@alt='Saudi Central Bank']");
	
	public void settings() throws InterruptedException
	{
		click(Settings);
		Thread.sleep(5000);
		click(BankAccounts);
		Thread.sleep(10000);
		
	}
	public void AddBankAccount() throws InterruptedException
	{
		//click(HamberIcon);
		click(AddBankAccount);
		Thread.sleep(5000);
		
	}
	public void Bankname() throws InterruptedException
	{
		Thread.sleep(5000);
		click(Bankname);
		Thread.sleep(5000);
		
	}
	
	public void permission(String permission) throws InterruptedException
	{
		List<WebElement> Accountpermision= driver.findElements(By.xpath("//div[@class='openBankPermissionLst']//div/label/input"));
		for (int i=0;i<=Accountpermision.size();i++) {
			if(permission.contains("Bank account details")&&i==0)
			{
				Accountpermision.get(i).click();
			}
			if(permission.contains("")&&i==1)
			{
				Accountpermision.get(i).click();
			}
			}
		System.out.println("not ac");
		click(String.format(Approvalpage.Dynamicxpath, "Allow"));
	}

}
