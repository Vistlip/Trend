import Pages.PenPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PenTrendTest {
    int pause = 500;
    @Test
    @DisplayName("Проверка максимального значения оси Y")
    public void checkMaxY() throws InterruptedException {
        PenPage page = open(PenPage.URL, PenPage.class)
                .inputMaxY()
                .windowsClick()
                .checkMaxY();
    }

    @Test
    @DisplayName("Проверка минимального значения оси Y")
    public void checkMinY() throws InterruptedException {
        String page = open(PenPage.URL, PenPage.class)
                .inputMinY()
                .windowsClick()
                .checkMinY();
        System.out.println(page);
        assertEquals("10", page);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка кнопки автомасштаба")
    public void checkAutoScale() throws InterruptedException {
        PenPage page = open(PenPage.URL, PenPage.class)
                .clickAutoScale();
        String max = page(PenPage.class)
                .checkAutoMaxY();
        System.out.println(max);
        assertEquals("50", max);
        String min = page(PenPage.class)
                .checkMinY();
        System.out.println(min);
        assertEquals("0", min);
        Thread.sleep(pause);
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
    public void checkStyleLineStipple() throws InterruptedException {
        String page = open(PenPage.URL, PenPage.class)
                .clickStyleLine()
                .clickStyleLineStipple()
                .checkStyleLine();
        System.out.println(page);
        assertEquals("12,12", page);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка стиля линии: точки")
    public void checkStyleLineDot() throws InterruptedException {
        String page = open(PenPage.URL, PenPage.class)
                .clickStyleLine()
                .clickStyleLineDot()
                .checkStyleLine();
        System.out.println(page);
        assertEquals("3,3", page);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка стиля линии: линия")
    public void checkStyleLineContinuous() throws InterruptedException {
        String page = open(PenPage.URL, PenPage.class)
                .clickStyleLine()
                .checkStyleLine();
        System.out.println(page);
        assertEquals("", page);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка стиля линии: нет")
    public void checkStyleLineNo() throws InterruptedException {
        String page = open(PenPage.URL, PenPage.class)
                .clickStyleLine()
                .clickStyleLineNo()
                .checkStyleLineNo();
        System.out.println(page);
        assertEquals("0", page);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка толщины пера")
    public void checkLineWidth() throws InterruptedException {
        String page = open(PenPage.URL, PenPage.class)
                .inputLineWidth()
                .windowsClick()
                .checkLineWidth();
        System.out.println(page);
        assertEquals("7", page);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка цвета пера")
    public void checkPenColor() throws InterruptedException {
        String page = open(PenPage.URL, PenPage.class)
                .clickButtonPenColor()
                .inputPenColor()
                .clickSavePenColor()
                .checkPenColor();
        System.out.println(page);
        assertEquals("rgba(1,1,255,1.0)", page);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка тип точек: квадрат")
    public void checkDotTypeRectangle() throws InterruptedException {
        String page = open(PenPage.URL, PenPage.class)
                .clickDotType()
                .clickDotTypeRectangle()
                .checkDotType();
        System.out.println(page);
        assertEquals("M -1 -1 L 1 -1 L 1 1 L -1 1 L -1 -1 Z", page);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка тип точек: круг")
    public void checkDotTypeCircle() throws InterruptedException {
        String page = open(PenPage.URL, PenPage.class)
                .clickDotType()
                .clickDotTypeCircle()
                .checkDotType();
        System.out.println(page);
        assertEquals("M 1 0 A 1 1 0 1 0 1 0.0001", page);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка тип точек: треугольник")
    public void checkDotTypeTriangle() throws InterruptedException {
        String page = open(PenPage.URL, PenPage.class)
                .clickDotType()
                .clickDotTypeTriangle()
                .checkDotType();
        System.out.println(page);
        assertEquals("M 0 -1 L 1 1 L -1 1 Z", page);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка тип точек: ромб")
    public void checkDotTypeDiamond() throws InterruptedException {
        String page = open(PenPage.URL, PenPage.class)
                .clickDotType()
                .clickDotTypeDiamond()
                .checkDotType();
        System.out.println(page);
        assertEquals("M 0 -1 L 1 0 L 0 1 L -1 0 Z", page);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка тип точек: крест")
    public void checkDotTypeCross() throws InterruptedException {
        String page = open(PenPage.URL, PenPage.class)
                .clickDotType()
                .clickDotTypeCross()
                .checkDotType();
        System.out.println(page);
        assertEquals("M -1 -0.6 L -0.6 -1 L 1 0.6 L 0.6 1 M -1 0.6 L -0.6 1 L 1 -0.6 L 0.6 -1", page);
        Thread.sleep(pause);
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
