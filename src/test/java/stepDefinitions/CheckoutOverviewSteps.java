package stepDefinitions;
import io.cucumber.java.en.When;
import pages.CheckoutOverviewPage;
import utils.AssertionsClass;

public class CheckoutOverviewSteps{

    @When("I confirm checkout")
    public void i_confirm_checkout() {

        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage();
        AssertionsClass.assertTitle("CHECKOUT: OVERVIEW", checkoutOverviewPage.getTitle());
        checkoutOverviewPage.finishCheckoutOverview();

    }
}
