Feature: Add review on product

  @case21
  Scenario: The use
    Given The user launches browser and navigates to automationexercise.com website
    When The user clicks on " Products" page link button
    Then The user verifies that "All Products" is visible
    When The user clicks on View Product of "1" product
    Then The user verifies that Write Your Review is visible
    When The user enters name, email and review
    When The user clicks submit button
    Then The user verifies success message that Thank you for your review.