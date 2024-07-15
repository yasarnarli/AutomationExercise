package com.autoexercise.step_defs;

import com.autoexercise.pages.HomePage;
import com.autoexercise.pages.ProductsPage;
import com.autoexercise.utilities.BrowserUtils;
import com.autoexercise.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class Case18_StepDefs {
    HomePage homePage=new HomePage();
    ProductsPage productsPage=new ProductsPage();
    @Then("The user verifies that categories are visible on the left side")
    public void the_user_verifies_that_are_visible_on_the_left_side(List<String>category) {
        Assert.assertTrue(homePage.category_WE.isDisplayed());
        homePage.categoryVerification_MTD(category);
    }

    @When("The user clicks on {string} category")
    public void theUserClicksOnCategory(String category) {
        homePage.clickCategory_MTD(category);

    }

    @And("The user clicks on any category link under Women category, for example: {string}")
    public void theUserClicksOnAnyCategoryLinkUnderWomenCategoryForExample(String subCategory) {
        homePage.clickWomenSubCategory_MTD(subCategory);
    }

    @Then("The user verifies that products page is displayed and confirms that text {string}")
    public void theUserVerifiesThatProductsPageIsDisplayedAndConfirmsThatText(String expectedHeader) {
        String actaulTitle= Driver.get().getTitle();
        String expectedTitle="Automation Exercise - Tops Products";
        Assert.assertEquals("title not the same",expectedTitle,actaulTitle);
        Assert.assertEquals("header not the same",expectedHeader,productsPage.topProductsHeader_WE.getText());

    }

    @And("The user clicks on any category link under Men category, for example: {string}")
    public void theUserClicksOnAnyCategoryLinkUnderMenCategoryForExample(String subCategory) {
        BrowserUtils.waitFor(2);
        homePage.clickMenSubCategory_MTD(subCategory);
    }

    @Then("The user verifies that for Men products page is displayed and confirms that text {string}")
    public void theUserVerifiesThatForMenProductsPageIsDisplayedAndConfirmsThatText(String expectedHeader) {
        String actaulTitle= Driver.get().getTitle();
        String expectedTitle="Automation Exercise - Jeans Products";
        Assert.assertEquals("title not the same",expectedTitle,actaulTitle);
        Assert.assertEquals("header not the same",expectedHeader,productsPage.jeansProductsHeader_WE.getText());
    }
}
