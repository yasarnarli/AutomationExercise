package com.autoexercise.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCasesPage extends BasePage{

    @FindBy(xpath = "//b[text()='Test Cases']")
    public WebElement testCasesHeader_WE;

    public void navigatedToTestCasesPageVerification_MTD(String expectedHeader){
        String actualHeader=testCasesHeader_WE.getText();
        Assert.assertEquals("Navigating to Test Cases Page verification fail",expectedHeader.toLowerCase(),actualHeader.toLowerCase());
    }
}
