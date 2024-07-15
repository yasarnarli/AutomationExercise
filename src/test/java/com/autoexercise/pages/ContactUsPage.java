package com.autoexercise.pages;

import com.autoexercise.utilities.Driver;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage {
    @FindBy(xpath = "//input[@name='name']")
    public WebElement getInTouchName_WE;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement getInTouchEmail_WE;
    @FindBy(xpath = "//input[@name='subject']")
    public WebElement getInTouchSubject_WE;
    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement getInTouchYourMessage_WE;
    @FindBy(xpath = "//input[@name='submit']")
    public WebElement getInTouchSumbitButton_WE;
    @FindBy(xpath = "(//div[text()='Success! Your details have been submitted successfully.'])[1]")
    public WebElement successfulSubmitMessage_WE;
    @FindBy(xpath = "//span[text()=' Home']")
    public WebElement navigateBackHomeButton_WE;


    public void fillTheGetInTouchArea_MTD() {
        Faker faker = new Faker();
        getInTouchName_WE.sendKeys(faker.name().fullName());
        getInTouchEmail_WE.sendKeys(faker.internet().emailAddress());
        getInTouchSubject_WE.sendKeys(faker.lorem().sentence());
        getInTouchYourMessage_WE.sendKeys(faker.lorem().paragraph());
    }

    public void clickingSubmitAndOKButton() {
        getInTouchSumbitButton_WE.click();
        Alert alert = Driver.get().switchTo().alert();
        alert.accept();
    }
    public void successfulDetailSubmitVerification_MTD(String expectedMessage){
        String actualMessage=successfulSubmitMessage_WE.getText();
        Assert.assertEquals("Successful Submit verification fail",expectedMessage,actualMessage);
    }


}
