Feature: Case4: Logout the user


@case4
  Scenario: The user login nad later logout and navigate login page
    Given The user launches browser and navigates to automationexercise.com website
    Then The user verifies that home page is visible successfully
    When The user clicks on " Signup / Login" page link button
    Then The user verifies that "Login to your account" is visible
    When The user enters correct email address and password and clicks login button
    Then The user verifies that Logged in as username is visible
    When The user clicks on " Logout" page link button
    Then The user verifies that "Login to your account" is visible

