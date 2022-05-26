import Pages.ImageBackgroundPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;


public class TrendImageTest {
    int pause = 500;
    @Test
    @DisplayName("Проверка замостка 'Заполнение' и 1 изображение")
    public void checkChangeImageFirstAndBGFill() throws InterruptedException {
        String page = open(ImageBackgroundPage.URL, ImageBackgroundPage.class)
                .clickChangeImage()
                .clickChangeImageSecond()
                .clickChangeImageFirst()
                .getStyleTrend();
        System.out.println(page);
        String[] arrActivity = page.split(";");
        assertEquals(" background-repeat: no-repeat", arrActivity[15]);
        assertEquals(" background-size: 100% 100%", arrActivity[16]);
        assertEquals(" background-image: url(\"resources/1.jpg\")", arrActivity[17]);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка замостка 'Заполнение' и 2 изображение")
    public void checkChangeImageSecondAndBGFill() throws InterruptedException {
        String page = open(ImageBackgroundPage.URL, ImageBackgroundPage.class)
                .clickChangeImage()
                .clickChangeImageSecond()
                .getStyleTrend();
        System.out.println(page);
        String[] arrActivity = page.split(";");
        assertEquals(" background-repeat: no-repeat", arrActivity[15]);
        assertEquals(" background-size: 100% 100%", arrActivity[16]);
        assertEquals(" background-image: url(\"resources/2.jpg\")", arrActivity[17]);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка замостка 'Заполнение' и 3 изображение")
    public void checkChangeImageThirdAndBGFill() throws InterruptedException {
        String page = open(ImageBackgroundPage.URL, ImageBackgroundPage.class)
                .clickChangeImage()
                .clickChangeImageThird()
                .getStyleTrend();
        System.out.println(page);
        String[] arrActivity = page.split(";");
        assertEquals(" background-repeat: no-repeat", arrActivity[15]);
        assertEquals(" background-size: 100% 100%", arrActivity[16]);
        assertEquals(" background-image: url(\"resources/3.jpg\")", arrActivity[17]);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка замостка 'Нет' и 1 изображение")
    public void checkChangeImageFirstAndBGNo() throws InterruptedException {
        String page = open(ImageBackgroundPage.URL, ImageBackgroundPage.class)
                .clickFormatImage()
                .clickFormatImageNo()
                .clickChangeImage()
                .clickChangeImageSecond()
                .clickChangeImageFirst()
                .getStyleTrend();
        System.out.println(page);
        String[] arrActivity = page.split(";");
        assertEquals(" background-repeat: no-repeat", arrActivity[15]);
        assertEquals(" background-size: 100% 100%", arrActivity[16]);
        assertEquals(" background-image: url(\"resources/1.jpg\")", arrActivity[17]);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка замостка 'Нет' и 2 изображение")
    public void checkChangeImageSecondAndBGNo() throws InterruptedException {
        String page = open(ImageBackgroundPage.URL, ImageBackgroundPage.class)
                .clickFormatImage()
                .clickFormatImageNo()
                .clickChangeImage()
                .clickChangeImageSecond()
                .getStyleTrend();
        System.out.println(page);
        String[] arrActivity = page.split(";");
        assertEquals(" background-repeat: no-repeat", arrActivity[15]);
        assertEquals(" background-size: 100% 100%", arrActivity[16]);
        assertEquals(" background-image: url(\"resources/2.jpg\")", arrActivity[17]);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка замостка 'Нет' и 3 изображение")
    public void checkChangeImageThirdAndBGNo() throws InterruptedException {
        String page = open(ImageBackgroundPage.URL, ImageBackgroundPage.class)
                .clickFormatImage()
                .clickFormatImageNo()
                .clickChangeImage()
                .clickChangeImageThird()
                .getStyleTrend();
        System.out.println(page);
        String[] arrActivity = page.split(";");
        assertEquals(" background-repeat: no-repeat", arrActivity[15]);
        assertEquals(" background-size: 100% 100%", arrActivity[16]);
        assertEquals(" background-image: url(\"resources/3.jpg\")", arrActivity[17]);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка замостка 'Мозайка' и 1 изображение")
    public void checkChangeImageFirstAndMosaic() throws InterruptedException {
        String page = open(ImageBackgroundPage.URL, ImageBackgroundPage.class)
                .clickFormatImage()
                .clickFormatImageMosaic()
                .clickChangeImage()
                .clickChangeImageSecond()
                .clickChangeImageFirst()
                .getStyleTrend();
        System.out.println(page);
        String[] arrActivity = page.split(";");
        assertEquals(" background-repeat: repeat", arrActivity[15]);
        assertEquals(" background-image: url(\"resources/1.jpg\")", arrActivity[16]);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка замостка 'Мозайка' и 2 изображение")
    public void checkChangeImageSecondAndBGMosaic() throws InterruptedException {
        String page = open(ImageBackgroundPage.URL, ImageBackgroundPage.class)
                .clickFormatImage()
                .clickFormatImageMosaic()
                .clickChangeImage()
                .clickChangeImageSecond()
                .getStyleTrend();
        System.out.println(page);
        String[] arrActivity = page.split(";");
        assertEquals(" background-repeat: repeat", arrActivity[15]);
        assertEquals(" background-image: url(\"resources/2.jpg\")", arrActivity[16]);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка замостка 'Мозайка' и 3 изображение")
    public void checkChangeImageThirdAndBGMosaic() throws InterruptedException {
        String page = open(ImageBackgroundPage.URL, ImageBackgroundPage.class)
                .clickFormatImage()
                .clickFormatImageMosaic()
                .clickChangeImage()
                .clickChangeImageThird()
                .getStyleTrend();
        System.out.println(page);
        String[] arrActivity = page.split(";");
        assertEquals(" background-repeat: repeat", arrActivity[15]);
        assertEquals(" background-image: url(\"resources/3.jpg\")", arrActivity[16]);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка замостка 'Центр' и 1 изображение")
    public void checkChangeImageFirstAndBGCenter() throws InterruptedException {
        String page = open(ImageBackgroundPage.URL, ImageBackgroundPage.class)
                .clickFormatImage()
                .clickFormatImageCenter()
                .clickChangeImage()
                .clickChangeImageSecond()
                .clickChangeImageFirst()
                .getStyleTrend();
        System.out.println(page);
        String[] arrActivity = page.split(";");
        assertEquals(" background-repeat: no-repeat", arrActivity[15]);
        assertEquals(" background-image: url(\"resources/1.jpg\")", arrActivity[16]);
        assertEquals(" background-position: center center", arrActivity[17]);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка замостка 'Центр' и 2 изображение")
    public void checkChangeImageSecondAndBGCenter() throws InterruptedException {
        String page = open(ImageBackgroundPage.URL, ImageBackgroundPage.class)
                .clickFormatImage()
                .clickFormatImageCenter()
                .clickChangeImage()
                .clickChangeImageSecond()
                .getStyleTrend();
        System.out.println(page);
        String[] arrActivity = page.split(";");
        assertEquals(" background-repeat: no-repeat", arrActivity[15]);
        assertEquals(" background-image: url(\"resources/2.jpg\")", arrActivity[16]);
        assertEquals(" background-position: center center", arrActivity[17]);
        Thread.sleep(pause);
    }

    @Test
    @DisplayName("Проверка замостка 'Центр' и 3 изображение")
    public void checkChangeImageThirdAndBGCenter() throws InterruptedException {
        String page = open(ImageBackgroundPage.URL, ImageBackgroundPage.class)
                .clickFormatImage()
                .clickFormatImageCenter()
                .clickChangeImage()
                .clickChangeImageThird()
                .getStyleTrend();
        System.out.println(page);
        String[] arrActivity = page.split(";");
        assertEquals(" background-repeat: no-repeat", arrActivity[15]);
        assertEquals(" background-image: url(\"resources/3.jpg\")", arrActivity[16]);
        assertEquals(" background-position: center center", arrActivity[17]);
        Thread.sleep(pause);
    }
}
