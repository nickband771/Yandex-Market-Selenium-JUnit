import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

public class TestCases {

    private WebDriver browser;

    @Before
    public void precondition() {
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://market.yandex.ru/");

    }

    @Test
    // Тест-кейс 1 "Открыть определенный товар по ссылке с главной страницы"
    public void checkProductOpen() {

        MainPage mainPage = new MainPage(browser);
        ProductPage productPage = new ProductPage(browser);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        mainPage
                .scrollToProductWithNumber30();

        String expectedProductWithNumber30Name = mainPage.getProductWithNumber30Name();

        String href = mainPage.getProductWithNumber30Href();

        mainPage
                .clickProductWithNumber30Button();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        browser.get(href);

        String currentProductName = productPage.getCurrentProductName();

        Assert.assertEquals(expectedProductWithNumber30Name, currentProductName);
    }

    @Test
    // Тест-кейс 2 "Выбор определенной категории через каталог товаров"
    public void checkCatalogFunction() {

        MainPage mainPage = new MainPage(browser);
        ElectronicsPage electronicsPage = new ElectronicsPage(browser);

        mainPage
                .clickOpenCatalogButton();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        String electronicsButtonText = mainPage.getElectronicsButtonText();

        mainPage
                .clickElectronicsButton();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        String electronicsSectionHeaderText = electronicsPage.getElectronicsSectionHeaderText();

        Assert.assertEquals(electronicsButtonText, electronicsSectionHeaderText);
    }

    @Test
    // Тест-кейс 3 "Ввод текста в поле для поиска, нажатие на кнопку"
    public void checkSearchFunction() {

        MainPage mainPage = new MainPage(browser);
        SearchPage searchPage = new SearchPage(browser);

        mainPage
                .clickInputTextArea()
                .inputText("Бытовая техника")
                .clickSearchButton();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        String currentSearchPageHeaderText = searchPage.getSearchPageHeaderText();

        Assert.assertEquals("Бытовая техника", currentSearchPageHeaderText);
    }

    @Test
    // Тест-кейс 4 "Добавление товара в избранное, отображение добавленного товара на странице"
    public void checkAddToWishListFunction() {

        MainPage mainPage = new MainPage(browser);
        ProductPage productPage = new ProductPage(browser);
        WishListPage wishListPage = new WishListPage(browser);

        String productWithNumber1ButtonHref = mainPage.getProductWithNumber1ButtonHref();

        mainPage
                .clickProductWithNumber1Button();

        browser.get(productWithNumber1ButtonHref);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        productPage
                .clickAddToWishListButton();

        String exceptedProductName = productPage.getCurrentProductName();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        productPage
                .clickWishListPageButton();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        String currentProductName = wishListPage.getFirstProductNameText();

        Assert.assertEquals(exceptedProductName, currentProductName);
    }

    @Test
    // Тест-кейс 5 "Добавление товара в корзину, отображение добавленного товара в корзине"
    public void checkAddToCartFunction() {

        MainPage mainPage = new MainPage(browser);
        ProductPage productPage = new ProductPage(browser);
        CartPage cartPage = new CartPage(browser);

        String productWithNumber1ButtonHref = mainPage.getProductWithNumber1ButtonHref();

        mainPage
                .clickProductWithNumber1Button();

        browser.get(productWithNumber1ButtonHref);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        String exceptedProductName = productPage.getCurrentProductName();

        productPage
                .clickAddToCartButton();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        productPage
                .clickCartPageButton();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        String currentProductName = cartPage.getFirstProductNameText();

        Assert.assertEquals(exceptedProductName, currentProductName);
    }

    @After
    public void closeBrowser() {
        browser.quit();
    }
}
