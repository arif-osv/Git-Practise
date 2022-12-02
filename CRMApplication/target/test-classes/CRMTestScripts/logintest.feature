Feature: Title of your feature


  Scenario: User can create one lead and create deal with direct deal tab
    Given user is on staging url login page
    When user enters username  and PassWord "khasim@onesingleview.com""Osv@1234"
    Then user take screen shot
    Then user click on Lead and deals link
  	 Then user take screen shot
    Then user click on create Lead button
    And user fill the all the details
    And user open newly created lead
    Then user click on direct deal button
    
  Scenario: Create company through CRM login
    Given user is on staging url login page
    Then user take screen shot
    When user enters username  and PassWord "khasim@onesingleview.com""Osv@1234"
    Then user click on Lead and deals link
    Then user take screen shot
    Then user click on create Lead button
    And user fill the all the details
    And user open newly created lead
    Then user take screen shot
    Then user verify profile bar status
    Then user login to mail and accept terms and conditions
    Then user take screen shot
    Given user is on staging url login page
    When user enters username  and PassWord "khasim@onesingleview.com""Osv@1234"
    Then user take screen shot
    Then user click on Lead and deals link
    Then user click on Deals button
    Then user take screen shot
    And user open newly created lead
    Then user take screen shot
    Then User Seclected on Contract signed
    Then user take screen shot
    Then User Seclected on Onboard
    Then user take screen shot
    And user fill all the company creation details

  Scenario: Title of your scenario
    Given user is on staging url login page
    Then user take screen shot
    When user enters username  and PassWord "khasim@onesingleview.com""Osv@1234"
    Then user click on Lead and deals link
    Then user take screen shot
    Then user click on create Lead button
    And user fill the all the details
    And user open newly created lead
    Then user take screen shot
    Then user verify profile bar status
    #Then user open the deal
    Then user click on create Lead button
    And user fill the all the details
    And user open newly created lead

  Scenario: Bulk lead sheet upload
    Given user is on staging url login page
    When user enters username  and PassWord "syed@onesingleview.com""Osv@1234"
    Then user click on Lead and deals link
    Then user take screen shot
    Then user click on create Lead button
    And user select Bulk and Upload Bulk
    Then user take screen shot
    Then user click on upload Button

  Scenario: User can create one lead and create deal with direct deal tab
    Given user is on staging url login page
    When user enters username  and PassWord "khasim@onesingleview.com""Osv@1234"
    Then user click on Lead and deals link
    Then user take screen shot
    Then user click on create Lead button
    And user fill the all the details
    And user open newly created lead
    Then user click on direct deal button
