package Project_object_model;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search_product {

    public WebDriver dr;
    By product = By.xpath("//a[@href=\"/products\"]");
    By search_product = By.id("search_product");
    By click_search = By.id("submit_search");

    public void click_product(){
        dr.findElement(product).click();
    }
    public void enter_product(String product){
        dr.findElement(search_product).sendKeys(product);
    }
}
