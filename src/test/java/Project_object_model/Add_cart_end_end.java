package Project_object_model;

import io.cucumber.java.it.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Add_cart_end_end {
    public WebDriver dr;

    Data_driven_file data=new Data_driven_file();

    public Add_cart_end_end(WebDriver dr){
    dr = dr;
        PageFactory.initElements(dr, this);
    }

//    public void takeScreenshots(WebDriver dr) throws IOException {
//        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy h-m-s");
//        Date date = new Date();
//        File scrFile = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
//        String filename="test result";
//        FileUtils.copyFile(scrFile, new File("./src/test/"+filename+"-"+dateFormat.format(date)+".png"));
//    }
    @FindBy(xpath = "//i[@class=\"material-icons card_travel\"]")
    public WebElement click_product; //1
    @FindBy(xpath = "//*[@id=\"empty_cart\"]/p/a/u")
    public WebElement ac_hear; //2

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/a")
    public WebElement add_product_to_cart; //3
    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[1]/h4")
    public WebElement show_as_added; //4
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")
    public WebElement view_cart; //5
    @FindBy(xpath = "//div/a[@class=\"btn btn-default check_out\"]")
    public WebElement proceed_to_check;
    @FindBy(xpath = "//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a/u")
    public WebElement Register_mem;

    public void clic_proceed_to_check(){
        proceed_to_check.click();
    }
    public void click_Register_memer(){ //6
        Register_mem.click();
    }
    public void show_add_cart(){ //5
        view_cart.click();
    }
    public void show_added_to_cart(){ //4
        show_as_added.getText();
    }
    public void click_add_product_to_cart(){ //3
        add_product_to_cart.click();
    }
    public void click_hear_on_add_cart(){ //2
        ac_hear.click();
    }

    public void click_products(){ //1
        click_product.click();
    }

  //########## registration flow#################
  By title_Mr = By.xpath("//input[@value=\"Mr\"]"); //click
    public void setTitle_Mr(){
        dr.findElement(title_Mr).click();
    }
    By title_Mrs = By.xpath("//input[@value=\"Mrs\"]"); //click
    By  enter_pwd = By.xpath("//input[@id=\'password\']"); //sendkey
    public void setEnter_pwd(){
        dr.findElement(enter_pwd).sendKeys("Dapple@123");
    }
    By birth_days = By.id("days"); // "//select[@id="days"]" // dropdown

    By birth_month = By.id("months"); // dropdown
    By birth_years = By.id("years"); //dropdown
    By check_box_newsletter = By.id("newsletter"); //click
    By enter_first_name = By.id("first_name");// sendkey
    public void setEnter_first_name(){
        dr.findElement(enter_first_name).sendKeys("Deepak");
    }
    By enter_last_name = By.id("last_name");
    public void setEnter_last_name(){
        dr.findElement(enter_last_name).sendKeys("puri");
    }
    By enter_comp_name = By.id("company");
    public void set_enter_comp_neme(){
        dr.findElement(enter_comp_name).sendKeys("puri");
    }
    By enter_Address1 = By.id("address1");
    public void set_enter_Address1(){
        dr.findElement(enter_Address1).sendKeys("puri");
    }
    By enter_address2 = By.id("address2"); // sendkey\
    public void set_enter_address2(){
        dr.findElement(enter_address2).sendKeys("puri");
    }
    By enter_country = By.id("country");  // dropdoun
    public void set_enter_country(){
        dr.findElement(enter_country).sendKeys("india");
    }
    By enter_state = By.id("state");
    public void set_enter_state(){
        dr.findElement(enter_state).sendKeys("Mh");
    }
    By enter_city = By.id("city");
    public void set_enter_city(){
        dr.findElement(enter_city).sendKeys("pune");
    }

    By enter_zipcode = By.id("zipcode");
    public void set_enter_zipcode(){
        dr.findElement(enter_zipcode).sendKeys("4135234");
    }
    By enter_mobile_number = By.id("mobile_number");
    public void set_enter_mobile_number(){
        dr.findElement(enter_mobile_number).sendKeys("9094859580");
    }
    By click_create_ac = By.xpath("//button[text()= \"Create Account\"]");
    public void set_click_create_ac(){
        dr.findElement(click_create_ac).click();
    }
    public void click_mr(){

    }

}
