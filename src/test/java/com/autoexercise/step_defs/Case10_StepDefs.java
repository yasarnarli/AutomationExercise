package com.autoexercise.step_defs;

import com.autoexercise.pages.HomePage;
import com.autoexercise.utilities.BrowserUtils;
import com.autoexercise.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Case10_StepDefs {
    HomePage homePage = new HomePage();

    @When("The user scrolls down to footer")
    public void the_user_scrolls_down_to_footer() {
        BrowserUtils.scrollToElement(homePage.subscription_WE);
    }

    @When("The user enters email address in input and click arrow button")
    public void theUserEntersEmailAddressInInputAndClickArrowButton() {
        homePage.inputSubscription_WE.sendKeys(ConfigurationReader.get("emailAddress"));
        homePage.arrowBUtton_WE.click();
    }

    @Then("The user verifies that successful subscribe message {string}")
    public void theUserVerifiesThatSuccessfulSubscribeMessage(String expectedMessage) {
        String actualMessage=homePage.successfulSubscribeMessage_WE.getText();
        Assert.assertEquals("subscription fail",expectedMessage,actualMessage);
    }
}
