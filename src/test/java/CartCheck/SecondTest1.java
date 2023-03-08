package CartCheck;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SecondTest1 {
    @BeforeTest
    public void SetUp() {
        open("https://ee.ge");
        System.setProperty("selenide.browserSize", "1980x1080");
    }
    @Test
    public void TestMethod3() {
        $(byClassName("btn-cart"), 0).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byId("search_list")).setValue("ლეპტოპი").pressEnter();
        $(byClassName("button-section"), 0).$(byClassName("add_to_cart")).click();
        $(byClassName("btn-cart"), 0).click();
        $(byText("კალათა ცარიელია")).shouldNotBe(Condition.visible);
        $(byClassName("btn-lightgrey")).$(byClassName("pl-2")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
    }
}
