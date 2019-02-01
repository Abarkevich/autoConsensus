package example;

import consensus.components.Initializer;
import core.BaseTest;
import core.utilities.Sleeper;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ExampleTest extends BaseTest{
    @Test
    public void test(){
        Initializer.loginPage.login("anna.barkevich@spiralscout.com", "Password_07!!");
        Sleeper.sleepInSeconds(3);
        Initializer.logOutPopup.logOut();
    }
}
