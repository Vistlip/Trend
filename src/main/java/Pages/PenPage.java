package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selectors.shadowCss;
import static com.codeborne.selenide.Selenide.*;

public class PenPage {
    public static final String URL = Urls.PenPageURL;

    @FindBy(how = How.XPATH, using = ".//ms-trend")
    private SelenideElement trend;
    @FindBy(how = How.XPATH, using = ".//ms-window")
    private ElementsCollection windows;
    @FindBy(how = How.XPATH, using = ".//ms-togglebutton")
    private ElementsCollection buttons;
    @FindBy(how = How.XPATH, using = ".//ms-combobox")
    private ElementsCollection comboboxes;
    @FindBy(how = How.XPATH, using = ".//ms-colorpicker")
    private ElementsCollection colorButtons;
    @FindBy(how = How.CLASS_NAME, using = "pcr-result")
    private ElementsCollection inputColor;
    @FindBy(how = How.CLASS_NAME, using = "pcr-save")
    private ElementsCollection saveBackgroundColorButton;
    String trendShadowHost = "#\\36 4053";

    public PenPage windowsClick() {
        this.windows.get(1).click();
        return this;
    }

    public PenPage inputMaxY(String maxValue) {
        $(shadowCss("input", "#\\36 4452")).setValue(maxValue);
        return this;
    }

    public PenPage checkMaxY(String maxValue) {
        ElementsCollection text = $$(shadowCss("text", trendShadowHost));
        text.get(4).shouldHave(Condition.text(maxValue));
        return this;
    }


    public PenPage inputMinY(String minValue) {
        $(shadowCss("input", "#\\36 4466")).setValue("10");
        return this;
    }

    public PenPage checkMinY(String minValue) {
        ElementsCollection text = $$(shadowCss("text", trendShadowHost));
        text.get(0).shouldHave(Condition.text(minValue));
        return this;
    }

    public PenPage clickAutoScale() {
        this.buttons.get(0).click();
        return this;
    }

    public PenPage checkAutoMaxY() {
        ElementsCollection text = $$(shadowCss("text", trendShadowHost));
        text.get(5).shouldHave(Condition.text("50"));
        return this;
    }

    public PenPage clickVisible() {
        this.buttons.get(1).click();
        return this;
    }

    public int checkTextElement() {
        ElementsCollection text = $$(shadowCss("text", trendShadowHost));
        return text.size();
    }

    public PenPage inputMeasureUnit() {
        $(shadowCss("input", "#\\36 4549")).setValue("m3");
        return this;
    }

    public PenPage clickPause() {
        this.buttons.get(6).click();
        return this;
    }

    public Boolean checkMeasureUnit() {
        ElementsCollection td = $$(shadowCss("td", trendShadowHost, "#legend"));
        return td.get(2).getText().contains("m3");
    }

    public PenPage inputDivisionsY() {
        $(shadowCss("input", "#\\36 4577")).setValue("7");
        return this;
    }

    public PenPage clickStyleLine() {
        this.comboboxes.get(0).click();
        return this;
    }

    public PenPage clickStyleLineStipple() {
        actions().moveToElement(comboboxes.get(0)).sendKeys("Пунктир").perform();
        actions().moveToElement(comboboxes.get(0)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public PenPage checkStyleLine(String dashArray) {
        ElementsCollection path = $$(shadowCss("path", trendShadowHost));
        int pathCount = path.size()-6;
        path.get(pathCount).shouldHave(Condition.attribute("stroke-dasharray", dashArray));
        return this;
    }

    public PenPage clickStyleLineDot() {
        actions().moveToElement(comboboxes.get(0)).sendKeys("Точка").perform();
        actions().moveToElement(comboboxes.get(0)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public PenPage clickStyleLineNo() {
        actions().moveToElement(comboboxes.get(0)).sendKeys("Нет").perform();
        actions().moveToElement(comboboxes.get(0)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public PenPage checkStyleLineNo() {
        ElementsCollection path = $$(shadowCss("path", trendShadowHost));
        int pathCount = path.size()-6;
        path.get(pathCount).shouldHave(Condition.attribute("stroke-opacity", "0"));
        return this;
    }

    public PenPage inputLineWidth() {
        $(shadowCss("input", "#\\36 4619")).setValue("7");
        return this;
    }

    public PenPage checkLineWidth() {
        ElementsCollection path = $$(shadowCss("path", trendShadowHost));
        int pathCount = path.size()-8;
        path.get(pathCount).shouldHave(Condition.attribute("stroke-width", "7"));
        return this;
    }

    public PenPage clickButtonPenColor() {
        this.colorButtons.get(0).click();
        return this;
    }

    //Ввод цветового значения
    public PenPage inputPenColor() {
        this.inputColor.get(0).setValue("#0000FF");
        return this;
    }

    public PenPage clickSavePenColor() {
        this.saveBackgroundColorButton.get(0).click();
        return this;
    }

    public PenPage checkPenColor() {
        ElementsCollection path = $$(shadowCss("path", trendShadowHost));
        int pathCount = path.size()-6;
        path.get(pathCount).shouldHave(Condition.attribute("stroke", "rgba(1,1,255,1.0)"));
        return this;
    }

    public PenPage clickDotType() {
        this.comboboxes.get(2).click();
        return this;
    }

    public PenPage clickDotTypeRectangle() {
        actions().moveToElement(comboboxes.get(2)).sendKeys("Квадрат").perform();
        actions().moveToElement(comboboxes.get(2)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public PenPage checkDotType(String dot) {
        ElementsCollection path = $$(shadowCss("path", trendShadowHost));
        int pathCount = path.size()-6;
        path.get(pathCount).shouldHave(Condition.attribute("d", dot));
        return this;
    }

    public PenPage clickDotTypeCircle() {
        actions().moveToElement(comboboxes.get(2)).sendKeys("Круг").perform();
        actions().moveToElement(comboboxes.get(2)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public PenPage clickDotTypeTriangle() {
        actions().moveToElement(comboboxes.get(2)).sendKeys("Треугольник").perform();
        actions().moveToElement(comboboxes.get(2)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public PenPage clickDotTypeDiamond() {
        actions().moveToElement(comboboxes.get(2)).sendKeys("Ромб").perform();
        actions().moveToElement(comboboxes.get(2)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public PenPage clickDotTypeCross() {
        actions().moveToElement(comboboxes.get(2)).sendKeys("Крест").perform();
        actions().moveToElement(comboboxes.get(2)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public PenPage inputDotSize() {
        $(shadowCss("input", "#\\32 21004")).setValue("10");
        return this;
    }

    public Boolean checkDotSize() {
        ElementsCollection path = $$(shadowCss("path", trendShadowHost));
        int pathCount = path.size()-8;
        System.out.println(pathCount);
        String res = path.get(pathCount).getAttribute("transform");
        return res.contains("5,0,0");
    }

    public PenPage clickVisibleAxisY() {
        this.buttons.get(2).click();
        return this;
    }

    public int checkTextElementsWithoutAxisY() {
        ElementsCollection text = $$(shadowCss("text", trendShadowHost));
        return text.size();
    }


}
