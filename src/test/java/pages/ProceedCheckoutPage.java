package pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

public class ProceedCheckoutPage extends BasePage{

    By btn_goCheckout = By.className("shopping_cart_link");
    By btn_checkout = By.id("checkout");
    By txt_firstName = By.id("first-name");
    By txt_lastName = By.id("last-name");
    By txt_zipCode = By.id("postal-code");
    By btn_continue = By.id("continue");

    public ProceedCheckoutPage(){

        PageFactory.initElements(Driver, this);
    }

    public void goToProceedToCheckout() {
//        Driver.findElement(By.className("shopping_cart_link")).click();
        Driver.findElement(btn_goCheckout).click();

    }


    public void goToCheckout(){
//        Driver.findElement(By.id("checkout")).click();
        Driver.findElement(btn_checkout).click();
    }

    public void addCheckoutInformation(DataTable dataTable){
        List<Map<String, String>> itemMap = dataTable.asMaps(String.class, String.class);
        System.out.println(itemMap);

        Driver.findElement(txt_firstName).sendKeys(itemMap.get(0).get("firstName"));
        Driver.findElement(txt_lastName).sendKeys(itemMap.get(0).get("lastName"));
        Driver.findElement(txt_zipCode).sendKeys(itemMap.get(0).get("zipCode"));
        Driver.findElement(btn_continue).click();
    }


}
