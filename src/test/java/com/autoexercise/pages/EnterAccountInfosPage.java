package com.autoexercise.pages;

import com.autoexercise.utilities.ConfigurationReader;
import com.autoexercise.utilities.Driver;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EnterAccountInfosPage extends BasePage {
    @FindBy(id = "id_gender1")
    public WebElement titleMr_WE;
    @FindBy(id = "password")
    public WebElement password_WE;
    @FindBy(id = "days")
    public WebElement dateOfBirth_Day_WE;
    @FindBy(id = "months")
    public WebElement dateOfBirth_Month_WE;
    @FindBy(id = "years")
    public WebElement dateOfBirth_Year_WE;
    @FindBy(id = "newsletter")
    public WebElement newsletterCheckbox_WE;
    @FindBy(id = "optin")
    public WebElement specialOffersCheckbox_WE;
    @FindBy(id = "first_name")
    public WebElement firstName_WE;
    @FindBy(id = "last_name")
    public WebElement lastName_WE;
    @FindBy(id = "company")
    public WebElement company_WE;
    @FindBy(id = "address1")
    public WebElement address1_WE;
    @FindBy(id = "address2")
    public WebElement address2_WE;
    @FindBy(id = "country")
    public WebElement country_Select_WE;
    @FindBy(id = "state")
    public WebElement state_WE;
    @FindBy(id = "city")
    public WebElement city_WE;
    @FindBy(id = "zipcode")
    public WebElement zipcode_WE;
    @FindBy(id = "mobile_number")
    public WebElement mobile_number_WE;
    @FindBy(xpath = "//button[text()='Create Account']")
    public WebElement createAccountButton_WE;
    @FindBy(xpath = "//b[text()='Account Created!']")
    public WebElement accountCreated_WE;
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement continueSubmit_WE;


    public void inputAccountInfos_MTD() {
        titleMr_WE.click();
        password_WE.sendKeys(ConfigurationReader.get("password"));
        Select select = new Select(dateOfBirth_Day_WE);
        select.selectByVisibleText(ConfigurationReader.get("dateOfBirth_Day"));
        Select select1 = new Select(dateOfBirth_Month_WE);
        select1.selectByVisibleText(ConfigurationReader.get("dateOfBirth_Month"));
        Select select2 = new Select(dateOfBirth_Year_WE);
        select2.selectByVisibleText(ConfigurationReader.get("dateOfBirth_Year"));
    }

    public void inputAddressInfos_MTD() {
        Faker faker = new Faker();
        firstName_WE.sendKeys(ConfigurationReader.get("name"));
        lastName_WE.sendKeys(faker.name().lastName());
        company_WE.sendKeys(faker.company().name());
        address1_WE.sendKeys(faker.address().fullAddress());
        address2_WE.sendKeys(faker.address().secondaryAddress());
        Select select = new Select(country_Select_WE);
        select.selectByVisibleText("United States");
        state_WE.sendKeys(faker.address().state());
        city_WE.sendKeys(faker.address().city());
        zipcode_WE.sendKeys(faker.address().zipCode());
        mobile_number_WE.sendKeys(faker.phoneNumber().cellPhone());
        createAccountButton_WE.click();
    }

    public void created_Delete_AccountVerification_MTD(String expectedMessage) {
        String actualMessage = Driver.get().findElement(By.xpath("//b[text()='"+expectedMessage+"']")).getText();
        Assert.assertEquals("Account Creating Fail", expectedMessage.toLowerCase(), actualMessage.toLowerCase());
        ;

    }
}
