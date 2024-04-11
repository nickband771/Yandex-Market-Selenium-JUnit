package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.Locators;


public class MainPage {

    private WebDriver browser;

    public MainPage(WebDriver browser) {
        this.browser = browser;
    }

    public MainPage scrollToProductWithNumber30() {
        WebElement productWithNumber61 = browser.findElement(Locators.MainPage.productWithNumber30);
        new Actions(browser).scrollToElement(productWithNumber61).perform();
        return new MainPage(browser);
    }

    public MainPage clickProductWithNumber30Button() {
        WebElement productWithNumber3Button = browser.findElement(Locators.MainPage.productWithNumber30Button);
        productWithNumber3Button.click();
        return new MainPage(browser);
    }

    public String getProductWithNumber30Href() {
        WebElement productWithNumber30 = browser.findElement(Locators.MainPage.productWithNumber30Href);
        return productWithNumber30.getAttribute("href");
    }

    public String getProductWithNumber30Name() {
        WebElement productWithNumber30Name = browser.findElement(Locators.MainPage.productWithNumber30Name);
        return productWithNumber30Name.getText();
    }

    public MainPage clickOpenCatalogButton() {
        WebElement openCatalogButton = browser.findElement(Locators.MainPage.openCatalogButton);
        openCatalogButton.click();
        return new MainPage(browser);
    }

    public ElectronicsPage clickElectronicsButton() {
        WebElement electronicsButton = browser.findElement(Locators.MainPage.electronicsButton);
        electronicsButton.click();
        return new ElectronicsPage(browser);
    }

    public String getElectronicsButtonText() {
        WebElement electronicsButton = browser.findElement(Locators.MainPage.electronicsButton);
        return electronicsButton.getText();
    }

    public MainPage clickInputTextArea() {
        WebElement inputTextArea = browser.findElement(Locators.MainPage.inputTextArea);
        inputTextArea.click();
        return new MainPage(browser);
    }

    public MainPage inputText(String text) {
        WebElement inputTextArea = browser.findElement(Locators.MainPage.inputTextArea);
        inputTextArea.sendKeys(text);
        return new MainPage(browser);
    }

    public SearchPage clickSearchButton() {
        WebElement searchButton = browser.findElement(Locators.MainPage.searchButton);
        searchButton.click();
        return new SearchPage(browser);
    }

    public ProductPage clickProductWithNumber1Button() {
        WebElement productWithNumber1Button = browser.findElement(Locators.MainPage.productWithNumber1Button);
        productWithNumber1Button.click();
        return new ProductPage(browser);
    }

    public String getProductWithNumber1ButtonHref() {
        WebElement productWithNumber1Button = browser.findElement(Locators.MainPage.productWithNumber1Button);
        return productWithNumber1Button.getAttribute("href");
    }
}
