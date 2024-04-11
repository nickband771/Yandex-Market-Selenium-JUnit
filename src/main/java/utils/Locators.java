package utils;

import org.openqa.selenium.By;

public class Locators {

    public interface MainPage {

        By productWithNumber1Button = By.xpath("/html/body/div[1]/div/div[4]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/li/div/div/div/div/div[2]/div/div/a");

        By productWithNumber30 = By.xpath("/html/body/div[1]/div/div[4]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[30]/li/div/div/div");

        By productWithNumber30Button = By.xpath("/html/body/div[1]/div/div[4]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[30]/li/div/div/div");

        By productWithNumber30Href = By.xpath("/html/body/div[1]/div/div[4]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[30]/li/div/div/div/div/div[2]/div/div/a");

        By productWithNumber30Name = By.xpath("/html/body/div[1]/div/div[4]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[30]/li/div/div/div/div/div[2]/div/div/a/h3");

        By openCatalogButton = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/header/div[1]/div/div/noindex[1]/div/div");

        By electronicsButton = By.xpath("/html/body/div[7]/div/div/div/div/div/div/div[1]/div/ul/li[5]/a");

        By inputTextArea = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/header/div[1]/div/div/div/div/div/div/form/div/div/div/div/div/input[1]");

        By searchButton = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/header/div[1]/div/div/div/div/div/div/form/div/button");
    }

    public interface ProductPage {

        By currentProductName = By.xpath("/html[@class='disableOverscroll']/body/div[@class='page']/div/div[4]/div/div[@id='cardContent']/div[1]/div[@class='_3pUL5 _1MOwX _1bCJz']/div[1]/div[@class='_3f8Sy']/div[@class='_261_I']/div/div[3]/div/h1[@class='_3TVFy _2SUA6 jM85b _13aK2 _1A5yJ']");

        By addToWishListButton = By.xpath("//*[@id='cardContent']/div[1]/div[@class='_3pUL5 _1MOwX _1bCJz']/div[1]/div[@class='_3aboV']/div[@class='_1jC_c']/div[@class='_2Ap1y'][2]/div/div[@class='cia-vs cia-cs']/div/div/button[@class='_63Rdu']");

        By wishListPageButton = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/header/div[1]/div/div/noindex[2]/nav/ul/li[3]/div/div/a/div");

        By addToCartButton = By.xpath("/html/body/div[1]/div/div[4]/div/div/div[1]/div/div[1]/div[3]/div[3]/section[1]/div[1]/div[2]/div/div[2]/div/div[4]/div[4]/div/div[2]/button");

        By cartPageButton = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/header/div[1]/div/div/noindex[2]/nav/ul/li[4]/div");
    }

    public interface ElectronicsPage {

        By electronicsSectionHeader = By.xpath("/html/body/div[1]/div/div[4]/div/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/h3");
    }

    public interface SearchPage {

        By searchPageHeader = By.xpath("/html/body/div[1]/div/div[4]/div/div/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div/div/h1");
    }

    public interface WishListPage {

        By firstProductName = By.xpath("/html/body/div[1]/div/div[4]/div/div/div/div[2]/div/div/div/div[2]/div[1]/div/div/section/div/div/div/div/div/div/div[2]/div/div/a/h3");
    }

    public interface CartPage {

        By firstProductName = By.xpath("/html/body/div[1]/div/div[4]/div/div/div/div/main/div[2]/div/div[2]/div[1]/div/div/div/ul/li/div/div/div/div[2]/div[1]/div[1]/div/div/div/div/ul/div[1]/div/div/div/div/li/div/article/div[3]/div[1]/div/h3/a");
    }
}
