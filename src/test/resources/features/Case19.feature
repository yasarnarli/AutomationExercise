Feature: View & Cart Brand Products

  @case19
  Scenario: The user views cart brand products

    Given The user launches browser and navigates to automationexercise.com website
    When The user clicks on " Products" page link button
    Then The user verifies that Brands are visible on the left side bar
    When The user clicks on "Polo" brand name
    Then The user verifies that polo "BRAND - POLO PRODUCTS" text is displayed
    When The user clicks on "Madame" brand name
    Then The user verifies that madame "BRAND - MADAME PRODUCTS" text is displayed


