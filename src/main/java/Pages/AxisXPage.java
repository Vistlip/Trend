package Pages;

import com.beust.ah.A;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByShadow;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import static com.codeborne.selenide.Selectors.shadowCss;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.actions;

public class AxisXPage {
    public static final String URL = Urls.AxisXURL;
    @FindBy(how = How.XPATH, using = ".//ms-trend")
    private SelenideElement trend;
    @FindBy(how = How.XPATH, using = ".//ms-window")
    private ElementsCollection windows;
    @FindBy(how = How.XPATH, using = ".//ms-combobox")
    private ElementsCollection combobox;
    @FindBy(how = How.XPATH, using = ".//ms-colorpicker")
    private ElementsCollection colorButtons;
    @FindBy(how = How.CLASS_NAME, using = "pcr-result")
    private ElementsCollection inputColor;
    @FindBy(how = How.CLASS_NAME, using = "pcr-save")
    private ElementsCollection saveBackgroundColorButton;
    String trendShadowHost = "#\\37 2100";
    Duration time = Duration.ofSeconds(15);
    String labelX = "Привет";

    public AxisXPage windowsClick() {
        this.windows.get(1).click();
        return this;
    }

    public AxisXPage inputTopOffset() {
        $(shadowCss("input", "#\\37 2264")).setValue("10");
        return this;
    }

    public AxisXPage checkTopOffset() {
        ElementsCollection path = $$(shadowCss("tspan", trendShadowHost));
        path.get(8).shouldHave(Condition.attribute("y", "16"));
        return this;
    }

    public AxisXPage inputHeightAxis() {
        $(shadowCss("input", "#\\37 2278")).setValue("20");
        return this;
    }

    public String checkHeightAxis() {
        ElementsCollection path = $$(shadowCss("path", trendShadowHost));
        String[] splitter = path.get(25).getAttribute("d").split(" ");
        System.out.println(path.get(25).getAttribute("d"));
        return splitter[5];
    }

    public AxisXPage clickDivisions() {
        combobox.get(1).click();
        return this;
    }

    public AxisXPage inputDivisions() {
        actions().moveToElement(combobox.get(1)).sendKeys("6").perform();
        actions().moveToElement(combobox.get(1)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public AxisXPage checkDivisions() {
        ElementsCollection path = $$(shadowCss("path", trendShadowHost));
        path.shouldHave(CollectionCondition.size(39), time);
        return this;
    }

    public AxisXPage inputLabelX() {
        $(shadowCss("input", "#\\37 2320")).setValue(labelX);
        return this;
    }

    public AxisXPage checkLabelX() {
        ElementsCollection path = $$(shadowCss("text", trendShadowHost));
        path.get(0).shouldHave(Condition.text(labelX));
        return this;
    }

    public AxisXPage inputThicknessAxisX() {
        $(shadowCss("input", "#\\37 2334")).setValue("9");
        return this;
    }

    public AxisXPage checkThicknessAxisX() {
        ElementsCollection path = $$(shadowCss("path", trendShadowHost));
        path.get(14).shouldHave(Condition.attribute("stroke-width", "9"), time);
        return this;
    }

    public AxisXPage clickDataFormat() {
        combobox.get(0).click();
        return this;
    }

    public AxisXPage inputDataFormatDT() {
        actions().moveToElement(combobox.get(0)).sendKeys("dd.MM.yyyy HH:mm:ss").perform();
        actions().moveToElement(combobox.get(0)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public Boolean checkDateFormatDT() {
        Date date = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        String str = formatForDateNow.format(date);
        ElementsCollection path = $$(shadowCss("tspan", trendShadowHost));
        Boolean format = path.get(10).text().contains(str);
        return format;
    }

    public AxisXPage inputDataFormatData() {
        actions().moveToElement(combobox.get(0)).sendKeys("dd.MM.yyyy").perform();
        actions().moveToElement(combobox.get(0)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public Boolean checkDateFormatData() {
        Date date = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy");
        String str = formatForDateNow.format(date);
        ElementsCollection path = $$(shadowCss("tspan", trendShadowHost));
        Boolean format = path.get(10).text().contains(str);
        return format;
    }

    public AxisXPage inputDataFormatTime() {
        actions().moveToElement(combobox.get(0)).sendKeys("HH:mm:ss").perform();
        actions().moveToElement(combobox.get(0)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public Boolean checkDateFormatTime() {
        Date date = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("HH:mm");
        String str = formatForDateNow.format(date);
        ElementsCollection path = $$(shadowCss("tspan", trendShadowHost));
        Boolean format = path.get(10).text().contains(str);
        return format;
    }

    public AxisXPage clickButtonColorDivision() {
        this.colorButtons.get(0).click();
        return this;
    }

    //Ввод цветового значения
    public AxisXPage inputColorDivision() {
        this.inputColor.get(0).setValue("#0000FF");
        return this;
    }

    public AxisXPage clickSaveColorDivision() {
        this.saveBackgroundColorButton.get(0).click();
        return this;
    }

    public AxisXPage checkColorDivision() {
        ElementsCollection path = $$(shadowCss("path", trendShadowHost));
        path.get(23).shouldHave(Condition.attribute("stroke", "rgba(1,1,255,1.0)"), time);
        return this;
    }
    public AxisXPage clickButtonColorAxisX() {
        this.colorButtons.get(1).click();
        return this;
    }

    //Ввод цветового значения
    public AxisXPage inputColorAxisX() {
        this.inputColor.get(1).setValue("#00FF0B");
        return this;
    }

    public AxisXPage clickSaveColorAxisX() {
        this.saveBackgroundColorButton.get(1).click();
        return this;
    }

    public AxisXPage checkColorAxisX() {
        ElementsCollection path = $$(shadowCss("path", trendShadowHost));
        path.get(14).shouldHave(Condition.attribute("stroke", "rgba(1,255,12,1.0)"), time);
        return this;
    }

    public AxisXPage inputThicknessDivisions() {
        $(shadowCss("input", "#\\37 2392")).setValue("8");
        return this;
    }

    public AxisXPage checkThicknessDivisions() {
        ElementsCollection path = $$(shadowCss("path", trendShadowHost));
        path.get(23).shouldHave(Condition.attribute("stroke-width", "8"), time);
        return this;
    }
}
