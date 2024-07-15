package com.autoexercise.step_defs;

import com.autoexercise.pages.ContactUsPage;
import com.autoexercise.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import javax.swing.*;

public class Case6_StepDefs {
    ContactUsPage contactUsPage = new ContactUsPage();

    @When("The user enters name, email, subject and message")
    public void the_user_enters_name_email_subject_and_message() {
        contactUsPage.fillTheGetInTouchArea_MTD();
    }

    @When("The user uploads a file")
    public void the_user_uploads_a_file() {

    }

    @When("The user clicks submit button and OK button")
    public void the_user_clicks_submit_button_and_ok_button() {
        contactUsPage.clickingSubmitAndOKButton();
    }

    @Then("The user verifies that   {string} is visible successfully in get in touch area")
    public void the_user_verifies_that_is_visible_successfully_in_get_in_touch_area(String expectedMessage) {
        contactUsPage.successfulDetailSubmitVerification_MTD(expectedMessage);
    }

    @When("The user clicks home button")
    public void the_user_clicks_home_button() {
        contactUsPage.navigateBackHomeButton_WE.click();
        BrowserUtils.waitFor(5);

    }

}
