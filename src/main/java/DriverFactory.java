import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.remote.MobileCapabilityType.APP;

public class DriverFactory {
    // Объявляем переменную для драйвера
    AndroidDriver<?> driver;

    // Метод для настройки драйвера
    public AndroidDriver<?> setUp() throws MalformedURLException {
        // Создаем экземпляр DesiredCapabilities для настройки драйвера
        DesiredCapabilities capabilities = new DesiredCapabilities();
        // Устанавливаем платформу на Android
        capabilities.setCapability("platformName", "ANDROID");
        // Устанавливаем путь к приложению
        capabilities.setCapability(APP, "/Users/iljad/Downloads/ZOOM.apk");
        // Устанавливаем удаленный URL для подключения к Appium серверу
        URL remoteURL = new URL("http://localhost:4723/wd/hub");

        // Инициализируем AndroidDriver с настройками capabilities и remoteURL
        driver = new AndroidDriver<>(remoteURL, capabilities);
        // Устанавливаем неявное ожидание
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Возвращаем инициализированный драйвер
        return driver;
    }
}

