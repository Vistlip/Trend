package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selectors.shadowCss;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AxisXPage {
    public static final String URL = Urls.AxisXURL;
    @FindBy(how = How.XPATH, using = ".//ms-trend")
    private SelenideElement trend;
    @FindBy(how = How.XPATH, using = ".//ms-window")
    private ElementsCollection windows;
    String trendShadowHost = "#\\37 2100";

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


}
