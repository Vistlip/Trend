import Pages.PenPage;
import Pages.TextTrendPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;

public class TextTrendTest {
    int pause = 500;
    @Test
    @DisplayName("Проверка цвета текста")
    public void checkTextColor() {
        TextTrendPage page = open(TextTrendPage.URL, TextTrendPage.class)
                .clickButtonTextColor()
                .inputColorText()
                .clickSaveTextColorTrend()
                .checkTextColor();
    }
}
