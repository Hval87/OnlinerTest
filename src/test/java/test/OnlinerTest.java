package test;

import PageForm.MainPage;
import lombok.extern.java.Log;
import org.junit.Assert;
import org.testng.annotations.Test;
@Log
public class OnlinerTest extends BaseTest{
    @Test
    public static void test1(){
        log.info("test 1 is running");
        MainPage mainPage=new MainPage();
        Assert.assertTrue(mainPage.isPageOpen());
        mainPage.clickBtnSignIn();
    }
}
