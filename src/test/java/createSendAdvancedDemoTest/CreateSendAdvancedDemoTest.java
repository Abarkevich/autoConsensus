package createSendAdvancedDemoTest;

import com.codeborne.selenide.Condition;
import consensus.components.Initializer;
import core.BaseTest;
import core.utilities.Sleeper;
import core.utilities.UploadUtils;
import org.testng.annotations.Test;

import static consensus.components.Initializer.leftMenuMain;
import static consensus.components.Initializer.loginPage;

public class CreateSendAdvancedDemoTest extends BaseTest {

    private String demoNameADV = "SS AB ADV 29 06 AUTOMATED #1 prod";
    private String pathToVideo = "C:\\Users\\user\\Pictures\\videos\\2mb0013.mp4";
    private String pathToLogo = "C:\\Users\\user\\Pictures\\Saved Pictures\\png.png";
    private String pathToFavicon = "C:\\Users\\user\\Pictures\\Saved Pictures\\png.png";
    private String questionADV = "Question";
    private String answer1 = "STD";
    private String answer2 = "SNGL";
    private String nameDemoFor1Answer = "SS AB STD 06 06 AUTOMATED #1";
    private String nameDemoFor2Answer = "SS AB NEW SNGL 29 06 #2";
    private String orgName = "SS";
    private String recEmail = "ssabrec_1@qa.com";
    private String firstRecName = "F_name";
    private String lastRecName = "L_name";
    private String titleRec = "QA";



    @Test
    public void createSendAdvancedDemoTest (){
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
        Initializer.createAdvancedDemo.selectDemoFor1AnswerADV(nameDemoFor1Answer);
        Initializer.createAdvancedDemo.selectDemoFor2AnswerADV(nameDemoFor2Answer);
        Initializer.createSingleDemo.clickContinue();
        Initializer.createAdvancedDemo.PreviewADV_Page.shouldBe(Condition.visible);
        Initializer.createAdvancedDemo.AdvSaveExit_BTN.click();
        Initializer.leftMenuMain.SALES_ACCELERATOR_BTN.click();
        Initializer.leftMenuSales.SEND_DEMO_LEFT_MENU_BTN.click();
        Initializer.sendDemo.selectDemoForSend(demoNameADV);
        Initializer.sendDemo.SendDemoViaCreatedDemo(orgName, recEmail, firstRecName, lastRecName, titleRec);
        Initializer.trackDemosSentPage.findSendFirstTimeDemoByName(demoNameADV);

    }
}
