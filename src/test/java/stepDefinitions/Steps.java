package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.BasePage;
import utils.ReadProperties;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Map;

public class Steps extends BasePage{

    private BasePage base;

    public Steps(BasePage base){
        this.base = base;
    }



    @Then("I add to cart products")
    public void i_add_to_cart_products() {

    }



    @Then("I add <{string}> product to cart")
    public void i_add_product_to_cart(String string) {

    }







}
