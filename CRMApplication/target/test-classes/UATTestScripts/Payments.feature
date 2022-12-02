Feature: Payment scenario's
 Scenario: Reviewer  create a payment and approver and executor approve the payment
    Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "INTERBANK"
    Then user create Payment "ALRAJHI""(20400...29123)""SA7580000260752019000935"
    Then user take screen shot
    And user click on the Add to Payment
    Then user logout the application
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smapp1""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe1""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "stcexe""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then close final payment pass or fail popup
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application

  Scenario: Group user create a payment and executor approve the payment
    Given user is on uat url login page
    When user enters username  and PassWord "stjrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "INTERBANK"
    Then user create Payment "ALRAJHI""(20400...29123)""SA7580000260752019000935"
    Then user take screen shot
    And user click on the Add to Payment
    Then user logout the application
    When user enters username  and PassWord "stjrev""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "stcexe""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then close final payment pass or fail popup
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application

 
  Scenario: Reviewer create a payment and Executor send need more info. reviewer send info.executor approve the payment the payment(L1,L3)
    Given user is on uat url login page
    When user enters username  and PassWord "stjrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "INTERBANK"
    Then user create Payment "ALRAJHI""(20400...29123)""SA7580000260752019000935"
    Then user take screen shot
    And user click on the Add to Payment
    Then user logout the application
    When user enters username  and PassWord "stjrev""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe""Osv@1234"
    Then user decision is "Reject" payment through "Overview"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application

  Scenario: Group user create a payment and executor approve the payment
    Given user is on uat url login page
    When user enters username  and PassWord "stjrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "INTERBANK"
    Then user create Payment "ALRAJHI""(20400...29123)""SA7580000260752019000935"
    Then user take screen shot
    And user click on the Add to Payment
    Then user logout the application
    When user enters username  and PassWord "stjrev""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "stcexe""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application

  Scenario: User Creating sarie payment for Alrajhi to NCB Account
    Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "SARIE"
    Then user create Payment "ALRAJHI""(20400...29123)""SA6610000000122807000101"
    Then user take screen shot
    And user click on the Add to Payment
    Then user logout the application

  Scenario: User Creating Local NEFT payment ICICI to HDFC Account
    Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "SARIE"
    Then user create Payment "ICICI""(00045...00301)""026291800001091"
    Then user take screen shot
    And user click on the Add to Payment
    Then user logout the application

  Scenario: User Creating Local RTGS payment YESBank to HDFC Account
    Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "SARIE"
    Then user create Payment "YesBank""(00019...17042)""50100002965304"
    Then user take screen shot
    And user click on the Add to Payment
    Then user logout the application

  Scenario: User Creating Local NEFT payment ICICI to HDFC Account
    Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "SARIE"
    Then user create Payment "ICICI""(00045...00301)""026291800001091"
    Then user take screen shot
    And user click on the Add to Payment
    Then user logout the application

  Scenario: Reviewer create a payment and Executor send need more info. reviewer send info.executor approve the payment the payment(L1,L3)
    Given user is on uat url login page
    When user enters username  and PassWord "stjrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "INTERBANK"
    Then user create Payment "ALRAJHI""(20400...29123)""SA7580000260752019000935"
    Then user take screen shot
    And user click on the Add to Payment button
    Then user logout the application
    When user enters username  and PassWord "stjrev""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe""Osv@1234"
    Then user decision is "Reject" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application

  Scenario: Reviewer create a payment and Executor Reject the payment(L1,L3)
    Given user is on uat url login page
    When user enters username  and PassWord "stjrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "INTERBANK"
    Then user create Payment "ALRAJHI""(20400...29123)""SA7580000260752019000935"
    Then user take screen shot
    And user click on the Add to Payment button
    Then user logout the application
    When user enters username  and PassWord "stjrev""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe""Osv@1234"
    Then user decision is "Reject" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application

  Scenario: Reveiwer create the payment and approve the Approver,Joint Executor(L1,L2,L3-Multiple)
    Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "INTERBANK"
    Then user create Payment "ALRAJHI""(20400...29123)""SA7580000260752019000935"
    Then user take screen shot
    And user click on the Add to Payment button
    Then user logout the application
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smapp1""Osv@1234"
    Then user decision is "Approve" payment through "Overview"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe1""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "stcexe""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application

  Scenario: Alinma Bank Restract the International Transfer
    Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "SWIFT"
    Then user Alinma create Payment "ALINMA""(SA230...03000)"
    Then user verify International payment is not allowed for selected debit account
    Then user take screen shot
    Then user logout the application

  Scenario: Reviewer  create a payment and approver and executor approve the payment
    Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "INTERBANK"
    Then user create Payment "ALRAJHI""(20400...29123)""SA7580000260752019000935"
    Then user take screen shot
    And user click on the Add to Payment
    Then user logout the application
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smapp1""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe1""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "stcexe""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then close final payment pass or fail popup
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application

  Scenario: Reviewer  create a payment and approver and executor approve the payment
    Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "INTERBANK"
    Then user create Payment "ALRAJHI""(20400...29123)""SA7580000260752019000935"
    Then user take screen shot
    And user click on the Add to Payment
    Then user logout the application
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smapp1""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe1""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "stcexe""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then close final payment pass or fail popup
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application

  Scenario: Reviewer  create a payment and approver and executor approve the payment
    Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "INTERBANK"
    Then user create Payment "ALRAJHI""(20400...29123)""SA7580000260752019000935"
    Then user take screen shot
    And user click on the Add to Payment
    Then user logout the application
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smapp1""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe1""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "stcexe""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then close final payment pass or fail popup
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application

  Scenario: Reviewer  create a payment and approver and executor approve the payment
    Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "INTERBANK"
    Then user create Payment "ALRAJHI""(20400...29123)""SA7580000260752019000935"
    Then user take screen shot
    And user click on the Add to Payment
    Then user logout the application
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smapp1""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe1""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "stcexe""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then close final payment pass or fail popup
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    
    
    
    
    
 Scenario: Reviewer  create a payment and approver and executor approve the payment
    Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "INTERBANK"
    Then user create Payment "ALRAJHI""(20400...29123)""SA7580000260752019000935"
    Then user take screen shot
    And user click on the Add to Payment
    Then user logout the application
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smapp1""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe1""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "stcexe""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then close final payment pass or fail popup
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application

  Scenario: Group user create a payment and executor approve the payment
    Given user is on uat url login page
    When user enters username  and PassWord "stjrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "INTERBANK"
    Then user create Payment "ALRAJHI""(20400...29123)""SA7580000260752019000935"
    Then user take screen shot
    And user click on the Add to Payment
    Then user logout the application
    When user enters username  and PassWord "stjrev""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "stcexe""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then close final payment pass or fail popup
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application

 
  Scenario: Reviewer create a payment and Executor send need more info. reviewer send info.executor approve the payment the payment(L1,L3)
    Given user is on uat url login page
    When user enters username  and PassWord "stjrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "INTERBANK"
    Then user create Payment "ALRAJHI""(20400...29123)""SA7580000260752019000935"
    Then user take screen shot
    And user click on the Add to Payment
    Then user logout the application
    When user enters username  and PassWord "stjrev""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe""Osv@1234"
    Then user decision is "Reject" payment through "Overview"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application

  Scenario: Group user create a payment and executor approve the payment
    Given user is on uat url login page
    When user enters username  and PassWord "stjrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "INTERBANK"
    Then user create Payment "ALRAJHI""(20400...29123)""SA7580000260752019000935"
    Then user take screen shot
    And user click on the Add to Payment
    Then user logout the application
    When user enters username  and PassWord "stjrev""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "stcexe""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application

  Scenario: User Creating sarie payment for Alrajhi to NCB Account
    Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "SARIE"
    Then user create Payment "ALRAJHI""(20400...29123)""SA6610000000122807000101"
    Then user take screen shot
    And user click on the Add to Payment
    Then user logout the application

  Scenario: User Creating Local NEFT payment ICICI to HDFC Account
    Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "SARIE"
    Then user create Payment "ICICI""(00045...00301)""026291800001091"
    Then user take screen shot
    And user click on the Add to Payment
    Then user logout the application

  Scenario: User Creating Local RTGS payment YESBank to HDFC Account
    Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "SARIE"
    Then user create Payment "YesBank""(00019...17042)""50100002965304"
    Then user take screen shot
    And user click on the Add to Payment
    Then user logout the application

  Scenario: User Creating Local NEFT payment ICICI to HDFC Account
    Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "SARIE"
    Then user create Payment "ICICI""(00045...00301)""026291800001091"
    Then user take screen shot
    And user click on the Add to Payment
    Then user logout the application

  Scenario: Reviewer create a payment and Executor send need more info. reviewer send info.executor approve the payment the payment(L1,L3)
    Given user is on uat url login page
    When user enters username  and PassWord "stjrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "INTERBANK"
    Then user create Payment "ALRAJHI""(20400...29123)""SA7580000260752019000935"
    Then user take screen shot
    And user click on the Add to Payment button
    Then user logout the application
    When user enters username  and PassWord "stjrev""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe""Osv@1234"
    Then user decision is "Reject" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application

  Scenario: Reviewer create a payment and Executor Reject the payment(L1,L3)
    Given user is on uat url login page
    When user enters username  and PassWord "stjrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "INTERBANK"
    Then user create Payment "ALRAJHI""(20400...29123)""SA7580000260752019000935"
    Then user take screen shot
    And user click on the Add to Payment button
    Then user logout the application
    When user enters username  and PassWord "stjrev""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe""Osv@1234"
    Then user decision is "Reject" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application

  Scenario: Reveiwer create the payment and approve the Approver,Joint Executor(L1,L2,L3-Multiple)
    Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "INTERBANK"
    Then user create Payment "ALRAJHI""(20400...29123)""SA7580000260752019000935"
    Then user take screen shot
    And user click on the Add to Payment button
    Then user logout the application
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smapp1""Osv@1234"
    Then user decision is "Approve" payment through "Overview"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe1""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "stcexe""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application

  Scenario: Alinma Bank Restract the International Transfer
    Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "SWIFT"
    Then user Alinma create Payment "ALINMA""(SA230...03000)"
    Then user verify International payment is not allowed for selected debit account
    Then user take screen shot
    Then user logout the application

  Scenario: Reviewer  create a payment and approver and executor approve the payment
    Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "INTERBANK"
    Then user create Payment "ALRAJHI""(20400...29123)""SA7580000260752019000935"
    Then user take screen shot
    And user click on the Add to Payment
    Then user logout the application
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smapp1""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe1""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "stcexe""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then close final payment pass or fail popup
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application

  Scenario: Reviewer  create a payment and approver and executor approve the payment
    Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "INTERBANK"
    Then user create Payment "ALRAJHI""(20400...29123)""SA7580000260752019000935"
    Then user take screen shot
    And user click on the Add to Payment
    Then user logout the application
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smapp1""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe1""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "stcexe""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then close final payment pass or fail popup
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application

  Scenario: Reviewer  create a payment and approver and executor approve the payment
    Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "INTERBANK"
    Then user create Payment "ALRAJHI""(20400...29123)""SA7580000260752019000935"
    Then user take screen shot
    And user click on the Add to Payment
    Then user logout the application
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smapp1""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe1""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "stcexe""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then close final payment pass or fail popup
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application

  Scenario: Reviewer  create a payment and approver and executor approve the payment
    Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    Then user click on Transfer
    And user Select the transfer type "INTERBANK"
    Then user create Payment "ALRAJHI""(20400...29123)""SA7580000260752019000935"
    Then user take screen shot
    And user click on the Add to Payment
    Then user logout the application
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smapp1""Osv@1234"
    Then user decision is "Approve" payment through "CheckBox"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "smexe1""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    When user enters username  and PassWord "stcexe""Osv@1234"
    Then user decision is "Approve" payment through "OverviewwithOTP"
    Then close final payment pass or fail popup
    Then user verify the status of payment
    Then user take screen shot
    Then user logout the application
    
