package test;

import PageForm.MainPage;
import PageForm.SignInPage;
import lombok.extern.java.Log;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.DataManager;
import utils.JsonType;

@Log
public class OnlinerTest extends BaseTest{
    @Test
    public static void test1(){
        log.info("test 1 is running");
        MainPage mainPage=new MainPage();
        Assert.assertEquals(mainPage.isPageOpen(),true,"main page is not opened");
        mainPage.clickBtnSignIn();
        SignInPage signInPage=new SignInPage();
        Assert.assertTrue(signInPage.isPageOpen(),"sign in page is not opened");
        signInPage.submitLogin(DataManager.parseData(JsonType.CREDENTIALS,"login"));
        signInPage.submitPassword(DataManager.parseData(JsonType.CREDENTIALS,"password"));
        signInPage.clickSubmit();



    }
}
