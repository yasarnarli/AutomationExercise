package com.autoexercise.step_defs;

import com.autoexercise.pages.HomePage;
import com.autoexercise.pages.ProductsPage;
import com.autoexercise.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class Case13_StepDefs {
    HomePage homePage=new HomePage();
    ProductsPage productsPage=new ProductsPage();

    @When("The user clicks {string} button of any product on home page")
    public void the_user_clicks_button_of_any_product_on_home_page(String string) {
        homePage.productThreeViewCartBtn_WE.click();
    }


    @Then("The user verifes that product detail {string} and {string} is opened")
    public void theUserVerifesThatProductDetailAndIsOpened(String expectedName, String expectedCategory) {
        Assert.assertEquals("expected name not the same",expectedName,productsPage.productThreeProductName_WE.getText());
        Assert.assertEquals("expected category not the same", expectedCategory,productsPage.productThreeCategory_WE.getText());
    }

    @When("The user increases the quantity to {string}")
    public void theUserIncreasesTheQuantityTo(String accruement) {
        productsPage.increasingTheProduct_MTD(accruement);
    }

    @When("The user clicks Add to Cart button")
    public void theUserClicksAddToCartButton() {
        productsPage.addToCartBtn_WE.click();
    }

    @And("The user clicks View Cart button on Pop Up")
    public void theUserClicksViewCartButtonOnPopUp() {
        productsPage.popUpViewCartBtn_WE.click();
    }

    @Then("The user verifies that product is displayed in cart page with exact quantity {string}")
    public void theUserVerifiesThatProductIsDisplayedInCartPageWithExactQuantity(String expectedQuantity) {
        Assert.assertEquals("Expected quantity not the same with actual",expectedQuantity,productsPage.productThreeQuantity_WE.getText());
    }
}
