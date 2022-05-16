import Pages.TrendPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.codeborne.selenide.Selenide.*;
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
    @DisplayName("Проверка заливки графика")
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
    @DisplayName("Проверка интервала")
    public void checkInterval() throws InterruptedException {
        String beginTime= open(TrendPage.URL, TrendPage.class)
                .clickDataEnd()
                .deleteDataEnd()
                .inputDataEnd()
                .clickInterval()
                .inputInterval()
                .clickDataEnd()
                .checkBeginTime();
        String endTime = page(TrendPage.class)
                .checkEndTime();
        SimpleDateFormat formatForDate = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        Date dateOne = null;
        Date dateTwo = null;
        try {
            dateOne = formatForDate.parse(beginTime);
            dateTwo = formatForDate.parse(endTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
        long difference = dateTwo.getTime() - dateOne.getTime();
        int min = (int)(difference / (60 * 1000));
        System.out.println(min);
        assertEquals(5, min);
        Thread.sleep(5000);
    }

    @Test
    @DisplayName("Проверка свойства конец")
    public void checkEndDate() throws InterruptedException {
        String page = open(TrendPage.URL, TrendPage.class)
                .clickDataEnd()
                .deleteDataEnd()
                .inputDataEnd()
                .clickInterval()
                .inputInterval()
                .clickDataEnd()
                .checkEndTime();
        System.out.println(page);
        Date date = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        String str = formatForDateNow.format(date) + ":00";
        assertEquals(str, page);
        Thread.sleep(5000);
    }

    @Test
    @DisplayName("Проверка минимальный вид")
    public void checkMinView() throws InterruptedException {
        String page = open(TrendPage.URL, TrendPage.class)
                .clickMinViewButton()
                .checkTrendToolbar();
        String[] arrActivity = page.split(";");
        System.out.println(arrActivity[10]);
        assertEquals(arrActivity[10]," visibility: hidden");
        Thread.sleep(500);
    }

    @Test
    @DisplayName("Проверка титула")
    public void checkTitle() throws InterruptedException {
        String page = open(TrendPage.URL, TrendPage.class)
                .clickTitle()
                .inputTitle()
                .windowsClick()
                .checkTitle();
        System.out.println(page);
        assertEquals(page, "Title");
        Thread.sleep(500);
    }

    @Test
    @DisplayName("Проверка кнопки дерева выбора перьев")
    public void checkSelectionTree() throws InterruptedException {
        String page = open(TrendPage.URL, TrendPage.class)
                .clickSelectionTreeButton()
                .checkSelectionTreeButton();
        String[] arrActivity = page.split(";");
        System.out.println(arrActivity[2]);
        assertEquals(arrActivity[2]," display: none");
        Thread.sleep(500);
    }

    @Test
    @DisplayName("Проверка максимальноого количества перьев")
    public void checkMaxPen() throws InterruptedException {
        String page = open(TrendPage.URL, TrendPage.class)
                .clickMaxPenInput()
                .inputMaxPen()
                .clickTrendTreePen()
                .clickCheckboxRandom()
                .clickCheckboxNotArchivePen()
                .clickOkTreeTrendPen()
                .clickInfo()
                .clickWarningTitle()
                .checkMessageWarning();
        System.out.println(page);
        assertEquals(page,"Не все параметры были добавлены в тренд (1 не добавлено) из-за превышения ограничения в (2)");
        Thread.sleep(500);
    }

}