Feature: Search Product


  Background: The user goes to the Products page and verifies All Products is visible
    Given The user launches browser and navigates to automationexercise.com website
    Then The user verifies that home page is visible successfully
    When The user clicks on " Products" page link button

    Then The user verifies that "All Products" is visible


  @case9
  Scenario Outline: The user goes to products page and search a product

    When The user enters "<productName>" in search input and click search button
    Then The user verifies that "Searched Products" is visible
    Then The user verifies that all the products related to search "<productName>" are visible
    Examples:


      | productName |
      | dress       |
      | Tshirt      |
      | T-Shirt     |
      | T SHIRT     |




