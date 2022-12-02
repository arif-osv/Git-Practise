package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
	        plugin = {"pretty","html:target/cucumber-reports/cucumber.html", 
	        		
	        		"json:target/cucumber-report/cucumber.json",
	            "me.jvt.cucumber.report.PrettyReports:target/cucumber",
	        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			"timeline:test-output-thread/",
		
	        "html:target/cucumber-reports/cucumber.html",
            "json:target/cucumber-reports/cucumber.json"
	}
	        ,
	        features = {"src/test/resources/ApplicationHooks/Paymentflows.feature"},
	        glue = {"stepdefinitions", "parallel"}
	     //   dryRun = false,monochrome = true,
	      //  tags = {"@smoke"}
	)

public class UATTestRunner {

}
