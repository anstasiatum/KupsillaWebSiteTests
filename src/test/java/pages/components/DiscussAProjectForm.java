package pages.components;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.checked;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DiscussAProjectForm {
    final String captchaSelector = "div[class='hs_recaptcha hs-recaptcha field hs-form-field'] div[class='input']";
    final String subscriptionCheckboxSelector = "input[id='LEGAL_CONSENT.subscription_type_531440580-36450580-f77f-41ee-912c-084550c5a044_3188']";
    final String firstNameFieldSelector = ".hs_firstname.hs-firstname.hs-fieldtype-text.field.hs-form-field";
    final String lastNameFieldSelector = ".hs_lastname.hs-lastname.hs-fieldtype-text.field.hs-form-field";
    final String emailFieldSelector = ".hs_email.hs-email.hs-fieldtype-text.field.hs-form-field";
    final String companyNameFieldSelector = ".hs_company.hs-company.hs-fieldtype-text.field.hs-form-field";
    final String messageFieldSelector = ".hs_message.hs-message.hs-fieldtype-textarea.field.hs-form-field";

    @Step("Check that captcha is visible")
    public void checkCaptchaIsVisible() {
        $(captchaSelector).shouldBe(visible);
    }

    @Step("Check the state of the subscription checkbox")
    public void checkSubscriptionCheckbox(boolean isChecked) {
        $(subscriptionCheckboxSelector)
                .shouldBe(visible);

        if (isChecked) {
            $(subscriptionCheckboxSelector).shouldBe(checked);
        } else {
            $(subscriptionCheckboxSelector).shouldNotBe(checked);
        }
    }

    @Step("Check the First Name field name")
    public void checkFirstNameFieldName(String fieldName) {
        $(firstNameFieldSelector).shouldHave(exactText(fieldName));
    }

    @Step("Check the Last Name field name")
    public void checkLastNameFieldName(String fieldName) {
        $(lastNameFieldSelector).shouldHave(exactText(fieldName));
    }

    @Step("Check the Email field name")
    public void checkEmailFieldName(String fieldName) {
        $(emailFieldSelector).shouldHave(exactText(fieldName));
    }

    @Step("Check the Company Name field name")
    public void checkCompanyNameFieldName(String fieldName) {
        $(companyNameFieldSelector).shouldHave(exactText(fieldName));
    }
    @Step("Check the Message field name")
    public void checkMessageFieldName(String fieldName) {
        $(messageFieldSelector).shouldHave(exactText(fieldName));
    }
}
