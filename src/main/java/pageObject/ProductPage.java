package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductPage {
     WebDriver driver;
    @FindBy(id = "add-to-cart-button")
    private WebElement buttonAddToCart;
    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void verifyButtonIsDisplayed(){
        Assert.assertTrue(buttonAddToCart.isDisplayed());
    }
    public AddedToCartPage addedToCart(){
        buttonAddToCart.click();
        return new AddedToCartPage(driver);
    }


}
