package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    @Step("Open the main page")
    public void openMainPage() {
        open(baseUrl);
    }
}
