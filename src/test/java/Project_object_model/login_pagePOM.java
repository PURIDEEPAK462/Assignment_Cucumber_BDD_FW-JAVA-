package Project_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_pagePOM {
    public WebDriver dr;
    public login_pagePOM(WebDriver dr){
        dr= dr;
        PageFactory.initElements(dr, this);
    }
    @FindBy(xpath="//input[@data-qa=\"login-email\"]")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(xpath="//input[@data-qa=\"login-password\"]")
    @CacheLookup
    WebElement txtPassword;
 //#################################################################################################

     @FindBy(xpath = "//button[text()=\"Login\"]")
        @CacheLookup
        WebElement login;

     @FindBy(xpath = "//a[text()=\" Logout\"]")
    @CacheLookup
    WebElement Logout;

     @FindBy(xpath = "//a[@href=\"/login\"]") //a[@href=\"/login\"]
     @CacheLookup
     WebElement signup_and_login;

    @FindBy(xpath = "//a[@href=\"/test_cases\"]")
            @CacheLookup
    WebElement test_case;

//#################################################################################################
    public void setUserName(String userName){
        txtEmail.clear();
        txtEmail.sendKeys(userName);
    }
    public void SetPassword(String password){
        txtPassword.clear();
        txtPassword.sendKeys(password);
    }

    public void click_login(){
        login.click();
    }
    public void click_logout(){
        Logout.click();
    }
    public void click_signup(){
        signup_and_login.click();
    }

    public void test_case_pag(){
        test_case.click();

    }


//#################################################################################################
}

