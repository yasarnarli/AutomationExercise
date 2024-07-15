Feature: Contact us form

  @case6
  Scenario: The user navigates to Contact us tag page link and fills the necessary areas
    Given The user launches browser and navigates to automationexercise.com website
    Then The user verifies that home page is visible successfully
    When The user clicks on " Contact us" page link button
    Then The user verifies that "Get In Touch" is visible
    When The user enters name, email, subject and message
    And The user uploads a file
    And The user clicks submit button and OK button
    Then The user verifies that   "Success! Your details have been submitted successfully." is visible successfully in get in touch area
    When The user clicks home button
    Then The user verifies that home page is visible successfully
    #homepage verification failed