Feature: Login
  @validData
  Scenario: Successful Login
    Given User is on HomePage
    When User clicks on Login icon
    #Then User verifies Login form is displayed
  And User enters valid data
    And User clicks on Anmelden button
    #And User click on User icon
    #Then User verifies his name
  Then User verifies login by check mark on login icon
  @wrongEmail
  Scenario Outline: Unsuccessful login with wrong email
    Given User is on HomePage
    When User clicks on Login icon
    And User enters wrong email and valid password
    |email|password|
    |<email>|<password>|
    And User clicks on Anmelden button
    Then User verifies Error message
    Examples:
      |email|password|
      |k@gmail.com|Aa12345!|
      |k111@gmail.com|Aa12345!|


