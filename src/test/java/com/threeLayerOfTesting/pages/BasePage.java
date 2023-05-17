package com.threeLayerOfTesting.pages;


import com.threeLayerOfTesting.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * parent class for concrete Page object classes
 * provides constructor with initElements method for re-usability
 * abstract - to prevent instantiation.
 */
public abstract  class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    // example
    @FindBy(tagName = "example")
    public WebElement pageHeader;

    // example
    @FindBy(xpath = "//div[@class='example']")
    public WebElement pageHeader1;


}
