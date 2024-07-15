Feature: Case1_Register User

  @case1
  Scenario: Registering new user by entering valid credentials and infos
    Given The user launches browser and navigates to automationexercise.com website
    Then The user verifies that home page is visible successfully
    When The user clicks on " Signup / Login" page link button
    Then The user verifies that "New User Signup!" is visible
    When The user enters name and email adress and clicks Signup button
    Then The user verifies that "ENTER ACCOUNT INFORMATION" area is visible
    When The user fill  details from configuration reader
    And The user select checkboxes Sign up for our newsletter! and Receive special offers from our partners!
    And The user fills the details of the address information area and clicks create account button
    Then The user verifies that   "Account Created!" is visible successfully
    When The user clicks continue button
   # And The user clicks on " Delete Account" page link button
    #Then The user verifies that   "Account Deleted!" is visible successfully
    #When The user clicks continue button

