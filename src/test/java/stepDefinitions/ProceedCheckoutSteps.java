package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import pages.BasePage;
import pages.ProceedCheckoutPage;
import utils.AssertionsClass;

public class ProceedCheckoutSteps extends BasePage {


    @Then("I proceed to checkout")
    public void i_proceed_to_checkout(DataTable dataTable) {

        ProceedCheckoutPage proceedCheckout = new ProceedCheckoutPage();
        proceedCheckout.goToProceedToCheckout();
        AssertionsClass.assertTitle("YOUR CART", proceedCheckout.getTitle());
        proceedCheckout.goToCheckout();
        AssertionsClass.assertTitle("CHECKOUT: YOUR INFORMATION", proceedCheckout.getTitle());
        proceedCheckout.addCheckoutInformation(dataTable);
    }
}
