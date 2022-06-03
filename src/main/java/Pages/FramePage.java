package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByShadow;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class FramePage {
    public static final String URL = Urls.FrameURL;
    @FindBy(how = How.XPATH, using = ".//ms-trend")
    private SelenideElement trend;
    @FindBy(how = How.XPATH, using = ".//ms-window")
    private ElementsCollection windows;
    @FindBy(how = How.XPATH, using = ".//ms-colorpicker")
    private ElementsCollection colorButtons;
    @FindBy(how = How.CLASS_NAME, using = "pcr-result")
    private ElementsCollection inputColor;
    @FindBy(how = How.CLASS_NAME, using = "pcr-save")
    private ElementsCollection saveBackgroundColorButton;
    @FindBy(how = How.XPATH, using = ".//ms-combobox")
    private ElementsCollection comboboxes;

    public FramePage clickWidth() {
        $(ByShadow.cssSelector("input", "#\\32 76407")).click();
        return this;
    }

    public FramePage inputWidth() {
        $(ByShadow.cssSelector("input", "#\\32 76407")).setValue("12");
        return this;
    }

    public FramePage winClick() {
        windows.get(1).click();
        return this;
    }

    public FramePage checkFrameWidth() {
        trend.shouldHave(Condition.attribute("style", "box-sizing: border-box; display: flex; overflow: hidden; position: absolute; border-style: solid; border-width: 12px; border-color: gray; z-index: 0; width: 1780px; height: 600px; background-color: rgb(245, 240, 245); opacity: 1; left: 70px; top: 50px; border-radius: 0px;"));
        return this;
    }

    public FramePage clickButtonFrameColor() {
        this.colorButtons.get(0).click();
        return this;
    }

    //Ввод цветового значения
    public FramePage inputFrameColor() {
        this.inputColor.get(0).setValue("#FF0000");
        return this;
    }

    public FramePage clickSaveFrameColor() {
        this.saveBackgroundColorButton.get(0).click();
        return this;
    }

    public FramePage checkFrameColor() {
        trend.shouldHave(Condition.attribute("style", "box-sizing: border-box; display: flex; overflow: hidden; position: absolute; border-style: solid; border-width: 2px; border-color: rgb(255, 1, 1); z-index: 0; width: 1780px; height: 600px; background-color: rgb(245, 240, 245); opacity: 1; left: 70px; top: 50px; border-radius: 0px;"));
        return this;
    }

    public FramePage clickStyle() {
        this.comboboxes.get(0).click();
        return this;
    }

    public FramePage clickStyleSolid() {
        actions().moveToElement(comboboxes.get(0)).sendKeys("Непрерывный").perform();
        actions().moveToElement(comboboxes.get(0)).sendKeys(Keys.ENTER).perform();
        return this;
    }
    public FramePage checkFrameStyleSolid() {
        trend.shouldHave(Condition.attribute("style", "box-sizing: border-box; display: flex; overflow: hidden; position: absolute; border-style: solid; border-width: 2px; border-color: gray; z-index: 0; width: 1780px; height: 600px; background-color: rgb(245, 240, 245); opacity: 1; left: 70px; top: 50px; border-radius: 0px;"));
        return this;
    }

    public FramePage clickStyleDashed() {
        actions().moveToElement(comboboxes.get(0)).sendKeys("Пунктир").perform();
        actions().moveToElement(comboboxes.get(0)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public FramePage checkFrameStyleDashed() {
        trend.shouldHave(Condition.attribute("style", "box-sizing: border-box; display: flex; overflow: hidden; position: absolute; border-style: dashed; border-width: 2px; border-color: gray; z-index: 0; width: 1780px; height: 600px; background-color: rgb(245, 240, 245); opacity: 1; left: 70px; top: 50px; border-radius: 0px;"));
        return this;
    }

    public FramePage clickStyleDotted() {
        actions().moveToElement(comboboxes.get(0)).sendKeys("Точка").perform();
        actions().moveToElement(comboboxes.get(0)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public FramePage checkFrameStyleDotted() {
        trend.shouldHave(Condition.attribute("style", "box-sizing: border-box; display: flex; overflow: hidden; position: absolute; border-style: dotted; border-width: 2px; border-color: gray; z-index: 0; width: 1780px; height: 600px; background-color: rgb(245, 240, 245); opacity: 1; left: 70px; top: 50px; border-radius: 0px;"));
        return this;
    }

    public FramePage clickStyleNo() {
        actions().moveToElement(comboboxes.get(0)).sendKeys("Нет").perform();
        actions().moveToElement(comboboxes.get(0)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public FramePage checkFrameStyleNo() {
        trend.shouldHave(Condition.attribute("style", "box-sizing: border-box; display: flex; overflow: hidden; position: absolute; border-style: hidden; border-width: 2px; border-color: gray; z-index: 0; width: 1780px; height: 600px; background-color: rgb(245, 240, 245); opacity: 1; left: 70px; top: 50px; border-radius: 0px;"));
        return this;
    }
}
