#Author: Arif Pasha
@RegressionTest
Feature: User management - All users, User search group admin only

Scenario: Group admin verify Pending users count matched or not

Given user is on uat url login page
When user enters username  and PassWord "smadmin""Osv@1234"
Then user take screen shot
Then User click on user management link
And user verify the user status dropdown is showing
Then user can be select one "Standard Metro"
Then user click on Active users dropdown
Then user click on reuired type user "Disabled users"
And Verify the number of users displayed count "Disabled users"
And verify the under rows user displayed count
And both count is equals or not
Then user disable any one user
And Verify the number of users displayed count "Disabled users"
And verify the under rows user displayed count
And both count is equals or not

Scenario: Group admin verify Pending users count matched or not

Given user is on uat url login page
When user enters username  and PassWord "smadmin""Osv@1234"
Then user take screen shot
Then User click on user management link
And user verify the user status dropdown is showing
Then user can be select one "Standard Jewellers"
Then user click on Active users dropdown
Then user click on reuired type user "Pending users"
And Verify the number of users displayed count "Pending users"
And verify the under rows user displayed count
And both count is equals or not

  Scenario: Group admin verify active users count
  
Given user is on uat url login page
When user enters username  and PassWord "smadmin""Osv@1234"
Then user take screen shot
Then User click on user management link
And user verify the user status dropdown is showing
Then user can be select one "Standard Jewellers"
And Verify the number of users displayed count "Active users"
And verify the under rows user displayed count
And both count is equals or not
Then user disable any one user
And Verify the number of users displayed count "Active users"
And verify the under rows user displayed count
And both count is equals or not


Scenario: Group admin verify Pending users count matched or not

Given user is on uat url login page
When user enters username  and PassWord "smadmin""Osv@1234"
Then user take screen shot
Then User click on user management link
And user verify the user status dropdown is showing
Then user can be select one "Standard Metro"
Then user click on Active users dropdown
Then user click on reuired type user "Disabled users"
And Verify the number of users displayed count "Disabled users"
And verify the under rows user displayed count
And both count is equals or not
Then user disable any one user
And Verify the number of users displayed count "Disabled users"
And verify the under rows user displayed count
And both count is equals or not

Scenario: Group admin verify Pending users count matched or not

Given user is on uat url login page
When user enters username  and PassWord "smadmin""Osv@1234"
Then user take screen shot
Then User click on user management link
And user verify the user status dropdown is showing
Then user can be select one "Standard Jewellers"
Then user click on Active users dropdown
Then user click on reuired type user "Pending users"
And Verify the number of users displayed count "Pending users"
And verify the under rows user displayed count
And both count is equals or not

  Scenario: Group admin verify active users count
  
Given user is on uat url login page
When user enters username  and PassWord "smadmin""Osv@1234"
Then user take screen shot
Then User click on user management link
And user verify the user status dropdown is showing
Then user can be select one "Standard Jewellers"
And Verify the number of users displayed count "Active users"
And verify the under rows user displayed count
And both count is equals or not
Then user disable any one user
And Verify the number of users displayed count "Active users"
And verify the under rows user displayed count
And both count is equals or not


Scenario: Group admin verify active users count and disable one user again verify count
  
Given user is on uat url login page
When user enters username  and PassWord "smadmin""Osv@1234"
Then user take screen shot
Then User click on user management link
And user verify the user status dropdown is showing
Then user can be select one "Standard Metro"
And Verify the number of users displayed count "active users"
And verify the under rows user displayed count
And both count is equals or not
Then user disable any one user
And Verify the number of users displayed count "active users"
And verify the under rows user displayed count
And both count is equals or not


Scenario: Group admin verify Pending users count matched or not


Given user is on uat url login page
When user enters username  and PassWord "smadmin""Osv@1234"
Then user take screen shot
Then User click on user management link
And user verify the user status dropdown is showing
Then user can be select one "Standard Metro"
Then user click on Active users dropdown
Then user click on reuired type user "Pending users"
And Verify the number of users displayed count "Pending users"
And verify the under rows user displayed count
And both count is equals or not
Then user disable any one user
And Verify the number of users displayed count "Pending users"
And verify the under rows user displayed count
And both count is equals or not

Scenario: Group admin verify Disable users status change to active user and verify the count matched or not

Given user is on uat url login page
When user enters username  and PassWord "smadmin""Osv@1234"
Then user take screen shot
Then User click on user management link
And user verify the user status dropdown is showing
Then user can be select one "Standard Jewellers"
And Verify the number of users displayed count "Disabled users"
And verify the under rows user displayed count
And both count is equals or not
Then user disable any one user
And Verify the number of users displayed count "Disabled users"
And verify the under rows user displayed count
And both count is equals or not
