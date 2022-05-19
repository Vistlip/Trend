package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.selector.ByShadow;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {
    public static final String URL = Urls.MainPageURL;

    @FindBy(how = How.XPATH, using = ".//ms-togglebutton")
    private ElementsCollection buttons;


    public MainPage(){}

    public MainPage clickPropertyDynamization() {
        $(ByShadow.cssSelector(".button", "#\\36 0406")).click();
        return  page(MainPage.class);
    }

    public MainPage checkVisibleButton() {
        $(ByShadow.cssSelector(".button", "#\\36 0406")).shouldBe(Condition.visible);
        return  page(MainPage.class);
    }
}
