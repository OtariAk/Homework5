package Registration;
import com.codeborne.selenide.Condition;
import org.testng.annotations.*;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class FirstTest2 {

    @Test
    public void TestMethod2(){
        open("https://ee.ge");
        System.setProperty("selenide.browserSize", "1980x1080");
        $(byClassName("btn-register"),0).click();
        $(byText("სწრაფი რეგისტრაცია")).shouldBe(Condition.visible, Duration.ofMillis(10000));
        $("#singup").shouldBe(Condition.disabled);
        $(byId("firstName")).click();
        $(byId("lastName")).click();
        $(byText("სახელი სავალდებულოა")).shouldBe(Condition.visible);
        $(byId("email")).click();
        $(byText("გვარი სავალდებულოა")).shouldBe(Condition.visible, Duration.ofMillis(15000));
        sleep(5000);
        $("#password").click();
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible,Duration.ofMillis(10000));
        $(byId("confirmPassword")).click();
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byClassName("ng-untouched")).click();
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);
        $(byId("email")).setValue("otoaxaladze");
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        $(byId("password")).setValue("Qwer1");
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byId("password")).setValue("Qwer1234");
        $(byId("confirmPassword")).setValue("Qwer12");
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);
    }
}
