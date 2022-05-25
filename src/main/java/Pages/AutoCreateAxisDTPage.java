package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByShadow;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class AutoCreateAxisDTPage {
    public static final String URL = Urls.AutoCreateAxisDTURL;
    @FindBy(how = How.XPATH, using = ".//ms-trend")
    private SelenideElement trend;
    @FindBy(how = How.XPATH, using = ".//ms-window")
    private ElementsCollection windows;
    @FindBy(how = How.XPATH, using = ".//ms-togglebutton")
    private ElementsCollection buttons;

    public AutoCreateAxisDTPage clickAutoCreateAxis() {
        this.buttons.get(1).click();
        return this;
    }
}
