import org.testng.annotations.Test;
import pages.LaptopPage;

import static pages.MainPage.Label.mainPageName;

     public class LaptopPageTests extends BaseTest{


    @Test
    public void aequalsPageTitlelaptop() throws InterruptedException {
        laptopPage.openPage();
        Thread.sleep(3000);// bez sleepov cherez raz srabativaet
        laptopPage.equalsPageTitleWithlaptopTitleName();
    }
    @Test
    public void bkroshkaNoutbukiIsDisplayed() throws InterruptedException {
        laptopPage.openPage();
        Thread.sleep(3000);
       laptopPage.elementKroshkaNoutbukiIsDisplayed();
    }
    @Test
    public void cauthorizationFieldIsDisplayed() throws InterruptedException {
        laptopPage.openPage();
        Thread.sleep(7000);
        laptopPage.clickOnElementAuthorizationIcon();
        laptopPage.elementAuthorizationFieldVhidIsDisplayed();
    }
    @Test
    public void dclickOnRozetkaLogoWorksCorrectly () throws InterruptedException {
        laptopPage.openPage();
        Thread.sleep(3000);
        laptopPage.clickOnElemenBytRozetkaLogo();
        Thread.sleep(3000);
        laptopPage.equalsPageTitleWithString(mainPageName);
    }
    @Test
    public void eclickOnDellElement () throws InterruptedException {
        laptopPage.openPage();
        Thread.sleep(7000);
        laptopPage.clickOnElementDell();
        Thread.sleep(7000);
        laptopPage.equalsDellTitleWithCorrectlyTitleName();
    }
}
