Feature: Schedule Payments


	 Scenario: Any OSV User Create the Schedule Payment
   Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
       Then User click on Schedule payments
    And user Select the transfer type "INTERBANK"
  Then user should be create Schedule payment "ALRAJHI""Yearly""(20400...29123)""SA3080004499608018880245"
  Then user logout the application

 Scenario: Executer Create the Schedule Payment and edit that payment
   Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    Then User click on Schedule payments
    And user Select the transfer type "INTERBANK"
  Then user should be create Schedule payment "ALRAJHI""Yearly""(20400...29123)""SA3080004499608018880245"
  Then user edit on created payment 
   Then user edit amount
   Then user logout the application
  
  Scenario: Executer Create the schedule payment and disable that payment
  
   Given user is on uat url login page
    When user enters username  and PassWord "smexe""Osv@1234"
    Then user click on payment button
    Then User click on Schedule payments
    And user Select the transfer type "INTERBANK"
  Then user should be create Schedule payment "ALRAJHI""Yearly""(20400...29123)""SA3080004499608018880245"
   Then user disable on created payment 
   Then user logout the application
 
  Scenario: Any OSV User Create the Schedule Payment
   Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    Then User click on Schedule payments
    And user Select the transfer type "INTERBANK"
  Then user should be create Schedule payment "ALRAJHI""Weekly""(20400...29123)""SA3080004499608018880245"
  Then user logout the application
  
	 Scenario: Any OSV User Create the Schedule Payment
   Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
       Then User click on Schedule payments
    And user Select the transfer type "INTERBANK"
  Then user should be create Schedule payment "ALRAJHI""Yearly""(20400...29123)""SA3080004499608018880245"
  Then user logout the application
  
	 Scenario: Any OSV User Create the Schedule Payment
   Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    
    Then User click on Schedule payments
    And user Select the transfer type "INTERBANK"
  Then user should be create Schedule payment "ALRAJHI""Weekly""(20400...29123)""SA3080004499608018880245"
	Then user logout the application