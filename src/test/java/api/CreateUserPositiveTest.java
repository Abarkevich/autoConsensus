package api;

import api.classes.user.CreateUser;
import api.classes.user.CreatedUser;
import api.methods.User;
import core.BaseTest;
import core.components.DisableBrowser;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class CreateUserPositiveTest extends BaseTest {
    User user = new User();

    @DisableBrowser
    @Test
    public void createUserPositiveTest(){
        CreateUser newUser = new CreateUser();
        ArrayList<String> roles = new ArrayList<>();
        roles.add("9330169c-1507-4400-a9fe-247987b79127");
        newUser.setEmail("user1_ab01@gmail.com");
        newUser.setPassword("Password_01!");
        newUser.setFirstName("Auto1");
        newUser.setLastName("Test1");
        newUser.setPhoneNumber("12345678");
        newUser.setRoleUuid(roles);
        newUser.setGroupUuid("");

        CreatedUser createdUser = user.create(newUser);
        System.out.println(createdUser.getDisplayName() + "!!!!!!!!!");
    }
}
