package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login_stepDefs {


    @Given("the user on the login page")
    public void the_user_on_the_login_page() {
        String url=ConfigurationReader.get("url");
        Driver.get().get(url);

    }
    @When("the user enters {string} and {string}")
    public void the_user_enters_and(String userNm, String passWd) {

      LoginPage loginPage =new LoginPage();

      loginPage.login(userNm,passWd);
    }

}
