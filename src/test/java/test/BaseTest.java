package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import utils.DataManager;
import utils.DriverManager;
import utils.JsonType;

public class BaseTest {
    private WebDriver driver;
    @BeforeTest
    public void setUp(){
        driver=DriverManager.getDriver();
        System.out.println(driver);
        driver.manage().window().maximize();
        driver.get(DataManager.parseData(JsonType.CONFIG_DATA,"startURL"));
    }
}
