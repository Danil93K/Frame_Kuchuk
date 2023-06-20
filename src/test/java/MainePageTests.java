import functions.Elements;
import org.testng.annotations.Test;
import pages.MainPage;

import static org.testng.Assert.assertEquals;

import static org.testng.Assert.assertTrue;
import static pages.MainPage.Label.mainPageName;


    public class MainePageTests extends BaseTest{


    @Test
    public void mainPageName(){
        mainPage.openPage();
        mainPage.equalsPageTitleWithString(mainPageName);
       }
    @Test
    public void katalogButtonIsDisplayed() {
        mainPage.openPage();
        mainPage.elementKatalogButtonIsDisplayed();
    }
    @Test
     public void korzinaEmptyAfterOpen()  {
            mainPage.openPage();
            mainPage.clickOnKorzinaButton();
       mainPage.equalsOfStrings(mainPage.getTextFromEmptyKorzinaElement(), MainPage.Label.textElementKorzinaEmpty);
     }
    @Test
    public void equalsTextAfterSearch() throws InterruptedException {
    mainPage.openPage();
    mainPage.sendKeysToSearchTextAndClickSearchButton();
    Thread.sleep(3000);// без паузы срабатывает по настроению
    mainPage.equalsOfTextH1ElementAndExpectedH1ElementText();
    }
    @Test
    public void elementHamburgerMenuIsClickable() throws InterruptedException {
        mainPage.openPage();
        mainPage.clickOnHamburger();
        mainPage.elementIsDisplayedForAssertAfterClickHamburgerMenu();
    }
}
