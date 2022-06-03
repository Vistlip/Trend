package Pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByShadow;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selectors.shadowCss;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class CursorSelectedPositionPage {
    public static final String URL = Urls.CursorSelectedPositionURL;
    @FindBy(how = How.XPATH, using = ".//ms-trend")
    private SelenideElement trend;
    @FindBy(how = How.XPATH, using = ".//ms-togglebutton")
    private ElementsCollection buttons;
    @FindBy(how = How.XPATH, using = ".//ms-combobox")
    private ElementsCollection comboboxes;
    @FindBy(how = How.XPATH, using = ".//ms-window")
    private ElementsCollection windows;
    @FindBy(how = How.XPATH, using = ".//ms-colorpicker")
    private ElementsCollection colorButtons;
    @FindBy(how = How.CLASS_NAME, using = "pcr-result")
    private ElementsCollection inputColor;
    @FindBy(how = How.CLASS_NAME, using = "pcr-save")
    private ElementsCollection saveBackgroundColorButton;
    String trendShadowHost = "#\\37 1684";
    String width = "7";

    public CursorSelectedPositionPage checkCursor(int axis) {
        ElementsCollection path = $$(shadowCss("path", trendShadowHost));
        path.should(CollectionCondition.size(axis));
        return this;
    }

    public CursorSelectedPositionPage clickButton(int numberButton) {
        this.buttons.get(numberButton).click();
        return this;
    }

    public CursorSelectedPositionPage clickTrend() {
        actions().moveToElement(trend, 0, 0).click().perform();
        return this;
    }

    public CursorSelectedPositionPage clickWidth() {
        $(ByShadow.cssSelector("input", "#\\37 1780")).click();
        return this;
    }

    public CursorSelectedPositionPage inputWidth() {
        $(ByShadow.cssSelector("input", "#\\37 1780")).setValue(width);
        return this;
    }

    public CursorSelectedPositionPage checkCursorWidth(int element) {
        ElementsCollection path = $$(shadowCss("path", trendShadowHost));
        path.get(element).shouldHave(Condition.attribute("stroke-width", width));
        return this;
    }

    public CursorSelectedPositionPage clickButtonCursorColor() {
        this.colorButtons.get(0).click();
        return this;
    }

    //Ввод цветового значения
    public CursorSelectedPositionPage inputCursorColor() {
        this.inputColor.get(0).setValue("#0000FF");
        return this;
    }

    public CursorSelectedPositionPage clickSaveCursorColor() {
        this.saveBackgroundColorButton.get(0).click();
        return this;
    }

    public CursorSelectedPositionPage checkCursorColor(int element) {
        ElementsCollection path = $$(shadowCss("path", trendShadowHost));
        path.get(element).shouldHave(Condition.attribute("stroke", "rgba(1,1,255,1.0)"));
        return this;
    }

}
