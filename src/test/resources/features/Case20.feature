Feature: Search Products and Verify After LOgin

  @case20
  Scenario: The user search products and verifies searched products is visible
    Given The user launches browser and navigates to automationexercise.com website
    When The user clicks on " Products" page link button
    Then The user verifies that "All Products" is visible
    When The user enters product name "jeans" in search input and click search button
    Then The user verifies that SEARCHED PRODUCTS is visible
    Then The user verifies that all the products related to search "jeans" are visible
    When The user adds those products to cart
    When The user clicks on " Cart" page link button
    Then The user verifies that all the products related to search "jeans" are visible
    When The user clicks on " Signup / Login" page link button
    When The user enters correct email address and password and clicks login button
    When The user clicks on " Cart" page link button
    Then The user verifies that all the products related to search "jeans" are visible
