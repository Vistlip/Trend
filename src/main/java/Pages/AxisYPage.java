package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selectors.shadowCss;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AxisYPage {
    public static final String URL = Urls.AxisYURL;
    String thicknessDivisions = "8";
    String labelY = "Подпись";
    String rightOffset = "7";
    String thicknessAxis = "9";
    @FindBy(how = How.XPATH, using = ".//ms-trend")
    private SelenideElement trend;
    @FindBy(how = How.XPATH, using = ".//ms-window")
    private ElementsCollection windows;
    @FindBy(how = How.XPATH, using = ".//ms-colorpicker")
    private ElementsCollection colorButtons;
    @FindBy(how = How.CLASS_NAME, using = "pcr-result")
    private ElementsCollection inputColor;
    @FindBy(how = How.CLASS_NAME, using = "pcr-save")
    private ElementsCollection saveBackgroundColorButton;
    String trendShadowHost = "#\\37 3956";

    public AxisYPage windowsClick() {
        this.windows.get(1).click();
        return this;
    }

    public AxisYPage inputThicknessDivisions() {
        $(shadowCss("input", "#\\37 4230")).setValue(thicknessDivisions);
        return this;
    }

    public AxisYPage checkThicknessDivisions() {
        ElementsCollection path = $$(shadowCss("path", trendShadowHost));
        path.get(30).shouldHave(Condition.attribute("stroke-width", thicknessDivisions));
        return this;
    }

    public AxisYPage inputLabelY() {
        $(shadowCss("input", "#\\37 4244")).setValue(labelY);
        return this;
    }

    public AxisYPage checkLabelY() {
        ElementsCollection path = $$(shadowCss("text", trendShadowHost));
        path.get(0).shouldHave(Condition.text(labelY));
        return this;
    }

    public AxisYPage inputRightOffset() {
        $(shadowCss("input", "#\\37 4258")).setValue(rightOffset);
        return this;
    }

    public AxisYPage checkRightOffset() {
        ElementsCollection path = $$(shadowCss("tspan", trendShadowHost));
        path.get(1).shouldHave(Condition.attribute("x", "-" + rightOffset));
        return this;
    }

    public AxisYPage inputThicknessAxis() {
        $(shadowCss("input", "#\\37 4272")).setValue(thicknessAxis);
        return this;
    }

    public AxisYPage checkThicknessAxis() {
        ElementsCollection path = $$(shadowCss("path", trendShadowHost));
        path.get(23).shouldHave(Condition.attribute("stroke-width", thicknessAxis));
        return this;
    }

    public AxisYPage clickButtonAxisColor() {
        this.colorButtons.get(0).click();
        return this;
    }

    //Ввод цветового значения
    public AxisYPage inputColorAxis() {
        this.inputColor.get(0).setValue("#0000FF");
        return this;
    }

    public AxisYPage clickSaveAxisColor() {
        this.saveBackgroundColorButton.get(0).click();
        return this;
    }

    public AxisYPage checkColorAxis() {
        ElementsCollection path = $$(shadowCss("path", trendShadowHost));
        path.get(30).shouldHave(Condition.attribute("stroke", "rgba(1,1,255,1.0)"));
        return this;
    }

    public AxisYPage inputLengthAxis() {
        $(shadowCss("input", "#\\37 4314")).setValue("15");
        return this;
    }

    public String checkLengthAxis() {
        ElementsCollection path = $$(shadowCss("path", trendShadowHost));
        String[] splitter = path.get(30).getAttribute("d").split(" ");
        System.out.println(path.get(30).getAttribute("d"));
        return splitter[4];
    }
}
