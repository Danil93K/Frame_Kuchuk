import functions.Elements;
import org.testng.annotations.Test;
import pages.MainPage;

import static org.testng.Assert.assertEquals;

import static org.testng.Assert.assertTrue;
import static pages.MainPage.Label.mainPageName;


public class MainePageTests extends BaseTest{


    @Test                      // https://github.com/Danil93K/FirstExam/tree/main/TestRail !
    public void mainPageName(){
        mainPage.openPage();
        mainPage.equalsPageTitleWithString(mainPageName);
       }
    @Test
    public void katalogButtonIsDisplayed() {// knopka katalog otobragaetsya git
        mainPage.openPage();
        mainPage.elementKatalogButtonIsDisplayed();
    }
    @Test
     public void korzinaEmptyAfterOpen()  {// korzina pustaya posle otkritiya
            mainPage.openPage();
            mainPage.clickOnKorzinaButton();
       mainPage.equalsOfStrings(mainPage.getTextFromEmptyKorzinaElement(), MainPage.Label.textElementKorzinaEmpty);
     }
    @Test
    public void equalsTextAfterSearch() throws InterruptedException {// pravilniy text posle poiska
    mainPage.openPage();
    mainPage.sendKeysToSearchTextAndClickSearchButton();
    Thread.sleep(3000);// без паузы срабатывает по настроению
    mainPage.equalsOfTextH1ElementAndExpectedH1ElementText();
    }
    @Test
    public void elementHamburgerMenuIsClickable() throws InterruptedException {// element hambburger clickabelniy
        mainPage.openPage();
        mainPage.clickOnHamburger();
        mainPage.elementIsDisplayedForAssertAfterClickHamburgerMenu();
    }
}
