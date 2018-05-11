package ru.lanit;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestSelenide {
    @Test
    public void takeScreenShot() {
        open("http://yandex.ru");
        $("#text").setValue("johny");
        $(".search2__button").click();

        $(".serp-item").shouldHave(text("johny"));
    }
}

