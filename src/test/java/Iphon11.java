import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
    public void  AllegroTest()
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-role='accept-consent']")));
        driver.findElement(By.cssSelector("[data-role='accept-consent']")).click();
        WebElement searchEntry = driver.findElement(By.cssSelector("[placeholder='czego szukasz?']"));
        searchEntry.sendKeys("Iphone 11");
        searchEntry.submit();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("czarny")));
        driver.findElement(By.linkText("czarny")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("article[data-analytics-view-custom-page='1']")));
        List <WebElement> Iphone11 = driver.findElements(By.cssSelector("article[data-analytics-view-custom-page='1']"));
        System.out.println(Iphone11.size());
        for(int i=0; i<Iphone11.size();i++){
            System.out.println((Iphone11.get(i).getText()));
        }




    }

    @After
    public void  tearDown()
    {

        //driver.quit();
    }






}
