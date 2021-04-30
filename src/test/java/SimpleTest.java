import factortyEx.DriverManagerFactory;
import factortyEx.DriverManager;
import factortyEx.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.MainPage;

public class SimpleTest {
    WebDriver driver;
    DriverManager driverManager;
    MainPage mainPage;

    @BeforeTest
    public void setup() {
        DriverType type = DriverType.valueOf("CHROME");
        driverManager = DriverManagerFactory.getDriver(type);
    }

    @BeforeMethod
    public void beforeMethod() {
        driver = driverManager.getDriver();
        mainPage = new MainPage(driver);
    }

    @Test
    public void test1() {
        mainPage.openPage()
                .findSearchField()
                .searchForIphone()
                .verifyIphonePresented();

    }

    @Test
    public void test2() {
        mainPage.openPage()
                .findSearchField()
                .searchForIphone()
                .viewProduct();

    }

    @Test
    public void test3() {
        mainPage.openPage()
                .findSearchField()
                .searchForIphone()
                .viewProduct()
                .verifyButtonIsDisplayed();

    }

    @Test
    public void test4() {
        mainPage.openPage()
                .findSearchField()
                .searchForIphone()
                .viewProduct()
                .addedToCart().
                verifyMessageAbout();

    }


    @AfterTest
    public void shutdown() {
        driverManager.quiteDriver();
    }
}
