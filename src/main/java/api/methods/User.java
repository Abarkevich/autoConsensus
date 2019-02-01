package api.methods;

import api.classes.user.*;
import io.restassured.RestAssured;

import static core.constants.ConfigProperties.API_URL;
import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertNotNull;

public class User {

    public CreatedUser create(CreateUser user) {
        RestAssured.baseURI = System.getProperty(API_URL);


        return given()
                .accept("application/json")
                .contentType("application/json")
                .body(user)
                .expect()
                .statusCode(200)
                .when()
                .post("credentials/createUser")
                .then()
                .log().all()
                .extract()
                .body().as(CreatedUser.class);
    }

    public Token login(Credentials credentials) {
        RestAssured.baseURI = System.getProperty(API_URL);
        Token token = given()
                .accept("application/json")
                .contentType("application/json")
                .body(credentials)
                .expect()
                .statusCode(200)
                .when()
                .post("/credentials/login")
                .then()
                .log().all()
                .extract()
                .body().as(Token.class);

        assertNotNull(token.getToken());
        return token;
    }

    public Token verifyToken(Token token, String uuid) {
        RestAssured.baseURI = System.getProperty(API_URL);
        Token result = given()
                .auth()
                .oauth2(token.getToken())
                .param("uuid", uuid)
                .contentType("application/json")
                .expect()
                .statusCode(200)
                .when()
                .get("/credentials/verifyToken")
                .then()
                .log().all()
                .extract()
                .body().as(Token.class);
        assertNotNull(result.getToken());
        return result;
    }

    public CreatedUser signUp (NewCredentialsSignUp user){
        RestAssured.baseURI = System.getProperty(API_URL);
        return given()
                .accept("application/json")
                .contentType("application/json")
                .body(user)
                .expect()
                .statusCode(200)
                .when()
                .post("/credentials/SignUp")
                .then()
                .log().all()
                .extract()
                .body().as(CreatedUser.class);
    }

}
