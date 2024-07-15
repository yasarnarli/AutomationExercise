package com.autoexercise.step_defs;

import com.autoexercise.pages.ProductsPage;
import com.autoexercise.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class Case12_StepDefs {
    ProductsPage productsPage=new ProductsPage();
    Actions actions=new Actions(Driver.get());
    @When("The user hovers over first product and click Add to cart")
    public void the_user_hovers_over_first_product_and_click_add_to_cart() {
        actions.moveToElement(productsPage.productOne_WE).perform();
        productsPage.productOneAddToCart_WE.click();

    }

    @And("The user clicks Continue Shopping Button")
    public void theUserClicksContinueShoppingButton() {
        productsPage.continueShoppingBtn_WE.click();
    }

    @And("The user hovers over second product and clicks Add to Cart")
    public void theUserHoversOverSecondProductAndClicksAddToCart() {
        actions.moveToElement(productsPage.productTwo_WE).perform();
        productsPage.productTwoAddToCart_WE.click();
    }

    @And("The user clicks View Cart button")
    public void theUserClicksViewCartButton() {
        productsPage.viewCart_WE.click();
    }


    @Then("The user verifies that both products{string} and {string} are added to Cart")
    public void theUserVerifiesThatBothProductsAndAreAddedToCart(String expectedProduct1, String expectedProduct2) {
        Assert.assertEquals("product one not the expected",expectedProduct1,productsPage.productOneName_WE.getText());
        Assert.assertEquals("product two not the expected",expectedProduct2,productsPage.productTwoName_WE.getText());
    }

    @Then("The user verifies that product one's price {string}, quantity {string}, and total {string}")
    public void theUserVerifiesThatProductOneSPriceQuantityAndTotal(String expectedPrice, String expectedQuantity, String expectedTotal) {
        Assert.assertEquals("product one's price not the same",expectedPrice,productsPage.productOnePrice_WE.getText());
        Assert.assertEquals("product one's quantity not the same",expectedQuantity,productsPage.productOneQuantity_WE.getText());
        Assert.assertEquals("product one's total price not the same",expectedTotal,productsPage.productOneTotal_WE.getText());
    }

    @Then("The user verifies that product two's price {string}, quantity {string}, and total {string}")
    public void theUserVerifiesThatProductTwoSPriceQuantityAndTotal(String expectedPrice, String expectedQuantity, String expectedTotal) {
        Assert.assertEquals("product two's price not the same",expectedPrice,productsPage.productTwoPrice_WE.getText());
        Assert.assertEquals("product two's quantity not the same",expectedQuantity,productsPage.productTwoQuantity_WE.getText());
        Assert.assertEquals("product two's total price not the same",expectedTotal,productsPage.productTwoTotal_WE.getText());
    }
}
