import constans.url;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.ClickSamokatPage;
import static org.junit.Assert.assertEquals;


public class ClickSamokatTest {
    //переменные для использования драйвера
    private WebDriver driverChrome;
    private WebDriver driverFirefox;

    @Test
    public void checkOpenMainPage() {
        driverChrome = new ChromeDriver();
        driverFirefox = new FirefoxDriver();

        this.testMain(driverChrome);
        this.testMain(driverFirefox);
    }

    public void testMain(WebDriver driver) {
        //открываю сайт через константу
        driver.get(url.ORDER_URL);
        // Создаю экземпляр класса  клика на самокат чтобы могла юзать его данные
        ClickSamokatPage clickSamokatPage = new ClickSamokatPage(driver);
        //Кликаем  на лого
        clickSamokatPage.clickSamokat();
        // Проверяб наличие текста
      String text = clickSamokatPage.textSamokatSend();
        //Сравниваю что мне ндо с тем что получила
     assertEquals(text, "Самокат\n" +
                "на пару дней\n" +
                "Привезём его прямо к вашей двери,\n" +
                "а когда накатаетесь — заберём");
    }

    @After
    public void teardown() {
        driverChrome.quit();
        driverFirefox.quit();
        // Закрываю браузеры   по очереди
    }

}
