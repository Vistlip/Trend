import Pages.CursorSelectedPositionPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class CursorSelectedPositionTest {
    @Test
    @DisplayName("Проверка: Курсов выключен")
    public void checkCursorOff() {
        CursorSelectedPositionPage page = open(CursorSelectedPositionPage.URL, CursorSelectedPositionPage.class)
                .checkCursor(25);
    }

    @Test
    @DisplayName("Проверка: Курсор включен")
    public void checkCursorOn() {
        CursorSelectedPositionPage page = open(CursorSelectedPositionPage.URL, CursorSelectedPositionPage.class)
                .clickButton(0)
                .clickTrend()
                .checkCursor(27);
    }

    @Test
    @DisplayName("Проверка: Изменение толщины курсора")
    public void checkCursorOnAndWidth() {
        CursorSelectedPositionPage page = open(CursorSelectedPositionPage.URL, CursorSelectedPositionPage.class)
                .clickButton(0)
                .clickWidth()
                .inputWidth()
                .clickTrend()
                .checkCursorWidth(23);
    }

    @Test
    @DisplayName("Проверка: Изменение цвета курсора")
    public void checkCursorOnAndColor() {
        CursorSelectedPositionPage page = open(CursorSelectedPositionPage.URL, CursorSelectedPositionPage.class)
                .clickButton(0)
                .clickButtonCursorColor()
                .inputCursorColor()
                .clickSaveCursorColor()
                .clickTrend()
                .checkCursorColor(23);
    }
}
