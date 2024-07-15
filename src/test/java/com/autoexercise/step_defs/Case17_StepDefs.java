package com.autoexercise.step_defs;

import com.autoexercise.pages.CartPage;
import com.autoexercise.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Case17_StepDefs {

    CartPage cartPage = new CartPage();


    @When("The user clicks X button corresponding to particular product")
    public void the_user_clicks_x_button_corresponding_to_particular_product() {
        cartPage.xButton_WE.click();
    }

    @Then("The user verifies that product is removed from the cart")
    public void theUserVerifiesThatProductIsRemovedFromTheCart() {
        BrowserUtils.waitForVisibility(cartPage.cartEmpty_WE,5);
        Assert.assertTrue(cartPage.cartEmpty_WE.isDisplayed());
    }
}
