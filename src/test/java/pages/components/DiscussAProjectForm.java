package pages.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.checked;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DiscussAProjectForm {
    private final SelenideElement captcha = $(".hs_recaptcha.hs-recaptcha.field.hs-form-field .input");
    private final String subscriptionCheckboxName = "LEGAL_CONSENT.subscription_type_531440580";
    private final SelenideElement subscriptionCheckbox = $("[name='" + subscriptionCheckboxName + "']");
    private final SelenideElement firstNameField = $(".hs_firstname.hs-firstname.hs-fieldtype-text.field.hs-form-field");
    private final SelenideElement lastNameField = $(".hs_lastname.hs-lastname.hs-fieldtype-text.field.hs-form-field");
    private final SelenideElement emailField = $(".hs_email.hs-email.hs-fieldtype-text.field.hs-form-field");
    private final SelenideElement companyNameField = $(".hs_company.hs-company.hs-fieldtype-text.field.hs-form-field");
    private final SelenideElement messageField = $(".hs_message.hs-message.hs-fieldtype-textarea.field.hs-form-field");

    @Step("Check that captcha is visible")
    public void checkCaptchaIsVisible() {
        captcha.shouldBe(visible);
    }


    @Step("Check that the subscription checkbox is set to: {isChecked}")
    public void checkSubscriptionCheckbox(boolean isChecked) {
        subscriptionCheckbox.shouldBe(visible);

        if (isChecked) {
            subscriptionCheckbox.shouldBe(checked);
        } else {
            subscriptionCheckbox.shouldNotBe(checked);
        }
    }

    @Step("Check the First Name field name")
    public void checkFirstNameFieldName(String fieldName) {
        firstNameField.shouldHave(exactText(fieldName));
    }

    @Step("Check the Last Name field name")
    public void checkLastNameFieldName(String fieldName) {
        lastNameField.shouldHave(exactText(fieldName));
    }

    @Step("Check the Email field name")
    public void checkEmailFieldName(String fieldName) {
        emailField.shouldHave(exactText(fieldName));
    }

    @Step("Check the Company Name field name")
    public void checkCompanyNameFieldName(String fieldName) {
        companyNameField.shouldHave(exactText(fieldName));
    }
    @Step("Check the Message field name")
    public void checkMessageFieldName(String fieldName) {
        messageField.shouldHave(exactText(fieldName));
    }
}
