Feature: Add to cart from recommended items

  @case22
  Scenario:  The user scroll to bottom and adds to cart from recommended items
    Given The user launches browser and navigates to automationexercise.com website
    When The user scrolls to bottom of page
    Then The user verifies that RECOMMENDED ITEMS is visible
    When The user clicks on Add To Cart on Recommended product
    And The user clicks View Cart button
    Then The user verifies that product is displayed in cart page

