import Pages.TransformPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class TransformTest {
    @Test
    @DisplayName("Проверка: Поворота тренда")
    public void checkCursorOff() {
        TransformPage page = open(TransformPage.URL, TransformPage.class)
                .clickRotate()
                .inputRotate()
                .winClick()
                .checkRotate();
    }
}
