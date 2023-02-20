package PageForm;

import Element.Button;
import lombok.extern.java.Log;
import org.openqa.selenium.By;

@Log
public class MainPage extends BasePage {
    private static final By uniqueLocator=By.xpath("//div[@class='b-news-layer']");
    private static final String name="onliner main page";
    private static final Button btnSignIn=new Button(By.xpath("//div[contains(@class,'auth-bar')and contains(@class,'item--text')]"),"sign in button");

    public MainPage() {
        super(uniqueLocator, name);
    }

    public static void clickBtnSignIn(){
        btnSignIn.click();
    }

}
