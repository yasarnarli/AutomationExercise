package com.autoexercise.pages;

import com.autoexercise.utilities.BrowserUtils;
import com.autoexercise.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends BasePage {
    @FindBy(xpath = "//div[@class='product-information']")
    public WebElement productDetails_WE;
    @FindBy(id = "search_product")
    public WebElement inputSearchProduct_WE;
    @FindBy(id = "submit_search")
    public WebElement searchButton_WE;
    @FindBy(xpath = "//div[@class='productinfo text-center']//p")
    public List<WebElement> searchedProducts_WES;
    @FindBy(xpath = "(//div[@class='col-sm-4'])[2]")
    public WebElement productOne_WE;
    @FindBy(xpath = "(//a[@data-product-id='1'])[2][text()='Add to cart']")
    public WebElement productOneAddToCart_WE;
    @FindBy(xpath = "//button[text()='Continue Shopping']")
    public WebElement continueShoppingBtn_WE;
    @FindBy(xpath = "(//div[@class='col-sm-4'])[3]")
    public WebElement productTwo_WE;
    @FindBy(xpath = "(//a[@data-product-id='2'])[2][text()='Add to cart']")
    public WebElement productTwoAddToCart_WE;
    @FindBy(xpath = "//u[text()='View Cart']")
    public WebElement viewCart_WE;
    @FindBy(xpath = "//tr[@id='product-1']//h4//a")
    public WebElement productOneName_WE;
    @FindBy(xpath = "//tr[@id='product-2']//h4//a")
    public WebElement productTwoName_WE;
    @FindBy(xpath = "(//tr[@id='product-1']//td)[3]//p")
    public WebElement productOnePrice_WE;
    @FindBy(xpath = "(//tr[@id='product-1']//td)[4]//button")
    public WebElement productOneQuantity_WE;
    @FindBy(xpath = "(//tr[@id='product-1']//td)[5]//p")
    public WebElement productOneTotal_WE;

    @FindBy(xpath = "(//tr[@id='product-2']//td)[3]//p")
    public WebElement productTwoPrice_WE;
    @FindBy(xpath = "(//tr[@id='product-2']//td)[4]//button")
    public WebElement productTwoQuantity_WE;
    @FindBy(xpath = "(//tr[@id='product-2']//td)[5]//p")
    public WebElement productTwoTotal_WE;

    @FindBy(xpath = "//h2[text()='Sleeveless Dress']")
    public WebElement productThreeProductName_WE;
    @FindBy(xpath = "//p[text()='Category: Women > Dress']")
    public WebElement productThreeCategory_WE;
    @FindBy(id = "quantity")
    public WebElement productQuantityArea_WE;

    @FindBy(xpath = "//button[@class='btn btn-default cart']")
    public WebElement addToCartBtn_WE;
    @FindBy(xpath = "//u[text()='View Cart']")
    public WebElement popUpViewCartBtn_WE;
    @FindBy(xpath = "//button[@class='disabled']")
    public WebElement productThreeQuantity_WE;
    @FindBy(xpath = "//h2[text()='Women - Tops Products']")
    public WebElement topProductsHeader_WE;
    @FindBy(xpath = "//h2[text()='Men - Jeans Products']")
    public WebElement jeansProductsHeader_WE;
    @FindBy(xpath = "//h2[text()='Brands']")
    public WebElement brands_WE;
    @FindBy(xpath = "//h2[text()='Brand - Polo Products']")
    public WebElement poloProducts_WE;
    @FindBy(xpath = "//h2[text()='Brand - Madame Products']")
    public WebElement madameProducts_WE;
    @FindBy(xpath = "//h2[text()='Searched Products']")
    public WebElement searchedProductsHeader_WE;
    @FindBy(xpath = "(//a[text()='Add to cart'])[2]")
    public WebElement addToCartFirstJeans_WE;
    @FindBy(xpath = "(//a[text()='Add to cart'])[4]")
    public WebElement addToCartSecondJeans_WE;
    @FindBy(xpath = "(//a[text()='Add to cart'])[6]")
    public WebElement addToCartThirdJeans_WE;
    @FindBy(xpath = "(//div[@class='single-products'])[1]")
    public WebElement firstJeans_WE;
    @FindBy(xpath = "(//div[@class='single-products'])[2]")
    public WebElement secondJeans_WE;
    @FindBy(xpath = "(//div[@class='single-products'])[3]")
    public WebElement thirdJeans_WE;
    @FindBy(xpath = "//a[text()='Write Your Review']")
    public WebElement writeYourReview_WE;
    @FindBy(id = "name")
    public WebElement nameForInputReview_WE;
    @FindBy(id = "email")
    public WebElement emailForInputReview_WE;
    @FindBy(id = "review")
    public WebElement inputReview_inTextArea_WE;
    @FindBy(id = "button-review")
    public WebElement inputReviewSubmitButton_WE;
    @FindBy(xpath = "//span[text()='Thank you for your review.']")
    public WebElement thanksForReviewMessage_WE;


    public void selectingTheViewProductByProductOrder(String order) {
        Driver.get().findElement(By.xpath("(//a[@style='color: brown;'])[1]")).click();
    }

    public void verificationOfProductDetails_MTD() {
        BrowserUtils.scrollToElement(productDetails_WE);
        String productDetails = productDetails_WE.getText();
        Assert.assertTrue(productDetails.contains("Blue Top"));
        Assert.assertTrue(productDetails.contains("Category"));
        Assert.assertTrue(productDetails.contains("Rs. 500"));
        Assert.assertTrue(productDetails.contains("Availability"));
        Assert.assertTrue(productDetails.contains("Condition"));
        Assert.assertTrue(productDetails.contains("Brand"));
    }

    public void productSearchAndClick_MTD(String productName) {
        inputSearchProduct_WE.sendKeys(productName);
        searchButton_WE.click();
    }

    public void searchedProductVerification_MTD(String productName) {
        boolean arananUrunBulundu = false;
        int count = 0;
        for (WebElement searchedProductsWe : searchedProducts_WES) {
            if (searchedProductsWe.getText().contains(productName)) {
                arananUrunBulundu = true;
                break;
            }
            count++;
        }
        System.out.println(productName + " count = " + count);
        if (arananUrunBulundu) {
            System.out.println("Aranan ürün ile ilgili sonuçlar bulundu");
        } else {
            System.out.println("Aranan ürün ile ilgili sonuçlar bulunamadı");
        }
    }

    public void increasingTheProduct_MTD(String accruement) {
        productQuantityArea_WE.clear();
        productQuantityArea_WE.sendKeys(accruement);
    }

    public void clickingBrand_MTD(String brandName) {
        Driver.get().findElement(By.xpath("//a[text()='" + brandName + "']")).click();
    }

}
