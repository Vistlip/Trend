import Pages.AxisXPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CategoriesAxisXTest {
    int pause = 500;
    @Test
    @DisplayName("Проверка: Верхнего отступа оси X")
    public void checkOffsetDivisions() {
        AxisXPage page = open(AxisXPage.URL, AxisXPage.class)
                .inputTopOffset()
                .windowsClick()
                .checkTopOffset();
    }

    @Test
    @DisplayName("Проверка: высоты делений оси Х")
    public void checkHeightAxis() throws InterruptedException {
        String page = open(AxisXPage.URL, AxisXPage.class)
                .inputHeightAxis()
                .windowsClick()
                .checkHeightAxis();
        System.out.println(page);
        assertEquals("620", page);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка: Количество делений")
    public void checkDivisions() {
        AxisXPage page = open(AxisXPage.URL, AxisXPage.class)
                .clickDivisions()
                .inputDivisions()
                .windowsClick()
                .checkDivisions();
    }

    @Test
    @DisplayName("Проверка: Подписи оси X")
    public void checkLabelX() {
        AxisXPage page = open(AxisXPage.URL, AxisXPage.class)
                .inputLabelX()
                .windowsClick()
                .checkLabelX();
    }

    @Test
    @DisplayName("Проверка: Толщины оси Х")
    public void checkThicknessAxisX() {
        AxisXPage page = open(AxisXPage.URL, AxisXPage.class)
                .inputThicknessAxisX()
                .windowsClick()
                .checkThicknessAxisX();
    }

    @Test
    @DisplayName("Проверка: Формат DT")
    public void checkFormatDT() {
        Boolean page = open(AxisXPage.URL, AxisXPage.class)
                .clickDataFormat()
                .inputDataFormatDT()
                .windowsClick()
                .checkDateFormatDT();
        assertTrue(page);
    }

    @Test
    @DisplayName("Проверка: Формат Data")
    public void checkFormatDataData() {
        Boolean page = open(AxisXPage.URL, AxisXPage.class)
                .clickDataFormat()
                .inputDataFormatData()
                .windowsClick()
                .checkDateFormatDT();
        assertTrue(page);
    }

    @Test
    @DisplayName("Проверка: Формат Time")
    public void checkFormatDataTime() {
        Boolean page = open(AxisXPage.URL, AxisXPage.class)
                .clickDataFormat()
                .inputDataFormatTime()
                .windowsClick()
                .checkDateFormatTime();
        assertTrue(page);
    }

    @Test
    @DisplayName("Проверка: Цвет делений")
    public void checkColorDivision() {
        AxisXPage page = open(AxisXPage.URL, AxisXPage.class)
                .clickButtonColorDivision()
                .inputColorDivision()
                .clickSaveColorDivision()
                .checkColorDivision();
    }

    @Test
    @DisplayName("Проверка: Цвет оси")
    public void checkColorAxisX() {
        AxisXPage page = open(AxisXPage.URL, AxisXPage.class)
                .clickButtonColorAxisX()
                .inputColorAxisX()
                .clickSaveColorAxisX()
                .checkColorAxisX();
    }

    @Test
    @DisplayName("Проверка: Толщины оси Х")
    public void checkThicknessDivisions() {
        AxisXPage page = open(AxisXPage.URL, AxisXPage.class)
                .inputThicknessDivisions()
                .windowsClick()
                .checkThicknessDivisions();
    }
}
