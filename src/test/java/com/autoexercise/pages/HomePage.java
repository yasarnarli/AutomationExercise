package com.autoexercise.pages;

import com.autoexercise.utilities.BrowserUtils;
import com.autoexercise.utilities.ConfigurationReader;
import com.autoexercise.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {
    @FindBy(xpath = "//a[text()=' Logged in as ']")
    public WebElement loggedAsUsername_WE;
    @FindBy(xpath = "//h2[text()='Subscription']")
    public WebElement subscription_WE;
    @FindBy(id = "susbscribe_email")
    public WebElement inputSubscription_WE;
    @FindBy(id = "subscribe")
    public WebElement arrowBUtton_WE;
    @FindBy(xpath = "//div[text()='You have been successfully subscribed!']")
    public WebElement successfulSubscribeMessage_WE;
    @FindBy(xpath = "//a[@href='/product_details/3'][text()='View Product']")
    public WebElement productThreeViewCartBtn_WE;
    @FindBy(xpath = "(//div[@class='single-products'])[1]")
    public WebElement productOne_WE;
    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[1]")
    public WebElement productOneAddToCart_WE;
    @FindBy(xpath = "//h2[text()='Category']")
    public WebElement category_WE;
    @FindBy(xpath = "(//span[@class='badge pull-right'])[1]")
    public WebElement categoryWomen_WE;
    @FindBy(xpath = "(//span[@class='badge pull-right'])[2]")
    public WebElement categoryMen_WE;
    @FindBy(xpath = "(//span[@class='badge pull-right'])[3]")
    public WebElement categoryKids_WE;
    @FindBy(xpath = "//h2[text()='recommended items']")
    public WebElement recommendedItemsHeader_WE;
    @FindBy(xpath = "(//a[text()='Add to cart'])[69]")
    public WebElement firstRecommendedItemAddToCart_WE;
    @FindBy(xpath = "//i[@class='fa fa-angle-up']")
    public WebElement moveUpwardArrow_WE;
    @FindBy(xpath = "//h2[text()='Full-Fledged practice website for Automation Engineers']")
    public WebElement fullFledgedHeader_WE;
    @FindBy(xpath = "//div[@class='logo pull-left']")
    public WebElement automationExerciseHeader_WE;




    public void homePageVerification_MTD() {
        String expectedTitle = "Automation Exercise";
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("HomePage Title verification fail", expectedTitle, actualTitle);
    }

    public void selectTag_MTD(String pagesTagLink) {
        Driver.get().findElement(By.xpath("//a[text()='" + pagesTagLink + "']")).click();
        BrowserUtils.waitFor(2);
    }

    public void successfulLoginVerification_MTD() {
        String expected = "Logged in as " + ConfigurationReader.get("name");
        String actual = loggedAsUsername_WE.getText();
        Assert.assertEquals("login verification fail", expected, actual);
    }

    public void categoryVerification_MTD(List<String> category) {
        for (String ctgry : category) {
            Assert.assertEquals("Category not the same", ctgry.toLowerCase(), Driver.get().findElement(By.xpath("//div[@id='" + ctgry + "']/..")).getText().toLowerCase());
        }
    }

    public void clickCategory_MTD(String category) {
        switch (category){
            case "Women":{
                categoryWomen_WE.click();
            }
            case "Men":{
                categoryMen_WE.click();
            }
            case "Kids":{
                categoryKids_WE.click();
            }
        }
    }

    public void clickWomenSubCategory_MTD(String subCategory) {
        Driver.get().findElement(By.xpath("//div[@id='Women']//li//a[text()='" + subCategory + "']")).click();
    }
    public void clickMenSubCategory_MTD(String subCategory) {
        Driver.get().findElement(By.xpath("//div[@id='Men']//li//a[text()='" + subCategory + "']")).click();
    }

}
