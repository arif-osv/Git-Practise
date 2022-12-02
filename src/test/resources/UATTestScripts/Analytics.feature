@Regression, @smoke
Feature: Analytics Scenario's
     
  Scenario: user click on Analytics and verify the all payments tabs.
    Given user is on uat url login page
    When user enters username  and PassWord "smexe""Osv@1234"
    Then user take screen shot
   And user click on "Analytics" link
   And user click on "All" tab
   And User select on the this year in dropdown
   And user click on "Same bank" tab

  Then user logout the application





















 #  Scenario: Executor create a beneficiry and Approve the Beneficiry
  #  Given user is on uat url login page
   # When user enters username  and PassWord "smexe""Osv@1234"
   	#And user click on "Beneficiaries" link
   	 #And user click on addBeneficiry Button
   	#And user Select on Bank "Al Rajhi Bank"
   	 # And user Decide to "Reject" the Beneficiry through "overview"
 
   #And user Decide to "Approve" the Beneficiry through checkbox
   	
   