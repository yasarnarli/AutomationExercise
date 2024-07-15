package com.autoexercise.step_defs;

import com.autoexercise.pages.ProductsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Case9_StepDefs {
    ProductsPage productsPage = new ProductsPage();

    @When("The user enters {string} in search input and click search button")
    public void the_user_enters_in_search_input_and_click_search_button(String productName) {
        productsPage.productSearchAndClick_MTD(productName);

    }

    @Then("The user verifies that all the products related to search {string} are visible")
    public void theUserVerifiesThatAllTheProductsRelatedToSearchAreVisible(String productName) {
        productsPage.searchedProductVerification_MTD(productName);
    }
}
