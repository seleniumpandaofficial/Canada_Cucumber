#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@TutorialsNinjaLogin
Feature: Login Scenarios for TutorialsNinja
 
  Background: Given user navigates to login page
 
  Scenario: Login to TutorialsNinja with valid email and valid password
    #Given user navigates to login page
    When user enters valid email address "seleniumpanda@gmail.com" into email field
    And user enters valid password "Selenium@123" into the password field
    And user clicks on Login button
    Then user gets successfully logged in

 Scenario: Login to TutorialsNinja with invalid email and invalid password
    #Given user navigates to login page
    When user enters invalid email address "seleniumpandaa12345@gmail.com" into email field
    And user enters invalid password "Selenium@123456" into the password field
    And user clicks on Login button
    Then user gets a warning message of credentials mismatch
    
Scenario: Login to TutorialsNinja with valid email and invalid password
    #Given user navigates to login page
    When user enters valid email address "seleniumpanda@gmail.com" into email field
    And user enters invalid password "Selenium@123456" into the password field
    And user clicks on Login button
    Then user gets a warning message of credentials mismatch
    
Scenario: Login to TutorialsNinja with invalid email and valid password
    #Given user navigates to login page
    When user enters invalid email address "seleniumpandaa12345@gmail.com" into email field
    And user enters valid password "Selenium@123" into the password field
    And user clicks on Login button
    Then user gets a warning message of credentials mismatch

Scenario: Login to TutorialsNinja without email and password
    #Given user navigates to login page
    When user keeps email address field blank
    And user keeps password field blank
    And user clicks on Login button
    Then user gets a warning message of credentials mismatch