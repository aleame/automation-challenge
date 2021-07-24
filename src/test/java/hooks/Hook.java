package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.BasePage;


public class Hook extends BasePage{

    @Before(order=1)
    public void InitializeTest()
    {
        System.out.println("Opening the browser");
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        Driver = new FirefoxDriver();
        Driver.navigate().to("https://www.saucedemo.com");
    }

    @After
    public void TearDownTest(Scenario scenario)
    {

        if (scenario.isFailed())
        {
            //Take screen shoot
            System.out.println(scenario.getName() + "Close the browser");
        }
    }

    @After
    public void closeDriver(){
        Driver.quit();
    }
}
