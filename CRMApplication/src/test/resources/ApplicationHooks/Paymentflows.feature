
@OSVPayments-All-Payment-Scenario's
Feature: Payments

  @InternationalPaymentCreation
Scenario: user should be create a payment through quick payment link  
 
 Given user is on uat url login page
 Then user enters username  and PassWord "smrev""Osv@1234"
 And I can click on the quick payments link
 Then user create "SWIFT" Payment "ALRAJHI""(20400...29123)""SA5330400108061198800019"

@QuickPaymentCreation
Scenario: user should be create a payment through quick payment link  
 
  Given user is on uat url login page
 Then user enters username  and PassWord "smrev""Osv@1234"
 And I can click on the quick payments link
 Then user create "SARIE" Payment "ALRAJHI""(20400...29123)""SA5330400108061198800019"
   @CreatePayment,sharepaymnet,download
   
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
   
   

Scenario: L1 Create the Payment L2 Reject The Payment

    Given user is on uat url login page
    When user enters username  and PassWord "syed@onesingleview.com""12345"
   Then I click on Settings and Goto Support Board
   
 	  When user enters username  and PassWord "smrev""Osv@1234"
 		Then user click on payment "Transfers"
    Then user create "SARIE" Payment "ALRAJHI""(20400...29123)""SA5330400108061198800019"
    Then user take screen shot
    And  Verify the create Payment details
    Then user logout the application
    Then user approve the "Transfers""Beneficiary accounts" approvel "smrev-Approve""smapp1-Approve""smexe-Approve"
 
    
Scenario: Spilt payment create
 Given user is on uat url login page
 	When user enters username  and PassWord "nameer_exe""Osv@1234"
 Then user click on payment "Split payment"
 Then user create spilt "SA8645000000032020604002""(05100...96502)""(01080...90014)"
  # Then user create "SARIE" Payment "ALRAJHI""(20400...29123)""SA5330400108061198800019"
  Then user logout the application



Scenario: Spilt payment create
 Given user is on uat url login page
 	When user enters username  and PassWord "nameer_exe""Osv@1234"
 Then user click on payment "Split payment"
 
 Then user create spilt "SA8645000000032020604002""(05100...96502)""(01080...90014)"
  # Then user create "SARIE" Payment "ALRAJHI""(20400...29123)""SA5330400108061198800019"
  Then user logout the application
 
Scenario: L1 Create the Payment L2 Reject The Payment

    Given user is on uat url login page
 	  When user enters username  and PassWord "smrev""Osv@1234"
 		Then user click on payment "Transfers"
    Then user create "SARIE" Payment "ALRAJHI""(20400...29123)""SA5330400108061198800019"
    Then user take screen shot
    Then user logout the application
    
 

Scenario:
 Given user is on uat url login page
 When user enters username  and PassWord "smrev""Osv@1234"
 Then user click on payment "SADAD"
 And I can Create the MOI Payment "(05100...96502)"


@SadadPayment
 Scenario: L1 Create the Payment L2 Reject The Payment

    Given user is on uat url login page
 	  When user enters username  and PassWord "smrev""Osv@1234"
 		Then user click on payment "Transfers"
    Then user create "SARIE" Payment "ALRAJHI""(20400...29123)""SA5330400108061198800019"
    Then user take screen shot
    Then user logout the application


 
@LOCALPayments
 Scenario: L1 Create the Payment L2 Reject The Payment

    Given user is on uat url login page
 	  When user enters username  and PassWord "smrev""Osv@1234"
 		Then user click on payment "Transfers"
    Then user create "SARIE" Payment "ALRAJHI""(20400...29123)""SA5330400108061198800019"
    Then user take screen shot
    Then user logout the application


@BulkPayment
Scenario:
 Given user is on uat url login page
 When user enters username  and PassWord "smrev""Osv@1234"
 Then user click on payment "Bulk transfers"
 And I can Create the Bulk Payment 
 Then I should Verify the Upload Successfully message
 Then user logout the application
   
 Then user approve the "Bulk transfers""Pending approval" approvel "smrev-Approve""smapp1-Approve""smexe-Approve"
 @BulkPayment
Scenario:
 Given user is on uat url login page
 When user enters username  and PassWord "smrev""Osv@1234"
 Then user click on payment "Bulk transfers"
 And I can Create the Bulk Payment 
 Then I should Verify the Upload Successfully message
 Then user logout the application
   
 Then user approve the "Bulk transfers""Pending approval" approvel "smrev-Approve""smapp1-Approve""smexe-Approve"

  @LOCALPayments
 Scenario: L1 Create the Payment L2 Reject The Payment

     Given user is on uat url login page
 	  When user enters username  and PassWord "smrev""Osv@1234"
 			Then user click on payment "Transfers"
      Then user create "SARIE" Payment "ALRAJHI""(20400...29123)""SA5330400108061198800019"
    Then user take screen shot
    Then user logout the application
     @SchedulePayment
  Scenario Outline: Any OSV user Should be Create Different Types of Schedule Payment
      
       Given user is on uat url login page
 	  When user enters username  and PassWord "smrev""Osv@1234"
 		Then user click on payment "Schedule payment"
 		Then user create "SARIE" Payment "ALRAJHI""(20400...29123)""SA5330400108061198800019"
 		   Then user approve the "Transfers""Beneficiary accounts" approvel "smrev-Approve""smapp1-Approve""smexe11-Approve"
 
    Then user logout the application
  

@InternationalPayment 
  Scenario: Initilizer Create the International Payment and Reviewer,Approver,Executor Approve the Payment
     Given user is on uat url login page
 	  When user enters username  and PassWord "smrev""Osv@1234"
 		Then user click on payment "Transfers"
    Then user create "SARIE" Payment "ALRAJHI""(20400...29123)""SA5330400108061198800019"
    Then user take screen shot
   # And user click on the Add to Payment
    Then user logout the application
   
    Then user approve the "Transfers""Beneficiary accounts" approvel "smrev-Approve""smapp1-Approve""smapp1-Approve"
  @LOCALPayments
 Scenario: L1 Create the Payment L2 Reject The Payment

     Given user is on uat url login page
 	  When user enters username  and PassWord "smrev""Osv@1234"
 	Then user click on payment "Transfers"
      Then user create "SARIE" Payment "ALRAJHI""(20400...29123)""SA5330400108061198800019"
    Then user take screen shot
   # And user click on the Add to Payment
    Then user logout the application
  @CompanyPayments
 Scenario: L2 Create the Payment L3 N

     Given user is on uat url login page
 	  When user enters username  and PassWord "smrev""Osv@1234"
 		Then user click on payment "Transfers"
  Then user create "SARIE" Payment "ALRAJHI""(20400...29123)""SA5330400108061198800019"
    Then user take screen shot
   # And user click on the Add to Payment
    Then user logout the application
      @IndianBankPayments
 Scenario: Workflow defined as L1,L2 & L3 and Intiator initiates the payments

     Given user is on uat url login page
 	  When user enters username  and PassWord "smrev""Osv@1234"
 	Then user click on payment "Transfers"
    Then user create "SARIE" Payment "ALRAJHI""(20400...29123)""SA5330400108061198800019"
    Then user take screen shot
   # And user click on the Add to Payment
    Then user logout the application
    
     
     
     
     