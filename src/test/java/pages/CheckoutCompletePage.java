package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


public class CheckoutCompletePage extends BasePage{

    By title_complete = By.className("title");
    By btn_burger_menu = By.id("react-burger-menu-btn");
    By btn_logout = By.id("logout_sidebar_link");


    public CheckoutCompletePage(){

        PageFactory.initElements(Driver, this);
    }

    public void logout(){
        Driver.findElement(btn_logout).click();
    }


}
