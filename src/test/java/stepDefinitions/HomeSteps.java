package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import pages.BasePage;
import pages.HomePage;
import utils.AssertionsClass;

public class HomeSteps extends BasePage {

    @Then("I add products to cart")
    public void i_add_products_to_cart(DataTable dataTable) {
        HomePage addToCart = new HomePage();
        addToCart.addToCart(dataTable);
        String titleString = addToCart.getTitle();
        AssertionsClass.assertTitle("PRODUCTS", titleString);
    }
}
