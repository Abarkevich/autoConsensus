package logInCorrectlyTest;


import consensus.components.Initializer;
import core.BaseTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static consensus.components.Initializer.logOutPopup;
import static consensus.components.Initializer.loginPage;

public class LogInCorrectlyTest extends BaseTest {

    @Test
    public void logInCorrectlyTest () {
        loginPage.login("anna.barkevich@spiralscout.com", "Password_001");
        logOutPopup.logOut();

    }
}
