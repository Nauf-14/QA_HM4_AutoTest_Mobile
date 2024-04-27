import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

public class ModuleHW4 {
    // Создаем экземпляр класса DriverFactory для управления драйвером Appium
    private final DriverFactory driverFactory = new DriverFactory();
    // Объявляем AndroidDriver как тип драйвера для мобильных устройств
    private AndroidDriver<?> driver;

    // Аннотации @AndroidFindBy используются для идентификации элементов пользовательского интерфейса по их атрибутам
    // и связывания их с переменными класса
    @AndroidFindBy(id = "btnJoinConf")
    MobileElement btnJoinConf;

    @AndroidFindBy(id = "txtTitle")
    MobileElement txtTitle;

    @AndroidFindBy(id = "btnBack")
    MobileElement btnBack;

    @AndroidFindBy(id = "panelConfNumber")
    MobileElement panelConfNumber;

    @AndroidFindBy(id = "btnGotoVanityUrl")
    MobileElement btnGotoVanityUrl;

    @AndroidFindBy(id = "panelScreenName")
    MobileElement panelScreenName;

    // Метод для настройки драйвера перед выполнением тестов
    @Before
    public void setDriver() throws MalformedURLException {
        // Инициализируем драйвер с помощью метода setUp() из класса DriverFactory
        driver = driverFactory.setUp();
        // Инициализируем элементы страницы с помощью PageFactory и AppiumFieldDecorator
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // Метод для выполнения теста
    @Test
    public void homeTest() throws InterruptedException {
        // Приостанавливаем выполнение теста на 2 секунды
        Thread.sleep(2000);

        // Выполняем действия на элементах интерфейса: нажимаем на кнопку btnJoinConf,
        // проверяем отображение других элементов
        btnJoinConf.click();
        txtTitle.isDisplayed();
        btnBack.isDisplayed();
        panelConfNumber.isDisplayed();
        btnGotoVanityUrl.isDisplayed();
        panelScreenName.isDisplayed();

        // Находим и проверяем отображение других элементов интерфейса
        MobileElement joinButton = (MobileElement) driver.findElementById("btnJoin");
        MobileElement linkText = (MobileElement) driver.findElementByAndroidUIAutomator("textContains(\"tap on the link to join the meeting\")");
        MobileElement optionsTitle = (MobileElement) driver.findElementByAndroidUIAutomator("textContains(\"JOIN OPTIONS\")");
        MobileElement optionNoAudio = (MobileElement) driver.findElementByAndroidUIAutomator("textContains(\"Don't Connect To Audio\")");
        MobileElement chkNoAudio = (MobileElement) driver.findElementById("chkNoAudio");

        joinButton.isDisplayed();
        linkText.isDisplayed();
        optionsTitle.isDisplayed();
        optionNoAudio.isDisplayed();
        chkNoAudio.isDisplayed();
    }

    // Метод для завершения работы теста
    @After
    public void tearDown() {
        // Закрываем драйвер после выполнения всех тестов
        driver.quit();
    }
}

