package pages;

import functions.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class RunningTrackPage  extends BasePage {
    public  RunningTrackPage(WebDriver driver) {
        super(driver);
    }
    private static class Locators{
        private final static String xpathFormTrack = "//form[@class='add-comment ng-untouched ng-pristine ng-invalid']";
        private final static  String xpathClickableButton = "//button[text()=' Увійти в особистий кабінет ']";// moe
        ////span[text()='Ноутбуки']
        protected final static String xpathH3VhidForClickableButton="//h3[@class='modal__heading']";
        protected final static String xpathHarakteristikiTab="//a[text()=' Характеристики ']";
        ////h3[text()=' Вхід']
        protected final static String xpathH1ElementByHarakteristikiPage="//h1[text()='Характеристики Бігова доріжка Life Fitness T5 Track Connect']";
        protected final static String xpathBuyButton="//button [@class='buy-button button button--with-icon button--green button--medium buy-button--tile ng-star-inserted']";
        //a [@data-id='Apple']
        protected final static String xpathElementInCart="//div [@class='cart-receipt ng-star-inserted']";
    }

    private static class Label{

        protected final static String TrackUrl="https://rozetka.com.ua/ua/life_fitness_t5_track_connect/p303787753/";//moe

        protected final static String TrackTitleName="Бігова доріжка Life Fitness T5 Track Connect – низькі ціни, кредит, оплата частинами в інтернет-магазині ROZETKA | Купити в Україні: Києві, Харкові, Дніпрі, Одесі, Запоріжжі, Львові";

    }
    public void elementFormTrackIsDisplayed(){
        assertTrue(elements.isElementDisplayed(Locators.xpathFormTrack ), "Элемент не отображается, хотя должен был");
    }
    public void clickOnClickableButton(){

        elements.findElementByXpath(Locators.xpathClickableButton).click();

    }
    public void clickOnBuyButton(){

        elements.findElementByXpath(Locators.xpathBuyButton).click();

    }
    public void elementH3VhidForClickableButtonIsDisplayed(){
        assertTrue(elements.isElementDisplayed(Locators.xpathH3VhidForClickableButton ), "Элемент не отображается, хотя должен был");
    }
    public void  elementH1ByHarakteristikiPageIsDisplayed(){
        assertTrue(elements.isElementDisplayed(Locators.xpathH1ElementByHarakteristikiPage), "Элемент не отображается, хотя должен был");
    }
    public void clickOnHarakteristikiTab(){

        elements.findElementByXpath(Locators.xpathHarakteristikiTab).click();

    }
    public void  elementInCartIsDisplayed(){
        assertTrue(elements.isElementDisplayed(Locators.xpathElementInCart), "Элемент не отображается, хотя должен был");
    }

    public void equalsPageTrackTitleName(){

        assertEquals(elements.getTitle(), Label.TrackTitleName );
    }

    public void openPage(){

        driver.get(Label.TrackUrl);
    }
}

