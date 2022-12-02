Feature: Dual Admin Creation

Scenario Outline:Super Admin Login to the Application and Create one new company with dual admin.

 Given user is on uat url login page
  When user enters username  and PassWord "khasim@onesingleview.com""12345"
  Then User Create a New Group 
  And open the created group
  And User create a new Company "<CompanyName>"
  And User create the rolls
  Then Create new User 
When User fill the new user details 

|username| EmailID               | MobileNumber|NationalId|Role|
|pashaosv|kaishpashamda@gmail.com|1234567123   |782187218 |Reviewer|
  
 
  Examples:
  |CompanyName|AdminType|
  |ariorps|Dual|
  |Arifinfo|Dual|
  |ArifTech| Dual| 
 
 

Scenario: Create new user for dual Admin 
  Given user is on uat url login page
  When user enters username  and PassWord "pashaone""Osv@1234"
Then Create new User 
When User fill the new user details 

|username| EmailID               | MobileNumber|NationalId|Role|
|pashaosv|kaishpashamda@gmail.com|1234567123   |782187218 |Reviewer|
|arifosv|bannpashamda@gmail.com  |721782178218 |7832783278|Reviewer|



Scenario: Create new role for admin
 Given user is on uat url login page
  When user enters username  and PassWord "pashaone""Osv@1234"
And User create the rolls

Scenario: Create new user for dual Admin 
  Given user is on uat url login page
  When user enters username  and PassWord "pashaone""Osv@1234"
Then Create new User  


Scenario Outline: Dual Admin Creation flow
  Given user is on uat url login page
  When user enters username  and PassWord "khasim@onesingleview.com""12345"
 # Then User Create a New Group 
  And open the created group
  And User create a new Company "<CompanyName>"
 # And user fill the create first Admin data
#	 And user login to the email and verify the user
	# And user fill the create second Admin data
#	 And user login to the email and verify the user
#And User create the rolls
Then Create new User
  
  Examples:
  |CompanyName|AdminType|
  |ariorps|Dual|
  |Arifinfo|Dual|
  |ArifTech| Dual|