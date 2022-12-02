package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.qa.util.WaitFunctions;

public class Paymentpage extends WaitFunctions {
	
	public Paymentpage(WebDriver driver) {
		super(driver);
	}

	public static final	By HamberIcon=By.className("hamburgerIcon");
	public static final By payment =By.xpath("//ul[@class='isFlexColumn']//a[contains(text(),'payments')]");
	public static final By transfers =By.xpath("//*[contains(text(),'Transfers')]");
	
	public static final By createpayment = By.xpath("//button[normalize-space()='+ Create payment']");
	public static final By createSchedulepayment = By.xpath("//button[normalize-space()='+ Schedule payment']");
	public static final By BeneficiryAccount = By.partialLinkText("Beneficiary accounts");
	public static final By Amount=By.name("amount");
	
	public static final By AddtoPayment=By.xpath("//button[contains(text(),'payment')]");
	
	public static final By UploadBulk=By.xpath("(//a[normalize-space()='Upload payments'])[1]");
	public static final By selectdebitac=By.xpath("//span[@class='selectedItem undefined']");
	
	public static final By allaccounts=By.xpath("//input[@name='all']");
	
	public static final By debitaccounts=By.xpath("//div[@class='isDropdownPlaceholder']");
	
	public static final String BankName ="//div[@title='%s']//following-sibling :: div";
	public static final String createpayments = "//button[normalize-space()='+ Create %s']";
	
	
	public static final By SelectCompany=By.xpath(" //div[@class=' css-tlfecz-indicatorContainer']");
	public static final By SpiltBeneficiryAccount=By.xpath(" //div[@class='name-select__indicator name-select__dropdown-indicator css-tlfecz-indicatorContainer']");
	
	public static final By Debitaccountone=By.xpath("//div[@class='isDropdownPlaceholder']");
	public static final By Debitaccounttwo=By.xpath("(//div[@class='selectedItem'])[2]");
	public static final By Debitaccountnumbertwo= By.xpath("//div[@class='isMultiDebitAccounts']/div[2]/div[1]/div[1]/div/div[2]/div[2]/div/div[2]");
	
	public static final By Amountfst=By.xpath("//div[@class='isMultiDebitAccounts'] /div[1]/div[2]/input");
	public static final By Amountsec=By.xpath("//div[@class='isMultiDebitAccounts'] /div[2]/div[2]/input");
	
	public static final By Description = By.name("description");

public void CreateBulkPayment() throws InterruptedException
{
	click(Paymentpage.payment);
	click(String.format(Approvalpage.Dynamicxpath, "Bulk transfers"));
	click(UploadBulk);
	click(selectdebitac);
	click(allaccounts);
	click(selectdebitac);
	
}


public  void Spiltpayment() throws InterruptedException
{
//	click(Osvpaymentpage.payment);
	//click(String.format(Approvalpage.Dynamicxpath, "Split payments"));
	//click(String.format(createpayments, "split payment"));
	click(SelectCompany);
	//click(String.format(Approvalpage.Dynamicxpath, "Select"));
	click(String.format(Approvalpage.Dynamicxpath, "Nameer calls"));
}

public void BeneficiryAccount(String BeneficiryAcNumber) throws InterruptedException
{
	click(SpiltBeneficiryAccount);
	click(String.format(Approvalpage.Dynamicxpath, BeneficiryAcNumber));
	
}
public void DebitAccountone(String debitacone) throws InterruptedException
{
	click(Debitaccountone);
	click(String.format(Approvalpage.Dynamicxpath, debitacone));
	click(Amountfst);
Entertext(Amountfst, "120");
	
	
}
public void DebitAccounttwo(String debitactwo) throws InterruptedException
{
	click(Debitaccounttwo);
	click(Debitaccountnumbertwo);
//	click(String.format(Approvalpage.Dynamicxpath, debitactwo));

	click(Amountsec);
Entertext(Amountsec, "25");
}


public void Description()
{
	click(Description);
	Entertext(Description,"Automation Test");
}


public void AddPayments() throws InterruptedException
{
	click(String.format(Approvalpage.Dynamicxpath,"Add to payments"));
}

public void CreditaccountSelection(String AccountNumber)
{
	
	
	
	
}



}