package pages.components;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.image;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class HeaderMenu {
    final String kupsillaLogo = ".header__logo-image";
    final String discussAProjectButton = "body > div:nth-child(1) > div:nth-child(1) > header:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > a:nth-child(1)";
    final String aboutButton = "body > div:nth-child(1) > div:nth-child(1) > header:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(6) > a:nth-child(1)";

    @Step("Check that Kupsilla logo is visible")
    public void checkLogoIsVisible() {
        $(kupsillaLogo)
                .shouldBe(visible)
                .shouldBe(image)
                .shouldHave(attribute("alt", "Kupsilla Logo"));
    }

    @Step("Check that the `Discuss a project` button is visible")
    public void checkDiscussAProjectButtonIsVisible() {
        $(discussAProjectButton)
                .shouldBe(clickable)
                .shouldHave(exactText("Discuss a project"))
                .shouldHave(attribute("href", "https://kupsilla.com/#discuss-form"));
    }

    @Step("Click on the `Discuss a project` button")
    public void clickOnDiscussAProjectButton() {
        $(discussAProjectButton).click();
    }

    @Step("Check that the `About` button is visible")
    public void checkAboutButtonIsVisible() {
        $(aboutButton)
                .shouldBe(clickable)
                .shouldHave(exactText("About"))
                .shouldHave(attribute("href", "https://kupsilla.com/about"));
    }

    @Step("Click on the `About` button")
    public void clickOnTheAboutButton() {
        $(aboutButton).click();
    }
}
