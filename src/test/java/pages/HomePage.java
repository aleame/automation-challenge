package pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomePage extends BasePage{

    By btn_backpack = By.id("add-to-cart-sauce-labs-backpack");
    By btn_tShirtRed = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    By btn_jacket = By.id("add-to-cart-sauce-labs-fleece-jacket");

    public HomePage(){

        PageFactory.initElements(Driver, this);
    }

    public void addToCart(DataTable dataTable){
        List<List<String>> itemList = dataTable.asLists();
        System.out.println(itemList);
        for (List<String> e : itemList) {
            System.out.println(e);
            switch (e.toString()) {
                case "backpack":{
                    Driver.findElement(btn_backpack).click();
                }
                case "red t-shirt":{
                    Driver.findElement(btn_tShirtRed).click();
                }
                case "jacket":{
                    Driver.findElement(btn_jacket).click();
                }
            }
        }

    }

}
