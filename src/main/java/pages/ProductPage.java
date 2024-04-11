package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;

public class ProductPage {

    private WebDriver browser;

    public ProductPage(WebDriver browser) {
        this.browser = browser;
    }

    public String getCurrentProductName() {
        WebElement currentProductName = browser.findElement(Locators.ProductPage.currentProductName);
        return currentProductName.getText();
    }

    public ProductPage clickAddToWishListButton() {
        WebElement addToWishListButton = browser.findElement(Locators.ProductPage.addToWishListButton);
        addToWishListButton.click();
        return new ProductPage(browser);
    }

    public WishListPage clickWishListPageButton() {
        WebElement mainPageButton = browser.findElement(Locators.ProductPage.wishListPageButton);
        mainPageButton.click();
        return new WishListPage(browser);
    }

    public ProductPage clickAddToCartButton() {
        WebElement addToCartButton = browser.findElement(Locators.ProductPage.addToCartButton);
        addToCartButton.click();
        return new ProductPage(browser);
    }

    public CartPage clickCartPageButton() {
        WebElement cartPageButton = browser.findElement(Locators.ProductPage.cartPageButton);
        cartPageButton.click();
        return new CartPage(browser);
    }
}
