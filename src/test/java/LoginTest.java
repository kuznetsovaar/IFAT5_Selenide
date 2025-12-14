import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class LoginTest extends BaseTest {
    @Test
    public void projectIsOpen() {
        loginPage
                .openPage()
                .login();
        projectsPage.waitOpen();

        $$x("//tr").findBy(text("кеп")).getSize();
        $$x("//tr").findBy(text("кеп")).should(exist);
    }
}
