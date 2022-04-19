package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByShadow;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class AppearancePage {
    public static final String URL = Urls.AppearancePageURL;
    @FindBy(how = How.XPATH, using = ".//ms-trend")
    private SelenideElement trend;
    @FindBy(how = How.XPATH, using = ".//ms-textinput")
    private SelenideElement textInput;

    public AppearancePage clickActivityButton() {
        $(ByShadow.cssSelector(".button", "#\\35 8526")).click();
        return page(AppearancePage.class);
    }
    public AppearancePage clickVisibleButton() {
        $(ByShadow.cssSelector(".button", "#\\35 9610")).click();
        return page(AppearancePage.class);
    }
    public AppearancePage inputPrompt() {
        this.textInput.setValue("123");
        return this;
    }

    public String checkActivityTrend() {
        return this.trend.getAttribute("style");
    }
}
