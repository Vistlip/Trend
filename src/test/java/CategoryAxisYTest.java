import Pages.AxisYPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;

public class CategoryAxisYTest {
    int pause = 500;
    @Test
    @DisplayName("Проверка толщины делений оси Y")
    public void checkThicknessDivisions() {
        AxisYPage page = open(AxisYPage.URL, AxisYPage.class)
                .inputThicknessDivisions()
                .windowsClick()
                .checkThicknessDivisions();
    }

    @Test
    @DisplayName("Проверка подписи")
    public void checkLabelY() {
        AxisYPage page = open(AxisYPage.URL, AxisYPage.class)
                .inputLabelY()
                .windowsClick()
                .checkLabelY();
    }

    @Test
    @DisplayName("Проверка отступа делений")
    public void checkRightOffset() {
        AxisYPage page = open(AxisYPage.URL, AxisYPage.class)
                .inputRightOffset()
                .windowsClick()
                .checkRightOffset();
    }

    @Test
    @DisplayName("Проверка толщины делений оси Y")
    public void checkThicknessAxis() {
        AxisYPage page = open(AxisYPage.URL, AxisYPage.class)
                .inputThicknessAxis()
                .windowsClick()
                .checkThicknessAxis();
    }

    @Test
    @DisplayName("Проверка цвета делений оси Y")
    public void checkColorAxis() {
        AxisYPage page = open(AxisYPage.URL, AxisYPage.class)
                .clickButtonAxisColor()
                .inputColorAxis()
                .clickSaveAxisColor()
                .checkColorAxis();
    }

    @Test
    @DisplayName("Проверка длины делений оси Y")
    public void checkLengthAxis() throws InterruptedException {
        String page = open(AxisYPage.URL, AxisYPage.class)
                .inputLengthAxis()
                .windowsClick()
                .checkLengthAxis();
        System.out.println(page);
        assertEquals("108", page);
        Thread.sleep(pause);
    }
}
