package com.autoexercise.step_defs;

import com.autoexercise.pages.HomePage;
import com.autoexercise.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Case25_StepDefs {
    HomePage homePage = new HomePage();

    @Then("The user verifies that SUBSCRIPTION is visible")
    public void the_user_verifies_that_subscription_is_visible() {
        Assert.assertTrue("subscription is not displayed", homePage.subscription_WE.isDisplayed());
    }

    @When("The user clicks on arrow at bottom right side to move upward")
    public void theUserClicksOnArrowAtBottomRightSideToMoveUpward() {
        homePage.moveUpwardArrow_WE.click();
    }

    @Then("The user verifies that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen")
    public void theUserVerifiesThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen() {
        Assert.assertTrue("Full Fledged Automation text is not displayed", homePage.fullFledgedHeader_WE.isDisplayed());
    }
}
