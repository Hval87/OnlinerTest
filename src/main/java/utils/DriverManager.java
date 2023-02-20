package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.java.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

@Log
public class DriverManager {
    public static final String CHROME = "chrome";
    public static final String FIREFOX = "firefox";
    private static WebDriver driver = null;

    public static WebDriver getDriver() {
        if (driver == null) {
            String browser = DataManager.parseData(JsonType.CONFIG_DATA, Constatnt.BROWSER);

            switch (browser) {
                case CHROME:
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("-incognito");
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case FIREFOX:
                    System.out.println(123);
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                default:
                    log.warning("browser is not defined");
                    throw new RuntimeException("browser is not defined");
            }
            return driver;
        } else
            return driver;
    }
}
