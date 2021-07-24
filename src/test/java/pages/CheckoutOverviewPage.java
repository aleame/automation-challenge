package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage extends BasePage{

    By btn_finish = By.id("finish");
    By btn_tShirtRed = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    By btn_jacket = By.id("add-to-cart-sauce-labs-fleece-jacket");

    public CheckoutOverviewPage(){

        PageFactory.initElements(Driver, this);
    }

    public void finishCheckoutOverview(){
        Driver.findElement(btn_finish).click();
//        Driver.findElement(By.id("finish")).click();
    }

}
