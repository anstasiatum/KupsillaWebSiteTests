package pages.components;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.checked;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DiscussAProjectForm {
    final String captcha = "div[class='hs_recaptcha hs-recaptcha field hs-form-field'] div[class='input']";
    final String subscriptionCheckbox = ".LEGAL_CONSENT.subscription_type_531440580-36450580-f77f-41ee-912c-084550c5a044_7527";
    final String subscriptionCheckboxText = "I agree to receive other communications from Kupsilla.";

    @Step("Captcha is visible")
    public void checkCaptchaIsVisible() {
        $(captcha).shouldBe(visible);
    }

    @Step("The subscription agreement checkbox is unchecked")
    public void checkSubscriptionCheckboxIsUnchecked() {
        $(subscriptionCheckbox)
                .shouldBe(visible)
                .shouldNotBe(checked)
                .shouldHave(exactText(subscriptionCheckboxText));
    }
}
