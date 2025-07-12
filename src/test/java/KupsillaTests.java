import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.components.AboutTab;
import pages.components.DiscussAProjectForm;
import pages.components.Footer;
import pages.components.HeaderMenu;

public class KupsillaTests extends TestBase {
    MainPage mainPage = new MainPage();
    HeaderMenu headerMenu = new HeaderMenu();
    DiscussAProjectForm discussAProjectForm = new DiscussAProjectForm();
    Footer footer = new Footer();
    AboutTab aboutTab = new AboutTab();

    @Test
    @Tag("Smoke")
    @DisplayName("Kupsilla logo should be visible")
    public void logoShouldBeVisibleTest() {
        mainPage.openMainPage();
        headerMenu.checkLogoIsVisible();
    }

    @Test
    @Tag("Smoke")
    @DisplayName("The `Discuss a project` form is shown after clicking in the corresponding button")
    public void discussAProjectFormOpensTest() {
        mainPage.openMainPage();
        headerMenu.checkDiscussAProjectButtonIsVisible();
        headerMenu.clickOnDiscussAProjectButton();
        discussAProjectForm.checkFirstNameFieldName("First Name*");
        discussAProjectForm.checkLastNameFieldName("Last Name*");
        discussAProjectForm.checkEmailFieldName("Email*");
        discussAProjectForm.checkCompanyNameFieldName("Company Name*");
        discussAProjectForm.checkMessageFieldName("Message");
        discussAProjectForm.checkSubscriptionCheckbox(false);
        discussAProjectForm.checkCaptchaIsVisible();
    }

    @Test
    @Tag("Smoke")
    @DisplayName("Checking the contacts in the page footer")
    public void contactsTest() {
        mainPage.openMainPage();
        footer.checkPhoneNumber("+1 (508) 878-0629");
        footer.checkEmail("sales@kupsilla.com");
    }

    @Test
    @Tag("Smoke")
    @DisplayName("Checking the `About` tab contents")
    public void partnersTabTest() {
        mainPage.openMainPage();
        headerMenu.checkAboutButtonIsVisible();
        headerMenu.clickOnTheAboutButton();
        aboutTab.checkArticleName("About");
        aboutTab.checkProjectsNumber("20+");
        aboutTab.checkPeopleNumber("70+");
        aboutTab.checkYearNumber("5+");
    }

    @Test
    @Tag("Smoke")
    @DisplayName("Checking the Copyright Information")
    public void copyrightTest() {
        mainPage.openMainPage();
        footer.checkCopyrightInfo("Copyright © 2025, Kupsilla.");
    }
}
