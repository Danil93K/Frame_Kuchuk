import functions.Elements;
import functions.Waiters;
import org.testng.annotations.Test;
import pages.RunningTrackPage;


    public class RunTrackPageTests extends BaseTest {
    @Test
    public void equalsPageTitleTrack() {
        RunTrackPage.openPage();
        RunTrackPage.equalsPageTrackTitleName();
    }

    @Test
    public void elementFormIsDisplayed() {

        RunTrackPage.openPage();
        RunTrackPage.elementFormTrackIsDisplayed();
    }

    @Test
    public void elementUviytiButtonIsClickble() throws InterruptedException {

        RunTrackPage.openPage();
        RunTrackPage.clickOnClickableButton();
        RunTrackPage.elementH3VhidForClickableButtonIsDisplayed();

    }

    @Test
    public void redirectToHarakteristikiPage() throws InterruptedException {
        RunTrackPage.openPage();
        RunTrackPage.clickOnHarakteristikiTab();
        RunTrackPage.elementH1ByHarakteristikiPageIsDisplayed();
    }

    @Test
    public void trackAddToCart() throws InterruptedException {

        RunTrackPage.openPage();
        RunTrackPage.clickOnBuyButton();
        RunTrackPage.elementInCartIsDisplayed();
    }


}
