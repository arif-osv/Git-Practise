Feature: User management 
@Usermanagement
Scenario: Group admin Creates the new user

Given user is on uat url login page
When user enters username  and PassWord "smadmin""Osv@1234"
Then user take screen shot
Then User click on user management link

