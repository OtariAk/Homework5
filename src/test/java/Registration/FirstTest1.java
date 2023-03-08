package Registration;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstTest1 {
    @BeforeTest
    public void SetUp(){
        open("https://ee.ge");
        System.setProperty("selenide.browserSize", "1980x1080");
    }

    @Test
    public void TestMethod1() {
        $(byClassName("btn-register"), 0).click();
        $(byText("სწრაფი რეგისტრაცია")).shouldBe(Condition.visible);
        $(byId("firstName")).setValue("Oto");
        $(byId("firstName")).shouldNotBe(Condition.empty);
        $(byId("lastName")).setValue("Akhaladze");
        $(byId("lastName")).shouldNotBe(Condition.empty);
        $(byId("email")).setValue("otoaxaladze@gmail.com");
        $(byId("email")).shouldNotBe(Condition.empty);
        $(byId("password")).setValue("Qwer1234");
        $(byId("confirmPassword")).setValue("Qwer1234");
        $(byId("singup")).shouldBe(Condition.enabled);
    }
}
