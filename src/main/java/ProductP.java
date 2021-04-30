import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductP {
    @FindBy(css = "div.a-row>h1")
    private WebElement infoMessage;
}
