package com.autoexercise.step_defs;

import com.autoexercise.pages.HomePage;
import com.autoexercise.pages.Signup_LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Case2_StepDefs {
    Signup_LoginPage signupLoginPage = new Signup_LoginPage();
    HomePage homePage = new HomePage();

    @When("The user enters correct email address and password and clicks login button")
    public void the_user_enters_correct_email_address_and_password_and_clicks_login_button() {
        signupLoginPage.loginToYourAccount_MTD();

    }

    @Then("The user verifies that Logged in as username is visible")
    public void theUserVerifiesThatLoggedInAsUsernameIsVisible() {
        homePage.successfulLoginVerification_MTD();
    }
}
