import Pages.AxisYPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;

public class CategoryAxisYTest {
    int pause = 5000;
    @Test
    @DisplayName("Проверка толщины делений оси Y")
    public void checkThicknessDivisions() throws InterruptedException {
        String page = open(AxisYPage.URL, AxisYPage.class)
                .inputThicknessDivisions()
                .checkThicknessDivisions();
        System.out.println(page);
        assertEquals("10", page);
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
    @DisplayName("Проверка толщины делений оси Y")
    public void checkRightOffset() throws InterruptedException {
        String page = open(AxisYPage.URL, AxisYPage.class)
                .inputRightOffset()
                .windowsClick()
                .checkRightOffset();
        System.out.println(page);
        assertEquals("-8", page);
        Thread.sleep(pause);
    }
}
