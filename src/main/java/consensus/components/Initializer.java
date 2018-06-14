package consensus.components;

import consensus.components.createAdvancedDemo.CreateAdvancedDemo;
import consensus.components.createSingleDemo.CreateSingleDemo;
import consensus.components.createStandardDemo.CreateStandardDemo;
import consensus.components.errorHandler.ErrorHandler;
import consensus.components.leftMenu.LeftMenuMain;
import consensus.components.logOut.LogOutPopup;
import consensus.components.loginPage.LoginPage;
import consensus.components.manageDemos.ManageDemos;
import consensus.components.sendDemo.SendDemo;


public class Initializer {
    public static LoginPage loginPage = null;
    public static LogOutPopup logOutPopup = null;
    public static LeftMenuMain leftMenuMain = null;
    public static CreateSingleDemo createSingleDemo = null;
    public static ManageDemos manageDemos = null;
    public static CreateStandardDemo createStandardDemo = null;
    public static ErrorHandler errorHandler = null;
    public static SendDemo sendDemo = null;
    public static CreateAdvancedDemo createAdvancedDemo = null;


    static {
        loginPage = new LoginPage();
        logOutPopup = new LogOutPopup();
        leftMenuMain = new LeftMenuMain();
        createSingleDemo = new CreateSingleDemo();
        manageDemos = new ManageDemos();
        createStandardDemo = new CreateStandardDemo();
        errorHandler = new ErrorHandler();
        sendDemo = new SendDemo();
        createAdvancedDemo = new CreateAdvancedDemo();
        }

}
