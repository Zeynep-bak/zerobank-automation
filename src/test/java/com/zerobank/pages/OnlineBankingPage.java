package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnlineBankingPage extends LoginPage{

    @FindBy(id = "account_summary_link")
    private WebElement accountSummryLink;









    public void clickAccountSummaryIcon() {
      accountSummryLink.click();
    }
}
