package api;

import api.classes.user.Credentials;
import api.methods.User;
import core.BaseTest;
import core.components.DisableBrowser;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static core.constants.ConfigProperties.API_URL;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertNotNull;

public class LoginPositiveTest extends BaseTest {
    User user = new User();

    @DisableBrowser
    @Test
    public void loginPositiveTest() {
        Credentials credentials = new Credentials();
        credentials.setUsername("anna.barkevich@spiralscout.com");
        credentials.setPassword("Password_07!!");
        RestAssured.baseURI = System.getProperty(API_URL);
        user.login(credentials);
    }
}
