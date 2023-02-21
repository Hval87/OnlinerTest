package PageForm;

import Element.Button;
import Element.Form;
import org.openqa.selenium.By;
import utils.DriverManager;

public class SignInPage extends BasePage {
    private static final   By uniqueLocator=By.xpath("//div[@class='auth-form']");
    private static final String name="sign in page";
    private static  Form loginForm=new Form(By.xpath("//input[@type='text' and contains(@class,'auth-input')]"),"input login");
    private static  Form passwordForm=new Form(By.xpath("//input[@type='password' and contains(@class,'auth-input')]"),"input password");
    private static Button btnSubmit=new Button(By.xpath("//button[contains(@class,'auth-button')]"),"submit button");

    public SignInPage() {
        super(uniqueLocator, name);
    }

    public void submitLogin(String login){
        loginForm.submitText(login);
    }

    public void submitPassword(String password){
        passwordForm.submitText(password);
    }
    public void clickSubmit(){
        btnSubmit.click();
    }
}
