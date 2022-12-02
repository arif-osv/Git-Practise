
@tag
Feature: TC_001

//user268
//933190
  @tag1
  Scenario: Open Banking AISP

   
     Given user is on uat url login page
 	   When user enters username  and PassWord "smrev""Osv@1234"
   	 Then I click on Settings
     And I click on Add Bank Accounts
     Then I can Select Saudi Central bank
     Then I Select Permission of only "Account Balance"
     And Select Consent Expiry Days.
 