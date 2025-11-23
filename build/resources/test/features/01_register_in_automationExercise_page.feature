# Author: Levi
# Language: en

Feature: Register on the AutomationExercises website
  As a user, I want to create a new account to access the services of the website.

  Background:
    Given I am on the Automation Exercise home page.

  Scenario: Successful registration
    Given I am enter the Signup-Login section
    When I enter a valid name and a valid email address
    And I continue to the registration form
    And I complete the required information on the form
    Then the account should be created correctly

  Scenario: Email already registered
    Given that I enter the “Signup / Login” section
    When I try to register with an email that already exists
    Then the message “Email Address already exists!” should be displayed

  Scenario: Invalid email address
    Given that I enter the “Signup / Login” section
    When I try to register with an invalid email address
    Then a message should be displayed indicating that the email address is invalid

  Scenario: Incomplete form data
    Given that I enter the “Signup/Login” section
    When I enter a valid name and email address
    And I proceed to the registration form
    And I leave mandatory fields blank
    Then a message should be displayed indicating the missing fields
