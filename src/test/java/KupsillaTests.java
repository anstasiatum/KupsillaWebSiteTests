import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.components.DiscussAProjectForm;
import pages.components.HeaderMenu;

public class KupsillaTests extends TestBase {
    MainPage mainPage = new MainPage();
    HeaderMenu headerMenu = new HeaderMenu();
    DiscussAProjectForm discussAProjectForm = new DiscussAProjectForm();

    @Test
    public void logoShouldBeVisibleTest() {
        mainPage.openMainPage();
        headerMenu.checkLogoIsVisible();
    }

    @Test
    public void discussAProjectFormOpensTest() {
        mainPage.openMainPage();
        headerMenu.checkDiscussAProjectButtonIsVisible();
        headerMenu.clickOnDiscussAProjectButton();
        discussAProjectForm.checkSubscriptionCheckboxIsUnchecked();
        discussAProjectForm.checkCaptchaIsVisible();
    }
}
