package com.autoexercise.pages;

import com.autoexercise.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {PageFactory.initElements(Driver.get(),this);
    }


}
