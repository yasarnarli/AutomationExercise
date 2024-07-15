package com.autoexercise.step_defs;

import com.autoexercise.pages.ProductsPage;
import com.autoexercise.utilities.BrowserUtils;
import com.autoexercise.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class Case20_StepDefs {
    ProductsPage productsPage=new ProductsPage();
    Actions actions=new Actions(Driver.get());

    @When("The user enters product name {string} in search input and click search button")
    public void the_user_enters_product_name_in_search_input_and_click_search_button(String productName) {
                productsPage.inputSearchProduct_WE.sendKeys(productName);
                productsPage.searchButton_WE.click();
    }

    @Then("The user verifies that SEARCHED PRODUCTS is visible")
    public void theUserVerifiesThatSEARCHEDPRODUCTSIsVisible() {
        Assert.assertTrue("searched products is not displayed",productsPage.searchedProductsHeader_WE.isDisplayed());
    }

    @When("The user adds those products to cart")
    public void theUserAddsThoseProductsToCart() {

        BrowserUtils.waitFor(2);
        actions.moveToElement(productsPage.firstJeans_WE).perform();
        BrowserUtils.waitFor(2);
        productsPage.addToCartFirstJeans_WE.click();
        BrowserUtils.waitFor(2);
        productsPage.continueShoppingBtn_WE.click();
        actions.moveToElement(productsPage.secondJeans_WE).perform();
        BrowserUtils.waitFor(2);
        productsPage.addToCartSecondJeans_WE.click();
        productsPage.continueShoppingBtn_WE.click();
        BrowserUtils.waitFor(2);
        actions.moveToElement(productsPage.thirdJeans_WE).perform();
        BrowserUtils.waitFor(2);
        productsPage.addToCartThirdJeans_WE.click();
        productsPage.continueShoppingBtn_WE.click();

    }
}
