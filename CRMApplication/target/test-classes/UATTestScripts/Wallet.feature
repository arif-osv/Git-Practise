Feature: Any OSV User Create the wallet Payment

  Scenario: Any OSV User Create the wallet Payment
    Given user is on uat url login page
    When user enters username  and PassWord "smrev""Osv@1234"
    Then user click on payment button
    And user click on wallet button
    And user click on create Wallet button
    Then user enter walletdetails
