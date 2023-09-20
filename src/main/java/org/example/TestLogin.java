package org.example;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TestLogin {
    @Test
    public void openLoginPage() {
        Selenide.open("https://practicetestautomation.com/practice-test-login/");
        $(By.name("username")).setValue("student");
        $(By.name("password")).setValue("password123");
        $(By.xpath("//*[@id=\"submit\"]")).click();
    }
    @Test
    public void testInvalidLogin() {
        Selenide.open("https://practicetestautomation.com/practice-test-login/");
        $(By.name("username")).setValue("bad");
        $(By.name("password")).setValue("bad");
        $(By.xpath("//*[@id=\"submit\"]")).click();
        $(By.xpath("//*[@id=\"error\"]"))
                .shouldHave(Condition.text("Your username is invalid!"));
    }
}
