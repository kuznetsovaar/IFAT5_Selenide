import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import pages.ProjectsPage;

public class BaseTest {
    LoginPage loginPage;
    ProjectsPage projectsPage;

    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1366x768";
        Configuration.timeout = 1590000;
        Configuration.headless = false;
        Configuration.baseUrl = "https://lt.uxcrowd.ru/";
        Configuration.holdBrowserOpen = true;

        loginPage = new LoginPage();
        projectsPage = new ProjectsPage();

        //Selenide.getWebDriver().manage().window().maximize;
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximazed");
        WebDriver driver = new ChromeDriver(options);
        setWebDriver(driver); */
    }

    @AfterMethod
    public void close() {
        Selenide.clearBrowserCookies();
        Selenide.closeWebDriver();
    }
}
