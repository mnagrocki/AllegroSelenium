import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Iphon11
{   private WebDriver driver;

    @Before
    public void Setup()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mnagr\\Documents\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to( "http://allegro.pl");

    }

    @Test
    public void  AllegroTest() {
        WebDriverWait wait;
        Actions actions = new Actions(driver);
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-role='accept-consent']")));
        driver.findElement(By.cssSelector("[data-role='accept-consent']")).click();
        WebElement searchEntry = driver.findElement(By.cssSelector("[placeholder='czego szukasz?']"));
        searchEntry.sendKeys("Iphone 11");
        searchEntry.submit();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("czarny")));
        driver.findElement(By.linkText("czarny")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("article[data-analytics-view-custom-page='1']")));
        List<WebElement> Iphone11 = driver.findElements(By.cssSelector("article[data-analytics-view-custom-page='1']"));
        System.out.println(Iphone11.size());
        for (int i = 0; i < Iphone11.size(); i++) {
            System.out.println((Iphone11.get(i).getText()));
        }
        ;

        driver.findElement(By.cssSelector("[class='_1h7wt _k70df _7qjq4 _27496_3VqWr']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[value='pd']")));
        driver.findElement(By.cssSelector("[value='pd']")).click();
        driver.findElement(By.cssSelector("[value='pd']")).isSelected();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("article[data-analytics-view-custom-index0='0']")));
        driver.findElement(By.cssSelector("[data-analytics-view-custom-index0='0']"));
        List<WebElement> priceMAx = driver.findElements(By.xpath("  //*[@id=\"opbox-listing--base\"]/div/section[1]/section/article[1]/div/div/div[2]/div[2]/div/div/span"));
        System.out.println(priceMAx.size());
        for (int i = 0; i < priceMAx.size(); i++){

            System.out.println("requested Iphone11 " + priceMAx.get(i).getText());
            String priceMaxElement = priceMAx.get(i).getText().replace(" zł", "").replace(" ","").replace(",",".");
            Double.parseDouble(priceMaxElement);
            double PriceVat = Double.parseDouble(priceMaxElement) * 0.23  + Double.parseDouble(priceMaxElement);
            System.out.println(("Price increased by vat " +PriceVat +"zł"));


        }




    }

    @After
    public void  tearDown()
    {

        //driver.quit();
    }






}
