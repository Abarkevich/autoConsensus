package consensus.components;

import consensus.components.loginPage.LoginPage;


public class Initializer {
    public static LoginPage loginPage = null;

   static {
       loginPage = new LoginPage();
    }
}
