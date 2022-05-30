package Pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selectors.shadowCss;
import static com.codeborne.selenide.Selenide.*;

public class AutoCreateAxisDTPage {
    public static final String URL = Urls.AutoCreateAxisDTURL;
    @FindBy(how = How.XPATH, using = ".//ms-trend")
    private SelenideElement trend;
    @FindBy(how = How.XPATH, using = ".//ms-window")
    private ElementsCollection windows;
    @FindBy(how = How.XPATH, using = ".//ms-togglebutton")
    private ElementsCollection buttons;
    String trendShadowHost = "#\\32 80531";

    public AutoCreateAxisDTPage clickButton(int numberButton) {
        this.buttons.get(numberButton).click();
        return this;
    }

    public AutoCreateAxisDTPage checkAxisCount(int axis) {
        ElementsCollection path = $$(shadowCss("path", trendShadowHost));
        path.shouldHave(CollectionCondition.size(axis));
        return this;
    }
}
