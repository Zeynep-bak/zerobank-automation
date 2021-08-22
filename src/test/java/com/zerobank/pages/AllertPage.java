package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllertPage {
    public AllertPage(){ PageFactory.initElements(Driver.get(), this); }

    @FindBy(id = "primary-button")
    private WebElement backsafeBox;

    @FindBy(linkText = "Advenced")
    private WebElement  advencedBox;


    public void clickSafeBox() {
        backsafeBox.click();
    }
}
