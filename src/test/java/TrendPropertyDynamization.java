import Pages.DynamizationPage;
import Pages.MainPage;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

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
}
