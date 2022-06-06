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

public class LocationTrendPage {
    public static final String URL = Urls.LocationTrendURL;
    @FindBy(how = How.XPATH, using = ".//ms-trend")
    private SelenideElement trend;
    @FindBy(how = How.XPATH, using = ".//ms-window")
    private ElementsCollection windows;
    @FindBy(how = How.XPATH, using = ".//ms-numericupdown")
    private ElementsCollection numericupdown;
    String inputOrderZ = "#\\32 76560";
    String inputWidth = "#\\32 76576";
    String inputHeight = "#\\32 76592";
    String inputX = "#\\32 76608";
    String inputY = "#\\32 76624";


    public LocationTrendPage winClick() {
        windows.get(1).click();
        return this;
    }

    public LocationTrendPage clickOrderZ() {
        $(ByShadow.cssSelector("input", inputOrderZ)).click();
        return this;
    }

    public LocationTrendPage inputOrderZ() {
        $(ByShadow.cssSelector("input", inputOrderZ)).setValue("0");
        return this;
    }

    public LocationTrendPage checkOrderZ() {
        trend.shouldHave(Condition.attribute("style", "box-sizing: border-box; display: flex; overflow: hidden; position: absolute; border-style: solid; border-width: 2px; border-color: gray; z-index: 0; width: 670px; height: 470px; background-color: rgb(245, 240, 245); opacity: 1; left: 620px; top: 80px; border-radius: 0px;"));
        return this;
    }

    public LocationTrendPage clickWidth() {
        $(ByShadow.cssSelector("input", inputWidth)).click();
        return this;
    }

    public LocationTrendPage inputWidth() {
        actions().moveToElement(numericupdown.get(1)).sendKeys(Keys.DELETE).perform();
        actions().moveToElement(numericupdown.get(1)).sendKeys(Keys.DELETE).perform();
        actions().moveToElement(numericupdown.get(1)).sendKeys(Keys.BACK_SPACE).perform();
        actions().moveToElement(numericupdown.get(1)).sendKeys("700").perform();
        return this;
    }

    public LocationTrendPage checkWidth() {
        trend.shouldHave(Condition.attribute("style", "box-sizing: border-box; display: flex; overflow: hidden; position: absolute; border-style: solid; border-width: 2px; border-color: gray; z-index: 1; width: 700px; height: 470px; background-color: rgb(245, 240, 245); opacity: 1; left: 620px; top: 80px; border-radius: 0px;"));
        return this;
    }

    public LocationTrendPage clickHeight() {
        $(ByShadow.cssSelector("input", inputHeight)).click();
        return this;
    }

    public LocationTrendPage inputHeight() {
        actions().moveToElement(numericupdown.get(2)).sendKeys(Keys.DELETE).perform();
        actions().moveToElement(numericupdown.get(2)).sendKeys(Keys.DELETE).perform();
        actions().moveToElement(numericupdown.get(2)).sendKeys(Keys.BACK_SPACE).perform();
        actions().moveToElement(numericupdown.get(2)).sendKeys("500").perform();
        return this;
    }

    public LocationTrendPage checkHeight() {
        trend.shouldHave(Condition.attribute("style", "box-sizing: border-box; display: flex; overflow: hidden; position: absolute; border-style: solid; border-width: 2px; border-color: gray; z-index: 1; width: 670px; height: 500px; background-color: rgb(245, 240, 245); opacity: 1; left: 620px; top: 80px; border-radius: 0px;"));
        return this;
    }

    public LocationTrendPage clickInputX() {
        $(ByShadow.cssSelector("input", inputX)).click();
        return this;
    }

    public LocationTrendPage inputInputX() {
        actions().moveToElement(numericupdown.get(3)).sendKeys(Keys.DELETE).perform();
        actions().moveToElement(numericupdown.get(3)).sendKeys(Keys.DELETE).perform();
        actions().moveToElement(numericupdown.get(3)).sendKeys(Keys.BACK_SPACE).perform();
        actions().moveToElement(numericupdown.get(3)).sendKeys("600").perform();
        return this;
    }

    public LocationTrendPage checkLocationX() {
        trend.shouldHave(Condition.attribute("style", "box-sizing: border-box; display: flex; overflow: hidden; position: absolute; border-style: solid; border-width: 2px; border-color: gray; z-index: 1; width: 670px; height: 470px; background-color: rgb(245, 240, 245); opacity: 1; left: 600px; top: 80px; border-radius: 0px;"));
        return this;
    }

    public LocationTrendPage clickInputY() {
        $(ByShadow.cssSelector("input", inputY)).click();
        return this;
    }

    public LocationTrendPage inputInputY() {
        actions().moveToElement(numericupdown.get(4)).sendKeys(Keys.DELETE).perform();
        actions().moveToElement(numericupdown.get(4)).sendKeys(Keys.DELETE).perform();
        actions().moveToElement(numericupdown.get(4)).sendKeys(Keys.BACK_SPACE).perform();
        actions().moveToElement(numericupdown.get(4)).sendKeys("100").perform();
        return this;
    }

    public LocationTrendPage checkLocationY() {
        trend.shouldHave(Condition.attribute("style", "box-sizing: border-box; display: flex; overflow: hidden; position: absolute; border-style: solid; border-width: 2px; border-color: gray; z-index: 1; width: 670px; height: 470px; background-color: rgb(245, 240, 245); opacity: 1; left: 620px; top: 100px; border-radius: 0px;"));
        return this;
    }
}
