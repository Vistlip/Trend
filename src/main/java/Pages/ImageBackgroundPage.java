package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ImageBackgroundPage {
    public static final String URL = Urls.ImageBackgroundPageURL;

    @FindBy(how = How.XPATH, using = ".//ms-trend")
    private SelenideElement trend;
    @FindBy(how = How.XPATH, using = ".//ms-window")
    private ElementsCollection windows;
    @FindBy(how = How.XPATH, using = ".//ms-combobox")
    private ElementsCollection comboboxes;


    public ImageBackgroundPage clickFormatImage() {
        this.comboboxes.get(0).click();
        return this;
    }

    public ImageBackgroundPage clickChangeImage() {
        this.comboboxes.get(1).click();
        return this;
    }

    public ImageBackgroundPage clickFormatImageNo() {
        actions().moveToElement(comboboxes.get(0)).sendKeys("Нет").perform();
        actions().moveToElement(comboboxes.get(0)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public ImageBackgroundPage clickFormatImageMosaic() {
        actions().moveToElement(comboboxes.get(0)).sendKeys("Мозаика").perform();
        actions().moveToElement(comboboxes.get(0)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public ImageBackgroundPage clickFormatImageFill() {
        actions().moveToElement(comboboxes.get(0)).sendKeys("Заполнение").perform();
        actions().moveToElement(comboboxes.get(0)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public ImageBackgroundPage clickFormatImageCenter() {
        actions().moveToElement(comboboxes.get(0)).sendKeys("Центр").perform();
        actions().moveToElement(comboboxes.get(0)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public ImageBackgroundPage clickChangeImageFirst() {
        actions().moveToElement(comboboxes.get(1)).sendKeys("1").perform();
        actions().moveToElement(comboboxes.get(1)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public ImageBackgroundPage clickChangeImageSecond() {
        actions().moveToElement(comboboxes.get(1)).sendKeys("2").perform();
        actions().moveToElement(comboboxes.get(1)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    public ImageBackgroundPage clickChangeImageThird() {
        actions().moveToElement(comboboxes.get(1)).sendKeys("3").perform();
        actions().moveToElement(comboboxes.get(1)).sendKeys(Keys.ENTER).perform();
        return this;
    }

    //Получения строки стиля тренда
    public String getStyleTrend() {
        return this.trend.getAttribute("style");
    }

    public ImageBackgroundPage windowsClick() {
        this.windows.get(1).click();
        return this;
    }

}
