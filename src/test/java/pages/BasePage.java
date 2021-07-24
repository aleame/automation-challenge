package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BasePage {
    public static WebDriver Driver;

    By txt_title = By.className("title");
    By txt_header = By.className("complete-header");
    By btn_burger_menu = By.id("react-burger-menu-btn");

    public void click(String element) throws Exception {
        try {
            isDisplayed(element);
            Driver.findElement(By.id(element)).click();
        } catch (Exception e) {
            throw new Exception("Click element " + element + " fails");
        }
    }

    public void selectMenuBurguer(){
        Driver.findElement(btn_burger_menu).isDisplayed();
        Driver.findElement(btn_burger_menu).click();
    }

    public String getTitle(){
        Driver.findElement(txt_title).isDisplayed();
        return Driver.findElement(txt_title).getText().toString();
    }

    public String getHeader(){
        Driver.findElement(txt_header).isDisplayed();
        return (Driver.findElement(txt_header).getText().toString());

    }

    public String getText(String element) throws Exception {
        try {
            isDisplayed(element);
            return Driver.findElement(By.id(element)).getText();
        } catch (Exception e) {
            throw new Exception("Get text element " + element + " fails");
        }
    }

    public void sendKeys(String  element, String text) throws Exception {
        try {
            isDisplayed(element);
            Driver.findElement(By.id(element)).sendKeys(text);
        } catch (Exception e) {
            throw new Exception("Get text element " + element + " fails");
        }
    }

    public boolean isDisplayed(String element) throws Exception {
        try {
            return Driver.findElement(By.id(element)).isDisplayed();
        } catch (Exception e) {
            throw new Exception("Display element " + element + " is not displayed");
        }
    }


}


