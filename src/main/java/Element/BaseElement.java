package Element;

import org.openqa.selenium.By;
import utils.DriverManager;

public class BaseElement {
    private By uniqueLocator;
    private String name;

    public BaseElement(By uniqueLocator, String name) {
        this.uniqueLocator = uniqueLocator;
        this.name = name;
    }

    public boolean isDisplay() {
        if (DriverManager.getDriver().findElement(uniqueLocator).isDisplayed()) {
            return true;
        } else
            return false;
    }

    public void click(){
        DriverManager.getDriver().findElement(uniqueLocator).click();
    }

}
