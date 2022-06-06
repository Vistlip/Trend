package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.actions;

public class AlignmentTrendPage {
    public static final String URL = Urls.AlignmentTrendURL;
    @FindBy(how = How.XPATH, using = ".//ms-trend")
    private ElementsCollection trend;
    @FindBy(how = How.XPATH, using = ".//ms-window")
    private ElementsCollection windows;
    @FindBy(how = How.XPATH, using = ".//ms-combobox")
    private ElementsCollection combobox;

    public AlignmentTrendPage winClick() {
        windows.get(1).click();
        return this;
    }

    public AlignmentTrendPage clickVerticalAlignment() {
        combobox.get(0).click();
        return this;
    }

    public AlignmentTrendPage inputVerticalAlignmentUp() {
        actions().moveToElement(combobox.get(0)).sendKeys("Верх").perform();
        actions().moveToElement(combobox.get(0)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public AlignmentTrendPage checkVerticalAlignmentUp() {
        trend.get(0).shouldHave(Condition.attribute("style", "flex-grow: 1;position: static;display: flex;min-width: 400px;box-sizing: border-box;overflow: hidden;border-style: solid;border-width: 2px;border-color: gray;z-index: 0;width: 400px;height: 300px;left: 130px;top: 290px;background-color: rgb(245, 240, 245);opacity: 1;border-radius: 0px;"));
        return this;
    }

    public AlignmentTrendPage inputVerticalAlignmentCenter() {
        actions().moveToElement(combobox.get(0)).sendKeys("Центр").perform();
        actions().moveToElement(combobox.get(0)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public AlignmentTrendPage checkVerticalAlignmentCenter() {
        trend.get(0).shouldHave(Condition.attribute("style", "flex-grow: 1;position: static;display: flex;min-width: 400px;box-sizing: border-box;overflow: hidden;border-style: solid;border-width: 2px;border-color: gray;z-index: 0;width: 400px;height: 300px;left: 130px;top: 290px;background-color: rgb(245, 240, 245);opacity: 1;border-radius: 0px;"));
        return this;
    }

    public AlignmentTrendPage inputVerticalAlignmentDown() {
        actions().moveToElement(combobox.get(0)).sendKeys("Низ").perform();
        actions().moveToElement(combobox.get(0)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public AlignmentTrendPage checkVerticalAlignmentDown() {
        trend.get(0).shouldHave(Condition.attribute("style", "flex-grow: 1;position: static;display: flex;min-width: 400px;box-sizing: border-box;overflow: hidden;border-style: solid;border-width: 2px;border-color: gray;z-index: 0;width: 400px;height: 300px;left: 130px;top: 290px;background-color: rgb(245, 240, 245);opacity: 1;border-radius: 0px;"));
        return this;
    }

    public AlignmentTrendPage clickHorizontalAlignment() {
        combobox.get(1).click();
        return this;
    }

    public AlignmentTrendPage inputHorizontalAlignmentLeft() {
        actions().moveToElement(combobox.get(1)).sendKeys("Лево").perform();
        actions().moveToElement(combobox.get(1)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public AlignmentTrendPage checkHorizontalAlignmentLeft() {
        trend.get(1).shouldHave(Condition.attribute("style", "position: static; display: flex; min-width: 400px; box-sizing: border-box; overflow: hidden; border-style: solid; border-width: 2px; border-color: gray; z-index: 0; width: 400px; height: 300px; left: 980px; top: 140px; align-self: flex-start; background-color: rgb(245, 240, 245); opacity: 1; border-radius: 0px;"));
        return this;
    }

    public AlignmentTrendPage inputHorizontalAlignmentCenter() {
        actions().moveToElement(combobox.get(1)).sendKeys("Центр").perform();
        actions().moveToElement(combobox.get(1)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public AlignmentTrendPage checkHorizontalAlignmentCenter() {
        trend.get(1).shouldHave(Condition.attribute("style", "position: static; display: flex; min-width: 400px; box-sizing: border-box; overflow: hidden; border-style: solid; border-width: 2px; border-color: gray; z-index: 0; width: 400px; height: 300px; left: 980px; top: 140px; align-self: center; background-color: rgb(245, 240, 245); opacity: 1; border-radius: 0px;"));
        return this;
    }

    public AlignmentTrendPage inputHorizontalAlignmentRight() {
        actions().moveToElement(combobox.get(1)).sendKeys("Право").perform();
        actions().moveToElement(combobox.get(1)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public AlignmentTrendPage checkHorizontalAlignmentRight() {
        trend.get(1).shouldHave(Condition.attribute("style", "position: static; display: flex; min-width: 400px; box-sizing: border-box; overflow: hidden; border-style: solid; border-width: 2px; border-color: gray; z-index: 0; width: 400px; height: 300px; left: 980px; top: 140px; align-self: flex-end; background-color: rgb(245, 240, 245); opacity: 1; border-radius: 0px;"));
        return this;
    }
}
