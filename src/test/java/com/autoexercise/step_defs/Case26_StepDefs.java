package com.autoexercise.step_defs;

import com.autoexercise.pages.HomePage;
import com.autoexercise.utilities.BrowserUtils;
import io.cucumber.java.en.When;

import javax.sql.rowset.BaseRowSet;

public class Case26_StepDefs {
    HomePage homePage=new HomePage();
    @When("The user scrolls up page to top")
    public void the_user_scrolls_up_page_to_top() {
        BrowserUtils.scrollToElement(homePage.automationExerciseHeader_WE);
    }
}
