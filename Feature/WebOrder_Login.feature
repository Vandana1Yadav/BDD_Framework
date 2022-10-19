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
    # Given weborder login page
    Given User is on Web Order url
    # When user enter valid username
    When User Enter the Login "Tester"
    # When user enter valid password
    And User Enter the Password "test" 
    And User click on Login Button
    #user should be on List of All Orders page
    Then "WebOrder" Home page should display

  Scenario: Successful LogOut
    When User should be able to from the Application by clicking on LogOut
    Then User should be taken back to LogIn page
