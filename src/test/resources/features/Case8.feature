Feature: Verify All Products and product detail page

  @case8
  Scenario:The user navigates to All Products Page and verifies product detail page
    Given The user launches browser and navigates to automationexercise.com website
    Then The user verifies that home page is visible successfully
    When The user clicks on " Products" page link button
    Then The user verifies that whether the title of the page is "Automation Exercise - All Products"
    Then The user verifies that "All Products" is visible
    When The user clicks on View Product of "1" product
    Then The user is landed to product detail page and verifies that detail is visible:product name,category,price,availability,condition,brand





