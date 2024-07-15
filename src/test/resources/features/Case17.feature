Feature: Remove Products From Cart

  @case17
  Scenario: The user adds product to cart and removes it from cart
    Given The user launches browser and navigates to automationexercise.com website
    Then The user verifies that home page is visible successfully
    When The user hovers over first product on the home page and click Add to cart
    And The user clicks Continue Shopping Button
    And The user clicks on " Cart" page link button
    Then The user verifies that cart page tag "Shopping Cart" is displayed
    When The user clicks X button corresponding to particular product
    Then The user verifies that product is removed from the cart

