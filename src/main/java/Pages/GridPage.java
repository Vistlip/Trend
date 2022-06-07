package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.shadowCss;
import static com.codeborne.selenide.Selenide.$$;

public class GridPage {
    public static final String URL = Urls.GridURL;
    @FindBy(how = How.XPATH, using = ".//ms-colorpicker")
    private ElementsCollection colorButtons;
    @FindBy(how = How.CLASS_NAME, using = "pcr-result")
    private ElementsCollection inputColor;
    @FindBy(how = How.CLASS_NAME, using = "pcr-save")
    private ElementsCollection saveBackgroundColorButton;
    String trendShadowHost = "#\\32 81054";
    Duration time = Duration.ofSeconds(15);

    public GridPage clickButtonColorGrid() {
        this.colorButtons.get(0).click();
        return this;
    }

    //Ввод цветового значения
    public GridPage inputColorGrid() {
        this.inputColor.get(0).setValue("#00FF0B");
        return this;
    }

    public GridPage clickSaveColorGrid() {
        this.saveBackgroundColorButton.get(0).click();
        return this;
    }

    public GridPage checkColorGrid() {
        ElementsCollection path = $$(shadowCss("path", trendShadowHost));
        path.get(1).shouldHave(Condition.attribute("stroke", "rgba(1,255,12,1.0)"), time);
        return this;
    }
}
