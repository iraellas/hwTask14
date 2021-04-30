package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchPage {

    WebDriver driver;

    @FindBy(xpath = "//span[contains(text(), 'MIGHTY SKINS Skin Compatible with Apple iPhone 12 Pro Max (APIPH12PRM-Cartoon Mania)')]")
    private WebElement iphone;


    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyIphonePresented() {
        Assert.assertTrue(iphone.isDisplayed());
    }
    public ProductPage viewProduct(){
        iphone.click();
        return new ProductPage(driver);
    }
}
