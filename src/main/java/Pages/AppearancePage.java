package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByShadow;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class AppearancePage {
    public static final String URL = Urls.AppearancePageURL;

    @FindBy(how = How.XPATH, using = ".//ms-trend")
    private SelenideElement trend;
    @FindBy(how = How.XPATH, using = ".//ms-textinput")
    private SelenideElement textInput;
    @FindBy(how = How.XPATH, using = ".//ms-window")
    private ElementsCollection windows;
    @FindBy(how = How.XPATH, using = ".//ms-colorpicker")
    private ElementsCollection colorButtons;
    @FindBy(how = How.CLASS_NAME, using = "pcr-result")
    private ElementsCollection inputColor;
    @FindBy(how = How.CLASS_NAME, using = "pcr-save")
    private ElementsCollection saveBackgroundColorButton;

    //Селекоторы кнопок
    public AppearancePage clickActivityButton() {
        $(ByShadow.cssSelector(".button", "#\\35 8526")).click();
        return page(AppearancePage.class);
    }
    public AppearancePage clickVisibleButton() {
        $(ByShadow.cssSelector(".button", "#\\35 9610")).click();
        return page(AppearancePage.class);
    }
    public AppearancePage clickFlashingButton() {
        $(ByShadow.cssSelector(".button", "#\\36 0100")).click();
        return page(AppearancePage.class);
    }
    //Клик по текстовому полю нужен для того чтобы ввод заработал. В инкрементах так же.
    public AppearancePage inputClick() {
        this.textInput.click();
        return this;
    }

    public AppearancePage inputPrompt() {
        $(ByShadow.cssSelector("input", "#\\35 9646")).setValue("123");
        return this;
    }
    //Селекторы кнопок цвета
    public AppearancePage clickButtonBackgroundColor() {
        this.colorButtons.get(0).click();
        return this;
    }

    public AppearancePage clickButtonShadowColor() {
        this.colorButtons.get(1).click();
        return this;
    }
    //Ввод цветового значения
    public AppearancePage inputColorBackground() {
        this.inputColor.get(0).setValue("#0000FF");
        return this;
    }

    public AppearancePage inputColorShadow() {
        this.inputColor.get(1).setValue("#FF0000");
        return this;
    }
    //Нажатие на кнопку применить в меню выбора цвета
    public AppearancePage clickSaveBackgroundColorButton() {
        this.saveBackgroundColorButton.get(0).click();
        return this;
    }

    public AppearancePage clickSaveShadowColorButton() {
        this.saveBackgroundColorButton.get(1).click();
        return this;
    }
    //Селекторы для инкрементов
    public AppearancePage clickScaleX() {
        $(ByShadow.cssSelector("input", "#\\36 0036")).click();
        return this;
    }

    public AppearancePage inputScaleX() {
        $(ByShadow.cssSelector("input", "#\\36 0036")).setValue("2");
        return this;
    }

    public AppearancePage clickScaleY() {
        $(ByShadow.cssSelector("input", "#\\36 0065")).click();
        return this;
    }

    public AppearancePage inputScaleY() {
        $(ByShadow.cssSelector("input", "#\\36 0065")).setValue("2");
        return this;
    }

    public AppearancePage clickTransparency() {
        $(ByShadow.cssSelector("input", "#\\36 0128")).click();
        return this;
    }

    public AppearancePage inputTransparency() {
        $(ByShadow.cssSelector("input", "#\\36 0128")).setValue("50");
        return this;
    }

    public AppearancePage clickRounding() {
        $(ByShadow.cssSelector("input", "#\\36 0156")).click();
        return this;
    }

    public AppearancePage inputRounding() {
        $(ByShadow.cssSelector("input", "#\\36 0156")).setValue("40");
        return this;
    }

    public AppearancePage clickShadow() {
        $(ByShadow.cssSelector("input", "#\\36 0235")).click();
        return this;
    }

    public AppearancePage inputShadow() {
        $(ByShadow.cssSelector("input", "#\\36 0235")).setValue("30");
        return this;
    }
    //Получения строки стиля тренда
    public String getStyleTrend() {
        return this.trend.getAttribute("style");
    }
    //Получение тултипа тренда
    public AppearancePage getDataTooltipTrend() {
        trend.shouldHave(Condition.attribute("data-tooltip", "123"));
        return this;
    }
    //Клик по пустому пространству на окне. Необходим для подтверждения ввода инкрментов и текстого ввода.
    public AppearancePage windowsClick() {
        this.windows.get(1).click();
        return this;
    }
}
