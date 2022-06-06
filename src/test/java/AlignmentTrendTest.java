import Pages.AlignmentTrendPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class AlignmentTrendTest {
    @Test
    @DisplayName("Проверка: Вертикальное выравнивание верх")
    public void checkAlignmentTop() {
        AlignmentTrendPage page = open(AlignmentTrendPage.URL, AlignmentTrendPage.class)
                .clickVerticalAlignment()
                .inputVerticalAlignmentUp()
                .winClick()
                .checkVerticalAlignmentUp();
    }

    @Test
    @DisplayName("Проверка: Вертикальное выравнивание центр")
    public void checkAlignmentCenter() {
        AlignmentTrendPage page = open(AlignmentTrendPage.URL, AlignmentTrendPage.class)
                .clickVerticalAlignment()
                .inputVerticalAlignmentCenter()
                .winClick()
                .checkVerticalAlignmentCenter();
    }

    @Test
    @DisplayName("Проверка: Вертикальное выравнивание низ")
    public void checkAlignmentBottom() {
        AlignmentTrendPage page = open(AlignmentTrendPage.URL, AlignmentTrendPage.class)
                .clickVerticalAlignment()
                .inputVerticalAlignmentDown()
                .winClick()
                .checkVerticalAlignmentDown();
    }

    @Test
    @DisplayName("Проверка: Горизонтальное выравнивание лево")
    public void checkAlignmentLeft() {
        AlignmentTrendPage page = open(AlignmentTrendPage.URL, AlignmentTrendPage.class)
                .clickHorizontalAlignment()
                .inputHorizontalAlignmentLeft()
                .winClick()
                .checkHorizontalAlignmentLeft();
    }

    @Test
    @DisplayName("Проверка: Горизонтальное выравнивание центр")
    public void checkAlignmentMiddle() {
        AlignmentTrendPage page = open(AlignmentTrendPage.URL, AlignmentTrendPage.class)
                .clickHorizontalAlignment()
                .inputHorizontalAlignmentCenter()
                .winClick()
                .checkHorizontalAlignmentCenter();
    }

    @Test
    @DisplayName("Проверка: Горизонтальное выравнивание право")
    public void checkAlignmentRight() {
        AlignmentTrendPage page = open(AlignmentTrendPage.URL, AlignmentTrendPage.class)
                .clickHorizontalAlignment()
                .inputHorizontalAlignmentRight()
                .winClick()
                .checkHorizontalAlignmentRight();
    }
}
