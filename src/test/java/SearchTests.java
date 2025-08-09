import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {


    @Test
    void captchaTest() {
        open("https://www.google.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("html").shouldHave(text("Об этой странице"));
    }

    @Test
    void yahooTest() {
        open("https://search.yahoo.com/");
        $("#yschsp").setValue("selenide").pressEnter();
        $("body").shouldHave(text("selenide.org"));

    }
}