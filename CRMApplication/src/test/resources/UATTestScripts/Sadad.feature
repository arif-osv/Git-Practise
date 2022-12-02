Feature:  Sadad Bill Payment

Scenario: different user's creating sadad bill payment
 Given user is on uat url login page
    When user enters username  and PassWord "<Username>""<Password>"
    Then user click on payment button
     Then user click on Transfer
 