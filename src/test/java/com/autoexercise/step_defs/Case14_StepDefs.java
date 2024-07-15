package com.autoexercise.step_defs;

import com.autoexercise.pages.CartPage;
import com.autoexercise.pages.EnterAccountInfosPage;
import com.autoexercise.pages.Signup_LoginPage;
import com.autoexercise.utilities.BrowserUtils;
import com.autoexercise.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Case14_StepDefs {
    CartPage cartPage = new CartPage();
    Signup_LoginPage signupLoginPage = new Signup_LoginPage();
    EnterAccountInfosPage enterAccountInfosPage = new EnterAccountInfosPage();
    Faker faker = new Faker();

    @Then("The user verifies that cart page tag {string} is displayed")
    public void the_user_verifies_that_cart_page_tag_is_displayed(String expectedTag) {
        Assert.assertEquals("expected tag not the same with actual tag", expectedTag, cartPage.shoppingCart_WE.getText());
    }

    @When("The user clicks Proceed to Checkout button")
    public void theUserClicksProceedToCheckoutButton() {
        cartPage.proceedCheckoutBtn_WE.click();
    }


    @And("The user clicks RegisterLogin button")
    public void theUserClicksRegisterLoginButton() {
        cartPage.registerLoginBtn_WE.click();
    }

    @And("The user fills all details in Signup And create account")
    public void theUserFillsAllDetailsInSignupAndCreateAccount() {
        signupLoginPage.newUserSignup_MTD();
        enterAccountInfosPage.inputAccountInfos_MTD();
        enterAccountInfosPage.inputAddressInfos_MTD();
    }

    @Then("The user verifies that {string} and {string} is visible")
    public void theUserVerifiesThatAndIsVisible(String expectedAddres, String expectedOrder) {
        Assert.assertEquals("addres details not visible", expectedAddres, cartPage.addresDetails_WE.getText());
        Assert.assertEquals("review your order not visible", expectedOrder, cartPage.reviewYourOrder_WE.getText());
    }

    @When("The user enters description in comment textarea and clicks Place Order")
    public void theUserEntersDescriptionInCommentTextareaAndClicksPlaceOrder() {
        cartPage.textArea_WE.sendKeys(faker.lorem().paragraph(3));
        cartPage.placeOrder_WE.click();
    }

    @And("The user enters payment details:Name on Card, Card Number, CVC, Expiration date")
    public void theUserEntersPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {
        cartPage.nameOnCardArea_WE.sendKeys(faker.name().fullName());
        cartPage.cardNumberArea_WE.sendKeys(faker.business().creditCardNumber());
        cartPage.cvcArea_WE.sendKeys(faker.number().digits(3));
        cartPage.expiryMonth_WE.sendKeys(faker.business().creditCardExpiry());
        cartPage.expiryYear_WE.sendKeys(faker.business().creditCardExpiry());
    }

    @And("The user clicks Pay and Confirm Order")
    public void theUserClicksPayAndConfirmOrder() {
        cartPage.payAndConfirmOrderBtn_WE.click();

    }

    @Then("The user verifies success message that {string}")
    public void theUserVerifiesSuccessMessageThat(String expectedMessage) {
        Driver.get().navigate().back();
        Assert.assertEquals("place order not successful ",expectedMessage,cartPage.successfulOrderMessage_WE.getText());
        Driver.get().navigate().forward();
    }

}
