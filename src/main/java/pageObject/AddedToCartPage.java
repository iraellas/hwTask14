package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddedToCartPage {
    WebDriver driver;
    @FindBy(css = "div.a-row>h1")
    private WebElement infoMessage;
    public AddedToCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void verifyMessageAbout(){
        Assert.assertTrue(infoMessage.getText().equals("Added to Cart"));
    }
}
