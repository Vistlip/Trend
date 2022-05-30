package Pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.shadowCss;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.actions;

public class AutoCreateAxisRTPage {
    Duration time = Duration.ofSeconds(15);
    public static final String URL = Urls.AutoCreateAxisRTURL;
    @FindBy(how = How.XPATH, using = ".//ms-trend")
    private SelenideElement trend;
    @FindBy(how = How.XPATH, using = ".//ms-togglebutton")
    private ElementsCollection buttons;
    @FindBy(how = How.XPATH, using = ".//ms-combobox")
    private ElementsCollection comboboxes;
    @FindBy(how = How.XPATH, using = ".//ms-window")
    private ElementsCollection windows;
    String trendShadowHost = "#\\32 80847";

    public AutoCreateAxisRTPage clickButton(int numberButton) {
        this.buttons.get(numberButton).click();
        return this;
    }

    public AutoCreateAxisRTPage clickWin() {
        this.windows.get(1).click();
        return this;
    }

    public AutoCreateAxisRTPage clickAddChoice() {
        this.comboboxes.get(0).click();
        return this;
    }

    public AutoCreateAxisRTPage clickAddPen() {
        actions().moveToElement(comboboxes.get(0)).sendKeys("Перо").perform();
        actions().moveToElement(comboboxes.get(0)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public AutoCreateAxisRTPage clickAddRandom() {
        actions().moveToElement(comboboxes.get(0)).sendKeys("Рандом").perform();
        actions().moveToElement(comboboxes.get(0)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public AutoCreateAxisRTPage clickAddConst() {
        actions().moveToElement(comboboxes.get(0)).sendKeys("Константа").perform();
        actions().moveToElement(comboboxes.get(0)).sendKeys(Keys.ENTER).perform();
        return this;
    }


    public AutoCreateAxisRTPage checkAxisCount(int axis) {
        ElementsCollection path = $$(shadowCss("path", trendShadowHost));
        path.should(CollectionCondition.size(axis), time);
        return this;
    }
}
