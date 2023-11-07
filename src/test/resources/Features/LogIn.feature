Feature: Login to DemoWebShop WebPage

@ValidCredentials
Scenario: Verification of Login with valid credentials
Given User is on DemoWebShop Home page
When User clicks Login
And User enters valid Email and Password
And User clicks Remember me
And User clicks login button
Then User should be able to login sucessfully
 
@InvalidCredentials
Scenario: Verification of Login with invalid credentials
Given User is on DemoWebShop Home page
When User clicks Login
And User enters valid Email and Password
And User clicks Remember me
And User clicks login button
Then Login will be unsucessful with error message