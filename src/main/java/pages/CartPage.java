package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;

public class CartPage {

    private WebDriver browser;

    public CartPage(WebDriver browser) {
        this.browser = browser;
    }

    public String getFirstProductNameText() {
        WebElement firstProductName = browser.findElement(Locators.CartPage.firstProductName);
        return firstProductName.getText();
    }
}
