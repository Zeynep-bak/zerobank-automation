package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath = "//div/strong")
    public List<WebElement> menuOptions;

    @FindBy(xpath = "//strong[.='Online Banking']")
    private WebElement onlineBankingModule;

    @FindBy(xpath = "//strong[.='Home']")
    private WebElement homeModule;

    @FindBy(xpath = "//strong[.='Feedback']")
    private WebElement feedbackModule;

    @FindBy(id = "online-banking")
    private WebElement moreServicesBtn;

    @FindBy(css = ".icon.icon-bookmark")
    private WebElement iconBookmark;

    @FindBy(css = ".icon.icon-user")
    private WebElement iconUser;

    @FindBy(css = ".icon.icon-random")
    private WebElement iconRandom;

    @FindBy(css = ".icon.icon-list-alt")
    private WebElement iconList;

    public void clickOnlineBankingModule() {
        onlineBankingModule.click();
    }
}
