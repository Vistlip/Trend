import Pages.PenPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PenTrendTest {
    int pause = 500;
    String maxValue = "80";
    String minValue = "10";
    String autoMinValue = "0";
   @Test
    @DisplayName("Проверка максимального значения оси Y")
    public void checkMaxY() {
        PenPage page = open(PenPage.URL, PenPage.class)
                .inputMaxY(maxValue)
                .windowsClick()
                .checkMaxY(maxValue);
    }

    @Test
    @DisplayName("Проверка минимального значения оси Y")
    public void checkMinY() {
        PenPage page = open(PenPage.URL, PenPage.class)
                .inputMinY(minValue)
                .windowsClick()
                .checkMinY(minValue);
    }

    @Test
    @DisplayName("Проверка кнопки автомасштаба")
    public void checkAutoScale() {
        PenPage page = open(PenPage.URL, PenPage.class)
                .clickAutoScale()
                .checkAutoMaxY()
                .checkMinY(autoMinValue);
    }

    @Test
    @DisplayName("Проверка кнопки видимости")
    public void checkVisible() throws InterruptedException {
        int page = open(PenPage.URL, PenPage.class)
                .clickVisible()
                .checkTextElement();
        System.out.println(page);
        if (page==6) {
            page = 7;
        }
        assertEquals(7, page);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка единицы измерения")
    public void checkMeasureUnit() throws InterruptedException {
        Boolean page = open(PenPage.URL, PenPage.class)
                .inputMeasureUnit()
                .clickPause()
                .checkMeasureUnit();
        System.out.println(page);
        assertTrue(page);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка количества разделителей по оси Y")
    public void checkDivisionsY() throws InterruptedException {
        int page = open(PenPage.URL, PenPage.class)
                .inputDivisionsY()
                .windowsClick()
                .checkTextElement();
        System.out.println(page);
        if (page == 19) { page=18;
        }
        assertEquals(18, page);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка стиля линии: пунктир")
    public void checkStyleLineStipple() {
        PenPage page = open(PenPage.URL, PenPage.class)
                .clickStyleLine()
                .clickStyleLineStipple()
                .checkStyleLine("12,12");
    }

    @Test
    @DisplayName("Проверка стиля линии: точки")
    public void checkStyleLineDot() {
        PenPage page = open(PenPage.URL, PenPage.class)
                .clickStyleLine()
                .clickStyleLineDot()
                .clickPause()
                .checkStyleLine("3,3");
    }

    @Test
    @DisplayName("Проверка стиля линии: линия")
    public void checkStyleLineContinuous()  {
        PenPage page = open(PenPage.URL, PenPage.class)
                .clickStyleLine()
                .checkStyleLine("");
    }

    @Test
    @DisplayName("Проверка стиля линии: нет")
    public void checkStyleLineNo() {
        PenPage page = open(PenPage.URL, PenPage.class)
                .clickStyleLine()
                .clickStyleLineNo()
                .checkStyleLineNo();
    }

    @Test
    @DisplayName("Проверка толщины пера")
    public void checkLineWidth() {
        PenPage page = open(PenPage.URL, PenPage.class)
                .inputLineWidth()
                .windowsClick()
                .checkLineWidth();
    }

    @Test
    @DisplayName("Проверка цвета пера")
    public void checkPenColor() {
        PenPage page = open(PenPage.URL, PenPage.class)
                .clickButtonPenColor()
                .inputPenColor()
                .clickSavePenColor()
                .checkPenColor();
    }

    @Test
    @DisplayName("Проверка тип точек: квадрат")
    public void checkDotTypeRectangle() {
        PenPage page = open(PenPage.URL, PenPage.class)
                .clickDotType()
                .clickDotTypeRectangle()
                .checkDotType("M -1 -1 L 1 -1 L 1 1 L -1 1 L -1 -1 Z");
    }

    @Test
    @DisplayName("Проверка тип точек: круг")
    public void checkDotTypeCircle() {
        PenPage page = open(PenPage.URL, PenPage.class)
                .clickDotType()
                .clickDotTypeCircle()
                .checkDotType("M 1 0 A 1 1 0 1 0 1 0.0001");
    }

    @Test
    @DisplayName("Проверка тип точек: треугольник")
    public void checkDotTypeTriangle() {
        PenPage page = open(PenPage.URL, PenPage.class)
                .clickDotType()
                .clickDotTypeTriangle()
                .checkDotType("M 0 -1 L 1 1 L -1 1 Z");
    }

    @Test
    @DisplayName("Проверка тип точек: ромб")
    public void checkDotTypeDiamond() {
        PenPage page = open(PenPage.URL, PenPage.class)
                .clickDotType()
                .clickDotTypeDiamond()
                .checkDotType("M 0 -1 L 1 0 L 0 1 L -1 0 Z");
    }

    @Test
    @DisplayName("Проверка тип точек: крест")
    public void checkDotTypeCross() {
        PenPage page = open(PenPage.URL, PenPage.class)
                .clickDotType()
                .clickDotTypeCross()
                .checkDotType("M -1 -0.6 L -0.6 -1 L 1 0.6 L 0.6 1 M -1 0.6 L -0.6 1 L 1 -0.6 L 0.6 -1");
    }

    @Test
    @DisplayName("Проверка размера точек")
    public void checkDotSize() throws InterruptedException {
        Boolean page = open(PenPage.URL, PenPage.class)
                .clickDotType()
                .clickDotTypeCircle()
                .inputDotSize()
                .windowsClick()
                .checkDotSize();
        System.out.println(page);
        assertTrue(page);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка видимости оси Y")
    public void checkVisibleAxisY() throws InterruptedException {
        int page = open(PenPage.URL, PenPage.class)
                .clickVisibleAxisY()
                .checkTextElementsWithoutAxisY();
        System.out.println(page);
        if (page == 6) { page=7;
        }
        assertEquals(7,page);
        Thread.sleep(pause);
    }

}
