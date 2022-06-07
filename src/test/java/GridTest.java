
import Pages.GridPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class GridTest {
    @Test
    @DisplayName("Проверка: Цвет сетки")
    public void checkColorGrid() {
        GridPage page = open(GridPage.URL, GridPage.class)
                .clickButtonColorGrid()
                .inputColorGrid()
                .clickSaveColorGrid()
                .checkColorGrid();
    }
}
