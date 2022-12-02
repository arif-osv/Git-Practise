Feature: Payments added with switch to hide date column and expand other columns width - SV-5994

Scenario: user verify hide button working properly or not

  Given user is on uat url login page
  When user enters username  and PassWord "smexe""Osv@1234"
  Then user take screen shot
   And user click on "payments" link
  And  user click on "Transfers"
  And user count before swich tabs count
   Then User click on payment switch icon
   And user count after swich tabs count
   Then user verified both are not matching