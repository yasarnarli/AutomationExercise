Feature: Verify Subscription in homepage

  @case10
  Scenario: The user subscribes succesfully
    Given The user launches browser and navigates to automationexercise.com website
    Then The user verifies that home page is visible successfully
    When The user scrolls down to footer
    Then The user verifies that "Subscription" is visible
    When The user enters email address in input and click arrow button
    Then The user verifies that successful subscribe message "You have been successfully subscribed!"