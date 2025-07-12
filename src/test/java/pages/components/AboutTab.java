package pages.components;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class AboutTab {
    final String articleNameSelector = "span[id='hs_cos_wrapper_dnd_area-module-2_'] h1";
    final String successfulProjectsNumberSelector = "h1[class='chakra-text css-yizfub'] span";
    final String peopleNumberSelector = "h1[class='chakra-text css-1xgu9r9'] span";
    final String yearNumberSelector = "span[id='hs_cos_wrapper_widget_1738292166375_'] span";

    @Step("Check the contact phone number")
    public void checkArticleName(String articleName) {
        $(articleNameSelector)
                .shouldBe(visible)
                .shouldHave(exactText(articleName));
    }

    @Step("Check the number of successful projects")
    public void checkProjectsNumber(String projectNumber) {
        $(successfulProjectsNumberSelector)
                .shouldBe(visible)
                .shouldHave(exactText(projectNumber));
    }

    @Step("Check the number of people")
    public void checkPeopleNumber(String peopleNumber) {
        $(peopleNumberSelector)
                .shouldBe(visible)
                .shouldHave(exactText(peopleNumber));
    }

    @Step("Check the number of years")
    public void checkYearNumber(String yearNumber) {
        $(yearNumberSelector)
                .shouldBe(visible)
                .shouldHave(exactText(yearNumber));
    }
}
