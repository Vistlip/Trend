package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.shadowCss;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.selector.ByShadow;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.text.SimpleDateFormat;
import java.util.Date;

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
    @FindBy(how = How.XPATH, using = ".//ms-dtpicker")
    private ElementsCollection dataEnd;
    @FindBy(how = How.XPATH, using = ".//button")
    private ElementsCollection buttonsPopup;
    @FindBy(how = How.CLASS_NAME, using = "btn-open")
    private SelenideElement openInfo;
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/ul/li/div/div[1]")
    private SelenideElement openTitle;
    @FindBy(how = How.CLASS_NAME, using = "body")
    private SelenideElement messageWarning;


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
        this.buttons.get(2).click();
        return this;
    }

    public String checkSelectionTreeButton() {
        ElementsCollection div = $$(shadowCss("div", "#\\36 2076", "#toolbar"));
        return div.get(2).getAttribute("style");
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

    public TrendPage clickDataEnd() {
        this.dataEnd.get(0).click();
        return this;
    }

    public TrendPage deleteDataEnd() {
        actions().moveToElement(dataEnd.get(0)).sendKeys(Keys.BACK_SPACE).perform();
        actions().moveToElement(dataEnd.get(0)).sendKeys(Keys.BACK_SPACE).perform();
        actions().moveToElement(dataEnd.get(0)).sendKeys(Keys.BACK_SPACE).perform();
        actions().moveToElement(dataEnd.get(0)).sendKeys(Keys.BACK_SPACE).perform();
        actions().moveToElement(dataEnd.get(0)).sendKeys(Keys.BACK_SPACE).perform();
        actions().moveToElement(dataEnd.get(0)).sendKeys(Keys.BACK_SPACE).perform();
        actions().moveToElement(dataEnd.get(0)).sendKeys(Keys.BACK_SPACE).perform();
        actions().moveToElement(dataEnd.get(0)).sendKeys(Keys.BACK_SPACE).perform();
        actions().moveToElement(dataEnd.get(0)).sendKeys(Keys.BACK_SPACE).perform();
        actions().moveToElement(dataEnd.get(0)).sendKeys(Keys.BACK_SPACE).perform();
        actions().moveToElement(dataEnd.get(0)).sendKeys(Keys.BACK_SPACE).perform();
        actions().moveToElement(dataEnd.get(0)).sendKeys(Keys.BACK_SPACE).perform();
        actions().moveToElement(dataEnd.get(0)).sendKeys(Keys.BACK_SPACE).perform();
        return this;
    }

    public TrendPage inputDataEnd() {
        Date date = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy HH.mm");
        String str = formatForDateNow.format(date);
        System.out.println(str);
        actions().moveToElement(dataEnd.get(0)).sendKeys(str).perform();
        actions().moveToElement(dataEnd.get(0)).sendKeys(Keys.ENTER).perform();
        actions().moveToElement(dataEnd.get(0)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public String checkBeginTime() {
        ElementsCollection text = $$(shadowCss("text", "#\\36 2076"));
        return text.get(6).getText();
    }

    public String checkEndTime() {
        ElementsCollection text = $$(shadowCss("text", "#\\36 2076"));
        return text.get(11).getText();
    }

    public String checkTrendToolbar() {
        ElementsCollection div = $$(shadowCss("ms-toolbar", "#\\36 2076"));
        return div.get(0).getAttribute("style");
    }

    public TrendPage clickTitle() {
        $(ByShadow.cssSelector("input", "#\\36 2386")).click();
        return this;
    }

    public TrendPage inputTitle() {
        $(ByShadow.cssSelector("input", "#\\36 2386")).setValue("Title");
        return this;
    }

    public String checkTitle() {
        ElementsCollection text = $$(shadowCss("text", "#\\36 2076"));
        int num = text.size()-2;
        return text.get(num).getText();
    }

    public TrendPage clickTrendTreePen() {
        ElementsCollection div = $$(shadowCss("div", "#\\36 2076", "#toolbar"));
        div.get(2).click();
        return this;
    }

    public TrendPage clickCheckboxRandom() {
        ElementsCollection input = $$(shadowCss("input", "ms-tree"));
        input.get(3).click();
        return this;
    }

    public TrendPage clickCheckboxNotArchivePen() {
        ElementsCollection input = $$(shadowCss("input", "ms-tree"));
        input.get(4).click();
        return this;
    }

    public TrendPage clickOkTreeTrendPen() {
        this.buttonsPopup.get(0).click();
        return this;
    }

    public TrendPage clickMaxPenInput() {
        $(shadowCss("input", "#\\33 31094")).click();
        return this;
    }

    public TrendPage inputMaxPen() {
        $(shadowCss("input", "#\\33 31094")).setValue("3");
        return this;
    }

    public TrendPage clickInfo() {
        this.openInfo.click();
        return this;
    }

    public TrendPage clickWarningTitle() {
        this.openTitle.click();
        return this;
    }

    public String checkMessageWarning() {
        return messageWarning.getText();
    }



    public TrendPage windowsClick() {
        this.windows.get(1).click();
        return this;
    }

}
