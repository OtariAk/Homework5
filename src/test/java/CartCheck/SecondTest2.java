package CartCheck;

import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SecondTest2 extends ChromeRunner {

    @Test
    public void TestMethod4(){
        $(byId("rcc-confirm-button")).click();
        $(byClassName("btn-cart"),0).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byClassName("unexpanded")).$(byText("შენახული ნივთები")).click();
        $(byText("ვერ მოიძებნა")).shouldBe(Condition.visible, Duration.ofMillis(10000));
        $(byId("search_list")).setValue("ლეპტოპი").pressEnter();
        $(byClassName("button-section"),0).$(byClassName("add_to_cart")).click();
        $(byClassName("btn-cart"),0).click();
        $(byText("კალათა ცარიელია")).shouldNotBe(Condition.visible, Duration.ofMillis(10000));
        $(byClassName("redButton")).click();
        $(byClassName("unexpanded")).$(byText("შენახული ნივთები")).click();
        $(byText("ვერ მოიძებნა")).shouldNotBe(Condition.visible);
        $(byClassName("btn-cart"),0).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byClassName("unexpanded")).$(byText("შენახული ნივთები")).click();
        $(byClassName("cross_icon")).$(byClassName("d-xs-none")).click();
        $(byText("ვერ მოიძებნა")).shouldNotBe(Condition.visible);
    }
}
