package pages;

import functions.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LaptopPage extends BasePage{
    public LaptopPage(WebDriver driver) {
        super(driver);
    }
    private static class Locators{
        protected final static String xpathKroshkaNoutbuki="//span[text()='Ноутбуки']";
        protected final static String xpathAuthorizationIcon="//button [@class='header__button ng-star-inserted']";
        ////h3[text()=' Вхід']
        protected final static String xpathElementAuthorizationFieldVhid="//h3[text()=' Вхід']";
        protected final static String xpathRozetkaLogo="//img [@alt='Rozetka Logo']";
        //a [@data-id='Apple']
        protected final static String xpathDell="//a [@data-id='Dell']";


    }

    private static class Label{
        protected final static String laptopUrl="https://rozetka.com.ua/ua/notebooks/c80004/";

        protected final static String laptopTitleName="Ноутбуки - ROZETKA | Купити ноутбук в Києві: ціна, відгуки, продаж, вибір ноутбуків в Україні";
        protected final static String dellTitleName="Ноутбуки Dell - ROZETKA | Купити ноутбук Делл в Києві: ціна, відгуки, продаж";
    }
    public void elementAuthorizationFieldVhidIsDisplayed(){
        assertTrue(elements.isElementDisplayed(Locators.xpathElementAuthorizationFieldVhid), "Элемент не отображается, хотя должен был");
    }
    public void elementKroshkaNoutbukiIsDisplayed(){
        assertTrue(elements.isElementDisplayed(Locators.xpathKroshkaNoutbuki), "Элемент не отображается, хотя должен был");
    }

    public void equalsPageTitleWithlaptopTitleName(){

        assertEquals(elements.getTitle(),Label.laptopTitleName);
    }
    public void clickOnElementAuthorizationIcon(){

        elements.findElementByXpath(Locators.xpathAuthorizationIcon).click();
    }
    public void clickOnElemenBytRozetkaLogo(){

        elements.findElementByXpath(Locators.xpathRozetkaLogo).click();
    }
    public void equalsPageTitleWithString(String mainPageName){

        assertEquals(elements.getTitle(),mainPageName);}
    public void clickOnElementDell(){

        elements.clickOnElementByXpath(Locators.xpathDell);
    }
    public void equalsDellTitleWithCorrectlyTitleName() {

        assertEquals(elements.getTitle(), Label.dellTitleName);
    }
    public void openPage(){

        driver.get(Label.laptopUrl);
    }
}
