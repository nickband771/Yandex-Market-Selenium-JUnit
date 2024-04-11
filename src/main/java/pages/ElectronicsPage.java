package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;

public class ElectronicsPage {

    private WebDriver browser;

    public ElectronicsPage(WebDriver browser) {
        this.browser = browser;
    }

    public String getElectronicsSectionHeaderText() {
        WebElement electronicsSectionHeader = browser.findElement(Locators.ElectronicsPage.electronicsSectionHeader);
        return electronicsSectionHeader.getText();
    }
}
