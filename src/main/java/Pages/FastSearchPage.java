package Pages;

import Locators.FastSearchLocators;
import javafx.collections.transformation.SortedList;
import net.bytebuddy.TypeCache;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Collection;

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
    {   wait.until(ExpectedConditions.visibilityOf(fastSearchLocators.getSelectColourBlack()));
         fastSearchLocators.getSelectColourBlack().isSelected();
         fastSearchLocators.getSelectColourBlack().click();
    }
    public void  choseListOfPhones()
    {
        wait.until(ExpectedConditions.visibilityOf(fastSearchLocators.getListOfPhones().get(1)));
        fastSearchLocators.getListOfPhones();
        System.out.println(fastSearchLocators.getListOfPhones());

        for (int i = 0; i < fastSearchLocators.getListOfPhones().size(); i++) {

            String aElement = fastSearchLocators.getListOfPhones().get(i).getText();
            System.out.println((aElement));

        }
        int validation = 60;
        if (fastSearchLocators.getListOfPhones().size() > validation) {
        System.out.println("Check the list, number of articles is more than " + validation + "!!!!!!!!!!!!!!!!");
    }

    }
    public void  ReachTopBar()
    {
     fastSearchLocators.getTopBar().click();

    }
    public void  selectHighestPrice()
    {
        wait.until(ExpectedConditions.visibilityOf(fastSearchLocators.getHighestPrice()));
        fastSearchLocators.getHighestPrice().isSelected();
        fastSearchLocators.getHighestPrice().click();
    }
    public void selectPriceMAx()
    {

        fastSearchLocators.getPriceMAx();
    }
    public void takeFirstArticle()
    {
        wait.until(ExpectedConditions.visibilityOf(fastSearchLocators.getFirsArticle()));
        fastSearchLocators.getFirsArticle().isSelected();
        fastSearchLocators.getFirsArticle();

    }
    public void takePriceMax()
    {
        for (int i = 0; i < fastSearchLocators.getPriceMAx().size(); i++){

            System.out.println("requested Iphone11 " + fastSearchLocators.getPriceMAx().get(i).getText());
             public String  priceMaxElement = fastSearchLocators.getPriceMAx().get(i).getText().replace(" zł", "").replace(" ","").replace(",",".");
            Double.parseDouble(priceMaxElement);
            double PriceVat = Double.parseDouble(priceMaxElement) * 0.23  + Double.parseDouble(priceMaxElement);
            System.out.println(("Price increased by 23% of vat " + PriceVat +"zł"));
        fastSearchLocators.getPriceMAx();
        }

    }
    public void takeSecondArticle()
    {
        wait.until(ExpectedConditions.visibilityOf(fastSearchLocators.getSecondArticle()));
        fastSearchLocators.getSecondArticle();
    }

    public void takePriceOfSecondArticle()
    {
        for (int i = 0; i < fastSearchLocators.getPriceSecondArticle().size(); i++){

            System.out.println("second article  " + fastSearchLocators.getPriceSecondArticle().get(i).getText());
            String priceSecondElement = fastSearchLocators.getPriceSecondArticle().get(i).getText().replace(" zł", "").replace(" ","").replace(",",".");
            Double.parseDouble(priceSecondElement);
            System.out.println(("Price of second article is "+ priceSecondElement));
            fastSearchLocators.getPriceSecondArticle();


        }
    }




}

