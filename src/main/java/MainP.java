import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainP {

    @FindBy(id = "nav-link-accountList-nav-line-1")
    private WebElement account;
    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchField;
    @FindBy(id = "nav-search-submit-button")
    private WebElement buttonForSearching;

}
