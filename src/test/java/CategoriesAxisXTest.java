import Pages.AxisXPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class CategoriesAxisXTest {
    @Test
    @DisplayName("Проверка толщины делений оси Y")
    public void checkThicknessDivisions() {
        AxisXPage page = open(AxisXPage.URL, AxisXPage.class)
                .inputTopOffset()
                .windowsClick()
                .checkTopOffset();
    }
}
