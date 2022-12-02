package com.qa.pages;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.fasterxml.jackson.core.JsonParser;
import com.google.gson.Gson;
import com.qa.util.WaitFunctions;

public class Supportdashboard  extends WaitFunctions {
	

	public Supportdashboard(WebDriver driver) {
		super(driver);
	} 
	
	public static final By HamberIcon = By.xpath("//button[contains(text(),'Add to payments')]");
	
	public static final By Supportlink=By.xpath("//*[@id='root']/div/div[3]/div[1]/div/div/div/nav/ul/li[7]/div/div");

public static final By MuleApi=By.xpath("//*[@id='root']/div/div[3]/div[2]/nav/ul/li[6]/a");

public static final By TransactionType=By.xpath("//input[@name='txnType']");
public static final By SearchButton=By.xpath("//button[normalize-space()='Search']");
public static final By SearchIcon=By.xpath("//span[@class='icon-eye-view iconEye Cursor payloadEyeIcon']");

public static final By Experiancelayerreq=By.xpath("//div[@class='multiMuleBankName']/pre");

public static final By Expres=By.xpath("//div[contains(@class,'expLayer')]//div[contains(@class,'mr-4 muleReqResp')][normalize-space()='Response']");
public static final By Experiancelayerresponse=By.xpath("//pre[contains(@class,'label systemTxtWrap')]");

public static final By systemlayerreq=By.xpath("//div[contains(@class,'systemLayer')]//div[contains(@class,'mr-4 muleReqResp')][normalize-space()='Request']");

public static final By systemlayerreqbody=By.xpath("//span[contains(@class,'label systemTxtWrap')]");

public static final By systemlayerres=By.xpath("//div[contains(@class,'systemLayer')]//div[contains(@class,'mr-4 muleReqResp')][normalize-space()='Response']");

public static final By systemlayerresbody=By.xpath("//span[contains(@class,'label systemTxtWrap')]");

public void support() throws InterruptedException
{
	click(Supportlink);
click(MuleApi);
click(TransactionType);
Entertext(TransactionType, "MT100");
click(SearchButton);
click(SearchIcon);
Thread.sleep(10000);
String req=driver.findElement(Experiancelayerreq).getText();
     System.out.println("Experiance Layer req :: "+req);
     
     if(req!=null)
     {
    	 System.out.println("Experiance layer data should be fired");
     }
     else
     {
    	 System.out.println("MT-100 Not fired");
     }
     click(Expres);
      String res=driver.findElement(Experiancelayerresponse).getText();
     System.out.println("Experiance Layer req :: "+res);

click(systemlayerreq);
String reqs=driver.findElement(systemlayerreqbody).getText();
System.out.println("SYstem Layer req :: "+reqs);

click(systemlayerres);
click(systemlayerresbody);

String repos=driver.findElement(systemlayerresbody).getText();
System.out.println("SYstem Layer req :: "+repos);
}
}