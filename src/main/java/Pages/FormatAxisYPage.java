package Pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selectors.shadowCss;
import static com.codeborne.selenide.Selenide.*;

public class FormatAxisYPage {
    public static final String URL = Urls.FormatAxisY;

    @FindBy(how = How.XPATH, using = ".//ms-combobox")
    private ElementsCollection comboboxes;
    @FindBy(how = How.XPATH, using = ".//ms-togglebutton")
    private ElementsCollection buttons;
    @FindBy(how = How.XPATH, using = ".//ms-window")
    private ElementsCollection windows;

    public FormatAxisYPage windowsClick() {
        this.windows.get(1).click();
        return this;
    }
    public FormatAxisYPage clickPause() {
        this.buttons.get(1).click();
        return this;
    }
    public FormatAxisYPage clickFormat() {
        this.comboboxes.get(0).click();
        return this;
    }

    public FormatAxisYPage clickFormatC() {
        actions().moveToElement(comboboxes.get(0)).sendKeys("c").perform();
        actions().moveToElement(comboboxes.get(0)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public Boolean checkFormatC() {
        ElementsCollection td = $$(shadowCss("td", "#\\32 06251", "#legend"));
        return td.get(2).getText().contains("₽");
    }

    public FormatAxisYPage clickFormatP() {
        actions().moveToElement(comboboxes.get(0)).sendKeys("p").perform();
        actions().moveToElement(comboboxes.get(0)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public Boolean checkFormatP() {
        ElementsCollection td = $$(shadowCss("td", "#\\32 06251", "#legend"));
        return td.get(2).getText().contains("%");
    }

    public FormatAxisYPage clickFormatE() {
        actions().moveToElement(comboboxes.get(0)).sendKeys("e").perform();
        actions().moveToElement(comboboxes.get(0)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public Boolean checkFormatE() {
        ElementsCollection td = $$(shadowCss("td", "#\\32 06251", "#legend"));
        return td.get(2).getText().contains("e");
    }

    public FormatAxisYPage inputDecimalPlaces() {
        $(shadowCss("input", "#\\32 06392")).setValue("3");
        return this;
    }

    public int checkDecimalPlaces() {
        ElementsCollection td = $$(shadowCss("td", "#\\32 06251", "#legend"));
        String[] splitter = td.get(2).getText().split("\\.");
        int i = splitter[1].length();
        return i;
    }
}
