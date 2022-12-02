package com.qa.pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.WaitFunctions;

public class DebitAccounts extends WaitFunctions{

	public DebitAccounts(WebDriver driver) {
		super(driver);
	}
	
	
	
	public void SelectDebitAccount(String DebitAccountNumber) throws InterruptedException
	{
		WebDriverWait wait= new WebDriverWait(driver, 45);
		
		
		List<WebElement> li=driver.findElements(By.xpath("//div[@class='benAccNum']"));
		for (WebElement we : li) {
			System.out.println("Single accounts are"+we.getText());
			if(we.getText().contains(DebitAccountNumber))
			{
				wait.until(ExpectedConditions.visibilityOf(we));
				
				we.click();
			}
			else
			{
				List<WebElement> lis=driver.findElements(By.xpath("//form/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div/div/div[2]/span[2]"));
				for (WebElement wes : lis) {
					wait.until(ExpectedConditions.visibilityOf(wes));
					wes.click();
					for (WebElement wwe : li) {
					wait.until(ExpectedConditions.visibilityOf(wwe));
						
						System.out.println("Single accounts are"+wwe.getText());
					}
				}
				
			}
		}
	}
	public void SDA(String DebAC)
	{
		List<WebElement> list1=driver.findElements(By.xpath("//div[@class='benAccNum']"));
		List<WebElement> list2=driver.findElements(By.xpath("//form/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div/div/div[2]/span[2]"));
		
		//list1 = list1.stream().filter(Str1-> 
        //list2.stream().map(x->x.getStr()).collect(Collectors.toSet())
        //.contains(str1)).collect(Collectors.toList());
		
		Iterator<WebElement> deptIterator = list1.iterator();
		Iterator<WebElement> empIterator = list2.iterator();
		while (deptIterator.hasNext() && empIterator.hasNext())
		{
			
			WebElement dept = deptIterator.next();
			WebElement emp = empIterator.next();
		System.out.println("the text"+dept.getText());
			emp.getText();
		}
		
		List<WebElement> unavailable = list1.stream()
                .filter(e -> !list2.contains(DebAC))
                .collect(Collectors.toList());
		
		}
}
