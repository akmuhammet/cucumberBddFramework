Feature: login action

Scenario: Successful login with valid credentials

  Given User is already on Login Page
  When title of page is "Sign In"
  Then User enters User Id with "janallaberdi@gmail.com" and Password with "211243Tm"
  And User clicks on Log In button
  Then User is on Dashboard Page with title "Dashboard Home Feed | Dice.com"
