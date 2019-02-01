package api;

import api.classes.user.CreatedUser;
import api.classes.user.NewCredentialsSignUp;
import api.methods.User;
import core.BaseTest;
import core.components.DisableBrowser;
import org.testng.annotations.Test;

public class SignUpPositiveTest extends BaseTest {
    User user = new User();


    @DisableBrowser
    @Test
    public void signUpPositiveTest(){
        NewCredentialsSignUp  newUser = new NewCredentialsSignUp();
        newUser.setEmail("ann_01@qa.com");
        newUser.setPassword("Password_01!");
        newUser.setFirstName("Ann");
        newUser.setLastName("Auto_1");
        newUser.setGroupName("Spiral Scout Auto");

        CreatedUser newCredentialsSignUp = user.signUp(newUser);
        System.out.println(newCredentialsSignUp.getUuid() + " UUID " + newCredentialsSignUp.getEmail() + " Email");

        }
}
