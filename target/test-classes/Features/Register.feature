Feature: Providing required data for register using data Table
  Scenario: Register using valid credentials
  	Given url to launch webpage
    When User clicking register Page to enter credentials
    And User clicking radio button
    And User entering firstname,Lastname,email,password and also confirm password
    | FirstName      | LastName    |            Email              | Password    | Confirm Password |
    | Expleo      | Group         | exp@gmail.com             | expleo@123      |  expleo@123          |
    And User clicks register button
    Then Check weather User register successfully