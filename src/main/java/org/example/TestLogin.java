package org.example;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.url;

public class TestLogin {
    @Test
    public void openLoginPage() throws InterruptedException {
        Selenide.open("https://practicetestautomation.com/practice-test-login/");
        $(By.name("username")).setValue("student");
        $(By.name("password")).setValue("Password123");
        $(By.xpath("//*[@id=\"submit\"]")).click();
        Thread.sleep(3000);
        //Assert the loaded URL after login
        url().contentEquals("practicetestautomation.com/practice-test-login/");
        $(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/p[1]/strong"))
                .shouldHave((Condition.text("Congratulations student. You successfully logged in!")));
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
