package com.autoexercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
    @FindBy(xpath = "//li[text()='Shopping Cart']")
    public WebElement shoppingCart_WE;
    @FindBy(xpath = "//a[text()='Proceed To Checkout']")
    public WebElement proceedCheckoutBtn_WE;
    @FindBy(xpath = "//u[text()='Register / Login']")
    public WebElement registerLoginBtn_WE;
    @FindBy(xpath = "//h2[text()='Address Details']")
    public WebElement addresDetails_WE;
    @FindBy(xpath = "//h2[text()='Review Your Order']")
    public WebElement reviewYourOrder_WE;
    @FindBy(css = "[class='form-control']")
    public WebElement textArea_WE;
    @FindBy(css = "[class='btn btn-default check_out']")
    public WebElement placeOrder_WE;

    @FindBy(css = "[name='name_on_card']")
    public WebElement nameOnCardArea_WE;
    @FindBy(css = "[name='card_number']")
    public WebElement cardNumberArea_WE;
    @FindBy(css = "[name='cvc']")
    public WebElement cvcArea_WE;
    @FindBy(css = "[name='expiry_month']")
    public WebElement expiryMonth_WE;
    @FindBy(css = "[name='expiry_year']")
    public WebElement expiryYear_WE;
    @FindBy(css = "[data-qa='pay-button']")
    public WebElement payAndConfirmOrderBtn_WE;
    @FindBy(xpath = "//div[@id='success_message']//div[@class='alert-success alert']")
    public WebElement successfulOrderMessage_WE;
    @FindBy(xpath = "//i[@class='fa fa-times']")
    public WebElement xButton_WE;
    @FindBy(xpath = "//b[text()='Cart is empty!']")
    public WebElement cartEmpty_WE;
    @FindBy(xpath = "//a[text()='Blue Top']")
    public WebElement blueTopDescription_WE;

}
