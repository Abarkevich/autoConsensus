package api;

import api.classes.user.Credentials;
import api.classes.user.Token;
import api.methods.User;
import core.BaseTest;
import core.components.DisableBrowser;
import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

import static core.constants.ConfigProperties.API_URL;

public class VerifyTokenTest extends BaseTest {
    User user = new User();
    String uuid = "7a2d86e8-d3ba-471c-a839-1aae721b7472";

    @DisableBrowser
    @Test
    public void verifyTokenTest(){
        Credentials credentials = new Credentials();
        credentials.setUsername("barkevichanna92@gmail.com");
        credentials.setPassword("Password_01!");
        RestAssured.baseURI = System.getProperty(API_URL);

        Token authenticationToken = user.login(credentials);
        Token tokenToVerify = user.verifyToken(authenticationToken, uuid);
        Assert.assertEquals(authenticationToken.getToken(),tokenToVerify.getToken());
    }
}
