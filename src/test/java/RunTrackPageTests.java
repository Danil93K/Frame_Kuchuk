import functions.Elements;
import functions.Waiters;
import org.testng.annotations.Test;
import pages.RunningTrackPage;


public class RunTrackPageTests extends BaseTest{
    @Test
    public void equalsPageTitleTrack(){// 1 pageTitle
        RunTrackPage.openPage();
        RunTrackPage.equalsPageTrackTitleName();
    }

    @Test
    public void  elementisDisplayed() { // 2 element is Displayed

        RunTrackPage.openPage();
        RunTrackPage.elementFormTrackIsDisplayed();
    }
    @Test
    public void elementUviytiButtonIsClickble() throws InterruptedException { // 3 element Clickble

        RunTrackPage.openPage();
        RunTrackPage.clickOnClickableButton();
        RunTrackPage.elementH3VhidForClickableButtonIsDisplayed();

    }
    @Test
    public void redirectToHarakteristikiPage() throws InterruptedException {// 4 Redirect harakteristika
        RunTrackPage.openPage();
        RunTrackPage.clickOnHarakteristikiTab();
        RunTrackPage.elementH1ByHarakteristikiPageIsDisplayed();
    }
    @Test
    public void trackAddToCart() throws InterruptedException {// 5 dorogka dobovlyaetsa v korzinu

        RunTrackPage.openPage();
        RunTrackPage.clickOnBuyButton();
        RunTrackPage.elementInCartIsDisplayed();
    }









}
