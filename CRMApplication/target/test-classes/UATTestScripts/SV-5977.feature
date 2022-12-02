Feature: Reconciliation : payables / receivables switch - SV-5977
Scenario: User verify the payable and receivables switch is present or not
  Given user is on uat url login page
  When user enters username  and PassWord "smexe""Osv@1234"
  Then user take screen shot
 And  approvals new pages 
 |approve|
  | mon | 
  | tue |
       And user click on "Reconciliation" link
  And  user verify the payable and receivable buttons are displaying
  Then user click on payable button
  And user click on receivable button