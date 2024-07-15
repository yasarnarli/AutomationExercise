Feature: Place Order: Register before Checkout

  @case15
  Scenario: The user places order and registers before check out
    Given The user launches browser and navigates to automationexercise.com website
    Then The user verifies that home page is visible successfully
    When The user clicks on " Signup / Login" page link button
    And The user fills all details in Signup And create account
    Then The user verifies that   "Account Created!" is visible successfully
    When The user clicks continue button
    Then The user verifies that Logged in as username is visible
    When The user hovers over first product on the home page and click Add to cart
    And The user clicks Continue Shopping Button
    And The user clicks on " Cart" page link button
    Then The user verifies that cart page tag "Shopping Cart" is displayed
    When The user clicks Proceed to Checkout button
    Then The user verifies that "Address Details" and "Review Your Order" is visible
    When The user enters description in comment textarea and clicks Place Order
    And The user enters payment details:Name on Card, Card Number, CVC, Expiration date
    And The user clicks Pay and Confirm Order
    Then The user verifies success message that "Your order has been placed successfully!"
    When The user clicks on " Delete Account" page link button
    Then The user verifies that   "Account Deleted!" is visible successfully
    When The user clicks continue button
