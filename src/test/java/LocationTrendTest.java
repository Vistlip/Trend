import Pages.FramePage;
import Pages.LocationTrendPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class LocationTrendTest {

    @Test
    @DisplayName("Проверка: Порядок по оси Z")
    public void checkOrderZ() {
        LocationTrendPage page = open(LocationTrendPage.URL, LocationTrendPage.class)
                .clickOrderZ()
                .inputOrderZ()
                .winClick()
                .checkOrderZ();
    }

    @Test
    @DisplayName("Проверка: Ширины")
    public void checkWidth() {
        LocationTrendPage page = open(LocationTrendPage.URL, LocationTrendPage.class)
                .clickWidth()
                .inputWidth()
                .winClick()
                .checkWidth();
    }

    @Test
    @DisplayName("Проверка: Высоты")
    public void checkHeight() {
        LocationTrendPage page = open(LocationTrendPage.URL, LocationTrendPage.class)
                .clickHeight()
                .inputHeight()
                .winClick()
                .checkHeight();
    }

    @Test
    @DisplayName("Проверка: Координаты Х")
    public void checkLocationX() {
        LocationTrendPage page = open(LocationTrendPage.URL, LocationTrendPage.class)
                .clickInputX()
                .inputInputX()
                .winClick()
                .checkLocationX();
    }

    @Test
    @DisplayName("Проверка: Координаты Y")
    public void checkLocationY() {
        LocationTrendPage page = open(LocationTrendPage.URL, LocationTrendPage.class)
                .clickInputY()
                .inputInputY()
                .winClick()
                .checkLocationY();
    }
}
