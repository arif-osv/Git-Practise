Feature: Beneficiries 

Scenario: user should create multiple payments and bulk approve the payments 
 Given user is on uat url login page
 Then user enters username  and PassWord "smrev""Osv@1234"
   
 		Then user click on payment "Transfers"
    Then user create "SARIE" Payment "ALRAJHI""(20400...29123)""SA5330400108061198800019"
    Then user take screen shot
    And  Verify the create Payment details
    And user click on share button
    And user click on payment download button
    Then user logout the application
    Then user approve the "Transfers""Beneficiary accounts" approvel "smrev-Approve""smapp1-Approve""smexe-Approve"
    Given user is on uat url login page
    When user enters username  and PassWord "syed@onesingleview.com""12345"
   Then I click on Settings and Goto Support Board
 @RejectBeneficiry
 Scenario: Reviewer create International Beneficiry and Approver&executer Approve the Beneficiry
Given user is on uat url login page
 When user enters username  and PassWord "smrev""Osv@1234"
 And I can create "Local" Beneficiry profile
 Then user logout the application
 Then user approve the "smrev-Approve""smapp1-Approve""smexe-Reject"
@Local_Beneficiries
Scenario: Reviewer create Local Beneficiry and Approver&executer Approve the Beneficiry
Given user is on uat url login page
 When user enters username  and PassWord "smrev""Osv@1234"
 And I can create "Local" Beneficiry profile
 Then user logout the application
 Then user approve the "smrev-Approve""smapp1-Approve""smexe-Approve"
 @International_Beneficiries
Scenario: Reviewer create International Beneficiry and Approver&executer Approve the Beneficiry
Given user is on uat url login page
 When user enters username  and PassWord "smrev""Osv@1234"
 And I can create "International" Beneficiry profile
 Then user logout the application
 Then user approve the "smrev-Approve""smapp1-Approve""smexe-Approve"
 @RejectBeneficiry
 Scenario: Reviewer create International Beneficiry and Approver&executer Approve the Beneficiry
Given user is on uat url login page
 When user enters username  and PassWord "smrev""Osv@1234"
 And I can create "International" Beneficiry profile
 Then user logout the application
 Then user approve the "smrev-Approve""smapp1-Approve""smexe-Reject"