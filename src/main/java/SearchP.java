import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchP {

    @FindBy(xpath = "//h2[contains(text(), 'New Apple iPhone 12 Pro (512GB, Pacific Blue) [Locked] + Carrier Subscription')]")
    private WebElement iphone;
}
