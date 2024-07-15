Feature: Verify Scroll Up without 'Arrow' button and Scroll Down functionality

  @case26
  Scenario: The user scrolls down and up without arrow button the pages and verifies that
    Given The user launches browser and navigates to automationexercise.com website
    Then The user verifies that home page is visible successfully
    When The user scrolls down to footer
    Then The user verifies that SUBSCRIPTION is visible
    When The user scrolls up page to top
    Then The user verifies that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen