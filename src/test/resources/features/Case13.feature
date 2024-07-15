Feature: Verify Product Quantity in Cart

  @case13
  Scenario: The user clicks any product's 'View Product', increases quantity and verifies that in cart page
    Given The user launches browser and navigates to automationexercise.com website
    Then The user verifies that home page is visible successfully
    When The user clicks 'View Cart' button of any product on home page
    Then The user verifes that product detail "Sleeveless Dress" and "Category: Women > Dress" is opened
    When The user increases the quantity to "4"
    When The user clicks Add to Cart button
    And The user clicks View Cart button on Pop Up
    Then The user verifies that product is displayed in cart page with exact quantity "4"
