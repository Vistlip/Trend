package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.shadowCss;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.selector.ByShadow;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TrendPage {
    public static final String URL = Urls.TrendPageURL;

    @FindBy(how = How.XPATH, using = ".//ms-trend")
    private SelenideElement trend;
    @FindBy(how = How.XPATH, using = ".//ms-window")
    private ElementsCollection windows;
    @FindBy(how = How.XPATH, using = ".//ms-combobox")
    private ElementsCollection comboboxes;
    @FindBy(how = How.XPATH, using = ".//ms-colorpicker")
    private ElementsCollection colorButtons;
    @FindBy(how = How.CLASS_NAME, using = "pcr-result")
    private ElementsCollection inputColor;
    @FindBy(how = How.CLASS_NAME, using = "pcr-save")
    private ElementsCollection saveBackgroundColorButton;
    @FindBy(how = How.XPATH, using = ".//ms-togglebutton")
    private ElementsCollection buttons;
    @FindBy(how = How.XPATH, using = ".//ms-interval")
    private ElementsCollection interval;


    //Селекоторы кнопок
    public TrendPage clickAutoscrollButton() {
        this.buttons.get(0).click();
        return this;
    }
    public TrendPage clickMinViewButton() {
        $(ByShadow.cssSelector(".button", "#\\36 2264")).click();
        return page(TrendPage.class);
    }
    public TrendPage clickSelectionTreeButton() {
        $(ByShadow.cssSelector(".button", "#\\36 67654")).click();
        return page(TrendPage.class);
    }

    public TrendPage clickButtonBackgroundColorTrend() {
        this.colorButtons.get(0).click();
        return this;
    }

    //Ввод цветового значения
    public TrendPage inputColorBackgroundTrend() {
        this.inputColor.get(0).setValue("#0000FF");
        return this;
    }

    public TrendPage clickSaveBackgroundColorTrend() {
        this.saveBackgroundColorButton.get(0).click();
        return this;
    }

    public TrendPage clickUpdatePeriod() {
        $(ByShadow.cssSelector("input", "#\\36 2338")).click();
        return this;
    }

    public TrendPage inputUpdatePeriod() {
        $(ByShadow.cssSelector("input", "#\\36 2338")).setValue("1000");
        return this;
    }

    public TrendPage clickMaxCountPen() {
        $(ByShadow.cssSelector("input", "#\\36 2338")).click();
        return this;
    }

    public TrendPage inputMaxCountPen() {
        $(ByShadow.cssSelector("input", "#\\36 2338")).setValue("3");
        return this;
    }

    public TrendPage clickInterval() {
        $(ByShadow.cssSelector("input", "#\\33 28002")).click();
        return this;
    }

    public TrendPage inputInterval() {
        actions().moveToElement(interval.get(0)).sendKeys("5").perform();
        actions().moveToElement(interval.get(0)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public String checkAutoScroll() {
        ElementsCollection div = $$(shadowCss("div", "#\\36 2076", "#toolbar"));
        return div.get(1).getAttribute("tooltip");
    }

    public String checkBackgroundColorTrend() {
        ElementsCollection div = $$(shadowCss("path", "#\\36 2076"));
        return div.get(0).getAttribute("fill");
    }

    public TrendPage windowsClick() {
        this.windows.get(1).click();
        return this;
    }



}
