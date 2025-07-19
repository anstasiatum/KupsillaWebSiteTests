package pages.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.image;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HeaderMenu {
    private final SelenideElement kupsillaLogo = $(".header__logo-image");
    private final SelenideElement discussAProjectButton = $(".header__button-col.hidden-phone .header__button.button");
    private final SelenideElement aboutButton = $(".header__menu-col").$(byText("About"));

    @Step("Check that Kupsilla logo is visible")
    public void checkLogoIsVisible() {
        kupsillaLogo
                .shouldBe(visible)
                .shouldBe(image)
                .shouldHave(attribute("alt", "Kupsilla Logo"));
    }

    @Step("Check that the `Discuss a project` button is visible")
    public void checkDiscussAProjectButtonIsVisible() {
        discussAProjectButton
                .shouldBe(clickable)
                .shouldHave(exactText("Discuss a project"))
                .shouldHave(attribute("href", "https://kupsilla.com/#discuss-form"));
    }

    @Step("Click on the `Discuss a project` button")
    public void clickOnDiscussAProjectButton() {
        discussAProjectButton.click();
    }

    @Step("Check that the `About` button is visible")
    public void checkAboutButtonIsVisible() {
        aboutButton
                .shouldBe(clickable)
                .shouldHave(exactText("About"))
                .shouldHave(attribute("href", "https://kupsilla.com/about"));
    }

    @Step("Click on the `About` button")
    public void clickOnTheAboutButton() {
        $(aboutButton).click();
    }
}
