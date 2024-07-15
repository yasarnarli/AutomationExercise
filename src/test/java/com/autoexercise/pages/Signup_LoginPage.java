package com.autoexercise.pages;

import com.autoexercise.utilities.ConfigurationReader;
import com.autoexercise.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signup_LoginPage extends BasePage {
    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameInput_WE;
    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement emailInputForNewUser_WE;
    @FindBy(xpath = "//button[@type='submit'][text()='Signup']")
    public WebElement signUpButton_WE;
    @FindBy(xpath = "(//input[@name='email'])[1]")
    public WebElement emailInputForLogin_WE;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInputForLogin_WE;
    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton_WE;
    @FindBy(xpath = "//b[text()='Enter Account Information']")
    public WebElement enterAccountInfo_WE;



    public void isSignupLoginPageHeadersVisible_MTD(String expectedHeader) {
        String actualHeader = Driver.get().findElement(By.xpath("//div//h2[text()='" + expectedHeader + "']")).getText();
        Assert.assertEquals("New User Signup! verification fail ", expectedHeader.toLowerCase(), actualHeader.toLowerCase());
    }

    public void newUserSignup_MTD() {
        nameInput_WE.sendKeys(ConfigurationReader.get("name"));
        emailInputForNewUser_WE.sendKeys(ConfigurationReader.get("emailAddress"));
        signUpButton_WE.click();
    }

    public void isEnterAccountInformationVisible_MTD(String expectedHeader) {
        String actualHeader = enterAccountInfo_WE.getText();
        Assert.assertEquals("Enter Account Information Header verification fail", expectedHeader, actualHeader);
    }
    public void loginToYourAccount_MTD(){
        emailInputForLogin_WE.sendKeys(ConfigurationReader.get("emailAddress"));
        passwordInputForLogin_WE.sendKeys(ConfigurationReader.get("password"));
        loginButton_WE.click();
    }
    public void loginWithIncorrectCredentials_MTD(String emailAddress, String password){
        emailInputForLogin_WE.sendKeys(emailAddress);
        passwordInputForLogin_WE.sendKeys(password);
        loginButton_WE.click();
    }
    public void incorrectLoginMessageVerification_MTD(String expectedMessage){
        String actualMessage=Driver.get().findElement(By.xpath("//p[text()='"+expectedMessage+"']")).getText();
        Assert.assertEquals("Incorrect Login Verification Fail",expectedMessage,actualMessage);
    }

}
