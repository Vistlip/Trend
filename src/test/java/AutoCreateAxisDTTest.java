import Pages.AutoCreateAxisDTPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class AutoCreateAxisDTTest {
    @Test
    @DisplayName("Проверка: Оси видимы, автоматическое создание включено")
    public void checkAutoCreatingAxisOn() {
        AutoCreateAxisDTPage page = open(AutoCreateAxisDTPage.URL, AutoCreateAxisDTPage.class)
                .checkAxisCount(42);
    }

    @Test
    @DisplayName("Проверка: Оси видимы, автоматическое создание выключено")
    public void checkAutoCreatingAxisOff() {
        AutoCreateAxisDTPage page = open(AutoCreateAxisDTPage.URL, AutoCreateAxisDTPage.class)
                .clickButton(1)
                .checkAxisCount(29);
    }

    @Test
    @DisplayName("Проверка: Оси невидимы, автоматическое создание включено")
    public void checkAutoCreatingAxisOnAndAxisNoVisibility() {
        AutoCreateAxisDTPage page = open(AutoCreateAxisDTPage.URL, AutoCreateAxisDTPage.class)
                .clickButton(2)
                .clickButton(3)
                .checkAxisCount(16);
    }
    @Test
    @DisplayName("Проверка: Оси невидимы, автоматическое создание включено")
    public void checkAutoCreatingAxisOffAndAxisNoVisibility() {
        AutoCreateAxisDTPage page = open(AutoCreateAxisDTPage.URL, AutoCreateAxisDTPage.class)
                .clickButton(2)
                .clickButton(3)
                .clickButton(1)
                .checkAxisCount(29);
    }
}
