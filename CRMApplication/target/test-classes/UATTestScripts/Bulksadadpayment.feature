#Author: Arif Pasha
@RegressionTest
Feature: Upload sadad Bulk Payment and Approve the user

  Scenario: Reviewer upload the Bulk sadad payment
  
Given user is on uat url login page
When user enters username  and PassWord "smrev""Osv@1234"
Then user take screen shot
Then User select Debit Account
And user Select Bill Category
And User select on BillerID
Then user attach the bulk sadad bills Sheet
Then User click on continue Button
And click on accept and upload
Then user take screen shot
And user verify upload successful message
Then user take screen shot
Then user logout the application
When user enters username  and PassWord "smrev""Osv@1234"
  And click on bulksadad approve
  Then user logout the application
When user enters username  and PassWord "smapp1""Osv@1234"
  And click on bulksadad approve
  Then user logout the application
When user enters username  and PassWord "smexe""Osv@1234"
 And click on bulksadad OTPapprove
 Then close final payment pass or fail popup
 Then user take screen shot
 Then user logout the application
 
 Scenario: Approver upload the Bulk sadad payment
  
Given user is on uat url login page
When user enters username  and PassWord "smapp1""Osv@1234"
Then user take screen shot
Then User select Debit Account
And user Select Bill Category
And User select on BillerID
Then user attach the bulk sadad bills Sheet
Then User click on continue Button
And click on accept and upload
Then user take screen shot
And user verify upload successful message
Then user take screen shot
Then user logout the application
When user enters username  and PassWord "smapp1""Osv@1234"
  And click on bulksadad approve
  Then user logout the application
When user enters username  and PassWord "smexe""Osv@1234"
 And click on bulksadad OTPapprove
 Then close final payment pass or fail popup
 Then user take screen shot
 Then user logout the application
 
 Scenario: Group user upload the Bulk sadad payment
  
Given user is on uat url login page
When user enters username  and PassWord "smexe""Osv@1234"
Then user take screen shot
Then User select Debit Account
And user Select Bill Category
And User select on BillerID
Then user attach the bulk sadad bills Sheet
Then User click on continue Button
And click on accept and upload
Then user take screen shot
And user verify upload successful message
Then user take screen shot
Then user logout the application
When user enters username  and PassWord "smexe""Osv@1234"
 And click on bulksadad OTPapprove
 Then close final payment pass or fail popup
 Then user take screen shot
 Then user logout the application
 Scenario: Joint executor Scenario
  
Given user is on uat url login page
When user enters username  and PassWord "smexe""Osv@1234"
Then user take screen shot
Then User select Debit Account
And user Select Bill Category
And User select on BillerID
Then user attach the bulk sadad bills Sheet
Then User click on continue Button
And click on accept and upload
Then user take screen shot
And user verify upload successful message
Then user take screen shot
Then user logout the application
When user enters username  and PassWord "smexe""Osv@1234"
 And click on bulksadad OTPapprove
 Then close final payment pass or fail popup
 Then user take screen shot
 Then user logout the application
 Scenario: Group user upload the payment and execute multiple user's
  
Given user is on uat url login page
When user enters username  and PassWord "smexe""Osv@1234"
Then user take screen shot
Then User select Debit Account
And user Select Bill Category
And User select on BillerID
Then user attach the bulk sadad bills Sheet
Then User click on continue Button
And click on accept and upload
Then user take screen shot
And user verify upload successful message
Then user take screen shot
Then user logout the application
When user enters username  and PassWord "smexe""Osv@1234"
 And click on bulksadad OTPapprove
 Then close final payment pass or fail popup
 Then user take screen shot
 Then user logout the application
 Scenario: Group user upload the Bulk sadad payment and reject the payment
  
Given user is on uat url login page
When user enters username  and PassWord "smexe""Osv@1234"
Then user take screen shot
Then User select Debit Account
And user Select Bill Category
And User select on BillerID
Then user attach the bulk sadad bills Sheet
Then User click on continue Button
And click on accept and upload
Then user take screen shot
And user verify upload successful message
Then user take screen shot
Then user logout the application
When user enters username  and PassWord "smexe""Osv@1234"
 And click on bulksadad OTPapprove
 Then close final payment pass or fail popup
 Then user take screen shot
 Then user logout the application
 Scenario: Reviewer upload the Bulk sadad payment
  
Given user is on uat url login page
When user enters username  and PassWord "smrev""Osv@1234"
Then user take screen shot
Then User select Debit Account
And user Select Bill Category
And User select on BillerID
Then user attach the bulk sadad bills Sheet
Then User click on continue Button
And click on accept and upload
Then user take screen shot
And user verify upload successful message
Then user take screen shot
Then user logout the application
When user enters username  and PassWord "smrev""Osv@1234"
  And click on bulksadad approve
  Then user logout the application
When user enters username  and PassWord "smapp1""Osv@1234"
  And click on bulksadad approve
  Then user logout the application
When user enters username  and PassWord "smexe""Osv@1234"
 And click on bulksadad OTPapprove
 Then close final payment pass or fail popup
 Then user take screen shot
 Then user logout the application
 Scenario: Reviewer upload the Bulk sadad payment
  
Given user is on uat url login page
When user enters username  and PassWord "smrev""Osv@1234"
Then user take screen shot
Then User select Debit Account
And user Select Bill Category
And User select on BillerID
Then user attach the bulk sadad bills Sheet
Then User click on continue Button
And click on accept and upload
Then user take screen shot
And user verify upload successful message
Then user take screen shot
Then user logout the application
When user enters username  and PassWord "smrev""Osv@1234"
  And click on bulksadad approve
  Then user logout the application
When user enters username  and PassWord "smapp1""Osv@1234"
  And click on bulksadad approve
  Then user logout the application
When user enters username  and PassWord "smexe""Osv@1234"
 And click on bulksadad OTPapprove
 Then close final payment pass or fail popup
 Then user take screen shot
 Then user logout the application
 
 Scenario: Reviewer upload the Bulk sadad payment
  
Given user is on uat url login page
When user enters username  and PassWord "smrev""Osv@1234"
Then user take screen shot
Then User select Debit Account
And user Select Bill Category
And User select on BillerID
Then user attach the bulk sadad bills Sheet
Then User click on continue Button
And click on accept and upload
Then user take screen shot
And user verify upload successful message
Then user take screen shot
Then user logout the application
When user enters username  and PassWord "smrev""Osv@1234"
  And click on bulksadad approve
  Then user logout the application
When user enters username  and PassWord "smapp1""Osv@1234"
  And click on bulksadad approve
  Then user logout the application
When user enters username  and PassWord "smexe""Osv@1234"
 And click on bulksadad OTPapprove
 Then close final payment pass or fail popup
 Then user take screen shot
 Then user logout the application
 
 Scenario: Reviewer upload the Bulk sadad payment
  
Given user is on uat url login page
When user enters username  and PassWord "smrev""Osv@1234"
Then user take screen shot
Then User select Debit Account
And user Select Bill Category
And User select on BillerID
Then user attach the bulk sadad bills Sheet
Then User click on continue Button
And click on accept and upload
Then user take screen shot
And user verify upload successful message
Then user take screen shot
Then user logout the application
When user enters username  and PassWord "smrev""Osv@1234"
  And click on bulksadad approve
  Then user logout the application
When user enters username  and PassWord "smapp1""Osv@1234"
  And click on bulksadad approve
  Then user logout the application
When user enters username  and PassWord "smexe""Osv@1234"
 And click on bulksadad OTPapprove
 Then close final payment pass or fail popup
 Then user take screen shot
 Then user logout the application
 
 Scenario: Reviewer upload the Bulk sadad payment
  
Given user is on uat url login page
When user enters username  and PassWord "smrev""Osv@1234"
Then user take screen shot
Then User select Debit Account
And user Select Bill Category
And User select on BillerID
Then user attach the bulk sadad bills Sheet
Then User click on continue Button
And click on accept and upload
Then user take screen shot
And user verify upload successful message
Then user take screen shot
Then user logout the application
When user enters username  and PassWord "smrev""Osv@1234"
  And click on bulksadad approve
  Then user logout the application
When user enters username  and PassWord "smapp1""Osv@1234"
  And click on bulksadad approve
  Then user logout the application
When user enters username  and PassWord "smexe""Osv@1234"
 And click on bulksadad OTPapprove
 Then close final payment pass or fail popup
 Then user take screen shot
 Then user logout the application