Feature: View Category Products

  @case18
  Scenario: The user verifies categories
    Given The user launches browser and navigates to automationexercise.com website
    Then The user verifies that categories are visible on the left side
    |Women|
    |Men|
    |Kids|
    When The user clicks on "Women" category
    And The user clicks on any category link under Women category, for example: "Tops "
    Then The user verifies that products page is displayed and confirms that text "WOMEN - TOPS PRODUCTS"
    And The user clicks on "Men" category
    And The user clicks on any category link under Men category, for example: "Jeans "
    Then The user verifies that for Men products page is displayed and confirms that text "MEN - JEANS PRODUCTS"