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
        int pathCount = path.size() - 15;
        String res = path.get(pathCount).getAttribute("stroke-width");
        return res;
    }
}