package com.autoexercise.step_defs;

import com.autoexercise.pages.HomePage;
import com.autoexercise.utilities.Driver;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class Case15_StepDefs {
    HomePage homePage=new HomePage();
    Actions actions=new Actions(Driver.get());

    @When("The user hovers over first product on the home page and click Add to cart")
    public void the_user_hovers_over_first_product_on_the_home_page_and_click_add_to_cart() {
        actions.moveToElement(homePage.productOne_WE).perform();
        homePage.productOneAddToCart_WE.click();


    }
}
