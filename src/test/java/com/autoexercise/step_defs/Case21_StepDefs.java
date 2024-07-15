package com.autoexercise.step_defs;

import com.autoexercise.pages.ProductsPage;
import com.autoexercise.utilities.ConfigurationReader;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Case21_StepDefs {
    ProductsPage productsPage=new ProductsPage();
    Faker faker=new Faker();
    @Then("The user verifies that Write Your Review is visible")
    public void the_user_verifies_that_write_your_review_is_visible() {
        Assert.assertTrue(productsPage.writeYourReview_WE.isDisplayed());
    }

    @When("The user enters name, email and review")
    public void theUserEntersNameEmailAndReview() {
        productsPage.nameForInputReview_WE.sendKeys(ConfigurationReader.get("name"));
        productsPage.emailForInputReview_WE.sendKeys(ConfigurationReader.get("emailAddress"));
        productsPage.inputReview_inTextArea_WE.sendKeys(faker.lorem().paragraph(5));

    }

    @When("The user clicks submit button")
    public void theUserClicksSubmitButton() {
        productsPage.inputReviewSubmitButton_WE.click();
    }

    @Then("The user verifies success message that Thank you for your review.")
    public void theUserVerifiesSuccessMessageThatThankYouForYourReview() {
        Assert.assertTrue(productsPage.thanksForReviewMessage_WE.isDisplayed());
    }
}
