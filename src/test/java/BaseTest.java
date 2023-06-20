import driver.DriverFactory;
import functions.ActionClass;
import functions.Assertions;
import functions.Elements;
import functions.Waiters;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import pages.BasePage;
import pages.MainPage;
import pages.LaptopPage;
import pages.RunningTrackPage;


public class BaseTest {
    static final Logger logger = LoggerFactory.getLogger(BaseTest.class);
    protected WebDriver driver = DriverFactory.startChromeDriver();
    protected BasePage basePage = new BasePage(driver);
    protected MainPage mainPage = new MainPage(driver);
    protected LaptopPage laptopPage = new LaptopPage(driver);
    protected RunningTrackPage RunTrackPage = new RunningTrackPage(driver);
    protected Waiters waiters = new Waiters(driver);
    protected ActionClass action = new ActionClass(driver);
    protected Assertions assertions = new Assertions(driver);
    protected Elements elements = new Elements(driver);

    @AfterSuite
    public void closeDriver(){
        logger.info("driver is closing");
        driver.quit();
    }
}
