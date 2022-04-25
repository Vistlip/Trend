import Pages.TrendPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;

public class CategoriesTrendTest {
    @Test
    @DisplayName("Проверка кнопки автопрокрутка")
    public void checkAuto() throws InterruptedException {
        String page = open(TrendPage.URL, TrendPage.class)
                .clickAutoscrollButton()
                .clickAutoscrollButton()
                //я хз что с кнопкой но тут приходится 2 раза тыкать.
                //в ручную по началу так же.
                .checkAutoScroll();
        System.out.println(page);
        assertEquals("Остановить автопрокрутку", page);
        Thread.sleep(500);
    }

    @Test
    @DisplayName("Проверка кнопки автопрокрутка")
    public void checkBackgroundColorTrend() throws InterruptedException {
        String page = open(TrendPage.URL, TrendPage.class)
                .clickButtonBackgroundColorTrend()
                .inputColorBackgroundTrend()
                .clickSaveBackgroundColorTrend()
                .checkBackgroundColorTrend();
        System.out.println(page);
        assertEquals("rgba(0,1,255,1.0)", page);
        Thread.sleep(500);
    }

    @Test
    @DisplayName("Проверка кнопки автопрокрутка")
    public void checkInterval() throws InterruptedException {
        TrendPage page = open(TrendPage.URL, TrendPage.class)
                .clickInterval()
                .inputInterval()
                .windowsClick();
        System.out.println(page);
 //       assertEquals("rgba(0,1,255,1.0)", page);
        Thread.sleep(5000);
    }
}
