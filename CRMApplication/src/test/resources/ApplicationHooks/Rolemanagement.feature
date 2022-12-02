Feature: Create new Role for any user
@Create_new_user 
Scenario: 
 Given user is on uat url login page
 	When user enters username  and PassWord "nameer_exe""Osv@1234"
Then I Can create new user

@Create_new_Role
Scenario: 
 Given user is on uat url login page
 	When user enters username  and PassWord "nameer_exe""Osv@1234"
Then User create new Role