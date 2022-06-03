package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByShadow;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.$;


public class TransformPage {
    public static final String URL = Urls.TransformURL;
    @FindBy(how = How.XPATH, using = ".//ms-trend")
    private SelenideElement trend;
    @FindBy(how = How.XPATH, using = ".//ms-window")
    private ElementsCollection windows;

    public TransformPage clickRotate() {
        $(ByShadow.cssSelector("input", "#\\32 79738")).click();
        return this;
    }

    public TransformPage inputRotate() {
        $(ByShadow.cssSelector("input", "#\\32 79738")).setValue("40");
        return this;
    }

    public TransformPage winClick() {
        windows.get(1).click();
        return this;
    }

    public TransformPage checkRotate() {
        trend.shouldHave(Condition.attribute("style", "box-sizing: border-box; display: flex; overflow: hidden; position: absolute; border-style: solid; border-width: 2px; border-color: gray; z-index: 2; width: 710px; height: 500px; background-color: rgb(245, 240, 245); opacity: 1; left: 600px; top: 130px; border-radius: 0px; transform: rotate(40deg);"));
        return this;
    }
}
