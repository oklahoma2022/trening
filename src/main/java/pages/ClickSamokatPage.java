package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickSamokatPage {

    //Подкючаемся
    private WebDriver driver;

    //создаем локатары кнопки
    private By logoSamokat= By.className("Header_LogoScooter__3lsAR");

    //Проверяем на странице  текст "самокат" чтобы понять на той ли мы странице"
   private By textSamokat = By.xpath(".//div[text()='Самокат ']");

    public ClickSamokatPage(WebDriver driver) {
        this.driver = driver;
    }

    //метод который кликает по логотипу  и проверяет наличие ссылки
    public void clickSamokat(){
        driver.findElement(logoSamokat).click();
    }

   public String textSamokatSend(){
        return driver.findElement(textSamokat).getText();
   }


}
