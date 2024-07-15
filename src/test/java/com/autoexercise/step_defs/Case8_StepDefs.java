package com.autoexercise.step_defs;

import com.autoexercise.pages.ProductsPage;
import com.autoexercise.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Case8_StepDefs {
    ProductsPage productsPage = new ProductsPage();

    @Then("The user verifies that whether the title of the page is {string}")
    public void the_user_verifies_that_whether_the_title_of_the_page_is(String expectedTitle) {
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Title Verification is fail", expectedTitle, actualTitle);
    }

    @When("The user clicks on View Product of {string} product")
    public void theUserClicksOnViewProductOfProduct(String order) {
        productsPage.selectingTheViewProductByProductOrder(order);
    }

    @Then("The user is landed to product detail page and verifies that detail is visible:product name,category,price,availability,condition,brand")
    public void theUserIsLandedToProductDetailPageAndVerifiesThatDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
        productsPage.verificationOfProductDetails_MTD();
    }
}
