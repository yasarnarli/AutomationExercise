package com.autoexercise.step_defs;

import com.autoexercise.pages.HomePage;
import com.autoexercise.pages.ProductsPage;
import com.autoexercise.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Case19_StepDefs {

    ProductsPage productsPage = new ProductsPage();

    @Then("The user verifies that Brands are visible on the left side bar")
    public void the_user_verifies_that_brands_are_visible_on_the_left_side_bar() {
        BrowserUtils.waitForClickablility(productsPage.brands_WE,3);
        Assert.assertTrue(productsPage.brands_WE.isDisplayed());
    }

    @When("The user clicks on {string} brand name")
    public void theUserClicksOnBrandName(String brandName) {
        productsPage.clickingBrand_MTD(brandName);
    }


    @Then("The user verifies that polo {string} text is displayed")
    public void theUserVerifiesThatPoloTextIsDisplayed(String expectedHeader) {
        Assert.assertEquals("polo brand name not matched",expectedHeader,productsPage.poloProducts_WE.getText());
    }

    @Then("The user verifies that madame {string} text is displayed")
    public void theUserVerifiesThatMadameTextIsDisplayed(String expectedHeader) {
        Assert.assertEquals("madame brand name not matched",expectedHeader,productsPage.madameProducts_WE.getText());
    }
}
