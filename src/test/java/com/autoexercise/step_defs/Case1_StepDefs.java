package com.autoexercise.step_defs;

import com.autoexercise.pages.EnterAccountInfosPage;
import com.autoexercise.pages.HomePage;
import com.autoexercise.pages.Signup_LoginPage;
import com.autoexercise.utilities.BrowserUtils;
import com.autoexercise.utilities.ConfigurationReader;
import com.autoexercise.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class Case1_StepDefs {
    HomePage homePage = new HomePage();
    Signup_LoginPage signupLoginPage = new Signup_LoginPage();
    EnterAccountInfosPage enterAccountInfosPage = new EnterAccountInfosPage();

    @Given("The user launches browser and navigates to automationexercise.com website")
    public void the_user_launches_browser_and_navigates_to_automationexercise_com_website() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @Then("The user verifies that home page is visible successfully")
    public void the_user_verifies_that_home_page_is_visible_successfully() {
        homePage.homePageVerification_MTD();
    }

    @When("The user clicks on {string} page link button")
    public void theUserClicksOnPageLinkButton(String pagesTagLink) {
        homePage.selectTag_MTD(pagesTagLink);
    }

    @Then("The user verifies that {string} is visible")
    public void theUserVerifiesThatIsVisible(String expectedHeader) {
        signupLoginPage.isSignupLoginPageHeadersVisible_MTD(expectedHeader);
    }

    @When("The user enters name and email adress and clicks Signup button")
    public void theUserEntersNameAndEmailAdressAndClicksSignupButton() {
        signupLoginPage.newUserSignup_MTD();
    }

    @Then("The user verifies that {string} area is visible")
    public void theUserVerifiesThatAreaIsVisible(String expectedHeader) {
        signupLoginPage.isEnterAccountInformationVisible_MTD(expectedHeader);
    }

    @When("The user fill  details from configuration reader")
    public void theUserFillDetailsFromConfigurationReader() {
        enterAccountInfosPage.inputAccountInfos_MTD();
    }

    @And("The user select checkboxes Sign up for our newsletter! and Receive special offers from our partners!")
    public void theUserSelectCheckboxesSignUpForOurNewsletterAndReceiveSpecialOffersFromOurPartners() {
        enterAccountInfosPage.newsletterCheckbox_WE.click();
        enterAccountInfosPage.specialOffersCheckbox_WE.click();
    }

    @And("The user fills the details of the address information area and clicks create account button")
    public void theUserFillsTheDetailsOfTheAddressInformationAreaAndClicksCreateAccountButton() {
        enterAccountInfosPage.inputAddressInfos_MTD();
    }

    @Then("The user verifies that   {string} is visible successfully")
    public void theUserVerifiesThatIsVisibleSuccessfully(String expectedMessage) {
        enterAccountInfosPage.created_Delete_AccountVerification_MTD(expectedMessage);
    }

    @When("The user clicks continue button")
    public void theUserClicksContinueButton() {
        enterAccountInfosPage.continueSubmit_WE.click();
        BrowserUtils.waitFor(5);
    }
}
