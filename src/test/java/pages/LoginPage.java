package pages;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;


public class LoginPage extends BasePage {


    By txt_userName = By.id("user-name");
    By txt_password = By.id("password");
    By btn_userName = By.id("login-button");

    public LoginPage(){

        PageFactory.initElements(Driver, this);
    }

    public void loginMethod(DataTable dataTable) {

        List<Map<String, String>> loginMap = dataTable.asMaps(String.class, String.class);
        System.out.println(loginMap);

        Driver.findElement(txt_userName).sendKeys(loginMap.get(0).get("userName"));
        Driver.findElement(txt_password).sendKeys(loginMap.get(0).get("password"));
        Driver.findElement(btn_userName).click();

    }


}
