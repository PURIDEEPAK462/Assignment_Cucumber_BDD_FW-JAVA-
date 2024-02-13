package StepDefinations;

import Project_object_model.Add_cart_end_end;

import Project_object_model.Registration_new_memberPOM;
import Project_object_model.login_pagePOM;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Step_def {
    public WebDriver dr;
    public login_pagePOM lp;

  public Registration_new_memberPOM  reg = new Registration_new_memberPOM(dr);
  Add_cart_end_end AdCrt = new Add_cart_end_end(dr);


    @Given("open the browser")
    public void open_the_browser() {
        WebDriverManager.chromedriver().setup();
        dr = new ChromeDriver();
//        WebDriverManager.edgedriver().setup();
//        dr = new EdgeDriver();

        dr.manage().window().maximize();
        dr.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);

        lp = new login_pagePOM(dr);
        System.out.println("chrome browser opened");
    }
    @When("open the url {string}")
    public void open_the_url(String url) {
        dr.get(url);
        System.out.println("user able to open URL");
    }
    @Then("Click on Signup_Login button")
    public void click_on_signup_login_button() {

        lp.click_signup();
        System.out.println("user able to enter into signup page");
    }
    @Then("Verify Login to your account is visible")
    public void verify_login_to_your_account_is_visible() {
//####################### Screenshot################################################################################
        File screenshot = ((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File
                    ("C:\\Users\\2277328\\OneDrive - Cognizant\\Desktop\\New folder\\Screenshot\\login_page.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        };
 //####################### Screenshot################################################################################

        boolean status = (dr.findElement(By.xpath("//h2[text()=\"Login to your account\"]")).isDisplayed());
        System.out.println(" Login to your account is visible :- "+status);
        Assert.assertEquals(status, true);
        System.out.println("user able to see login to your account");
//        String title = "Login to your account";
//        String tim = (dr.findElement(By.xpath("//h2[text()=\"Login to your account\"]")).isDisplayed();
//
//        Assert.assertEquals(title, tim);
//        System.out.println(" before login _ user able to see login to your account");
    }
    @Then("Enter correct email address {string} and password {string}")
    public void enter_correct_email_address_and_password(String email, String password) {
        lp.setUserName(email);
        lp.SetPassword(password);

    }
    @Then("Click login button")
    public void click_login_button() {
        lp.click_login();
    }
    @Then("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {
//####################### Screenshot################################################################################
        File screenshot = ((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File
                    ("C:\\Users\\2277328\\OneDrive - Cognizant\\Desktop\\New folder\\Screenshot\\Logged_in.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        };
        //####################### Screenshot################################################################################
        boolean status1 =
                (dr.findElement(By.xpath("//b[text()=\"Deepak puri\"]")).isDisplayed());
        System.out.println( "User name is visible as Deepak puri : " +status1);
        Assert.assertEquals(status1, true);
    }
    @Then("Click Logout button")
    public void click_logout_button() {
//    lp.click_logout();
        dr.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
    }
    @Then("Verify that user is navigated to login page")
    public void verify_that_user_is_navigated_to_login_page() {

        boolean status = (dr.findElement(By.xpath("//h2[text()=\"Login to your account\"]")).isDisplayed());
        System.out.println(" Login to your account is visible :- "+status);
        Assert.assertEquals(status, true);
        System.out.println("user able to see login to your account");
    }
    @Then("close browser")
    public void close_browser() {
        dr.close();
        System.out.println("user logged out successfully");


    }
 //################################################################################################
// @Then("verify Login to your account is visible")
// public void verify_login_to_your_account_is_visible() {
//     // Write code here that turns the phrase above into concrete actions
//     throw new io.cucumber.java.PendingException();
// }
    @Then("Enter incorrect email address {string} and password {string}")
    public void enter_incorrect_email_address_and_password(String email, String password) {
        lp.setUserName(email);
        lp.SetPassword(password);
    }
    @Then("Verify error {string} is visible")
    public void verify_error_is_visible(String title) {
        //####################### Screenshot################################################################################
//        File screenshot = ((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);
//        try {
//            FileUtils.copyFile(screenshot, new File
//                    ("C:\\Users\\2277328\\OneDrive - Cognizant\\Desktop\\New folder\\Screenshot\\login_error.png"));
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        };
       // lp.TakeScreenshot(dr);
        //####################### Screenshot################################################################################

        String actual = dr.findElement(By.xpath("//p[text()=\"Your email or password is incorrect!\"]")).getText();
        if(dr.getPageSource().contains("login successful")){
            dr.close();
            Assert.assertTrue(false);
            }
        else {
            Assert.assertEquals(title, actual);
            System.out.println(title+ " error got reflected");
        }}
    //#################################################################################################3
    //open_test_case_page
    @Then("Verify {string} is visible")
    public void verify_is_visible(String string) {
        System.out.println("will add this validation");
    }
    @Then("Click on {string} button")
     public void click_on_button(String Test_case_page) {
        lp.test_case_pag();
     }
  @Then("Verify user is navigated to test cases page successfully and msg shown as {string}")
    public void verify_user_is_navigated_to_test_cases_page_successfully_and_msg_shown_as(String tc) {
////        //####################### Screenshot################################################################################
//        File screenshot = ((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);
//        try {
//            FileUtils.copyFile(screenshot, new File
//                    ("C:\\Users\\2277328\\OneDrive - Cognizant\\Desktop\\New folder\\Screenshot\\test_case_page.png"));
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        //####################### Screenshot################################################################################
        String actual_tc = dr.findElement(By.xpath("//span[text()= \"Below is the list of test Cases for you to practice the Automation. Click on the scenario for detailed Test Steps:\"]")).getText();
        if(dr.getPageSource().contains("Below is the list of test Cases for you to practice the Automation. Click on the scenario for detailed Test Steps:")){
            dr.close();
            Assert.assertTrue(true);
        }
        else {
            Assert.assertEquals(tc, actual_tc);
            System.out.println(tc+ " Test_case_page_is_reflected_successfully");
        }

    }

//####################################Signup with valid user id and pass###########################

    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        File Screenshot = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(Screenshot, new File("C:\\Users\\2277328\\OneDrive - Cognizant\\Data\\homepage_snap.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    @Then("Add products to cart")
    public void add_products_to_cart() {
        AdCrt = new Add_cart_end_end(dr);
        JavascriptExecutor js = (JavascriptExecutor) dr;
        js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");



        WebElement add_product = dr.findElement(By.xpath("//i[@class=\"material-icons card_travel\"]"));
        add_product.click();
        WebElement clickproduct = dr.findElement(By.xpath("//div/ul/li/a[@href=\"/product_details/11\"]"));
        clickproduct.click();


    }

    @Then("Click Cart button")
    public void click_cart_button() {
        WebElement add_to_cart = dr.findElement(By.xpath("//button[@class=\"btn btn-default cart\"]"));
        add_to_cart.click();
       // AdCrt.show_add_cart();
        dr.get("https://www.automationexercise.com/");
        WebElement click_view_cart = dr.findElement(By.xpath("//i[@class=\"fa fa-shopping-cart\"]"));
            click_view_cart.click();


    }
    @Then("Verify that cart page is displayed")
    public void verify_that_cart_page_is_displayed() {


    }
    @Then("Click Proceed To Checkout")
    public void click_proceed_to_checkout() {
        AdCrt = new Add_cart_end_end(dr);
       AdCrt.clic_proceed_to_check();

    }
    @Then("Click Register \\/ Login button")
    public void click_register_login_button() {
   AdCrt.click_Register_memer();

    }

    @Then("Enter name as  and email address as")
    public void enter_name_as_and_email_address_as() throws IOException {
        reg= new Registration_new_memberPOM(dr);
        reg.Signup_name();
        reg.SignUp_email();
    }
    @Then("Click Signup button")
    public void click_signup_button() {
        File Screenshot = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
        try {

   FileUtils.copyFile(Screenshot, new File("C:\\Users\\2277328\\OneDrive - Cognizant\\Data\\newfile.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        dr.findElement(By.xpath("//button[text()=\"Signup\"]")).click();
        dr.findElement(By.xpath("//input[@value=\"Mrs\"]")).click();
        JavascriptExecutor ps = (JavascriptExecutor)dr;
        ps.executeScript("window.scrollBy(0, 400)", "");
        dr.findElement(By.id("password")).sendKeys("Dapple");
        JavascriptExecutor ps1 = (JavascriptExecutor)dr;
        ps1.executeScript("window.scrollBy(0, 400)", "");
        dr.findElement(By.id("first_name")).sendKeys("deepak");
        dr.findElement(By.id("last_name")).sendKeys("puri");
        dr.findElement(By.id("company")).sendKeys("CTS");
        dr.findElement(By.id("address1")).sendKeys("hijewadi");
        dr.findElement(By.id("address2")).sendKeys("near phase 3");
        JavascriptExecutor ps2 = (JavascriptExecutor)dr;
        ps2.executeScript("window.scrollBy(0, 400)", "");
        dr.findElement(By.id("state")).sendKeys("MH");
        dr.findElement(By.id("city")).sendKeys("pune");
        dr.findElement(By.id("zipcode")).sendKeys("097432");
        dr.findElement(By.id("mobile_number")).sendKeys("98787679");
        dr.findElement(By.xpath("//button[text()= \"Create Account\"]")).click();


//        AdCrt.setEnter_pwd();
//        AdCrt.setEnter_first_name();
//        AdCrt.setEnter_last_name();
//        AdCrt.set_enter_city();
//        AdCrt.set_enter_Address1();
//        AdCrt.set_enter_address2();
//        AdCrt.setTitle_Mr();
//        AdCrt.set_enter_comp_neme();
//        AdCrt.set_enter_state();
//        AdCrt.set_enter_zipcode();
//        AdCrt.set_enter_country();
//        AdCrt.set_enter_mobile_number();
//        AdCrt.set_click_create_ac();
    }
//    @Then("Fill all details in Signup and create account")
//    public void fill_all_details_in_signup_and_create_account() {
//
//
//    }
    @Then("Verify ACCOUNT CREATED! and click Continue button")
    public void verify_account_created_and_click_continue_button() {
        String account="ACCOUNT CREATED!";
        String actual = dr.findElement(By.xpath("//b[text()=\"Account Created!\"]")).getText();
        System.out.println("searched products " + actual);
        Assert.assertEquals(actual,account);
        dr.findElement(By.xpath("//a[text()=\"Continue\"]")).click();

    }
    @Then("Verify Logged in as username at top")
    public void verify_logged_in_as_username_at_top() {
        String account="Deep";
        String actual = dr.findElement(By.xpath("//b[text()=\"Deep\"]")).getText();
        System.out.println("logged in as  " + actual);
        Assert.assertEquals(actual,account);
        dr.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();
        AdCrt.clic_proceed_to_check();
    }
    @Then("Click Proceed To Checkout button")
    public void click_proceed_to_checkout_button() {
//        Alert alert = dr.switchTo().alert(); // switch to alert
//       // dr.switchTo().alert().accept();
//        dr.switchTo().alert().dismiss();
//        dr.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();
//      //  dr.findElement(By.xpath("//a[@href=\"/delete_account\"]")).click();
////        WebElement click_view_cart = dr.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a"));
////        click_view_cart.click();
//        AdCrt.clic_proceed_to_check();



    }

//    @Then("Verify Address Details and Review Your Order")
//    public void verify_address_details_and_review_your_order() {
//
//
//    }

    @Then("Enter description in comment text area and click {string}")
    public void enter_description_in_comment_text_area_and_click(String string) {
        JavascriptExecutor ps2 = (JavascriptExecutor)dr;
        ps2.executeScript("window.scrollBy(0, 400)", "");
        WebElement comment = dr.findElement(By.xpath("//textarea[@class=\"form-control\"]"));
        comment.sendKeys("product is good ");
        WebElement place_order = dr.findElement(By.xpath("//a[text()=\"Place Order\"]"));
        place_order.click();

    }
    @Then("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enter_payment_details_name_on_card_card_number_cvc_expiration_date() {
        WebElement name_on_card = dr.findElement(By.xpath("//*[@id=\"payment-form\"]/div[1]/div/input"));
        name_on_card.sendKeys(" deepak_puri");

        WebElement cardnumber = dr.findElement(By.xpath("//*[@id=\"payment-form\"]/div[2]/div/input"));
            cardnumber.sendKeys("3464478484748");
        WebElement CVV = dr.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[1]/input"));
        CVV.sendKeys("345");

        WebElement expiry_date = dr.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[2]/input"));
        expiry_date.sendKeys("09");

        WebElement year = dr.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[3]/input"));
        year.sendKeys("2029");


    }
    @Then("Click Pay and Confirm Order button")
    public void click_pay_and_confirm_order_button() {
        WebElement click_pay = dr.findElement(By.xpath("//*[@id=\"submit\"]"));
        click_pay.click();


    }
    @Then("Verify success message {string}")
    public void verify_success_message(String string) {
        ////*[@id="form"]/div/div/div/h2/b
        String expected="ORDER PLACED!";
        String actual = dr.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")).getText();
        System.out.println("payment is done  " + actual);
        Assert.assertEquals(actual,expected);


    }
    @Then("Click Download Invoice button and verify invoice is downloaded successfully.")
    public void click_download_invoice_button_and_verify_invoice_is_downloaded_successfully() {
    dr.findElement(By.xpath("//div/a[text()='Download Invoice']")).click();


    }
    @Then("Click Continue button")
    public void click_continue_button() {
    dr.findElement(By.xpath("//div/a[text()='Continue']")).click();
    }
    @Then("Click Delete Account button")
    public void click_delete_account_button() {
        dr.findElement(By.xpath("//a[@href=\"/delete_account\"]")).click();


    }
    @Then("Verify ACCOUNT DELETED! and click Continue button")
    public void verify_account_deleted_and_click_continue_button() {
        String errormsg="ACCOUNT DELETED!";
        String actualMsg = dr.findElement(By.xpath("//div/h2/b[text()='Account Deleted!']")).getText();
        System.out.println("ERROR msg " + actualMsg);
        Assert.assertEquals(actualMsg,errormsg);


    }



}




