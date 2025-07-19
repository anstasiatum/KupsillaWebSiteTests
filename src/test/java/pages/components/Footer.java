package pages.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class Footer {
    private final SelenideElement phoneNumberField = $("a[href='tel:+15088780629']");
    private final SelenideElement emailField = $("a[href='mailto:sales@kupsilla.com']");
    private final SelenideElement copyright = $("#hs_cos_wrapper_footer-module-11_ div p");

    @Step("Check the contact phone number")
    public void checkPhoneNumber(String phoneNumber) {
        phoneNumberField
                .shouldBe(visible)
                .shouldHave(exactText(phoneNumber));
    }

    @Step("Check the contact email")
    public void checkEmail(String email) {
        emailField
                .shouldBe(visible)
                .shouldHave(exactText(email));
    }

    @Step("Check the copyright information")
    public void checkCopyrightInfo(String copyrightInfo) {
        copyright
                .shouldBe(visible)
                .shouldHave(exactText(copyrightInfo));
    }
}
