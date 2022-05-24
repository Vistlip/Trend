package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByShadow;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class CategoriesPage {
    public static final String URL = Urls.CategoriesPageURL;

    @FindBy(how = How.XPATH, using = ".//ms-togglebutton")
    private ElementsCollection buttons;
    @FindBy(how = How.XPATH, using = ".//ms-text")
    private SelenideElement CategoriesText;


    public void DynamizationPage(){}
    //Селектор кнопки на главное окно
    public CategoriesPage clickMainPage() {
        $(ByShadow.cssSelector(".button", "#\\36 0443")).click();
        return page(CategoriesPage.class);
    }
    //Селектор кнопки Внешний вид
    public CategoriesPage clickAppearancePage() {
        $(ByShadow.cssSelector(".button", "#\\35 9470")).click();
        return page(CategoriesPage.class);
    }
    //Селектор кнопки График
    public CategoriesPage clickGraphPage() {
        $(ByShadow.cssSelector(".button", "#\\36 2478")).click();
        return page(CategoriesPage.class);
    }
    //Селектор кнопки Текст
    public CategoriesPage clickTextPage() {
        $(ByShadow.cssSelector(".button", "#\\37 5741")).click();
        return page(CategoriesPage.class);
    }

    public CategoriesPage clickAxisYPage() {
        $(ByShadow.cssSelector(".button", "#\\37 2795")).click();
        return page(CategoriesPage.class);
    }

    public CategoriesPage clickKeyboardPage() {
        $(ByShadow.cssSelector(".button", "#\\32 69732")).click();
        return page(CategoriesPage.class);
    }

    public CategoriesPage clickCursorPage() {
        $(ByShadow.cssSelector(".button", "#\\37 1565")).click();
        return page(CategoriesPage.class);
    }

    public CategoriesPage clickTransformationPage() {
        $(ByShadow.cssSelector(".button", "#\\32 69835")).click();
        return page(CategoriesPage.class);
    }

    public CategoriesPage clickLayoutPage() {
        $(ByShadow.cssSelector(".button", "#\\36 8668")).click();
        return page(CategoriesPage.class);
    }



    public CategoriesPage checkVisibleCategoriesText () {
        this.CategoriesText.shouldBe(Condition.visible);
        return this;
    }
}
