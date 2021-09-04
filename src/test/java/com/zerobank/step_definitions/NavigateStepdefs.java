package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.HomePage;
import com.zerobank.pages.OnlineBankingPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NavigateStepdefs {

    HomePage homePage = new HomePage();
    OnlineBankingPage onlineBankingPage =new OnlineBankingPage();
    @Then("the user should see following options")
    public void theUserShouldSeeFollowingOptions(List<String> menuOptns) {
        BrowserUtils.waitFor(4);

        List<String> actualOptions = BrowserUtils.getElementsText(new HomePage().menuOptions);

        Assert.assertEquals(actualOptions,menuOptns);
        System.out.println("actualOptions = " + actualOptions);
        System.out.println("menuOptns = " + menuOptns);

    }

    @Then("the user navigates to ONLINE BANKING to Account summary")
    public void theUserNavigatesToONLINEBANKINGToAccountSummary() {
        homePage.clickOnlineBankingModule();
        onlineBankingPage.clickAccountSummaryIcon();


    }

    @And("the title should be {string}")
    public void theTitleShouldBe(String expectedTitle) {
        BrowserUtils.waitFor(4);
        System.out.println("expectedTitle = " + expectedTitle);
        String actualTitle= Driver.get().getTitle();
        System.out.println("actualTitle = " + actualTitle);
         Assert.assertTrue(expectedTitle.contains(actualTitle));
    }

    @And("Account summary page following account types")
    public void accountSummaryPageFollowingAccountTypes( List<String> accountTypes) {
        List<String> boardHeader = BrowserUtils.getElementsText(new AccountSummaryPage().boardHeaders);
        System.out.println("accountTypes = " + accountTypes);
        System.out.println("bHeaders = " + boardHeader);
        Assert.assertEquals(accountTypes,boardHeader);

    }

    @And("Credit Account table have to following columns")
    public void creditAccountTableHaveToFollowingColumns(List<String> columns) {
        List<String> colmnName = BrowserUtils.getElementsText(new AccountSummaryPage().columsName);
        System.out.println("colmnName = " + colmnName);




        }

    @Then("the user navigates to ONLINE BANKING to Account activity")
    public void theUserNavigatesToONLINEBANKINGToAccountActivity() {
        homePage.clickOnlineBankingModule();
        onlineBankingPage.clickAccountActivityIcon();
    }

    @And("the drop down default option should be {string}")
    public void theDropDownDefaultOptionShouldBe(String dropElement) {



        Select dropDownEl =new Select(onlineBankingPage.accountDropDown);
//        String expectedOption = dropElement;
//        String actualOption = dropDownEl.getFirstSelectedOption().getText();
//        System.out.println("expectedOption = " + expectedOption);
//        System.out.println("actualOption = " + actualOption);
        dropDownEl.selectByVisibleText("Savings");
       String   expectedOption = "Savings";
       String  actualOption = dropDownEl.getFirstSelectedOption().getText();
        System.out.println("actualOption = " + actualOption);
        Assert.assertEquals(actualOption,expectedOption);
    }

//    @And("the drop down options have to following columns")
//    public void theDropDownOptionsHaveToFollowingColumns() {
//        onlineBankingPage.clickDropDownMenu();
//
//        Select dropDownEl =new Select(onlineBankingPage.accountDropDown);
//        List<WebElement> options = dropDownEl.getOptions();
//        System.out.println("options.size() = " + options.size());
//
//        for (WebElement option : options) {
//            System.out.println("option = " + option.getText());
//        }
//    }

    @Then("the drop down options have to following columns")
    public void the_drop_down_options_have_to_following_columns(List<WebElement> columns) {

        Select dropDownEl = new Select(onlineBankingPage.accountDropDown);
        List<WebElement> options = dropDownEl.getOptions();
        System.out.println("options.size() = " + options.size());

        for (WebElement option : options) {
            System.out.println("option = " + option.getText());

        }

    }}














