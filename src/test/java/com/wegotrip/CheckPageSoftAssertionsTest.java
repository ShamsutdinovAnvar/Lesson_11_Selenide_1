package com.wegotrip;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CheckPageSoftAssertionsTest {

    @Test
    @DisplayName("Проверка наличия страницы SoftAssertions")
    public void checkPageSoftAssertions(){

        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $(".wiki-rightbar").shouldHave(Condition.text("SoftAssertions"));
    }
    @Test
    @DisplayName("Проверка наличия внутри примера кода для JUnit5")
    public void checkCodeJUnit5(){

        open("https://github.com/selenide/selenide/wiki/SoftAssertions");
        $(".markdown-body").$(byText("3. Using JUnit5 extend test class:")).shouldBe(visible);
    }
}
