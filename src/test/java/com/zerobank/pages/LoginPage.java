package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){ PageFactory.initElements(Driver.get(), this); }

   @FindBy(xpath = "//input[@type='text']")
    private WebElement loginBox;

    @FindBy(id = "user_password")
    private WebElement passwordBox;

    @FindBy(name = "submit")
    private WebElement signBox;

    @FindBy(xpath = "//a[@href='/forgot-password.html']")
    private WebElement forgotPassword;

    @FindBy(id = "user_remember_me")
     private WebElement rememberbtn;


 public void login(String user, String passwrd) {
  loginBox.sendKeys(user);
  passwordBox.sendKeys(passwrd);
  signBox.click();
 }
}
