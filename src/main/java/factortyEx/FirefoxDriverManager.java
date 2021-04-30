package factortyEx;

import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxDriverManager extends DriverManager {
    //Selenium does not support Manager for Firefox ( but supports for Edge, so you can try it )

    @Override
    protected void startService() {

    }

    @Override
    protected void stopService() {

    }

    @Override
    protected void createDriver() {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }
}
