import Pages.AppearancePage;
import Pages.DynamizationPage;
import Pages.MainPage;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrendPropertyDynamization {
    @Test
    public void checkPageDynamizationAndReturnOnMainPage() throws InterruptedException {
        MainPage mainPage = open(MainPage.URL, MainPage.class)
                .clickPropertyDynamization();
        DynamizationPage dynamizationPage = page(DynamizationPage.class)
                .checkVisibleCategoriesText()
                .clickMainPage();
        mainPage.checkVisibleButton();
    }

    @Test
    public void checkAppearancePageAndActivity() throws InterruptedException {
        MainPage mainPage = open(MainPage.URL, MainPage.class)
                .clickPropertyDynamization();
        DynamizationPage dynamizationPage = page(DynamizationPage.class)
                .checkVisibleCategoriesText()
                .clickAppearancePage();
        String page = page(AppearancePage.class)
                .clickActivityButton()
                .checkActivityTrend();
        System.out.println(page);
        String[] arrActivity = page.split(";");
        System.out.println(arrActivity[15]);
        assertTrue(arrActivity[15].equals(" pointer-events: none"));
        Thread.sleep(5000);
    }

    @Test
    public void checkAppearancePageAndVisible() throws InterruptedException {
        MainPage mainPage = open(MainPage.URL, MainPage.class)
                .clickPropertyDynamization();
        DynamizationPage dynamizationPage = page(DynamizationPage.class)
                .checkVisibleCategoriesText()
                .clickAppearancePage();
        String page = page(AppearancePage.class)
                .clickVisibleButton()
                .checkActivityTrend();
        System.out.println(page);
        String[] arrActivity = page.split(";");
        System.out.println(arrActivity[15]);
        assertTrue(arrActivity[15].equals(" visibility: hidden"));
        Thread.sleep(5000);
    }

    @Test
    public void checkAppearancePageAndPrompt() throws InterruptedException {
        MainPage mainPage = open(MainPage.URL, MainPage.class)
                .clickPropertyDynamization();
        DynamizationPage dynamizationPage = page(DynamizationPage.class)
                .checkVisibleCategoriesText()
                .clickAppearancePage();
        String page = page(AppearancePage.class)
                .inputPrompt()
                .checkActivityTrend();
        System.out.println(page);
        String[] arrActivity = page.split(";");
        System.out.println(arrActivity[15]);
        assertTrue(arrActivity[15].equals("data-tooltip=\"123\""));
        Thread.sleep(5000);
    }
}
