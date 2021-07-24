package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.BasePage;
import pages.CheckoutCompletePage;
import utils.AssertionsClass;

public class CheckoutCompleteSteps{



    @Then("I logout from DemoVirtualShop")
    public void i_logout_from_demo_virtual_shop() {

        CheckoutCompletePage completePage = new CheckoutCompletePage();
        AssertionsClass.assertTitle("CHECKOUT: COMPLETE!", completePage.getTitle());
        AssertionsClass.assertHeader("THANK YOU FOR YOUR ORDER", completePage.getHeader());
        completePage.selectMenuBurguer();
        completePage.logout();

    }
}
