import Pages.FormatAxisYPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FormatAxisYTest {
    int pause = 5000;

    @Test
    @DisplayName("Проверка денежного формата")
    public void checkFormatAxisYC() throws InterruptedException {
        Boolean page = open(FormatAxisYPage.URL, FormatAxisYPage.class)
                .clickFormat()
                .clickFormatC()
                .clickPause()
                .checkFormatC();
        System.out.println(page);
        assertTrue(page);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка формата процентов")
    public void checkFormatAxisYP() throws InterruptedException {
        Boolean page = open(FormatAxisYPage.URL, FormatAxisYPage.class)
                .clickFormat()
                .clickFormatP()
                .clickPause()
                .checkFormatP();
        System.out.println(page);
        assertTrue(page);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка формата экспоненты")
    public void checkFormatAxisYE() throws InterruptedException {
        Boolean page = open(FormatAxisYPage.URL, FormatAxisYPage.class)
                .clickFormat()
                .clickFormatE()
                .clickPause()
                .checkFormatE();
        System.out.println(page);
        assertTrue(page);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка количества знаков после запятой")
    public void checkDecimalPlaces() throws InterruptedException {
        int page = open(FormatAxisYPage.URL, FormatAxisYPage.class)
                .clickFormatF()
                .inputDecimalPlaces()
                .windowsClick()
                .checkDecimalPlaces();
        System.out.println(page);
        assertEquals(3, page);
        Thread.sleep(pause);
    }
}