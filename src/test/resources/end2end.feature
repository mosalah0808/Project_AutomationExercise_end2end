Feature: Automation end2end tests   to verify users scenarios on 'http://automationexercise.com'
  As a new user
  I want to create an account on the webpage
  I want login to my account
  So that I can access the website's features

  Scenario: Registration new user
    Given I am on HomePage'
    When  Verify that home page is visible successfully
    Then  Verify 'New User Signup!' is visible
    When  Enter name and email address and  Click 'Signup' button
    Then Verify that 'ENTER ACCOUNT INFORMATION' is visible
    When  Enter account and address information  and  Click 'Create Account' button
    Then Verify that 'ACCOUNT CREATED!' is visible and Click 'Continue' button
    Then Verify that 'Logged in as username' is visible
    When  Click 'Delete Account' button
    Then Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button







