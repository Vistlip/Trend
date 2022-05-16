import Pages.PenPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PenTrendTest {
    @Test
    @DisplayName("Проверка кнопки автопрокрутка")
    public void checkMaxY() throws InterruptedException {
        String page = open(PenPage.URL, PenPage.class)
                .inputMaxY()
                .windowsClick()
                .checkMaxY();
        System.out.println(page);
        assertEquals("80", page);
        Thread.sleep(500);
    }

    @Test
    @DisplayName("Проверка кнопки автопрокрутка")
    public void checkMinY() throws InterruptedException {
        String page = open(PenPage.URL, PenPage.class)
                .inputMinY()
                .windowsClick()
                .checkMinY();
        System.out.println(page);
        assertEquals("10", page);
        Thread.sleep(500);
    }

    @Test
    @DisplayName("Проверка кнопки автопрокрутка")
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
        Thread.sleep(500);
    }

    @Test
    @DisplayName("Проверка кнопки автопрокрутка")
    public void checkVisible() throws InterruptedException {
        int page = open(PenPage.URL, PenPage.class)
                .clickVisible()
                .checkTextElement();
        System.out.println(page);
        assertEquals(7, page);
        Thread.sleep(5000);
    }

    @Test
    @DisplayName("Проверка кнопки автопрокрутка")
    public void checkMeasureUnit() throws InterruptedException {
        Boolean page = open(PenPage.URL, PenPage.class)
                .inputMeasureUnit()
                .clickPause()
                .checkMeasureUnit();
        System.out.println(page);
        assertTrue(page);
        Thread.sleep(5000);
    }

    @Test
    @DisplayName("Проверка кнопки автопрокрутка")
    public void checkDivisionsY() throws InterruptedException {
        int page = open(PenPage.URL, PenPage.class)
                .inputDivisionsY()
                .windowsClick()
                .checkTextElement();
        System.out.println(page);
        assertEquals(18, page);
        Thread.sleep(5000);
    }

    @Test
    @DisplayName("Проверка кнопки автопрокрутка")
    public void checkStyleLineStipple() throws InterruptedException {
        String page = open(PenPage.URL, PenPage.class)
                .clickStyleLine()
                .clickStyleLineStipple()
                .checkStyleLine();
        System.out.println(page);
        assertEquals("12,12", page);
        Thread.sleep(5000);
    }

    @Test
    @DisplayName("Проверка кнопки автопрокрутка")
    public void checkStyleLineDot() throws InterruptedException {
        String page = open(PenPage.URL, PenPage.class)
                .clickStyleLine()
                .clickStyleLineDot()
                .checkStyleLine();
        System.out.println(page);
        assertEquals("3,3", page);
        Thread.sleep(5000);
    }

    @Test
    @DisplayName("Проверка кнопки автопрокрутка")
    public void checkStyleLineContinuous() throws InterruptedException {
        String page = open(PenPage.URL, PenPage.class)
                .clickStyleLine()
                .checkStyleLine();
        System.out.println(page);
        assertEquals("", page);
        Thread.sleep(5000);
    }
}
