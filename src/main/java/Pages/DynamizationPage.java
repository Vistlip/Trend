package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByShadow;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class DynamizationPage {
    public static final String URL = Urls.DynamizationPageURL;

    @FindBy(how = How.XPATH, using = ".//ms-togglebutton")
    private ElementsCollection buttons;
    @FindBy(how = How.XPATH, using = ".//ms-text")
    private SelenideElement CategoriesText;


    public DynamizationPage(){}
    //Селектор кнопки на главное окно
    public DynamizationPage clickMainPage() {
        $(ByShadow.cssSelector(".button", "#\\36 0443")).click();
        return page(DynamizationPage.class);
    }
    //Селектор кнопки Внешний вид
    public DynamizationPage clickAppearancePage() {
        $(ByShadow.cssSelector(".button", "#\\35 9470")).click();
        return page(DynamizationPage.class);
    }
    //Селектор кнопки График
    public DynamizationPage clickGraphPage() {
        $(ByShadow.cssSelector(".button", "#\\36 2478")).click();
        return page(DynamizationPage.class);
    }
    //Селектор кнопки Текст
    public DynamizationPage clickTextPage() {
        $(ByShadow.cssSelector(".button", "#\\37 5741")).click();
        return page(DynamizationPage.class);
    }

    public DynamizationPage clickAxisYPage() {
        $(ByShadow.cssSelector(".button", "#\\37 2795")).click();
        return page(DynamizationPage.class);
    }

    public DynamizationPage clickKeyboardPage() {
        $(ByShadow.cssSelector(".button", "#\\32 69732")).click();
        return page(DynamizationPage.class);
    }

    public DynamizationPage clickCursorPage() {
        $(ByShadow.cssSelector(".button", "#\\37 1565")).click();
        return page(DynamizationPage.class);
    }

    public DynamizationPage clickTransformationPage() {
        $(ByShadow.cssSelector(".button", "#\\32 69835")).click();
        return page(DynamizationPage.class);
    }

    public DynamizationPage clickLayoutPage() {
        $(ByShadow.cssSelector(".button", "#\\36 8668")).click();
        return page(DynamizationPage.class);
    }



    public DynamizationPage checkVisibleCategoriesText () {
        this.CategoriesText.shouldBe(Condition.visible);
        return this;
    }
}
