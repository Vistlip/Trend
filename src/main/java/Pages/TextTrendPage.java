package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selectors.shadowCss;
import static com.codeborne.selenide.Selenide.$$;

public class TextTrendPage {
    public static final String URL = Urls.TextTrendURL;

    @FindBy(how = How.XPATH, using = ".//ms-colorpicker")
    private ElementsCollection colorButtons;
    @FindBy(how = How.CLASS_NAME, using = "pcr-result")
    private ElementsCollection inputColor;
    @FindBy(how = How.CLASS_NAME, using = "pcr-save")
    private ElementsCollection saveBackgroundColorButton;

    public TextTrendPage clickButtonTextColor() {
        this.colorButtons.get(0).click();
        return this;
    }

    //Ввод цветового значения
    public TextTrendPage inputColorText() {
        this.inputColor.get(0).setValue("#0000FF");
        return this;
    }

    public TextTrendPage clickSaveTextColorTrend() {
        this.saveBackgroundColorButton.get(0).click();
        return this;
    }

    public TextTrendPage checkTextColor() {
        ElementsCollection text = $$(shadowCss("text", "#\\37 5524"));
        int num = text.size()-2;
        text.get(num).shouldHave(Condition.attribute("fill", "rgba(1,1,255,1.0)"));
        return this;
    }
}
