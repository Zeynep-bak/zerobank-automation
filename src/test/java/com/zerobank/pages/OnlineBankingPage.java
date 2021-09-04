package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnlineBankingPage extends LoginPage{

    @FindBy(id = "account_summary_link")
    private WebElement accountSummryLink;

    @FindBy(id = "account_activity_link")
    private WebElement accountActivityLink;

    @FindBy(id = "aa_accountId")
    public  WebElement accountDropDown;






    public void clickAccountSummaryIcon() {
      accountSummryLink.click();
    }

    public void clickAccountActivityIcon() {
        accountActivityLink.click();
    }

    public void clickDropDownMenu() {
        accountDropDown.click();
    }
}
