import Pages.AutoCreateAxisRTPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class AutoCreateAxisRTTest {
    @Test
    @DisplayName("Проверка: Добавление 1 пера, автоматическое создание включено")
    public void checkAutoCreatingAxisOnAddOnePen() {
    AutoCreateAxisRTPage page = open(AutoCreateAxisRTPage.URL, AutoCreateAxisRTPage.class)
            .clickButton(1)
            .checkAxisCount(50);
    }
    @Test
    @DisplayName("Проверка: Добавление 2 перьев, автоматическое создание включено")
    public void checkAutoCreatingAxisOnAddTwoPen() {
        AutoCreateAxisRTPage page = open(AutoCreateAxisRTPage.URL, AutoCreateAxisRTPage.class)
                .clickAddChoice()
                .clickAddRandom()
                .clickButton(1)
                .clickWin()
                .clickAddChoice()
                .clickAddConst()
                .clickButton(1)
                .checkAxisCount(66);
    }

    @Test
    @DisplayName("Проверка: Добавление 3 перьев, автоматическое создание включено")
    public void checkAutoCreatingAxisOnAddThreePen() {
        AutoCreateAxisRTPage page = open(AutoCreateAxisRTPage.URL, AutoCreateAxisRTPage.class)
                .clickAddChoice()
                .clickAddRandom()
                .clickButton(1)
                .clickWin()
                .clickAddChoice()
                .clickAddConst()
                .clickButton(1)
                .clickWin()
                .clickAddChoice()
                .clickAddPen()
                .clickButton(1)
                .checkAxisCount(84);
    }

    @Test
    @DisplayName("Проверка: Добавление 2 перьев, автоматическое создание выключено")
    public void checkAutoCreatingAxisOffAddTwoPen() {
        AutoCreateAxisRTPage page = open(AutoCreateAxisRTPage.URL, AutoCreateAxisRTPage.class)
                .clickAddChoice()
                .clickAddConst()
                .clickButton(1)
                .clickWin()
                .clickAddChoice()
                .clickAddPen()
                .clickButton(1)
                .clickWin()
                .clickButton(2)
                .checkAxisCount(40);
    }
}
