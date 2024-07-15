Feature: Register user with existing email

  @case5
  Scenario: The user tries that registering with an existing email
  
    Given The user launches browser and navigates to automationexercise.com website
    Then The user verifies that home page is visible successfully
    When The user clicks on " Signup / Login" page link button
    Then The user verifies that "New User Signup!" is visible
    When The user enters name and email adress and clicks Signup button
    Then The user verifies that error "Email Address already exist!"