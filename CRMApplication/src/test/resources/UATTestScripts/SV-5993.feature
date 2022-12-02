Feature: Payments "Remove all" button added for limit exceeded suggested companies - SV-5993
Scenario: user select multple payments and verify remove all button displayed
 Given user is on uat url login page
  When user enters username  and PassWord "smexe""Osv@1234"
  Then user click on payment button
  Then user click on Transfer
  And user Select the transfer type "INTERBANK"
  And user create bulk amount "ALRAJHI""(20400...29123)""SA7580000260752019000935"
  And user click on the Add to Payment
  Then user click on Transfer
   And user Select the transfer type "INTERBANK"
  Then user create Payment "ALRAJHI""(20400...29123)""SA7580000260752019000935"
    And user click on the Add to Payment
And user select to the newly created two payments
  Then user see the remove button is displaying and click on remove button
  
   