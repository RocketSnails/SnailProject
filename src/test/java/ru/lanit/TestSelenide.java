package ru.lanit;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.sun.deploy.net.protocol.chrome.ChromeURLConnection;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import sun.util.locale.LocaleObjectCache;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestSelenide {
    @Test
    public void takeScreenShot() {
        Configuration.browser = "chrome";
        open("https://gbu.myalm.ru/pm/SAT/");
        $(By.name("login")).setValue("DVSolovyev");
        $(By.name("pass")).setValue("WorkSnail148830");
        $("[type='submit']").click();
        $("#step-0 > div.popover-navigation.text-center > button:nth-child(2)").click();
        $("#menu_favs > li:nth-child(11) > a").click();
        $("#menu-group-reports").click();
        $("#\\31 -4 > a").click();
        String date = LocalDate.now().minusWeeks(1).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        $("#select_dt1").setValue(date);
        Selenide.actions().sendKeys(Keys.ENTER).perform();
        Selenide.sleep(5000);
        screenshot("trackingscreen");
        Configuration.reportsFolder = "test-result/reports";


    }

}