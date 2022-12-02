package parallel;

import com.qa.factory.DriverFactory;
import com.qa.pages.Invoicepage;

import io.cucumber.java.en.Then;

public class InvoicePagesteps {
	Invoicepage invoicepage= new Invoicepage(DriverFactory.getDriver());
	
	@Then("User Create Invoice")
	public void CreateInvoice() throws InterruptedException
	{
		invoicepage.createInvoice();
	}

}
