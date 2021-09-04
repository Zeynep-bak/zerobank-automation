
Feature: menu options
  Background:
    Given the user on the login page
    When the user enters "username" and "password"
    And the user choose back to safety box in error page

  Scenario: the user should see menu options

    Then the user should see following options
      | HOME           |
      | ONLINE BANKING |
      | FEEDBACK       |


  Scenario: the user navigates Account summary
    Then the user navigates to ONLINE BANKING to Account summary
    And the title should be "Zero - Account Summary"
    And Account summary page following account types
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |



  Scenario:Credit Account Tables
    Then the user navigates to ONLINE BANKING to Account summary
    And Credit Account table have to following columns
      | Account     |
      | Credit Card |
      | Balance     |

        @wip
      Scenario: the user navigates account activity link
        Then the user navigates to ONLINE BANKING to Account activity
        And the title should be "Zero - Account Activity"
        And the drop down default option should be "Savings"
#       And the drop down options have to following columns
#          | Savings     |
#          | Checking    |
#          | Loan        |
#          | Credit	Card |
#          | Brokerage   |