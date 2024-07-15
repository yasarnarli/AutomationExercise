package com.autoexercise.step_defs;

import com.autoexercise.pages.CartPage;
import com.autoexercise.pages.HomePage;
import com.autoexercise.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Case22_StepDefs {
    HomePage homePage=new HomePage();
    CartPage cartPage=new CartPage();

    @When("The user scrolls to bottom of page")
    public void the_user_scrolls_to_bottom_of_page() {
        BrowserUtils.scrollToElement(homePage.recommendedItemsHeader_WE);
    }

    @Then("The user verifies that RECOMMENDED ITEMS is visible")
    public void theUserVerifiesThatRECOMMENDEDITEMSIsVisible() {
        Assert.assertTrue(homePage.recommendedItemsHeader_WE.isDisplayed());
    }

    @When("The user clicks on Add To Cart on Recommended product")
    public void theUserClicksOnAddToCartOnRecommendedProduct() {
        homePage.firstRecommendedItemAddToCart_WE.click();
    }

    @Then("The user verifies that product is displayed in cart page")
    public void theUserVerifiesThatProductIsDisplayedInCartPage() {
        Assert.assertTrue(cartPage.blueTopDescription_WE.isDisplayed());
    }
}
