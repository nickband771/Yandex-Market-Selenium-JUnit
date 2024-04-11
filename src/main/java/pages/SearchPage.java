package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;

public class SearchPage {

    private WebDriver browser;

    public SearchPage(WebDriver browser) {
        this.browser = browser;
    }

    public String getSearchPageHeaderText() {
        WebElement searchPageHeader = browser.findElement(Locators.SearchPage.searchPageHeader);
        return searchPageHeader.getText();
    }
}
