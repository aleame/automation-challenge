package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.LoginPage;


import java.util.List;
import java.util.Map;



public class LoginSteps{


    @When("I login into the DemoVirtualShop")
    public void i_login_into_the_demo_virtual_shop(DataTable dataTable) throws Exception{
        LoginPage login = new LoginPage();
        login.loginMethod(dataTable);



//        List<Map<String, String>> loginMap = dataTable.asMaps(String.class, String.class);
//        System.out.println(loginMap);
//
//        base.Driver.findElement(By.id("user-name")).sendKeys(loginMap.get(0).get("userName"));
//        base.Driver.findElement(By.id("password")).sendKeys(loginMap.get(0).get("password"));
//        base.Driver.findElement(By.id("login-button")).click();

    }


}
