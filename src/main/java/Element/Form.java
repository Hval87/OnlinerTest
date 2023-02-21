package Element;

import lombok.extern.java.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utils.DriverManager;

@Log
public class Form  extends BaseElement{
    private  By locator;
    private  String name;

    public Form(By uniqueLocator, String name) {
        super(uniqueLocator, name);
        locator=uniqueLocator;
        this.name=name;
    }

    public void submitText(String text){
        System.out.println(locator.toString());
        DriverManager.getDriver().findElement(locator).sendKeys(text);
        log.info(String.format("form %s is submited",name));
    }

    public void clearText(String text){
        DriverManager.getDriver().findElement(locator).clear();
        log.info(String.format("form %s is cleared",name));
    }

}
