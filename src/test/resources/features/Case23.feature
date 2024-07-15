Feature: Verify address details in checkout page

  @case23
  Scenario: The user creates account, adds product to cart and proceeds yo checkout and deletes account
    Given The user launches browser and navigates to automationexercise.com website
    Then The user verifies that home page is visible successfully
    When The user clicks on " Signup / Login" page link button
    When The user enters name and email adress and clicks Signup button
    When The user fill  details from configuration reader
    And The user fills the details of the address information area and clicks create account button
    Then The user verifies that   "Account Created!" is visible successfully
    When The user clicks continue button
    Then The user verifies that Logged in as username is visible
    When The user hovers over first product on the home page and click Add to cart
    And The user clicks Continue Shopping Button
    And The user clicks on " Cart" page link button
    Then The user verifies that cart page tag "Shopping Cart" is displayed
    When The user clicks Proceed to Checkout button
    Then The user verifies that "Address Details" and "Review Your Order" is visible
    When The user clicks on " Delete Account" page link button
    Then The user verifies that   "Account Deleted!" is visible successfully
    When The user clicks continue button
