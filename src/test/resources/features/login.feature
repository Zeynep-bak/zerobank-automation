Feature: login with valid credentials


  Scenario: login with valid credentials
    Given the user on the login page
    When the user enters "username" and "password"
    And the user choose back to safety box in error page
    Then the user should be logged homePage


    Scenario Outline:should not login with invalid credentials
      Given the user on the login page
      When the user enters invalid username "<username>" or password "<password>"
      Then the user should see error message
      Examples:
        | username | password |
        | bakls    | 23456    |
        | abcde    | 54321    |
        | 89567    | cbhf     |
        | error    | opera    |