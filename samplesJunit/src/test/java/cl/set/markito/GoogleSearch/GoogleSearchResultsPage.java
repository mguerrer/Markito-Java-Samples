package cl.set.markito.GoogleSearch;

import java.util.List;

/*
All the code that follow is
Copyright (c) 2022, Marcos Guerrero. All Rights Reserved.
Not for reuse without permission.
*/


import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchResultsPage {
    @SuppressWarnings("unused")
    private Map<String, String> data;
    @SuppressWarnings("unused")
    private WebDriver driver;

    @FindAll({
        @FindBy( xpath =  "//*/div[@class='MjjYud']/div/div/div/div/div/div/a/div/div[@role='heading']"),  
        @FindBy( tagName = "h3")}
        )
    @iOSXCUITFindBy(tagName = "h3")
  
    @CacheLookup
    public List<WebElement> queryResults;

    @FindBy(name = "btnK")
    @CacheLookup
    private WebElement googleSearch1;

    @FindBy(name = "btnK")
    @CacheLookup
    private WebElement googleSearch2;


    public GoogleSearchResultsPage() {
    }

    public GoogleSearchResultsPage(WebDriver driver) {
        this();
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}