#Author: Abhinay Dixit
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
Feature: To Test WeBorder Login functionality with multiple value
@smoke
  Scenario Outline: Successful Login with multiple Valid Credentials
    #Scenario: Successful Login with Valid Credentials
    #Given User is on WebOrder Home Page
    Given User is on WebOrder Login Page
    When User enters "<Username>" and "<Password>" of WebOrder app
    And User click on Login button of WebOrder app
    Then User should get proper "<ExpResult>"

    Examples: With Multiple Data
      | Username | Password | ExpResult                  |
      | Tester   | test1    | Invalid Login or Password. |
      | Tester1  | test     | Invalid Login or Password. |
      |          | test     | Invalid Login or Password. |
      | Tester   | test     | Logout                     |
