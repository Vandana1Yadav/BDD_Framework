#Author: Vandana Yadav
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
Feature: To Test Web Order Login Fucntionality

  @smoke
  Scenario: Successful Login with Valid Credentials
    Given User enters Spreecom Login page
    When user enter valid username "vandana@spree.com"
    And user enter valid password "vandanayadav"
    And User click on Login Button
    Then "Spreecom" Home page should display
