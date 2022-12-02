@tag
Feature: Sadad Payments
  @SadadPayment
  Scenario: Title of your scenario
  
   Given user is on uat url login page
 When user enters username  and PassWord "smrev""Osv@1234"
 Then user click on payment "SADAD"
 And I can Create the MOI Payment "NCB" 
 Then I should Verify the Upload Successfully message
 Then user logout the application
   
 Then user approve the "Bulk transfers""Pending approval" approvel "smrev-Approve""smapp1-Approve""smexe-Approve"
  
  