Feature: Add Products in Cart


  @case12
  Scenario: The user adds the first and sceond products to Cart

    Given The user launches browser and navigates to automationexercise.com website
    Then The user verifies that home page is visible successfully
    When The user clicks on " Products" page link button
    And The user hovers over first product and click Add to cart
    And The user clicks Continue Shopping Button
    And The user hovers over second product and clicks Add to Cart
    And The user clicks View Cart button
    Then The user verifies that both products"Blue Top" and "Men Tshirt" are added to Cart
    Then The user verifies that product one's price "Rs. 500", quantity "1", and total "Rs. 500"
    Then The user verifies that product two's price "Rs. 400", quantity "1", and total "Rs. 400"


    