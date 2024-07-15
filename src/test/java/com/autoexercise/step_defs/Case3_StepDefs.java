package com.autoexercise.step_defs;

import com.autoexercise.pages.Signup_LoginPage;
import com.autoexercise.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;

public class Case3_StepDefs {
    Signup_LoginPage signupLoginPage = new Signup_LoginPage();

    @When("The user enters incorrect {string} and {string} and clicks login button")
    public void the_user_enters_incorrect_and_and_clicks_login_button(String string1, String string2) {
        signupLoginPage.loginWithIncorrectCredentials_MTD(string1, string2);
    }

    @Then("The user verifies that error {string}")
    public void the_user_verifies_that_error(String expectedMessage) {
        signupLoginPage.incorrectLoginMessageVerification_MTD(expectedMessage);
    }
}
