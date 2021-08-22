package com.zerobank.step_definitions;

import com.zerobank.pages.AllertPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_stepDefs {

    LoginPage loginPage =new LoginPage();

    @Given("the user on the login page")
    public void the_user_on_the_login_page() {
        String url=ConfigurationReader.get("url");
        Driver.get().get(url);

    }
    @When("the user enters {string} and {string}")
    public void the_user_enters_and(String userNm, String passWd) {
        userNm=ConfigurationReader.get("username");
        passWd=ConfigurationReader.get("password");



      loginPage.login(userNm,passWd);
    }

    @And("the user choose back to safety box in error page")
    public void theUserChooseBackToSafetyBoxInErrorPage() {
        AllertPage allertPage =new AllertPage();
        allertPage.clickSafeBox();
    }

    @Then("the user should be logged homePage")
    public void theUserShouldBeLoggedHomePage() {
        String actualTitle = Driver.get().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertTrue(actualTitle.contains("Zero - Personal Banking"));
    }

    @When("the user enters invalid username {string} or password {string}")
    public void theUserEntersInvalidUsernameOrPassword(String usernm, String passwrd) {
        loginPage.login(usernm,passwrd);
    }

    @Then("the user should see error message")
    public void theUserShouldSeeErrorMessage() {
        System.out.println("Wrong message is Visible = " + loginPage.wrongMsgIsVisible());
        Assert.assertTrue(loginPage.wrongMsgIsVisible());
    }
}
