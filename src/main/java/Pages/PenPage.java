package Pages;

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

    public PenPage windowsClick() {
        this.windows.get(1).click();
        return this;
    }

    public PenPage inputMaxY() {
        $(shadowCss("input", "#\\36 4452")).setValue("80");
        return this;
    }

    public String checkMaxY() {
        ElementsCollection text = $$(shadowCss("text", "#\\36 4053"));
        return text.get(4).getText();
    }


    public PenPage inputMinY() {
        $(shadowCss("input", "#\\36 4466")).setValue("10");
        return this;
    }

    public String checkMinY() {
        ElementsCollection text = $$(shadowCss("text", "#\\36 4053"));
        return text.get(0).getText();
    }

    public PenPage clickAutoScale() {
        this.buttons.get(0).click();
        return this;
    }

    public String checkAutoMaxY() {
        ElementsCollection text = $$(shadowCss("text", "#\\36 4053"));
        return text.get(5).getText();
    }

    public PenPage clickVisible() {
        this.buttons.get(1).click();
        return this;
    }

    public int checkTextElement() {
        ElementsCollection text = $$(shadowCss("text", "#\\36 4053"));
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
        ElementsCollection td = $$(shadowCss("td", "#\\36 4053", "#legend"));
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

    public String checkStyleLine() {
        ElementsCollection path = $$(shadowCss("path", "#\\36 4053"));
        int pathCount = path.size()-6;
        System.out.println(pathCount);
        String res = path.get(pathCount).getAttribute("stroke-dasharray");
        return res;
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

    public String checkStyleLineNo() {
        ElementsCollection path = $$(shadowCss("path", "#\\36 4053"));
        int pathCount = path.size()-6;
        String res = path.get(pathCount).getAttribute("stroke-opacity");
        return res;
    }

    public PenPage inputLineWidth() {
        $(shadowCss("input", "#\\36 4619")).setValue("7");
        return this;
    }

    public String checkLineWidth() {
        ElementsCollection path = $$(shadowCss("path", "#\\36 4053"));
        int pathCount = path.size()-8;
        System.out.println(pathCount);
        String res = path.get(pathCount).getAttribute("stroke-width");
        return res;
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

    public String checkPenColor() {
        ElementsCollection path = $$(shadowCss("path", "#\\36 4053"));
        int pathCount = path.size()-6;
        System.out.println(pathCount);
        String res = path.get(pathCount).getAttribute("stroke");
        return res;
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

    public String checkDotType() {
        ElementsCollection path = $$(shadowCss("path", "#\\36 4053"));
        int pathCount = path.size()-6;
        System.out.println(pathCount);
        String res = path.get(pathCount).getAttribute("d");
        return res;
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
        ElementsCollection path = $$(shadowCss("path", "#\\36 4053"));
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
        ElementsCollection text = $$(shadowCss("text", "#\\36 4053"));
        return text.size();
    }


}
