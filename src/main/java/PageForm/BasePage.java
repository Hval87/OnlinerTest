package PageForm;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverManager;

import java.time.Duration;

public class BasePage {
    private By uniqueLocator;
    private String name;

    public BasePage(By uniqueLocator, String name) {
        this.uniqueLocator = uniqueLocator;
        this.name = name;
    }
    public boolean isPageOpen(){
      if(DriverManager.getDriver().findElement(uniqueLocator)!=null){
          return true;
      }
      else return false;
    }
}
