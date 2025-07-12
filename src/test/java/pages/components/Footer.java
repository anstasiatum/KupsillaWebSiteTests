package pages.components;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class Footer {
    final String phoneNumberSelector = "a[href='tel:+15088780629']";
    final String emailSelector = "a[href='mailto:sales@kupsilla.com']";
    final String copyrightSelector = "span[id='hs_cos_wrapper_footer-module-11_'] div p";

    @Step("Check the contact phone number")
    public void checkPhoneNumber(String phoneNumber) {
        $(phoneNumberSelector)
                .shouldBe(visible)
                .shouldHave(exactText(phoneNumber));
    }

    @Step("Check the contact email")
    public void checkEmail(String email) {
        $(emailSelector)
                .shouldBe(visible)
                .shouldHave(exactText(email));
    }

    @Step("Check the copyright information")
    public void checkCopyrightInfo(String copyrightInfo) {
        $(copyrightSelector)
                .shouldBe(visible)
                .shouldHave(exactText(copyrightInfo));
    }
}
