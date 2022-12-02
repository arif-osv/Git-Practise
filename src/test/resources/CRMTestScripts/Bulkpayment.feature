Feature: Bulk Payment scenario's


Scenario: Reviewer Creating Bulk payment and approver and Multiple executors approve the payment
    Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    And click on payments link and click on Bulk Transfer
     Then user take screen shot
    And click on upload payments
     Then user take screen shot
    Then user Select the Debit Account
     Then user take screen shot
    Then user upload payment sheet
     Then user take screen shot
    Then select payment due date
     Then user take screen shot
    And  enter the description in English language
     Then user take screen shot
    Then click on clear the data
     Then user take screen shot
    Then user Select the Debit Account after clear
     Then user take screen shot
    Then user upload payment sheet
     Then user take screen shot
    Then select payment due date
     Then user take screen shot
    And  enter the description in Arabic language
     Then user take screen shot
    Then click on upload the data
     Then user take screen shot
    And click on accept and upload
     Then user take screen shot
    And user verify upload successful message
     Then user take screen shot
    	Then user logout the application
     When user enters username  and PassWord "smrev""Osv@1234"
       Then Bulk payment approve
    Then user take screen shot
    Then user click on overview button
    Then user take screen shot
    Then user click on upcoming payments under click on bulk button
    Then user take screen shot
    Then user click on approve button
    Then user take screen shot
    Then user logout the application
   When user enters username  and PassWord "smapp1""Osv@1234"
       Then Bulk payment approve
    Then user take screen shot
    Then user click on overview button
    Then user take screen shot
    Then user click on upcoming payments under click on bulk button
    Then user take screen shot
    Then user click on approve button
    Then user take screen shot
    Then user logout the application
   When user enters username  and PassWord "smexe""Osv@1234"
       Then Bulk payment approve
    Then user take screen shot
    Then user click on overview button
    Then user take screen shot
    Then user click on upcoming payments under click on bulk button
    Then user take screen shot
  	Then user enter otp
    Then user take screen shot
    Then user logout the application
      When user enters username  and PassWord "smexe1""Osv@1234"
       Then Bulk payment approve
    Then user take screen shot
    Then user click on overview button
    Then user take screen shot
    Then user click on upcoming payments under click on bulk button
    Then user take screen shot
   Then user enter otp
    Then user take screen shot
    Then user logout the application
   When user enters username  and PassWord "stcexe""Osv@1234"
       Then Bulk payment approve
    Then user take screen shot
    Then user click on overview button
    Then user take screen shot
    Then user click on upcoming payments under click on bulk button
    Then user take screen shot
   Then user enter otp
   Then user take screen shot
   Then close final payment pass or fail popup
   
    Then user take screen shot
 Then user logout the application
 
    Scenario: Reviewer Creating Bulk payment reviewer and  executors approve the payment
      Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    And click on payments link and click on Bulk Transfer
     Then user take screen shot
    And click on upload payments
     Then user take screen shot
    Then user Select the Debit Account
     Then user take screen shot
    Then user upload payment sheet
     Then user take screen shot
    Then select payment due date
     Then user take screen shot
    And  enter the description in English language
     Then user take screen shot
    Then click on clear the data
     Then user take screen shot
    Then user Select the Debit Account after clear
     Then user take screen shot
    Then user upload payment sheet
     Then user take screen shot
    Then select payment due date
     Then user take screen shot
    And  enter the description in Arabic language
     Then user take screen shot
    Then click on upload the data
     Then user take screen shot
    And click on accept and upload
     Then user take screen shot
    And user verify upload successful message
     Then user take screen shot
    	Then user logout the application
     When user enters username  and PassWord "smrev""Osv@1234"
       Then Bulk payment approve
    Then user take screen shot
    Then user click on overview button
    Then user take screen shot
    Then user click on upcoming payments under click on bulk button
    Then user take screen shot
    Then user click on approve button
    Then user take screen shot
    Then user logout the application
   When user enters username  and PassWord "smapp1""Osv@1234"
       Then Bulk payment approve
    Then user take screen shot
    Then user click on overview button
    Then user take screen shot
    Then user click on upcoming payments under click on bulk button
    Then user take screen shot
    Then user click on approve button
    Then user take screen shot
    Then user logout the application
   When user enters username  and PassWord "smexe""Osv@1234"
       Then Bulk payment approve
    Then user take screen shot
    Then user click on overview button
    Then user take screen shot
    Then user click on upcoming payments under click on bulk button
    Then user take screen shot
  	Then user enter otp
    Then user take screen shot
    Then user logout the application
   
    Scenario: Executor Creating Bulk payment and  Multiple executors approve the payment
        Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    And click on payments link and click on Bulk Transfer
     Then user take screen shot
    And click on upload payments
     Then user take screen shot
    Then user Select the Debit Account
     Then user take screen shot
    Then user upload payment sheet
     Then user take screen shot
    Then select payment due date
     Then user take screen shot
    And  enter the description in English language
     Then user take screen shot
    Then click on clear the data
     Then user take screen shot
    Then user Select the Debit Account after clear
     Then user take screen shot
    Then user upload payment sheet
     Then user take screen shot
    Then select payment due date
     Then user take screen shot
    And  enter the description in Arabic language
     Then user take screen shot
    Then click on upload the data
     Then user take screen shot
    And click on accept and upload
     Then user take screen shot
    And user verify upload successful message
     Then user take screen shot
    	Then user logout the application
     When user enters username  and PassWord "smrev""Osv@1234"
       Then Bulk payment approve
    Then user take screen shot
    Then user click on overview button
    Then user take screen shot
    Then user click on upcoming payments under click on bulk button
    Then user take screen shot
    Then user click on approve button
    Then user take screen shot
    Then user logout the application
   When user enters username  and PassWord "smapp1""Osv@1234"
       Then Bulk payment approve
    Then user take screen shot
    Then user click on overview button
    Then user take screen shot
    Then user click on upcoming payments under click on bulk button
    Then user take screen shot
    Then user click on approve button
    Then user take screen shot
    Then user logout the application
   When user enters username  and PassWord "smexe""Osv@1234"
       Then Bulk payment approve
    Then user take screen shot
    Then user click on overview button
    Then user take screen shot
    Then user click on upcoming payments under click on bulk button
    Then user take screen shot
  	Then user enter otp
    Then user take screen shot
    Then user logout the application
   
    Scenario: Bulk payments all the flow is displaying proper format or not
        Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    And click on payments link and click on Bulk Transfer
     Then user take screen shot
    And click on upload payments
     Then user take screen shot
    Then user Select the Debit Account
     Then user take screen shot
    Then user upload payment sheet
     Then user take screen shot
    Then select payment due date
     Then user take screen shot
    And  enter the description in English language
     Then user take screen shot
    Then click on clear the data
     Then user take screen shot
    Then user Select the Debit Account after clear
     Then user take screen shot
    Then user upload payment sheet
     Then user take screen shot
    Then select payment due date
     Then user take screen shot
    And  enter the description in Arabic language
     Then user take screen shot
    Then click on upload the data
     Then user take screen shot
    And click on accept and upload
     Then user take screen shot
    And user verify upload successful message
     Then user take screen shot
    	Then user logout the application
     When user enters username  and PassWord "smrev""Osv@1234"
       Then Bulk payment approve
    Then user take screen shot
    Then user click on overview button
    Then user take screen shot
    Then user click on upcoming payments under click on bulk button
    Then user take screen shot
    Then user click on approve button
    Then user take screen shot
    Then user logout the application
   When user enters username  and PassWord "smapp1""Osv@1234"
       Then Bulk payment approve
    Then user take screen shot
    Then user click on overview button
    Then user take screen shot
    Then user click on upcoming payments under click on bulk button
    Then user take screen shot
    Then user click on approve button
    Then user take screen shot
    Then user logout the application
   When user enters username  and PassWord "smexe""Osv@1234"
       Then Bulk payment approve
    Then user take screen shot
    Then user click on overview button
    Then user take screen shot
    Then user click on upcoming payments under click on bulk button
    Then user take screen shot
  	Then user enter otp
    Then user take screen shot
    Then user logout the application
   
    Scenario: L1&L3 flow
        Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    And click on payments link and click on Bulk Transfer
     Then user take screen shot
    And click on upload payments
     Then user take screen shot
    Then user Select the Debit Account
     Then user take screen shot
    Then user upload payment sheet
     Then user take screen shot
    Then select payment due date
     Then user take screen shot
    And  enter the description in English language
     Then user take screen shot
    Then click on clear the data
     Then user take screen shot
    Then user Select the Debit Account after clear
     Then user take screen shot
    Then user upload payment sheet
     Then user take screen shot
    Then select payment due date
     Then user take screen shot
    And  enter the description in Arabic language
     Then user take screen shot
    Then click on upload the data
     Then user take screen shot
    And click on accept and upload
     Then user take screen shot
    And user verify upload successful message
     Then user take screen shot
    	Then user logout the application
     When user enters username  and PassWord "smrev""Osv@1234"
       Then Bulk payment approve
    Then user take screen shot
    Then user click on overview button
    Then user take screen shot
    Then user click on upcoming payments under click on bulk button
    Then user take screen shot
    Then user click on approve button
    Then user take screen shot
    Then user logout the application
   When user enters username  and PassWord "smapp1""Osv@1234"
       Then Bulk payment approve
    Then user take screen shot
    Then user click on overview button
    Then user take screen shot
    Then user click on upcoming payments under click on bulk button
    Then user take screen shot
    Then user click on approve button
    Then user take screen shot
    Then user logout the application
   When user enters username  and PassWord "smexe""Osv@1234"
       Then Bulk payment approve
    Then user take screen shot
    Then user click on overview button
    Then user take screen shot
    Then user click on upcoming payments under click on bulk button
    Then user take screen shot
  	Then user enter otp
    Then user take screen shot
    Then user logout the application
   
    Scenario: L1,L3 reject flow
    
        Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    And click on payments link and click on Bulk Transfer
     Then user take screen shot
    And click on upload payments
     Then user take screen shot
    Then user Select the Debit Account
     Then user take screen shot
    Then user upload payment sheet
     Then user take screen shot
    Then select payment due date
     Then user take screen shot
    And  enter the description in English language
     Then user take screen shot
    Then click on clear the data
     Then user take screen shot
    Then user Select the Debit Account after clear
     Then user take screen shot
    Then user upload payment sheet
     Then user take screen shot
    Then select payment due date
     Then user take screen shot
    And  enter the description in Arabic language
     Then user take screen shot
    Then click on upload the data
     Then user take screen shot
    And click on accept and upload
     Then user take screen shot
    And user verify upload successful message
     Then user take screen shot
    	Then user logout the application
     When user enters username  and PassWord "smrev""Osv@1234"
       Then Bulk payment approve
    Then user take screen shot
    Then user click on overview button
    Then user take screen shot
    Then user click on upcoming payments under click on bulk button
    Then user take screen shot
    Then user click on approve button
    Then user take screen shot
    Then user logout the application
   When user enters username  and PassWord "smapp1""Osv@1234"
       Then Bulk payment approve
    Then user take screen shot
    Then user click on overview button
    Then user take screen shot
    Then user click on upcoming payments under click on bulk button
    Then user take screen shot
    Then user click on approve button
    Then user take screen shot
    Then user logout the application
   When user enters username  and PassWord "smexe""Osv@1234"
       Then Bulk payment approve
    Then user take screen shot
    Then user click on overview button
    Then user take screen shot
    Then user click on upcoming payments under click on bulk button
    Then user take screen shot
  	Then user enter otp
    Then user take screen shot
    Then user logout the application
   
    Scenario: L2&L3 flow 
    
        Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    And click on payments link and click on Bulk Transfer
     Then user take screen shot
    And click on upload payments
     Then user take screen shot
    Then user Select the Debit Account
     Then user take screen shot
    Then user upload payment sheet
     Then user take screen shot
    Then select payment due date
     Then user take screen shot
    And  enter the description in English language
     Then user take screen shot
    Then click on clear the data
     Then user take screen shot
    Then user Select the Debit Account after clear
     Then user take screen shot
    Then user upload payment sheet
     Then user take screen shot
    Then select payment due date
     Then user take screen shot
    And  enter the description in Arabic language
     Then user take screen shot
    Then click on upload the data
     Then user take screen shot
    And click on accept and upload
     Then user take screen shot
    And user verify upload successful message
     Then user take screen shot
    	Then user logout the application
     When user enters username  and PassWord "smrev""Osv@1234"
       Then Bulk payment approve
    Then user take screen shot
    Then user click on overview button
    Then user take screen shot
    Then user click on upcoming payments under click on bulk button
    Then user take screen shot
    Then user click on approve button
    Then user take screen shot
    Then user logout the application
   When user enters username  and PassWord "smapp1""Osv@1234"
       Then Bulk payment approve
    Then user take screen shot
    Then user click on overview button
    Then user take screen shot
    Then user click on upcoming payments under click on bulk button
    Then user take screen shot
    Then user click on approve button
    Then user take screen shot
    Then user logout the application
   When user enters username  and PassWord "smexe""Osv@1234"
       Then Bulk payment approve
    Then user take screen shot
    Then user click on overview button
    Then user take screen shot
    Then user click on upcoming payments under click on bulk button
    Then user take screen shot
  	Then user enter otp
    Then user take screen shot
    Then user logout the application
   
    Scenario: Reviewer Creating Bulk payment and approver and Multiple executors approve the payment
        Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    And click on payments link and click on Bulk Transfer
     Then user take screen shot
    And click on upload payments
     Then user take screen shot
    Then user Select the Debit Account
     Then user take screen shot
    Then user upload payment sheet
     Then user take screen shot
    Then select payment due date
     Then user take screen shot
    And  enter the description in English language
     Then user take screen shot
    Then click on clear the data
     Then user take screen shot
    Then user Select the Debit Account after clear
     Then user take screen shot
    Then user upload payment sheet
     Then user take screen shot
    Then select payment due date
     Then user take screen shot
    And  enter the description in Arabic language
     Then user take screen shot
    Then click on upload the data
     Then user take screen shot
    And click on accept and upload
     Then user take screen shot
    And user verify upload successful message
     Then user take screen shot
    	Then user logout the application
     When user enters username  and PassWord "smrev""Osv@1234"
       Then Bulk payment approve
    Then user take screen shot
    Then user click on overview button
    Then user take screen shot
    Then user click on upcoming payments under click on bulk button
    Then user take screen shot
    Then user click on approve button
    Then user take screen shot
    Then user logout the application
   When user enters username  and PassWord "smapp1""Osv@1234"
       Then Bulk payment approve
    Then user take screen shot
    Then user click on overview button
    Then user take screen shot
    Then user click on upcoming payments under click on bulk button
    Then user take screen shot
    Then user click on approve button
    Then user take screen shot
    Then user logout the application
   When user enters username  and PassWord "smexe""Osv@1234"
       Then Bulk payment approve
    Then user take screen shot
    Then user click on overview button
    Then user take screen shot
    Then user click on upcoming payments under click on bulk button
    Then user take screen shot
  	Then user enter otp
    Then user take screen shot
    Then user logout the application
     
