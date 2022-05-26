import Pages.AxisYPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;

public class CategoryAxisYTest {
    int pause = 500;
    @Test
    @DisplayName("Проверка толщины делений оси Y")
    public void checkThicknessDivisions() throws InterruptedException {
        String page = open(AxisYPage.URL, AxisYPage.class)
                .inputThicknessDivisions()
                .windowsClick()
                .checkThicknessDivisions();
        System.out.println(page);
        assertEquals("8", page);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка подписи")
    public void checkLabelY() throws InterruptedException {
        String page = open(AxisYPage.URL, AxisYPage.class)
                .inputLabelY()
                .windowsClick()
                .checkLabelY();
        System.out.println(page);
        assertEquals("Подпись", page);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка отступа делений")
    public void checkRightOffset() throws InterruptedException {
        String page = open(AxisYPage.URL, AxisYPage.class)
                .inputRightOffset()
                .windowsClick()
                .checkRightOffset();
        System.out.println(page);
        assertEquals("-8", page);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка толщины делений оси Y")
    public void checkThicknessAxis() throws InterruptedException {
        String page = open(AxisYPage.URL, AxisYPage.class)
                .inputThicknessAxis()
                .windowsClick()
                .checkThicknessAxis();
        System.out.println(page);
        assertEquals("7", page);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка цвета делений оси Y")
    public void checkColorAxis() throws InterruptedException {
        String page = open(AxisYPage.URL, AxisYPage.class)
                .clickButtonAxisColor()
                .inputColorAxis()
                .clickSaveAxisColor()
                .checkColorAxis();
        System.out.println(page);
        assertEquals("rgba(1,1,255,1.0)", page);
        Thread.sleep(pause);
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
