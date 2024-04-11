package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;

public class WishListPage {

    private WebDriver browser;

    public WishListPage(WebDriver browser) {
        this.browser = browser;
    }

    public String getFirstProductNameText() {
        WebElement firstProductName = browser.findElement(Locators.WishListPage.firstProductName);
        return firstProductName.getText();
    }
}
