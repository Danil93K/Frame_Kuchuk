import org.testng.annotations.Test;
import pages.LaptopPage;

import static pages.MainPage.Label.mainPageName;

public class LaptopPageTests extends BaseTest{
    @Test
    public void aequalsPageTitlelaptopp() throws InterruptedException {// Pravilnoe nazvanie stranici
        laptopPage.openPage();
        Thread.sleep(3000);// bez sleepov cherez raz srabativaet
        laptopPage.equalsPageTitleWithlaptopTitleName();
    }
    @Test
    public void bkroshkaNoutbukiIsDisplayed() throws InterruptedException {//  Element otobragaetsya
        laptopPage.openPage();
        Thread.sleep(3000);
       laptopPage.elementKroshkaNoutbukiIsDisplayed();
    }
    @Test
    public void cauthorizationFieldIsDisplayed() throws InterruptedException {// authorization forma otobrageetsya
        laptopPage.openPage();
        Thread.sleep(7000);
        laptopPage.clickOnElementAuthorizationIcon();
        laptopPage.elementAuthorizationFieldVhidIsDisplayed();
    }
    @Test
    public void dclickOnRozetkaLogoWorksCorrectly () throws InterruptedException {// nagatie na logo redirect na glvnuyu stranicu
        laptopPage.openPage();
        Thread.sleep(3000);
        laptopPage.clickOnElemenBytRozetkaLogo();
        Thread.sleep(3000);
        laptopPage.equalsPageTitleWithString(mainPageName);
    }
    @Test
    public void eclickOnDellElement () throws InterruptedException {// click na Dell otrabativaet verno
        laptopPage.openPage();
        Thread.sleep(7000);
        laptopPage.clickOnElementDell();
        Thread.sleep(7000);
        laptopPage.equalsDellTitleWithCorrectlyTitleName();
    }


    // 2 Element is displayed +
    // 3 avtorization open +
    // 4 Nazhatie logotip( rozetka 18 let) otrabativaet pravilno +
    // 5 vibor nugnoy firmi(apple) otrabativaet pravilno +
    // !!! 3 STRANICA dlya testa kartochka tovara !!!
}
