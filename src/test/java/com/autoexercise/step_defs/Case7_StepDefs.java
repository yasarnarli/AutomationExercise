package com.autoexercise.step_defs;

import com.autoexercise.pages.TestCasesPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Case7_StepDefs {
    TestCasesPage testCasesPage=new TestCasesPage();

    @Then("The user verifies that navigated to {string} page")
    public void the_user_verifies_that_navigated_to_page(String string) {
     testCasesPage.navigatedToTestCasesPageVerification_MTD(string);
    }


}
