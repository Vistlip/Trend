import Pages.FramePage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class FrameTest {
    @Test
    @DisplayName("Проверка: Толщины рамки")
    public void checkFrameWidth() {
        FramePage page = open(FramePage.URL, FramePage.class)
                .clickWidth()
                .inputWidth()
                .winClick()
                .checkFrameWidth();
    }

    @Test
    @DisplayName("Проверка: Цвета рамки")
    public void checkFrameColor() {
        FramePage page = open(FramePage.URL, FramePage.class)
                .clickButtonFrameColor()
                .inputFrameColor()
                .clickSaveFrameColor()
                .checkFrameColor();
    }

    @Test
    @DisplayName("Проверка: Стиль - Непрерывный")
    public void checkFrameStyleSolid() {
        FramePage page = open(FramePage.URL, FramePage.class)
                .clickStyle()
                .clickStyleSolid()
                .checkFrameStyleSolid();
    }

    @Test
    @DisplayName("Проверка: Стиль - Пунктир")
    public void checkFrameStyleDashed() {
        FramePage page = open(FramePage.URL, FramePage.class)
                .clickStyle()
                .clickStyleDashed()
                .checkFrameStyleDashed();
    }

    @Test
    @DisplayName("Проверка: Стиль - Точка")
    public void checkFrameStyleDotted() {
        FramePage page = open(FramePage.URL, FramePage.class)
                .clickStyle()
                .clickStyleDotted()
                .checkFrameStyleDotted();
    }

    @Test
    @DisplayName("Проверка: Стиль - Нет")
    public void checkFrameStyleNo() {
        FramePage page = open(FramePage.URL, FramePage.class)
                .clickStyle()
                .clickStyleNo()
                .checkFrameStyleNo();
    }
}
