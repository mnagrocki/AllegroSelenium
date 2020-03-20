package Pages;

import Locators.FastSearchLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FastSearchPage
{

    WebDriver driver;
    WebDriverWait wait;
    FastSearchLocators fastSearchLocators;

    public  FastSearchPage(WebDriver driver  )
    {
        this.driver = driver;
        fastSearchLocators = new FastSearchLocators();
        PageFactory.initElements(driver, fastSearchLocators);
        wait = new WebDriverWait(driver,10);

    }

    public void closeAlert()
    {
        wait.until(ExpectedConditions.elementToBeClickable(fastSearchLocators.getAlert()));
        fastSearchLocators.getAlert().click();
    }
    public void clickToTopBar ()
    {
        fastSearchLocators.getPlaceSearch().click();

    }
    public void placeText(String placeSearch)
    {
        fastSearchLocators.getPlaceSearch().sendKeys(placeSearch);
        fastSearchLocators.getPlaceSearch().submit();

    }
    public void  takeColours()
    {   wait.until(ExpectedConditions.visibilityOfElementLocated((By)fastSearchLocators.getSelectColour()));
        fastSearchLocators.getSelectColour().click();
    }
    public void  choseListOfPhones()
    {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By)fastSearchLocators.getListOfPhones()));
        fastSearchLocators.getListOfPhones();
        System.out.println(fastSearchLocators.getListOfPhones().size());
        for (int i = 0; i < fastSearchLocators.getListOfPhones().size(); i++) {
            String aElement = fastSearchLocators.getListOfPhones().size().get(i).getText();
            System.out.println((aElement);
        }

    }
    public void  ReachTopBar()
    {
     fastSearchLocators.getTopBar().click();

    }
    public void  selectHighestPrice()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated((By)fastSearchLocators.getHighestPrice()));
        fastSearchLocators.getHighestPrice();
    }
    public void selectPriceMAx()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated((By)fastSearchLocators.getPriceMAx()));
        fastSearchLocators.getPriceMAx();
    }
    public void takeFirstArticle()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated((By)fastSearchLocators.getFirsArticle()));
        fastSearchLocators.getFirsArticle();
    }
    public void takePriceMax()
    {
        for (int i = 0; i < fastSearchLocators.getPriceMAx().size(); i++){

            System.out.println("requested Iphone11 " + fastSearchLocators.getPriceMAx().get(i).getText());
            String priceMaxElement = fastSearchLocators.getPriceMAx().get(i).getText().replace(" zł", "").replace(" ","").replace(",",".");
            Double.parseDouble(priceMaxElement);
            double PriceVat = Double.parseDouble(priceMaxElement) * 0.23  + Double.parseDouble(priceMaxElement);
            System.out.println(("Price increased by vat " + PriceVat +"zł"));
        fastSearchLocators.getPriceMAx();




        }






    }
}

