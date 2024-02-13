package Runner_file;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.awt.*;

@RunWith(Cucumber.class)
@CucumberOptions(
       // features = "src/test/java/Feature_file/Login_to_portal.feature",
        // features = "src/test/java/Feature_file/New_User_Signup!.feature",
        features = "src/test/java/Feature_file/Add_carts.feature",

        glue = "StepDefinations",
        //tags = "@login_feature",
        tags =" @add_cart1",

        // tags = "@New_User_Signup!", // Excel_data_driven
       // tags = "@Test_case_page",
       //dryRun = true,
        dryRun = false,
        plugin = {"pretty",
                "json:target/cucumber-json/cucumber_add_cart_done1.json",
                "html:target/cucumber-reports_add_cart_Done1.html"
        }
)

public class Runner_file {
}
