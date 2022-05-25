package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selectors.shadowCss;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AxisYPage {
    public static final String URL = Urls.AxisYURL;
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

    public AxisYPage windowsClick() {
        this.windows.get(1).click();
        return this;
    }

    public AxisYPage inputThicknessDivisions() {
        $(shadowCss("input", "#\\37 4230")).setValue("10");
        return this;
    }

    public String checkThicknessDivisions() {
        ElementsCollection path = $$(shadowCss("path", "#\\37 3956"));
        int pathCount = path.size() - 10;
        String res = path.get(pathCount).getAttribute("stroke-miterlimit");
        return res;
    }

    public AxisYPage inputLabelY() {
        $(shadowCss("input", "#\\37 4244")).setValue("Подпись");
        return this;
    }

    public String checkLabelY() {
        ElementsCollection path = $$(shadowCss("text", "#\\37 3956"));
        String res = path.get(0).getText();
        return res;
    }

    public AxisYPage inputRightOffset() {
        $(shadowCss("input", "#\\37 4258")).setValue("8");
        return this;
    }

    public String checkRightOffset() {
        ElementsCollection path = $$(shadowCss("tspan", "#\\37 3956"));
        String res = path.get(1).getAttribute("x");
        return res;
    }

    public AxisYPage inputThicknessAxis() {
        $(shadowCss("input", "#\\37 4272")).setValue("7");
        return this;
    }

    public String checkThicknessAxis() {
        ElementsCollection path = $$(shadowCss("path", "#\\37 3956"));
        System.out.println(path.size());
        int pathCount = path.size() - 41;
        String res = path.get(pathCount).getAttribute("stroke-width");
        return res;
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

    public String checkColorAxis() {
        ElementsCollection path = $$(shadowCss("path", "#\\37 3956"));
        System.out.println(path.size());
        int pathCount = path.size() - 35;
        String res = path.get(pathCount).getAttribute("stroke");
        return res;
    }

    public AxisYPage inputLengthAxis() {
        $(shadowCss("input", "#\\37 4314")).setValue("15");
        return this;
    }

    public String checkLengthAxis() {
        ElementsCollection path = $$(shadowCss("path", "#\\37 3956"));
        System.out.println(path.size());
        int pathCount = path.size() - 34;
        String[] splitter = path.get(pathCount).getAttribute("d").split(" ");
        System.out.println(path.get(pathCount).getAttribute("d"));
        return splitter[4];
    }
}
