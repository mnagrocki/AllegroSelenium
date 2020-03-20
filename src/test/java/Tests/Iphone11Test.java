package Tests;

import Pages.FastSearchPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone11Test
{
    private WebDriver driver;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mnagr\\Documents\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to( "http://allegro.pl");
    }
    @Test
    public void testIphone11()
    {
        FastSearchPage fastSearchPage = new FastSearchPage(driver);
        fastSearchPage.closeAlert();
        fastSearchPage.clickToTopBar();
        fastSearchPage.placeText("Iphone 11");
        fastSearchPage.takeColours();
        fastSearchPage.choseListOfPhones();
        fastSearchPage.ReachTopBar();
        fastSearchPage.selectHighestPrice();
        fastSearchPage.selectPriceMAx();
        fastSearchPage.takeFirstArticle();
        fastSearchPage.takePriceMax();





    }


}
