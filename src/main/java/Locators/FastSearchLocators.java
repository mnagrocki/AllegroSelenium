package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FastSearchLocators
{

    @FindBy(css = "[data-role='accept-consent']")
    private WebElement alert;
    public WebElement getAlert() {
        return alert;
    }

    public void setAlert(WebElement alert) {
        this.alert = alert;
    }

    @FindBy(css = "[placeholder='czego szukasz?']")
    private WebElement placeSearch;

    public WebElement getPlaceSearch() {
        return placeSearch;
    }

    public void setPlaceSearch(WebElement placeSearch) {
        this.placeSearch = placeSearch;
    }

    @FindBy(linkText = "czarny")
    private WebElement selectColourBlack;

    public WebElement getSelectColourBlack() {
        return selectColourBlack;
    }

    public void setSelectColourBlack(WebElement selectColourBlack) {
        this.selectColourBlack = selectColourBlack;
    }



    @FindBy(css= "article[data-analytics-view-custom-page='1']")
    private List<WebElement> listOfPhones;

    public List<WebElement> getListOfPhones() {
        return listOfPhones;
    }

    public void setListOfPhones(WebElement listOfPhones) {
        this.listOfPhones = (List<WebElement>) listOfPhones;
    }
    @FindBy(xpath= "/html/body/div[2]/div[4]/div/div/div/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/select")
    private WebElement topBar;

    public WebElement getTopBar() {
        return topBar;
    }

    public void setTopBar(WebElement topBar) {
        this.topBar = topBar;
    }

    @FindBy(xpath ="/html/body/div[2]/div[4]/div/div/div/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/select/option[3]")
    private WebElement highestPrice;

    public WebElement getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(WebElement highestPrice) {
        this.highestPrice = highestPrice;
    }

    @FindBy(css="[data-analytics-view-custom-index0='2'] ._9c44d_1LBF0")
    private WebElement firsArticle;


    public WebElement getFirsArticle() {
        return firsArticle;
    }

    public void setFirsArticle(WebElement firsArticle) {
        this.firsArticle = firsArticle;
    }

    @FindBy(xpath= "  //*[@id=\"opbox-listing--base\"]/div/section[2]/section/article[1]/div/div/div[2]/div[2]/div/div/span" )
    private List<WebElement> priceMAx;

    public List<WebElement> getPriceMAx() {
        return priceMAx;
    }

    public void setPriceMAx(WebElement priceMAx) {
        this.priceMAx = (List<WebElement>) priceMAx;
    }


    @FindBy (css= "[class='_3e3a8_2kHSL _3e3a8_2LFBt']")
    private WebElement closePopup;

    public WebElement getClosePopup() {
        return closePopup;
    }

    public void setClosePopup(WebElement closePopup) {
        this.closePopup = closePopup;
    }
}


