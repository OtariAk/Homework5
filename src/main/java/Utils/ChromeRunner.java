package Utils;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;
import static com.codeborne.selenide.Selenide.open;

public class ChromeRunner {
    @BeforeMethod
    public void SetUp(){
        System.setProperty("selenide.browserSize", "1980x1080");
        open("https://ee.ge");
    }

    @AfterMethod
    public void tearDown(){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }
}
