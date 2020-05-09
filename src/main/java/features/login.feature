Feature: login action

Scenario: Successful login with valid credentials

  Given User is already on Login Page
  When title of page is "American Express - Login"
  Then User enters User Id with "myCoolUser" and Password with "myPassword"
  And User clicks on Log In button
  Then User is on Dashboard Page
