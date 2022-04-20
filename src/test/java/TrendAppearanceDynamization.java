import Pages.AppearancePage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrendAppearanceDynamization {

    @Test
    @DisplayName("Проверка изменения активности тренда")
    public void checkTrendActivity() throws InterruptedException {
        String page = open(AppearancePage.URL, AppearancePage.class)
                .clickActivityButton()
                .getStyleTrend();
        System.out.println(page);
        String[] arrActivity = page.split(";");
        System.out.println(arrActivity[15]);
        assertTrue(arrActivity[15].equals(" pointer-events: none"));
        Thread.sleep(500);
    }

    @Test
    @DisplayName("Проверка изменения видимости тренда")
    public void checkTrendVisible() throws InterruptedException {
        String page = open(AppearancePage.URL, AppearancePage.class)
                .clickVisibleButton()
                .getStyleTrend();
        System.out.println(page);
        String[] arrActivity = page.split(";");
        System.out.println(arrActivity[15]);
        assertTrue(arrActivity[15].equals(" visibility: hidden"));
        Thread.sleep(500);
    }

    @Test
    @DisplayName("Проверка пизменения мигания тренда")
    public void checkTrendFlashing() throws InterruptedException {
        String page = open(AppearancePage.URL, AppearancePage.class)
                .clickFlashingButton()
                .getStyleTrend();
        System.out.println(page);
        String[] arrActivity = page.split(";");
        System.out.println(arrActivity[15]);
        assertTrue(arrActivity[15].equals(" animation: 1000ms linear 0s infinite normal none running flash"));
        Thread.sleep(500);
    }

    @Test
    @DisplayName("Проверка изменения всплывающей подсказки тренда")
    public void checkPrompt() throws InterruptedException {
        String page = open(AppearancePage.URL, AppearancePage.class)
                .inputClick()
                .inputPrompt()
                .windowsClick()
                .getDataTooltipTrend();
        System.out.println(page);
        assertTrue(page.equals("123"));
        Thread.sleep(500);
    }

    @Test
    @DisplayName("Проверка изменения заливки фона тренда")
    public void checkBackgroundColor() throws InterruptedException {
        String page = open(AppearancePage.URL, AppearancePage.class)
                .clickButtonBackgroundColor()
                .inputColorBackground()
                .clickSaveBackgroundColorButton()
                .getStyleTrend();
        System.out.println(page);
        String[] arrActivity = page.split(";");
        System.out.println(arrActivity[10]);
        assertTrue(arrActivity[10].equals(" background-color: rgb(0, 1, 255)"));
        Thread.sleep(500);
    }

    @Test
    @DisplayName("Проверка изменения цвета тени тренда")
    public void checkShadowColor() throws InterruptedException {
        String page = open(AppearancePage.URL, AppearancePage.class)
                .clickShadow()
                .inputShadow()
                .windowsClick()
                .clickButtonShadowColor()
                .inputColorShadow()
                .clickSaveShadowColorButton()
                .getStyleTrend();
        System.out.println(page);
        String[] arrActivity = page.split(";");
        System.out.println(arrActivity[15]);
        assertTrue(arrActivity[15].equals(" box-shadow: rgb(255, 0, 0) 30px 30px 1px 0px"));
        Thread.sleep(500);
    }

    @Test
    @DisplayName("Проверка изменения масштаба по оси х тренда")
    public void checkScaleX() throws InterruptedException {
        String page = open(AppearancePage.URL, AppearancePage.class)
                .clickScaleX()
                .inputScaleX()
                .windowsClick()
                .getStyleTrend();
        System.out.println(page);
        String[] arrActivity = page.split(";");
        System.out.println(arrActivity[15]);
        assertTrue(arrActivity[15].equals(" transform: scaleX(2)"));
        Thread.sleep(500);
    }

    @Test
    @DisplayName("Проверка зменения масштаба по оси y тренда")
    public void checkScaleY() throws InterruptedException {
        String page = open(AppearancePage.URL, AppearancePage.class)
                .clickScaleY()
                .inputScaleY()
                .windowsClick()
                .getStyleTrend();
        System.out.println(page);
        String[] arrActivity = page.split(";");
        System.out.println(arrActivity[15]);
        assertTrue(arrActivity[15].equals(" transform: scaleY(2)"));
        Thread.sleep(500);
    }

    @Test
    @DisplayName("Проверка изменения прозрачности")
    public void checkTransparency() throws InterruptedException {
        String page = open(AppearancePage.URL, AppearancePage.class)
                .clickTransparency()
                .inputTransparency()
                .windowsClick()
                .getStyleTrend();
        System.out.println(page);
        String[] arrActivity = page.split(";");
        System.out.println(arrActivity[11]);
        assertTrue(arrActivity[11].equals(" opacity: 0.5"));
        Thread.sleep(500);
    }

    @Test
    @DisplayName("Проверка изменеия радиуса скругления")
    public void checkRounding() throws InterruptedException {
        String page = open(AppearancePage.URL, AppearancePage.class)
                .clickRounding()
                .inputRounding()
                .windowsClick()
                .getStyleTrend();
        System.out.println(page);
        String[] arrActivity = page.split(";");
        System.out.println(arrActivity[11]);
        assertTrue(arrActivity[14].equals(" border-radius: 20px"));
        Thread.sleep(500);
    }

    @Test
    @DisplayName("Проверка изменения размера тени")
    public void checkShadow() throws InterruptedException {
        String page = open(AppearancePage.URL, AppearancePage.class)
                .clickShadow()
                .inputShadow()
                .windowsClick()
                .getStyleTrend();
        System.out.println(page);
        String[] arrActivity = page.split(";");
        System.out.println(arrActivity[15]);
        assertTrue(arrActivity[15].equals(" box-shadow: gray 30px 30px 1px 0px"));
        Thread.sleep(500);
    }
}
