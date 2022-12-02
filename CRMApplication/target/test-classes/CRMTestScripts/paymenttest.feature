Feature: Payment scenario's


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
