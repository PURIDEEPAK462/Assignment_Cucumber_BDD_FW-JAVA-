package Project_object_model;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Registration_new_memberPOM {
    public WebDriver dr;

    Data_driven_file data=new Data_driven_file();
    public Registration_new_memberPOM(WebDriver dr){

        PageFactory.initElements(dr, this);
    }
    @FindBy(xpath = "//input[@data-qa=\"signup-name\"]")

   public WebElement sinup_name;
//
    @FindBy(xpath = "//input[@data-qa=\"signup-email\"]")

    public WebElement Sinup_email;

    By validate_New_User_Signup = By.xpath("//h2[text()=\"New User Signup!\"]");
   // By signup_name = By.xpath("//input[@data-qa=\"signup-name\"]");//sendkey
  //  By  SignUp_email = By.xpath("//input[@data-qa=\"signup-email\"]"); //sendkey
    By  SignUp_button= By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"); //click
    By title_Mr = By.xpath("//input[@value=\"Mr\"]"); //click
    By title_Mrs = By.xpath("//input[@value=\"Mrs\"]"); //click
    By  enter_pwd = By.xpath("//input[@id=\"password\"]"); //sendkey
    By birth_days = By.id("days"); // "//select[@id="days"]" // dropdown
    By birth_month = By.id("months"); // dropdown
    By birth_years = By.id("years"); //dropdown
    By check_box_newsletter = By.id("newsletter"); //click
    By enter_first_name = By.id("first_name");// sendkey
    By enter_last_name = By.id("last_name");
    By enter_comp_name = By.id("company");
    By enter_Address1 = By.id("address1");
    By enter_address2 = By.id("address2"); // sendkey
    By enter_country = By.id("country");  // dropdoun
    By enter_state = By.id("state");
    By enter_city = By.id("city");
    By enter_zipcode = By.id("zipcode");
    By enter_mobile_number = By.id("mobile_number");
    By click_create_ac = By.xpath("//button[text()= \"Create Account\"]");

 //####################################################################################################
                    //###   Action methods  #####//
    public void Signup_name() throws IOException {
        String name = data.read(1, 1);
    sinup_name.sendKeys(name);
      //  dr.findElement(signup_name).sendKeys(name);
    }
    public void SignUp_email() throws IOException {
        String email = data.read(1, 2);
    Sinup_email.sendKeys(email);
      //  dr.findElement(SignUp_email).sendKeys(email);
    }
    public void SignUp_button(){
        dr.findElement(SignUp_button).click();
    }
    public void title_Mr(){
        dr.findElement(title_Mr).click();
    }
    public void enter_pwd(String new_pwd){
        dr.findElement(enter_pwd).sendKeys(new_pwd);
    }
  //###################################Selecting titles############################
    public void set_titles(String title){
        if (title.equals("Mr")){
            dr.findElement(title_Mr).click();
        }
        else if (title.equals("Mrs")){
                dr.findElement(title_Mrs).click();
            }
        else {dr.findElement(title_Mr).click();// default
        }
    }
    //###################################Selecting birth date############################
    public void create_birth_date(String day){

    }

   }
