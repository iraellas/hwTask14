package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPage {

    WebDriver driver;

    @FindBy(id = "nav-link-accountList-nav-line-1")
    private WebElement account;
    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchField;
    @FindBy(id = "nav-search-submit-button")
    private WebElement buttonForSearching;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MainPage openPage() {
        driver.get("https://www.amazon.com/");
        return this;
    }

    public MainPage findSearchField() {
        searchField.isDisplayed();
        searchField.click();
        return this;
    }

    public SearchPage searchForIphone() {
        searchField.sendKeys("Apple iPhone 12 Pro MAX 512GB Graphite Unlocked");
        buttonForSearching.click();
        return new SearchPage(driver);
    }

}
