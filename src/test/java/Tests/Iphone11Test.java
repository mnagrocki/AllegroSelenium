package Tests;

import Pages.FastSearchPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Iphone11Test
{
    private WebDriver driver;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mnagr\\Documents\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to( "http://allegro.pl");
        assertEquals(driver.getTitle(), "Allegro - Bezpieczne zakupy w niskich cenach");

    }
    @Test
    public void testIphone11()
    {

        FastSearchPage fastSearchPage = new FastSearchPage(driver);
        fastSearchPage.closeAlert();
        fastSearchPage.clickToTopBar();
        fastSearchPage.placeText("Iphone 11");
        fastSearchPage.takeColours();
        assertTrue( driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/div/div/div[2]/div[2]/div[1]/div[3]/div/div/div/div/div/fieldset[25]/div/ul/li/label/a/span")).isDisplayed());
        fastSearchPage.choseListOfPhones();
        fastSearchPage.ReachTopBar();
        fastSearchPage.selectHighestPrice();
        assertTrue( driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/select/option[3]")).isSelected());
        fastSearchPage.selectPriceMAx();
        fastSearchPage.popapClose();
        fastSearchPage.takeFirstArticle();
        fastSearchPage.takePriceMax();



    }



}
