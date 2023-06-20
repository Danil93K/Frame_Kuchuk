package pages;

import org.openqa.selenium.WebDriver;

import static org.testng.Assert.*;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public static class Locators{

        protected final static String xpathSearchField = "//input [@name='search']";//moe
        protected final static String xpathkatalogButton="//button [@class='button button--medium button--with-icon menu__toggle ng-star-inserted']";// moe

        protected final static String xpathKorzinaMainPage="//rz-cart[@class='header-actions__component']";//moe
        protected final static String xpathEmptyKorzinaElement="//h4 [@class='cart-dummy__heading']";//moe
        protected final static String xpathZnaytiButton="//button [@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']";//moe

        protected final static String xpathH1AfterSearch="//h1 [@class='catalog-heading ng-star-inserted']";//moe

        protected final static String xpathHamburgerMenu="/html/body/app-root/div/div/rz-header/rz-main-header/header/div/div/rz-mobile-user-menu";
        //div [@class='side-menu__header ng-tns-c37-1 ng-star-inserted']
        protected final static String xpathForAssertAfterClickHamburger="//div [@class='side-menu drawer-content drawer-content_state_visible']";


    }

    public static class Label{
        private final static String url = "https://rozetka.com.ua/";
        public static String  mainPageName ="Інтернет-магазин ROZETKA™: офіційний сайт найпопулярнішого онлайн-гіпермаркету в Україні";
        public static String textElementKorzinaEmpty="Кошик порожній";
        public static String textToSendKeysSearch="Компас";
        public static String expectedTextFromH1AfterSearch="Компаси";
    }
    public void equalsPageTitleWithString(String mainPageName){

        assertEquals(elements.getTitle(),mainPageName);}
    public void elementKatalogButtonIsDisplayed(){
       assertTrue(elements.isElementDisplayed(Locators.xpathkatalogButton), "Элемент не отображается, хотя должен был");
    }
    public void clickOnKorzinaButton(){
        elements.clickOnElementByXpath(Locators.xpathKorzinaMainPage);

    }
    public String getTextFromEmptyKorzinaElement(){

        return  elements.findElementByXpath(Locators.xpathEmptyKorzinaElement).getText();
    }
    public void equalsOfStrings(String actualString, String expectedString){
        assertEquals(actualString,expectedString,
                "Я ожидал получить "+expectedString+". А получил "+ actualString);
    }
    public void sendKeysToSearchTextAndClickSearchButton(){

        elements.findElementByXpath(Locators.xpathSearchField).sendKeys(Label.textToSendKeysSearch);
        elements.clickOnElementByXpath(Locators.xpathZnaytiButton);
    }
    public void equalsOfTextH1ElementAndExpectedH1ElementText(){
        assertEquals(elements.getTextFromElementXpath(Locators.xpathH1AfterSearch),Label.expectedTextFromH1AfterSearch,
                "Я ожидал получить "+Label.expectedTextFromH1AfterSearch+". А получил "+ elements.getTextFromElementXpath(Locators.xpathH1AfterSearch));
    }
    public void clickOnHamburger(){

        elements.findElementByXpath(Locators.xpathHamburgerMenu).click();

    }
    public void elementIsDisplayedForAssertAfterClickHamburgerMenu() {
        assertTrue(elements.isElementDisplayed(Locators.xpathForAssertAfterClickHamburger), "Элемент не отображается, хотя должен был");
    }








      /*  public void searchByText(String text){
        elements.sendKeysToElementBy(Locators.katalogButton,text);
        elements.clickOnElementBy(Locators.searchButton);
    }*/
    public void openPage(){

        driver.get(Label.url);
    }
}
