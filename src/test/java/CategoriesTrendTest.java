import Pages.CategoryTrendPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;

public class CategoriesTrendTest {
    int pause = 500;
    @Test
    @DisplayName("Проверка кнопки автопрокрутка")
    public void checkAuto() {
        CategoryTrendPage page = open(CategoryTrendPage.URL, CategoryTrendPage.class)
                .clickAutoscrollButton()
                .clickAutoscrollButton()
                //я хз что с кнопкой но тут приходится 2 раза тыкать.
                //в ручную по началу так же.
                .checkAutoScroll();
    }

    @Test
    @DisplayName("Проверка заливки графика")
    public void checkBackgroundColorTrend() {
        CategoryTrendPage page = open(CategoryTrendPage.URL, CategoryTrendPage.class)
                .clickButtonBackgroundColorTrend()
                .inputColorBackgroundTrend()
                .clickSaveBackgroundColorTrend()
                .checkBackgroundColorTrend();
    }

    @Test
    @DisplayName("Проверка интервала")
    public void checkInterval() throws InterruptedException {
        String beginEndDT= open(CategoryTrendPage.URL, CategoryTrendPage.class)
                .clickAutoscrollButton()
                .checkBeginTime();
        String[] splitter = beginEndDT.split(";");
        SimpleDateFormat formatForDate = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        Date dateOne = null;
        Date dateTwo = null;
        System.out.println(beginEndDT);
        try {
            dateOne = formatForDate.parse(splitter[0]);
            dateTwo = formatForDate.parse(splitter[1]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        long difference = dateTwo.getTime() - dateOne.getTime();
        int min = (int)(difference / (60 * 1000));
        System.out.println(min);
        assertEquals(1, min);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка свойства конец")
    public void checkEndDate() {
        CategoryTrendPage page = open(CategoryTrendPage.URL, CategoryTrendPage.class)
                .clickAutoscrollButton()
                .inputDataEnd()
                .windowsClick()
                .checkEndTime();
    }

    @Test
    @DisplayName("Проверка минимальный вид")
    public void checkMinView() throws InterruptedException {
        String page = open(CategoryTrendPage.URL, CategoryTrendPage.class)
                .clickMinViewButton()
                .checkTrendToolbar();
        String[] arrActivity = page.split(";");
        System.out.println(arrActivity[10]);
        assertEquals(arrActivity[10]," visibility: hidden");
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка титула")
    public void checkTitle() {
        CategoryTrendPage page = open(CategoryTrendPage.URL, CategoryTrendPage.class)
                .clickTitle()
                .inputTitle()
                .windowsClick()
                .checkTitle();
    }

    @Test
    @DisplayName("Проверка кнопки дерева выбора перьев")
    public void checkSelectionTree() throws InterruptedException {
        String page = open(CategoryTrendPage.URL, CategoryTrendPage.class)
                .clickSelectionTreeButton()
                .checkSelectionTreeButton();
        String[] arrActivity = page.split(";");
        System.out.println(arrActivity[2]);
        assertEquals(arrActivity[2]," display: none");
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка максимальноого количества перьев")
    public void checkMaxPen() throws InterruptedException {
        String page = open(CategoryTrendPage.URL, CategoryTrendPage.class)
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
        Thread.sleep(pause);
    }

}
