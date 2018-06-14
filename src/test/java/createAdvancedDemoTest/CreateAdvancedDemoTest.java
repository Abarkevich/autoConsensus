package createAdvancedDemoTest;

import com.codeborne.selenide.Condition;
import com.sun.org.apache.xml.internal.security.Init;
import consensus.components.Initializer;
import core.BaseTest;
import core.utilities.Sleeper;
import core.utilities.UploadUtils;
import org.testng.annotations.Test;

import java.beans.Visibility;

import static consensus.components.Initializer.loginPage;
import static consensus.components.Initializer.leftMenuMain;


public class CreateAdvancedDemoTest extends BaseTest {

    private String demoNameADV = "SS AB ADV 11 06 AUTOMATED #1 Helix";
    private String pathToVideo = "C:\\Users\\user\\Pictures\\videos\\2mb0013.mp4";
    private String pathToLogo = "C:\\Users\\user\\Pictures\\Saved Pictures\\png.png";
    private String pathToFavicon = "C:\\Users\\user\\Pictures\\Saved Pictures\\png.png";
    private String questionADV = "Question";
    private String answer1 = "STD";
    private String answer2 = "SNGL";
    private String selectedDemoFor1Answer = "SS AB standard 06 06 Helix";

    @Test
    public void createAdvancedDemoTest() {
        loginPage.login("anna.barkevich@spiralscout.com", "Password_001");
        leftMenuMain.CREATE_DEMO_BTN.waitUntil(Condition.visible, 10000);
        Initializer.leftMenuMain.CREATE_DEMO_BTN.click();
        Initializer.createAdvancedDemo.CreateADV_BTN.waitUntil(Condition.visible, 10000);
        Initializer.createAdvancedDemo.CreateADV_BTN.click();
        Initializer.createAdvancedDemo.TitleADVPage.waitUntil(Condition.visible, 10000);
        Initializer.createAdvancedDemo.TitleADV_Input.sendKeys(demoNameADV);
        Initializer.createSingleDemo.clickContinue();
        Initializer.createSingleDemo.VIDEO_SELECT_FILE_BTN.waitUntil(Condition.visible, 5000);
        Initializer.createSingleDemo.VIDEO_SELECT_FILE_BTN.click();
        Sleeper.sleepInMillis(1);
        UploadUtils.selectAndUpload(pathToVideo);
        Initializer.createSingleDemo.DOWNLOAD_VIDEO_BTN.waitUntil(Condition.visible, 40000);
        Initializer.createSingleDemo.clickContinue();
        Initializer.createSingleDemo.LOGOANDFAVICON_PAGE.waitUntil(Condition.visible, 5000);
        Initializer.createAdvancedDemo.LogoAdvBTN.click();
        Sleeper.sleepInMillis(1);
        UploadUtils.selectAndUpload(pathToLogo);
        Sleeper.sleepInMillis(10);
        Initializer.createSingleDemo.clickContinue();
        Initializer.createAdvancedDemo.QuestionADVFieldINPUT.sendKeys(questionADV);
        Initializer.createAdvancedDemo.AnswerADV1_Input.sendKeys(answer1);
        Initializer.createAdvancedDemo.AnswerADV2_Input.sendKeys(answer2);
        Initializer.createAdvancedDemo.selectDemoFor1AnswerADV(selectedDemoFor1Answer);


    }


}

